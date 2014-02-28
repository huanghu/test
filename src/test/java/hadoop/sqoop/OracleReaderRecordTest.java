package hadoop.sqoop;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.apache.hadoop.mapreduce.lib.db.DBWritable;
import org.junit.Before;
import org.junit.Test;

import com.cloudera.sqoop.mapreduce.db.DBConfiguration;
import com.cloudera.sqoop.mapreduce.db.DataDrivenDBInputFormat;
import com.cloudera.sqoop.mapreduce.db.DataDrivenDBRecordReader;
import com.cloudera.sqoop.mapreduce.db.OracleDBRecordReader;

public class OracleReaderRecordTest {
	OracleDBRecordReader<DBWritable> reader = null;
	Configuration conf = null;
	DBConfiguration dbConf = null;
	DataDrivenDBInputFormat<DBWritable> inputFormat = null;
	
	@Before
	public void before(){
		conf = new Configuration();
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@10.10.225.20:1521:testdb1";
		String userName = "popware";
		String passwd = "popware";
		String query = "select 'mtlSystemItemsPop1' as type , a.ware_id ,b.attributes ,b.sku_id ," +
				"a.title,c.cubage,a.weight from ware_ware a inner join ware_sku b on a.ware_id = " +
				"b.ware_id inner join ware_ext c on a.ware_id = c.ware_id where " +
				"a.modified >= to_date('2012-03-26 00:00:00','yyyy-mm-dd hh24:mi:ss') and " +
				"a.modified < to_date('2012-03-27 00:00:00','yyyy-mm-dd hh24:mi:ss') and $CONDITIONS";
		String splitBy = "a.ware_id";
		//INPUT_BOUNDING_QUERY --boundary-query
		String boundaryQuery = "select min(ware_id) ,max(ware_id) from ware_ware";
		
		DBConfiguration.configureDB(conf, driverClass, dbUrl, userName, passwd);
		conf.set(com.cloudera.sqoop.mapreduce.db.DBConfiguration.INPUT_QUERY, query);
		conf.set(com.cloudera.sqoop.mapreduce.db.DBConfiguration.INPUT_BOUNDING_QUERY, boundaryQuery);
		conf.set(com.cloudera.sqoop.mapreduce.db.DBConfiguration.INPUT_ORDER_BY_PROPERTY, splitBy);
		
		dbConf = new DBConfiguration(conf);
		inputFormat = new DataDrivenDBInputFormat<DBWritable>();
		inputFormat.setConf(conf);


	} 
	
	@Test
	public void test(){
		try {

			Job job = new Job(conf);
			List<InputSplit> splits = inputFormat.getSplits(job);
			System.out.println("splits " + splits.size());
			
			TaskAttemptID taskId = new TaskAttemptID();
			TaskAttemptContext context = new TaskAttemptContext(conf, taskId);
			DataDrivenDBRecordReader<DBWritable> reader = (DataDrivenDBRecordReader<DBWritable>)inputFormat.createRecordReader(splits.get(0), context);
			//(OracleDBRecordReader<DBWritable>)
			System.out.println("reader " + reader.nextKeyValue());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
}
