package hadoop.job.sqoop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hadoop.job.tools.Constant;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.cloudera.sqoop.Sqoop;

public class SqoopExecuteMR extends Configured implements Tool {
	private String hostName = "master.slave"; //本地集群
	//	private String hostName = "hadoop-master.360buy.com";
	private String queue = "default";
//	private String queue = "erpmerge";
	
	enum CounterTest{
		MAPCOUNT
	}
	
	public static class MapClass extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		public void map(LongWritable key ,Text value ,Context context){
			try {
			    Configuration conf = context.getConfiguration();
			    
				FileSystem fs = FileSystem.get(conf);
				Path path = new Path("/user/huanghu/example/input_stock");
				fs.delete(path ,true);
			    

				String[] args = new String[conf.getInt("test.sqoop.args.length" ,0)];
				for(int i = 0 ;i < args.length ; i ++){
					args[i] = conf.get("test.sqoop.args" + i);
				};
				Sqoop.main(args);
//				context.write(outKey, value);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
	
//	public static class ReduceClass extends Reducer<LongWritable, Text, Text, Text>{
//	@Override
//	public void reduce(LongWritable key ,Iterable<Text> values ,Context context){
//		try {
//			Configuration conf = context.getConfiguration();
//			String[] args = new String[conf.getInt("test.sqoop.args.length" ,0)];
//			
//			for(int i = 0 ;i < args.length ; i ++){
//				args[i] = conf.get("test.sqoop.args" + i);
//			};
//			Sqoop.main(args);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}	
	
	
	public int run(String[] args) throws Exception {
		Configuration conf = getConf();
		Constant.getConfiguaration(conf ,hostName ,queue);

		System.setProperty("path.separator", ":");
		conf.set("tmpjars", this.getTmpjars(conf));
		conf.setInt("test.sqoop.args.length", args.length);
//		conf.setInt("mapred.map.tasks", 1);
		
		for(int i = 0 ;i < args.length ;i ++){
			conf.set("test.sqoop.args" + i, args[i]);			
		}

		
		Job job = new Job(conf ,"SqoopTest");
		job.setJarByClass(SqoopExecuteMR.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");

		Path inputDir = new Path("/user/huanghu/aa");
		Path outputDir = new Path("/user/huanghu/example/input_stock1");
		FileInputFormat.setInputPaths(job, inputDir);
		FileOutputFormat.setOutputPath(job, outputDir);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
				
		job.setMapperClass(MapClass.class);
//		job.setReducerClass(ReduceClass.class);
		job.setNumReduceTasks(0);
		((JobConf)job.getConfiguration()).setNumMapTasks(1);
		
		job.waitForCompletion(true);
		
		return 0;
	}
	
	/**
	 * 获得tmpjars
	 * @return
	 */
	private String getTmpjars(Configuration conf) throws IOException{
		StringBuilder tmpjars = new StringBuilder();
		String path = "/user/huanghu/lib/";
		
		//
		this.getTmpJarsSingle(conf ,tmpjars ,path, "sqoop-1.3.0-cdh3u3.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "commons-cli-1.2.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "commons-httpclient-3.1_1.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "commons-io-2.1.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "commons-logging-1.1.1.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "jackson-core-asl-1.9.9.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "mysql-connector-java-5.1.18.jar" ,false);
		this.getTmpJarsSingle(conf ,tmpjars ,path, "jackson-mapper-asl-1.9.9.jar" ,true);
		
		return tmpjars.toString();
	}
	
	/**
	 * 拼每个jars的tmpjars的路径
	 * @param path
	 * @param name
	 * @param tmpjarBuilder
	 * @return
	 */
	private void getTmpJarsSingle(Configuration conf ,StringBuilder tmpjars ,String path ,String name ,boolean isEnd) throws IOException{
		
		/*
		 * 		Path tmpPath = new Path("/user/huanghu/lib/sqoop-1.3.0-cdh3u3.jar");
		FileSystem fs = tmpPath.getFileSystem(conf);
		String finalPath = new Path("/user/huanghu/lib/sqoop-1.3.0-cdh3u3.jar").makeQualified(fs).toString();
		 */
		String absPath = path + name;
		Path tmpPath = new Path(absPath);
		FileSystem fs = tmpPath.getFileSystem(conf);
		String finalPath = new Path(absPath).makeQualified(fs).toString();
		tmpjars.append(finalPath);
		if(!isEnd){
			tmpjars.append(",");
		}

	}
	
	private static String[] setArgs() throws Exception{
		List<String> argsList = new ArrayList<String>();
		argsList.add("import");
		argsList.add("--connect");
		argsList.add("jdbc:mysql://192.168.225.101:3306/jdrebate");
		
		argsList.add("--username");
		argsList.add("rbt");
		argsList.add("--password");
		argsList.add("rbt");
		
		argsList.add("--query");
		argsList.add("\"SELECT id,agr_no FROM rbt_agr_calc_time_point where $CONDITIONS limit 1\"");
		
		argsList.add("--split-by");
		argsList.add("id");
		
		argsList.add("--fields-terminated-by");
		argsList.add("'\t'");
		
//		argsList.add("-m");
//		argsList.add("1");
		
		argsList.add("--target-dir");
		argsList.add("/user/huanghu/example/input_stock");
		
		String[] args = new String[0];
		args = argsList.toArray(args);
		return args;
	}
	
	public static void main(String[] args){
		try {
			args = setArgs();
			int res = ToolRunner.run(new Configuration(), new SqoopExecuteMR() ,args);
			System.exit(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
