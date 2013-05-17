package hadoop.job.PIM_POP;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.FileSystem;
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
//			 URI[] uris = new URI[]{new URI(url)};
//			 DistributedCache.setLocalFiles(conf, str)
//			 DistributedCache.setCacheArchives(archives, conf)
			 
//			 String path = "C:\\Users\\Administrator\\Desktop\\临时.txt";
//			 DistributedCache.setLocalFiles(context.getConfiguration(), path);
//			 
//			 for(Text value : values){
//				 Path[] pathCache = DistributedCache.getLocalCacheFiles(context.getConfiguration());
//				 try {
//					FileSystem fs = FileSystem.get(new URI(pathCache[0].toString()), context.getConfiguration());
//					
//				} catch (URISyntaxException e) {
//					e.printStackTrace();
//				}
//				 
//			 }
			 
			 String attributeCache = "150000000	1000000041	红色	color:1";
			 for(Text value : values){
				 String v
			 }
		 }
	}
}
