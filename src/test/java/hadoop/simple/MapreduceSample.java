package hadoop.simple;

import java.io.IOException;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class MapreduceSample {
	public static class Map extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		protected void map(LongWritable key, Text value, 
                Context context) throws IOException, InterruptedException {
			System.out.println("map junit");
			Text outKey = new Text(key.toString());
			context.write(outKey, value);
		}
	}
	
	public static class Reduce extends Reducer<Text, Text, Text, Text>{
		  protected void reduce(Text key, Iterable<Text> values, Context context
          ) throws IOException, InterruptedException {
			  System.out.println("reducer junit");
			  for(Text value: values) {
				  context.write(key, value);
			  }
		  }		
	}
}
