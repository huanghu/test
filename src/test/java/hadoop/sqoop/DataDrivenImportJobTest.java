package hadoop.sqoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.manager.GenericJdbcManager;
import com.cloudera.sqoop.manager.ImportJobContext;
import com.cloudera.sqoop.manager.SqlManager;
import com.cloudera.sqoop.mapreduce.DataDrivenImportJob;
import com.cloudera.sqoop.util.ImportException;


public class DataDrivenImportJobTest {
	SqoopOptions options = new SqoopOptions();
	DataDrivenImportJob dataJob = null;
	Configuration conf = new Configuration();
	ImportJobContext context;
	SqlManager manager = null;
	
	private String HOST_NAME = "hadoop-master.360buy.com";
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	@Before
	public void before(){
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user", "root");

		this.setSqoopOptions();
		
		String driverClass = "com.mysql.jdbc.Driver";
		manager = new GenericJdbcManager(driverClass ,options);
		
		String jarFile = "";
		Path outputPath = new Path("/user/huanghu/sqoopTest");
		String tableName = "";
		context = new ImportJobContext(tableName, jarFile,options, outputPath);
		context.setConnManager(manager);
		dataJob = new DataDrivenImportJob(options, context.getInputFormat(),context);
	}
	
	private void setSqoopOptions(){
		//options.getConnectString()
		String conncectString = "jdbc:mysql://192.168.227.17.:3359/ebook";
		options.setConnectString(conncectString);	
		
		String sqlQuery = "select * from ebook";
		options.setSqlQuery(sqlQuery);
	}
	
	@Test
	public void test(){
		try {
			String ormJarFile = null;
			dataJob.runImport(null, ormJarFile, "ebook_id", conf);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ImportException e) {
			e.printStackTrace();
		}
	}
}
