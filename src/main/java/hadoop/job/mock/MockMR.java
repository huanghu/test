package hadoop.job.mock;

import java.io.IOException;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class MockMR {
	public static class MockMapper extends Mapper<LongWritable, MockWritable, NullWritable, MockWritable>{
		@Override
		  protected void map(LongWritable key, MockWritable value, 
                  Context context) throws IOException, InterruptedException {
			context.write(NullWritable.get() ,value);
		}
	}
}
