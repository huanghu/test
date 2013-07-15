package hadoop.sort;

import java.io.IOException;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class MapreduceSample {
	public static class Map extends Mapper<LongWritable, TextPair, Text, TextPair>{
		@Override
		protected void map(LongWritable key, TextPair value, 
                Context context) throws IOException, InterruptedException {
			System.out.println("map junit");
			Text outKey = new Text(key.toString());
			context.write(outKey, value);
		}
	}
	
	public static class Reduce extends Reducer<Text, TextPair, Text, TextPair>{
		  protected void reduce(Text key, Iterable<TextPair> values, Context context
          ) throws IOException, InterruptedException {
			  System.out.println("reducer junit");
			  for(Text value: values) {
				  context.write(key, value);
			  }
		  }		
	}
}
