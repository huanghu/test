package hadoop.job.PIM_POP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.HarFileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class ValueMapReduce {
	public static class Map extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		protected void map(LongWritable key, Text value, 
                Context context) throws IOException, InterruptedException {
			Text outKey = new Text(key.toString());
			context.write(outKey, value);
		}
	}
	
	public static class Reduce extends Reducer<Text, Text, Text, Text>{
		 protected void reduce(Text key, Iterable<Text> values, Context context
         ) throws IOException, InterruptedException {
//			 Path[] cacheFiles = DistributedCache.getLocalCacheArchives(context.getConfiguration());
			 URI[] cacheArchives = DistributedCache.getCacheArchives(context.getConfiguration());
			 if(cacheArchives != null && cacheArchives.length > 0){
				 java.util.Map<String, String[]> cacheMap = this.getCacheMap(context.getConfiguration() ,cacheArchives);
//				 java.util.Map<String, String[]> cacheMap = this.getCacheMap(cacheFiles);
				 
				 for(Text value : values){
					 try{
						 Text outValue = new Text();
						 
						 List<String> outStrings = this.getOutStrings(value ,cacheMap);
						 outValue.set(outStrings.toString());
						 context.write(key, outValue);						 
					 }catch(RuntimeException ex){
						 ex.printStackTrace();
					 }
				 }
			 }
		 }
		 
		 private java.util.Map<String ,String[]> getCacheMap(Configuration conf , URI[] cacheArichivesFiles) throws IOException{
			 java.util.Map<String ,String[]> cacheMap = new HashMap<String ,String[]>();
			 Path arPath = null;
			 URI uri = null;
			 for(int i = 0 ;i < cacheArichivesFiles.length ; i ++){
				 //遍历缓存里的归档文件，如果有attributeCache字样的，设置arPath
				 uri = cacheArichivesFiles[i];
				 if(uri.toString().indexOf("attributeCache") >= 0){
					 arPath = DistributedCache.getFileStatus(conf, uri).getPath();
				 }
			 }
			 
			 if(arPath == null){
				 //缓存里没有文件，返回
				 return cacheMap;
			 }
			 
			 //获得归档里面的文件
			 HarFileSystem fs = new HarFileSystem();  
			 fs.initialize(uri, conf); 
			 FileStatus[] satus = fs.listStatus(arPath);
			 for(FileStatus s : satus){
				 Path p  = s.getPath();
				 String pName = p.getName();
				 if(pName.indexOf("part") >= 0){
					 //取得归档文件的内容
					 FSDataInputStream inputStream = fs.open(s.getPath());
					 BufferedInputStream bstream = new BufferedInputStream(inputStream);
					 BufferedReader reader = new BufferedReader(new InputStreamReader(bstream));
					 String line;
					 while((line = reader.readLine()) != null){
						 if(!line.equals("")){
							 String[] cacheAttribute = line.split("\t");
							 if(cacheAttribute != null && cacheAttribute.length >0){
								 System.out.println("line " + line);
								 //在缓存文件中每行的第一个值
								 String attributeId = cacheAttribute[0];
								 //将每一行不为空的值（转换为数组后）放入map
								 cacheMap.put(attributeId, cacheAttribute);
							 }
						 }
					 }
					 inputStream.close();
					 bstream.close();
					 reader.close();
				 }

			 }
			 return cacheMap;

		 }
		 
		 //从缓存中获得正确的属性值
		 private List<String> getOutStrings(
				 	Text value ,
				 	java.util.Map<String, String[]> cacheMap) 
				 	throws RuntimeException{
			 List<String> outStrings = new ArrayList<String>(2);
			 String wareSku = value.toString();
			 String[] wareSkuAttributes = wareSku.split("\t");
			 //获得1000000041:150000000^1000000041:150000000 
			 //假设第二个就是1000000041:150000000^1000000041:150000000
			 String wareSkuAttribute = wareSkuAttributes[1];
			 String[] attributes = wareSkuAttribute.split("\\^");
			 for(String attribute : attributes){
				 this.setOutStringByAttribute(cacheMap, outStrings, attribute);
			 }	
			 
			 return outStrings;
		 }
		 
		 /**
		  * 将属性值输入到适当的位置，颜色是第一个，尺码是第二个
		  * @throws RuntimeException
		  */
		 private void setOutStringByAttribute(
				 java.util.Map<String, String[]> cacheMap ,
				 List<String> outStrings ,
				 String attribute) throws RuntimeException{
			 String[] attrValues = attribute.split(":");
			 String attributeId = attrValues[0];
			 String[] caches = cacheMap.get(attributeId);
			 if(caches.length >= 4){
				 if(caches[4].indexOf("color:1") >= 0){
					 //是颜色，放入第一个
					 //如果是color:1 放入outStrings第一个
					 outStrings.add(0, caches[3]);
				 }else if(caches[4].indexOf("size:1") >= 0){
					 //如果是size:1 放入outStrings第二个(如果只有一种属性，那就放第一个)
					 outStrings.add(outStrings.size(), caches[3]);								 
				 }
			 }
		 }
	}
}
