package hadoop.job.configuration;

import hadoop.job.tools.Constant;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;

public class CustomRecordReader extends RecordReader<LongWritable, CustomEntity> {
	
	private LineRecordReader lineRecordReader; 
	Text value;
	
	public CustomRecordReader(LineRecordReader lineRecordReader){
		this.lineRecordReader = lineRecordReader;
	}
	
	@Override
	public CustomEntity getCurrentValue() {
		value = lineRecordReader.getCurrentValue();
		System.out.println("READER " + value);
		if(value == null){
			System.out.println("当前值为空");
		}
		String[] values = value.toString().split(Constant.SEPARATE_SYMBOL);
		CustomEntity currentValue = new CustomEntity(value);
		try {
			if(values != null && values.length >= 3){
				currentValue.setId((int)System.currentTimeMillis() % 200);
				currentValue.setValue1(values[0]);
				currentValue.setValue2(values[1]);				
			}else{
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("错误的value " + value);
			e.printStackTrace();
		}

		return currentValue;
	 }

	@Override
	public void initialize(InputSplit split, TaskAttemptContext context)
			throws IOException, InterruptedException {
		lineRecordReader.initialize(split, context);
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		return lineRecordReader.nextKeyValue();
	}

	@Override
	public LongWritable getCurrentKey() throws IOException,
			InterruptedException {
		return lineRecordReader.getCurrentKey();
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		return lineRecordReader.getProgress();
	}

	@Override
	public void close() throws IOException {
		lineRecordReader.close();
	}
}
