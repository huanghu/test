package hadoop.job.sequence;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.cloudera.sqoop.lib.SqoopRecord;


public class SequenceFileInputOutputDemo extends Configured implements Tool {
	
	private String HOST_NAME = "192.168.162.129";
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	private static class MapClass extends Mapper<LongWritable, SqoopRecord, SqoopRecord,
    NullWritable>{
		@Override
		protected void map(LongWritable key ,SqoopRecord value ,Context context) throws IOException, InterruptedException {
			
			context.write(value, NullWritable.get());
		}
	}

	public int run(String[] args) throws Exception {
		String pathIn = "/user/huanghu/sequ";
		String pathOut = "/user/huanghu/bb";
		
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","root");
		
		Job job = new Job(conf ,"SequenceTest");
		job.setJarByClass(SequenceFileInputOutputDemo.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
		
		Path in = new Path(pathIn);
		Path out = new Path(pathOut);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		job.setMapperClass(MapClass.class);
		
		job.setInputFormatClass(SequenceFileInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(SqoopRecord.class);
		job.setOutputValueClass(NullWritable.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
		return 0;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			args = new String[]{"/user/huanghu/sequ" ,"/user/huanghu/bb"}; 
			int res = ToolRunner.run(new Configuration(), new SequenceFileInputOutputDemo() ,args);
			System.exit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
