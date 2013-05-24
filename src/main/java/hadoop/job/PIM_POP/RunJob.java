package hadoop.job.PIM_POP;

import hadoop.job.har.HarDemo;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class RunJob {
	
	private final static String HOST_NAME = "hadoop-master.360buy.com"; //������Ⱥ
	private final static String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private final static String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public static void main(String[] args) throws Exception{
		
		Configuration conf = new Configuration();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		conf.set("mapred.job.queue.name", "erpmerge");
		
//		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
	    String jar1 = "D:\\java\\program\\test\\target\\test-0.0.1.jar";
	    String jar2 = "D:\\资料\\java资料\\hadoop\\sqoop\\lib\\ojdbc6.jar";
	    jar1 = tranPath(conf ,jar1);
	    jar2 = tranPath(conf, jar2);
	    
	    conf.set("tmpjars", String.format("%s,%s", jar1 ,jar2));
//	    Job job = new Job(conf, "Attribute");
//	    job.setJarByClass(AttributeMapRedcue.class);
//
//	    
//	    job.setMapperClass(AttributeMapRedcue.Map.class);
//	    job.setReducerClass(AttributeMapRedcue.Reduce.class);
//
//	    job.setOutputKeyClass(Text.class);
//	    job.setOutputValueClass(Text.class);
//	    FileInputFormat.addInputPath(job, new Path("/user/huanghu/cacheTest/input"));
//	    FileOutputFormat.setOutputPath(job, new Path("/user/huanghu/cacheTest/output"));
//	    
//		checkFile(conf, "/user/huanghu/cacheTest/output");
//	    
//		job.waitForCompletion(true);
	    
	    //归档
	    //creachArchives(conf);
		
	    //放入缓存
		DistributedCache.addCacheArchive(new URI("/user/huanghu/cacheTest/archives/output/attributeCache.har"), conf);
		//	    DistributedCache.addCacheFile(new URI("/user/huanghu/cacheTest/archives/output/attributeCache.har/part-0"), conf);
	    
	    //第二个job
	    System.out.println("第二个job");
	    Job job2 = new Job(conf, "Value");
	    job2.setMapperClass(ValueMapReduce.Map.class);
	    job2.setReducerClass(ValueMapReduce.Reduce.class);

	    job2.setOutputKeyClass(Text.class);
	    job2.setOutputValueClass(Text.class);
	    FileInputFormat.addInputPath(job2, new Path("/user/huanghu/cacheTest/output"));
	    FileOutputFormat.setOutputPath(job2, new Path("/user/huanghu/cacheTest/final/output"));
	    
		checkFile(conf, "/user/huanghu/cacheTest/final/output");
	    job2.waitForCompletion(true);
	}
	
	private static void checkFile(Configuration conf ,String pathStr){
		try {
			FileSystem fs = FileSystem.get(conf);
			Path path = new Path(pathStr);
			if(fs.exists(path)){
				fs.delete(path ,true);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String tranPath(Configuration conf ,String jarPath) throws IOException{
	    System.setProperty("path.separator", ":");  
	    FileSystem fs = FileSystem.getLocal(conf);  
	    String newJarPath = new Path(jarPath).makeQualified(fs).toString();
	    return newJarPath;
	}
	
	private static void creachArchives(Configuration conf){
		
		checkFile(conf, "/user/huanghu/cacheTest/archives/output");
		
		List<String> args = new ArrayList<String>();
		args.add("-archiveName");
		args.add("attributeCache.har");
		args.add("-p");
		args.add("/user/huanghu/cacheTest/output");
		args.add("/user/huanghu/cacheTest/archives/output");
		HarDemo.run(conf ,args.toArray(new String[args.size()]));
	}
}
