package hadoop.job.monitor;

import hadoop.job.experiment.ExpeBasic;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.JobStatus;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class MonitorJob extends Configured implements Tool  {
	private String HOST_NAME = "hadoop-test-master.360buy.com";
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);

	@SuppressWarnings("deprecation")
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user","root");
		
		Job job = new Job(conf ,"RPCtest");
		job.setJarByClass(ExpeBasic.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
		
		JobClient client = new JobClient((JobConf)job.getConfiguration());
		@SuppressWarnings("unused")
		JobStatus[] status = client.getAllJobs();
		
		System.out.println("status: " + client.getJob("job_201211151416_0794"));
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			args = new String[]{"/user/huanghu/text" ,"/user/huanghu/output/bb"}; 
			int res = ToolRunner.run(new Configuration(), new MonitorJob() ,args);
			System.exit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
