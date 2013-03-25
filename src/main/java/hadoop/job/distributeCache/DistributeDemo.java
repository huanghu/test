package hadoop.job.distributeCache;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class DistributeDemo extends Configured implements Tool {
	
	private String HOST_NAME = "hadoop-master.360buy.com"; //开发集群
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public static class Map extends Mapper<LongWritable, Text, LongWritable, Text>{
		@Override
		protected void map(LongWritable key ,Text value ,Context context)
		throws IOException ,InterruptedException{
			Configuration conf = context.getConfiguration();
			DistributeDemo distribute = new DistributeDemo();
			distribute.existsCache(conf);
			context.write(key, value);
		}
	}
	
	public static class Reduce extends Reducer<LongWritable, Text, Text, Text>{
		@Override
		protected void reduce(LongWritable key ,Iterable<Text> values ,Context context) 
		throws IOException ,InterruptedException{
			System.out.println("reduce.....");
			Configuration conf = context.getConfiguration();
			DistributeDemo distribute = new DistributeDemo();
			distribute.existsCache(conf);
		}
	}
	
	/**
	 * 是否存在缓存
	 * @param conf
	 */
	public void existsCache(Configuration conf){
		try {
			URI[] uris = null;
			uris = DistributedCache.getCacheFiles(conf);
			if(uris == null){
				System.out.println("no cache");
				String url = "/user/huanghu/abc-mapping.xml";
				uris = new URI[]{new URI(url)};
				DistributedCache.setCacheFiles(uris, conf);
				System.out.println("cache is put");
			}else {
				System.out.println("have cache");
				System.out.println("cache is" + uris);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int run(String[] args) throws Exception {
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		conf.set("mapred.job.queue.name", "erpmerge");
		
		Job job = new Job(conf ,"cacheTest");
		job.setJarByClass(DistributeDemo.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
		
		String outUrl = "/user/huanghu/cacheTest/";
		String inUrl = "/user/huanghu/common.xml";
		Path out = new Path(outUrl);
		Path in = new Path(inUrl);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		//清洗
		this.clearOutPath(job.getConfiguration() ,out);
		
		job.setMapperClass(Map.class);
		job.setReducerClass(Reduce.class);
		
		job.waitForCompletion(true);
		
		return 0;
	}
	
	/**
	 * 清除输出路径
	 */
	private void clearOutPath(Configuration conf ,Path out) throws IOException{
		FileSystem fs = FileSystem.get(conf);
		fs.delete(out ,true);
	}
	
	public static void main(String[] args){
		try {
			ToolRunner.run(new Configuration() ,new DistributeDemo(), args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
