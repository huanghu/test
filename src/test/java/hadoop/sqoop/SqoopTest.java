package hadoop.sqoop;

import com.cloudera.sqoop.ConnFactory;
import com.cloudera.sqoop.metastore.JobData;

import com.cloudera.sqoop.manager.ManagerFactory;

import com.cloudera.sqoop.manager.ImportJobContext;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapReduceDriver;
import org.apache.oozie.action.hadoop.SqoopMain;
import org.junit.Before;
import org.junit.Test;



import com.cloudera.sqoop.Sqoop;
import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.manager.ConnManager;
import com.cloudera.sqoop.manager.MySQLManager;
import com.cloudera.sqoop.manager.SqlManager;
import com.cloudera.sqoop.tool.ImportTool;


public class SqoopTest {
	String[] args = new String[0];
	MySQLManager sqlManager = null;
	ConnManager connManager;
	
	@Before
	public void before(){
		try {
			setArgs();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){
		Configuration conf = new Configuration();
	    SqoopOptions opts = new SqoopOptions(conf);
	    ImportTool tool = new ImportTool();
	    
		sqlManager = new MySQLManager(opts);
	    conf.set(ConnFactory.FACTORY_CLASS_NAMES_KEY, AlwaysDummyFactory.class.getName());
	    ConnFactory factory = new ConnFactory(conf);
	    try {
			ConnManager manager = factory.getManager(
					new JobData(new SqoopOptions(), tool));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		opts.setTableName("rbt_agr_calc_time_point");
	    Sqoop sqoop = new Sqoop(tool, conf, opts);
	    Sqoop.runSqoop(sqoop, args);
		
	}
	
	  public static class AlwaysDummyFactory extends ManagerFactory {
		    public ConnManager accept(JobData data) {
		      // Always return a new DummyManager
		      return new DummyManager();
		    }
		  }
	  
	  /**
	   * This implementation doesn't do anything special.
	   */
	  public static class DummyManager extends ConnManager {
	    public void close() {
	    }

	    public String [] listDatabases() {
	      return null;
	    }

	    public String [] listTables() {
	      return null;
	    }

	    public String [] getColumnNames(String tableName) {
	      return null;
	    }

	    public String getPrimaryKey(String tableName) {
	      return null;
	    }

	    /**
	    * Default implementation.
	    * @param sqlType     sql data type
	    * @return            java data type
	    */
	    public String toJavaType(int sqlType) {
	      return null;
	    }

	    /**
	    * Default implementation.
	    * @param sqlType     sql data type
	    * @return            hive data type
	    */
	    public String toHiveType(int sqlType) {
	      return null;
	    }

	    public Map<String, Integer> getColumnTypes(String tableName) {
	      return null;
	    }

	    public ResultSet readTable(String tableName, String [] columns) {
	      return null;
	    }

	    public Connection getConnection() {
	      return null;
	    }

	    public String getDriverClass() {
	      return null;
	    }

	    public void execAndPrint(String s) {
	    }

	    public void importTable(ImportJobContext context) {
	    }

	    public void release() {
	    }
	  }
	
	private void setArgs() throws Exception{
		List<String> argsList = new ArrayList<String>();
		
		/*
		 * --connect 'jdbc:sqlserver://10.10.224.153;username=testwrite;password=test_123_*();database=peking' --query
		 *  "select top 10 'stock' as t,wid,orgid,sid,numck,numrk,numzt,Stock,NumOrderYd,NumTransferYdRk,NumTransferYdCk from Core_StockStatDay(nolock) WHERE \$CONDITIONS" 
		 *  --where "statday=20120215" --split-by Wid --fields-terminated-by '\t' --target-dir example/input_stock
		 * 
		 */
		argsList.add("--connect");
		argsList.add("'jdbc:mysql://192.168.225.101:3306/jdrebate'");
		
		/*
		 * --username erp --password erp
		 */
		argsList.add("--username");
		argsList.add("rbt");
		argsList.add("--password");
		argsList.add("rbt");
		
		argsList.add("--table");
		argsList.add("rbt_agr_calc_time_point");
		
//		argsList.add("--columns");
//		argsList.add("id,agr_no");
		
//		argsList.add("--query");
//		argsList.add("\"SELECT id,agr_no FROM rbt_agr_calc_time_point where $CONDITIONS\"");
//		
//		/*
//		 *--where "1=1" 
//		 */
//		argsList.add("--where");
//		argsList.add("1=1");
		
		argsList.add("--split-by");
		argsList.add("id");
		
		argsList.add("--fields-terminated-by");
		argsList.add("'\t'");
//		
//		argsList.add("--target-dir");
//		argsList.add("example/input_stock");
		
		args = argsList.toArray(args);
		System.out.println("args " + args.length);
	}
}
