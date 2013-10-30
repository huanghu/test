package hadoop.job.mock;

import hadoop.common.CommonUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.InputFormat;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockInputFormat extends InputFormat<LongWritable, MockWritable> {
	Logger logger = LoggerFactory.getLogger(MockInputFormat.class);
	
	private String pChgDateFrom;
	private String pChgDateTo;
	private String batchNo;
	private int lSpuSkuFlag;
	private long lSubMinNo;
	private long lSpuMaxNo;
	private int pCommintCount;
	private String dBDriver;
	private String connStr;
	private String name;
	private String passwd;	
	private String callQuery;

	@Override
	public List<InputSplit> getSplits(JobContext context) throws IOException,
			InterruptedException {
		List<InputSplit> inputSplits = new ArrayList<InputSplit>();
		
		if (this.setConfValue(context) == false) {
			logger.error("check is pass ,return");
			throw new InterruptedException("check is pass ,return");
		}
		
		MockInputSplit mock = new MockInputSplit(
				pChgDateFrom ,
				pChgDateTo ,
				batchNo ,
				lSpuSkuFlag ,
				lSubMinNo ,
				lSpuMaxNo ,
				pCommintCount ,
				dBDriver ,
				connStr ,
				name ,
				passwd ,
				callQuery);
		inputSplits.add(mock);
		return inputSplits;
	}
	
	private boolean setConfValue(JobContext context){
		Configuration conf = context.getConfiguration();

		dBDriver = conf.get(MockCommon.DB_DRIVER);
		if (this.checkConf(dBDriver ,String.format("%s is null", MockCommon.DB_DRIVER)) == false) {
			return false;
		}
		
		connStr = conf.get(MockCommon.CONN_STR);
		if (this.checkConf(dBDriver ,String.format("%s is null", MockCommon.CONN_STR)) == false) {
			return false;
		}
		
		name = conf.get(MockCommon.NAME);
		if (this.checkConf(name ,String.format("%s is null", MockCommon.NAME)) == false) {
			return false;
		}		
		
		passwd = conf.get(MockCommon.PASSWD);
		if (this.checkConf(passwd ,String.format("%s is null", MockCommon.PASSWD)) == false) {
			return false;
		}	
		
		pChgDateFrom = conf.get(MockCommon.P_CHG_DATE_FROM);
		if (this.checkConf(pChgDateFrom ,String.format("%s is null", MockCommon.P_CHG_DATE_FROM)) == false) {
			return false;
		}
		
		pChgDateTo = conf.get(MockCommon.P_CHG_DATE_TO);
		if (this.checkConf(pChgDateTo ,String.format("%s is null", MockCommon.P_CHG_DATE_TO)) == false) {
			return false;
		}		
		
		batchNo = conf.get(MockCommon.BATCH_NO);
		if (this.checkConf(batchNo ,String.format("%s is null", MockCommon.BATCH_NO)) == false) {
			return false;
		}
		
		if (this.checkLSpuSkuFlagStr(conf) == false) {
			return false;
		}

		if (this.checkLSubMinNoStr(conf) == false) {
			return false;
		}
		
		if (this.checkLSpuMaxNoStr(conf) == false) {
			return false;
		}

		if (this.checkPCommintCountStr(conf) == false) {
			return false;
		}
		
		callQuery = conf.get(MockCommon.CALL_QUERY);
		if (this.checkConf(callQuery ,String.format("%s is null", MockCommon.CALL_QUERY)) == false) {
			return false;
		}
		
		return true;
	}
	
	private boolean checkConf(String value ,String message){
		if (CommonUtil.isEmpty(value)) {
			logger.error(message);
			return false;
		}
		return true;
	}
	
	private boolean checkLSpuSkuFlagStr(Configuration conf){
		String lSpuSkuFlagStr = conf.get(MockCommon.LSPU_SKU_FLAG);
		if(this.checkConf(lSpuSkuFlagStr, String.format("%s is null", MockCommon.LSPU_SKU_FLAG)) == false){
			return false;
		}
		lSpuSkuFlag = Integer.parseInt(lSpuSkuFlagStr);
		return true;
	}
	
	private boolean checkLSubMinNoStr(Configuration conf){
		String lSubMinNoStr = conf.get(MockCommon.LSUB_MIN_NO); 
		if(this.checkConf(lSubMinNoStr, String.format("%s is null", MockCommon.LSUB_MIN_NO)) == false){
			return false;
		}
		lSubMinNo = Long.parseLong(lSubMinNoStr);
		return true;
	}
	
	private boolean checkLSpuMaxNoStr(Configuration conf){
		String lSpuMaxNoStr = conf.get(MockCommon.LSUB_MAX_NO);
		if(this.checkConf(lSpuMaxNoStr, String.format("%s is null", MockCommon.LSUB_MAX_NO)) == false){
			return false;
		}
		lSpuMaxNo = Long.parseLong(lSpuMaxNoStr);
		return true;
	}
	
	private boolean checkPCommintCountStr(Configuration conf){
		String pCommintCountStr = conf.get(MockCommon.P_COMMINT_COUNT);
		if(this.checkConf(pCommintCountStr, String.format("%s is null", MockCommon.P_COMMINT_COUNT)) == false){
			return false;
		}	
		pCommintCount = Integer.parseInt(pCommintCountStr);
		return true;
	}

	@Override
	public RecordReader<LongWritable, MockWritable> createRecordReader(InputSplit split,
			TaskAttemptContext context) throws IOException,
			InterruptedException {
		MockInputSplit mockInputSplit = (MockInputSplit)split;
		RecordReader<LongWritable, MockWritable> recordReader = new MockRecordReader(split, 
				mockInputSplit.getpChgDateFrom(), 
				mockInputSplit.getpChgDateTo(), 
				mockInputSplit.getBatchNo(), 
				mockInputSplit.getlSubMinNo(), 
				mockInputSplit.getlSpuMaxNo(), 
				mockInputSplit.getlSpuSkuFlag(), 
				mockInputSplit.getpCommintCount() ,
				mockInputSplit.getdBDriver() ,
				mockInputSplit.getConnStr() ,
				mockInputSplit.getName() ,
				mockInputSplit.getPasswd() ,
				mockInputSplit.getCallQuery());
		return recordReader;
	}

}
