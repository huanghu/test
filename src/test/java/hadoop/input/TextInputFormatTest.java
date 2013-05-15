package hadoop.input;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.junit.Before;
import org.junit.Test;

/**
 *TextInputFormat的单元测试 
 */
public class TextInputFormatTest {
	
	InputSplit split;
	TaskAttemptContext context;
	
	@Before
	public void before(){
		Configuration conf = new Configuration();
		TaskAttemptID task = new TaskAttemptID();
		
		split = new InputSplit() {
			
			@Override
			public String[] getLocations() throws IOException, InterruptedException {
				return null;
			}
			
			@Override
			public long getLength() throws IOException, InterruptedException {
				return 0;
			}
		};	
		context = new TaskAttemptContext(conf ,task);
	}

	@Test
	public void test() {
		TextInputFormat input = new TextInputFormat();

		input.createRecordReader(split, context);
	}

}
