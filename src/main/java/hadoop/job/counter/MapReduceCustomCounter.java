package hadoop.job.counter;


import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class MapReduceCustomCounter extends Configured implements Tool {
	
//	private String HOST_NAME = "master.slave"; //���ؼ�Ⱥ
	private String HOST_NAME = "hadoop-master.360buy.com"; //������Ⱥ
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public static class MapClass extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		public void map(LongWritable key ,Text value ,Context context){
			Text outKey = new Text(key.toString());
			try {
			    Counter counter = context.getCounter("countTest", "countTest");
			    counter.increment(1);
				
				context.write(outKey, value);
				context.getCounter(CounterEnum.MAP).increment(1);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			args = new String[]{"/user/huanghu/aa" ,"/user/huanghu/bb"}; 
			int res = ToolRunner.run(new Configuration(), new MapReduceCustomCounter() ,args);
			System.exit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		
		Job job = new Job(conf ,"RPCtest");
		job.setJarByClass(MapReduceCustomCounter.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
		
		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		job.setMapperClass(MapClass.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
		return 0;
	}

}
