package hadoop.job.experiment;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class Output {
	public static class OutputMapper extends Mapper<LongWritable, Text, Text, Text>{
		
		protected void map(LongWritable key, Text value, Context context
        ) throws IOException, InterruptedException {
			System.out.println("测试");
	    	Text outKey = new Text("1");
	    	context.write(outKey, value);
	    }
	}
	
	public static class OutputReduce extends Reducer<LongWritable, Text, NullWritable, Text>{
		  protected void reduce(Text key, Iterable<Text> values, Context context
		                        ) throws IOException, InterruptedException {
		    for(Text value: values) {
		      context.write(NullWritable.get(), value);
		    }
		  }
	}
	
	  public static void main(String[] args) throws Exception {
		    Configuration conf = new Configuration();
		    Job job = new Job(conf, "test hadoop2.2");
		    job.setJarByClass(Output.class);
		    job.setMapperClass(OutputMapper.class);
		    job.setReducerClass(OutputReduce.class);
		    
		    job.setOutputKeyClass(NullWritable.class);
		    job.setOutputValueClass(Text.class);
		    job.setMapOutputKeyClass(Text.class);
		    job.setMapOutputValueClass(Text.class);
		    
		    job.setInputFormatClass(TextInputFormat.class);
		    job.setOutputFormatClass(TextOutputFormat.class);

		    FileInputFormat.setInputPaths(job, new Path("/user/erpmerge/a"));
		    FileOutputFormat.setOutputPath(job, new Path("/user/erpmerge/b"));
		    System.exit(job.waitForCompletion(true) ? 0 : 1);
		  }
}
