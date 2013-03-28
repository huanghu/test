package hadoop.job.tools;

import org.apache.hadoop.conf.Configuration;

public class Constant {
	public final static String SEPARATE_SYMBOL = "\t";
	
	public static String HOST_NAME = "hadoop-master.360buy.com"; //开发集群
	public static String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	public static String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public static void getConfiguaration(Configuration configuration ,
			String hostName ,
			String queue){
		Configuration conf = configuration;
		try {
			String fsDefaultName = String.format("hdfs://%s:8020/", hostName);
			String mapredJobTracker = String.format("%s:8021", hostName);
			
			conf.set("fs.default.name", fsDefaultName);
			conf.set("mapred.job.tracker", mapredJobTracker);
			conf.set("mapred.job.queue.name", queue);
			conf.set("hadoop.job.user","huanghu");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
