package hadoop.job.mock;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MockInputSplit extends InputSplit implements WritableComparable<MockInputSplit> {
	Logger logger = LoggerFactory.getLogger(MockInputSplit.class);
	
	private String pChgDateFrom;
	private String pChgDateTo;
	private String batchNo; //批次号
	private int lSpuSkuFlag;
	private long lSubMinNo; //最大的seq_no
	private long lSpuMaxNo; //最小的seq_no
	private int pCommintCount;
	private String dBDriver;
	private String connStr;
	private String name;
	private String passwd;
	private String callQuery;
	
	public MockInputSplit(){}
	
	public MockInputSplit(String pChgDateFrom ,
			String pChgDateTo ,
			String batchNo ,
			int lSpuSkuFlag ,
			long lSubMinNo ,
			long lSpuMaxNo ,
			int pCommintCount ,
			String dBDriver ,
			String connStr ,
			String name ,
			String passwd ,
			String callQuery){
		this.pChgDateFrom = pChgDateFrom;
		this.pChgDateTo = pChgDateTo;
		this.batchNo = batchNo;
		this.lSpuSkuFlag = lSpuSkuFlag;
		this.lSubMinNo = lSubMinNo;
		this.lSpuMaxNo = lSpuMaxNo;
		this.pCommintCount = pCommintCount;
		this.dBDriver = dBDriver;
		this.connStr = connStr;
		this.name = name;
		this.passwd = passwd;
		this.callQuery = callQuery;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		
		out.writeUTF(pChgDateFrom);
		out.writeUTF(pChgDateTo);
		out.writeUTF(batchNo);
		out.writeInt(lSpuSkuFlag);
		out.writeLong(lSubMinNo);
		out.writeLong(lSpuMaxNo);
		out.writeInt(pCommintCount);
		out.writeUTF(dBDriver);
		out.writeUTF(connStr);
		out.writeUTF(name);
		out.writeUTF(passwd);
		out.writeUTF(callQuery);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		pChgDateFrom = in.readUTF();
		pChgDateTo = in.readUTF();
		batchNo = in.readUTF();
		lSpuSkuFlag = in.readInt();
		lSubMinNo = in.readLong();
		lSpuMaxNo = in.readLong();
		pCommintCount = in.readInt();
		dBDriver = in.readUTF();
		connStr = in.readUTF();
		name = in.readUTF();
		passwd = in.readUTF();
		callQuery = in.readUTF();
	}


	@Override
	public int compareTo(MockInputSplit o) {
		if(o == null){
			return 1;
		}
		
		if (lSubMinNo > o.getlSubMinNo()) {
			return 1;
		}else if(lSubMinNo < o.getlSubMinNo()){
			return -1;
		}else{
			//相等
			return 0;
		}
		
	}	

	@Override
	public long getLength() throws IOException, InterruptedException {
		long length = 0;
		length = lSpuMaxNo - lSubMinNo;
		return length;
	}

	@Override
	public String[] getLocations() throws IOException, InterruptedException {
		return new String[]{};
	}
	
	public String getpChgDateFrom() {
		return pChgDateFrom;
	}

	public void setpChgDateFrom(String pChgDateFrom) {
		this.pChgDateFrom = pChgDateFrom;
	}

	public String getpChgDateTo() {
		return pChgDateTo;
	}

	public void setpChgDateTo(String pChgDateTo) {
		this.pChgDateTo = pChgDateTo;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public long getlSubMinNo() {
		return lSubMinNo;
	}

	public void setlSubMinNo(long lSubMinNo) {
		this.lSubMinNo = lSubMinNo;
	}

	public long getlSpuMaxNo() {
		return lSpuMaxNo;
	}

	public void setlSpuMaxNo(long lSpuMaxNo) {
		this.lSpuMaxNo = lSpuMaxNo;
	}

	public int getlSpuSkuFlag() {
		return lSpuSkuFlag;
	}

	public void setlSpuSkuFlag(int lSpuSkuFlag) {
		this.lSpuSkuFlag = lSpuSkuFlag;
	}

	public int getpCommintCount() {
		return pCommintCount;
	}

	public void setpCommintCount(int pCommintCount) {
		this.pCommintCount = pCommintCount;
	}

	public String getdBDriver() {
		return dBDriver;
	}

	public void setdBDriver(String dBDriver) {
		this.dBDriver = dBDriver;
	}

	public String getConnStr() {
		return connStr;
	}

	public void setConnStr(String connStr) {
		this.connStr = connStr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getCallQuery() {
		return callQuery;
	}

	public void setCallQuery(String callQuery) {
		this.callQuery = callQuery;
	}
}
