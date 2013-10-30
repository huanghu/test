package hadoop.job.mock;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockRecordReader extends RecordReader<LongWritable, MockWritable> {
	Logger logger = LoggerFactory.getLogger(MockRecordReader.class);
	
	private InputSplit split;
	private String pChgDateFrom;
	private String pChgDateTo;
	private String batchNo;
	private long lSubMinNo;
	private long lSubMaxNo;
	private int lSpuSkuFlag;
	private int pCommintCount;
	private String dBDriver;
	private String connStr;
	private String name;
	private String passwd;	
	private String callQuery;
	
	//用于nextKeyValue判断是否已经处理过当前seq_no段的数据
	//初始值为lSubMinNo
	private long dealNo = 0; 
	
	public MockRecordReader(
			InputSplit split ,
			String pChgDateFrom ,
			String pChgDateTo ,
			String batchNo ,
			long lSubMinNo ,
			long lSubMaxNo ,
			int lSpuSkuFlag ,
			int pCommintCount ,
			String dBDriver ,
			String connStr ,
			String name ,
			String passwd ,
			String callQuery){
		this.split = split;
		this.pChgDateFrom = pChgDateFrom;
		this.pChgDateTo = pChgDateTo;
		this.batchNo = batchNo;
		this.lSubMinNo = lSubMinNo;
		this.lSubMaxNo = lSubMaxNo;
		this.lSpuSkuFlag = lSpuSkuFlag;
		this.pCommintCount = pCommintCount;
		this.dBDriver = dBDriver;
		this.connStr = connStr;
		this.name = name;
		this.passwd = passwd;
		this.callQuery = callQuery;
		
		this.dealNo = lSubMinNo;
	}

	@Override
	public void initialize(InputSplit split, TaskAttemptContext context)
			throws IOException, InterruptedException {
		
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		
		dealNo = (lSubMaxNo - lSubMinNo - dealNo) < pCommintCount ? (dealNo + lSubMaxNo) : (dealNo + pCommintCount);
		
		if (dealNo <= lSubMaxNo) {
			return true;
		}
		System.out.println("end");
		return false;
	}

	@Override
	public LongWritable getCurrentKey() throws IOException,
			InterruptedException {
		return null;
	}

	@Override
	public MockWritable getCurrentValue() throws IOException,
			InterruptedException {
		MockWritable writable = new MockWritable(
									pChgDateFrom ,
									pChgDateTo ,
									batchNo ,
									lSubMinNo ,
									lSubMaxNo ,
									lSpuSkuFlag ,
									pCommintCount ,
									dBDriver ,
									connStr ,
									name ,
									passwd ,
									callQuery);
		
		return writable;
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		float progress = lSubMaxNo / split.getLength();
		return progress;
	}

	@Override
	public void close() throws IOException {
		logger.info("close");
	}

}
