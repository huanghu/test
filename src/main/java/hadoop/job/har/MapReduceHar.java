package hadoop.job.har;

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
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * ∞—har ‰»Îmapreduce
 * @author huanghu
 *
 */
public class MapReduceHar extends Configured implements Tool {

	public static class MapClass extends Mapper<LongWritable, Text, Text, Text>{
		public void map(LongWritable key ,Text value ,Context context) 
		throws IOException ,InterruptedException{
			context.write(new Text("1"), value);
		}
	}
	
	public static class Reduce extends Reducer<Text, Text, Text, Text>{
		public void reduce(Text key ,Iterable<Text> values ,Context context) 
		throws IOException ,InterruptedException{
			for(Text val : values){
				context.write(key, val);
			}
		}
	}
	
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		
		Job job = new Job(conf ,"HarInput");
		job.setJarByClass(MapReduceHar.class);
		
		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
//		job.setMapperClass(MapClass.class);
//		job.setReducerClass(Reduce.class);
		
		job.setMapperClass(Mapper.class);
		job.setReducerClass(Reducer.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputKeyClass(Text.class);
		
		System.exit(job.waitForCompletion(true)?0:1);
		return 0;
	}
	
	public static void main(String[] args) throws Exception{
		int res = ToolRunner.run(new Configuration(), new MapReduceHar() ,args);
		System.exit(res);
	}
	
}
