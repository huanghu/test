package hadoop.job.mock;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.OutputCommitter;
import org.apache.hadoop.mapreduce.OutputFormat;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MockOutputFormat extends OutputFormat<NullWritable, MockWritable> {

	@Override
	public RecordWriter<NullWritable, MockWritable> getRecordWriter(
			TaskAttemptContext context) throws IOException,
			InterruptedException {
		RecordWriter<NullWritable, MockWritable> recordWriter = new MockRecordWriter();
		return recordWriter;
	}

	@Override
	public void checkOutputSpecs(JobContext context) throws IOException,
			InterruptedException {
		
	}

	@Override
	public OutputCommitter getOutputCommitter(TaskAttemptContext context)
			throws IOException, InterruptedException {
	    return new FileOutputCommitter(FileOutputFormat.getOutputPath(context),
                context);
	}

}
