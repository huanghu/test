package hadoop.job.mock;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class RunJob extends Configured implements Tool{

//	private String HOST_NAME = "master.slave"; //本地集群
	private String HOST_NAME = "hadoop-master.360buy.com"; //开发集群
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	@Override
	public int run(String[] args) throws Exception {
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","huanghu");
		conf.set("mapred.job.queue.name", "erpmerge");
		
		setConfiguration(conf);
		
		System.setProperty("path.separator", ":");
	    FileSystem fs = FileSystem.getLocal(conf);
	    String appsPath = "D:\\Java\\program\\ebsdi\\maven.1379495293888\\ebsdi-apps\\target\\ebsdi-apps.jar";
	    String domainPath = "D:\\Java\\program\\ebsdi\\maven.1379495293888\\ebsdi-domain\\target\\ebsdi-domain.jar";
	    String corePath = "D:\\Java\\program\\ebsdi\\maven.1379495293888\\ebsdi-core\\target\\ebsdi-core.jar";
	    String jdbcLib = "/user/huanghu/share/lib/ojdbc6.jar";
		String finalAppsPath = new Path(appsPath).makeQualified(fs).toString();
		String finalDomainPath = new Path(domainPath).makeQualified(fs).toString();
		String finalCorePath = new Path(corePath).makeQualified(fs).toString();
		
		conf.set("tmpjars", String.format("%s,%s,%s,%s", finalAppsPath ,finalDomainPath ,finalCorePath ,jdbcLib));
		Job job = new Job(conf ,"Mock");
		job.setJarByClass(RunJob.class);
		
		job.setInputFormatClass(MockInputFormat.class);
		job.setOutputFormatClass(MockOutputFormat.class);
		job.setMapperClass(MockMR.MockMapper.class);
		job.setNumReduceTasks(0);
		job.setOutputKeyClass(NullWritable.class);
		job.setOutputValueClass(NullWritable.class);
		
		job.waitForCompletion(true);
		
		return 0;
	}
	
	private void setConfiguration(Configuration conf){
		conf.set(MockCommon.P_CHG_DATE_FROM, "2013-08-01 00:00:00");
		conf.set(MockCommon.P_CHG_DATE_TO, "2013-09-01 00:00:00");
		conf.set(MockCommon.BATCH_NO, "1111");
		conf.set(MockCommon.LSPU_SKU_FLAG, "1");
		conf.set(MockCommon.LSUB_MIN_NO, "0");
		conf.set(MockCommon.LSUB_MAX_NO, "3");
		conf.set(MockCommon.P_COMMINT_COUNT, "5000");
		conf.set(MockCommon.DB_DRIVER, "oracle.jdbc.driver.OracleDriver");
		conf.set(MockCommon.CONN_STR, "jdbc:oracle:thin:@192.168.225.20:1528:SIT2");
		conf.set(MockCommon.NAME, "apps");
		conf.set(MockCommon.PASSWD, "appssit2");
		conf.set(MockCommon.CALL_QUERY, "call MockCux(? ,? ,? ,? ,? ,?)}");
	}

	public static void main(String[] args){
		try {
			ToolRunner.run(new Configuration(), new RunJob(), args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
