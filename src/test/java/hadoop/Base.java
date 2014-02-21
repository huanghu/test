package hadoop;

import org.apache.hadoop.conf.Configuration;

public class Base {
	private String HOST_NAME = "hadoop-master.360buy.com"; //������Ⱥ
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	Configuration conf;
	public Base() {
		this.conf = new Configuration();
		conf = new Configuration();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","root");
		conf.set("mapred.job.queue.name", "erpmerge");
	}

	public Configuration getConf() {
		return conf;
	}
	
}
