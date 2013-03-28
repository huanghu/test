package hadoop.job.configuration;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;

public class CustomInputFormat extends FileInputFormat<LongWritable, CustomEntity> {

	@Override
	public RecordReader<LongWritable, CustomEntity> createRecordReader(
			InputSplit split, TaskAttemptContext context) throws IOException,
			InterruptedException {
		LineRecordReader lineRecordReader = new LineRecordReader();
		return new CustomRecordReader(lineRecordReader);
	}

}
