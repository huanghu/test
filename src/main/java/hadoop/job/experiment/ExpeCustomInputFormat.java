package hadoop.job.experiment;

import hadoop.job.configuration.CustomEntity;
import hadoop.job.configuration.CustomInputFormat;
import hadoop.job.configuration.CustomOutputFormat;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.mapred.JobConf;

public class ExpeCustomInputFormat extends Configured implements Tool  {
	private String HOST_NAME = "master.slave"; //本地集群
	private String QUEUE = "default";
	
//	private String HOST_NAME = "hadoop-master.360buy.com"; //开发集群
//	private String QUEUE = "erpmerge";
	
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	//mapClass
	public static class MapClass extends Mapper<LongWritable, CustomEntity, Text, CustomEntity>{
		@Override
		public void map(LongWritable key ,CustomEntity value ,Context context){
			Text outKey = new Text(String.valueOf(value.getId()));
			try {
				context.write(outKey, value);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//reduceClass
	public static class ReduceClass extends Reducer<Text, CustomEntity, Text, CustomEntity>{
		@Override
		protected void reduce(Text key ,Iterable<CustomEntity> values ,Context context){
			try {
				for(CustomEntity value : values){
					System.out.println("11 " + value.getValue1());
					context.write(key, value);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		conf.set("mapred.job.queue.name", QUEUE);
		
		Job job = new Job(conf ,"RPCtest");
		job.setJarByClass(ExpeCustomInputFormat.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
		
		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		job.setMapperClass(MapClass.class);
		job.setReducerClass(ReduceClass.class);
		
		job.setInputFormatClass(CustomInputFormat.class);
		job.setOutputFormatClass(CustomOutputFormat.class);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(CustomEntity.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(CustomEntity.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
		return 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			args = new String[]{"/user/huanghu/aa" ,"/user/huanghu/bb"}; 
			int res = ToolRunner.run(new Configuration(), new ExpeCustomInputFormat() ,args);
			System.exit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
