package hadoop.mapred;

import java.io.IOException;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.util.Tool;

public class MapReduce extends Configured implements Tool {
	
	private enum COUNTER{
		TOTAL
	}

	public static class MapClass extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		protected void map(LongWritable key ,Text value ,Context context){
			try {
				Counter counter = context.getCounter(COUNTER.TOTAL);
				counter.increment(1);
				Text outKey = new Text(key.toString());
				context.write(outKey, value);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class ReduceClass extends Reducer<Text ,Text ,Text ,Text>{
		@Override
		protected void reduce(Text key ,Iterable<Text> values ,Context context){
			try {
				Long value = context.getCounter(COUNTER.TOTAL).getValue();
				context.write(key, new Text(value.toString()));
//				for(Text value : values){
//					context.write(key, value);
//				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
