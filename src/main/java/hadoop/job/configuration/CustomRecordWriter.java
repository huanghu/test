package hadoop.job.configuration;


import java.io.IOException;

import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

public class CustomRecordWriter<K, V> extends RecordWriter<K, V> {
	
	private RecordWriter<K, V> recordWriter;
	
	public CustomRecordWriter(RecordWriter<K, V> recordWriter){
		this.recordWriter = recordWriter;
	}
	

	@Override
	public void write(K key, V value) throws IOException,
			InterruptedException {
		this.recordWriter.write(key, value);
	}

	@Override
	public void close(TaskAttemptContext context) throws IOException,
			InterruptedException {
		this.recordWriter.close(context);
	}
}
