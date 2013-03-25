package hadoop.job.configuration;

import java.io.IOException;

import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class CustomOutputFormat<K, V> extends FileOutputFormat<K, V> {
	
	private TextOutputFormat<K, V> textOutputFormat;
	
	public CustomOutputFormat(){
		this.textOutputFormat = new TextOutputFormat<K, V>();
	}

	@Override
	public RecordWriter<K, V> getRecordWriter(TaskAttemptContext job) 
	throws IOException, InterruptedException {
		CustomRecordWriter<K, V> customRecordWriter = new CustomRecordWriter<K ,V>(textOutputFormat.getRecordWriter(job));	
	    return customRecordWriter;
	}

}
