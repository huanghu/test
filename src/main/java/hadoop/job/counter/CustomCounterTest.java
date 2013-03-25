package hadoop.job.counter;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.JobID;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class CustomCounterTest extends Configured implements Tool {
	private String HOST_NAME = "hadoop-master.360buy.com";
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public int run(String[] args) throws Exception {

		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user", "root");
		@SuppressWarnings("unused")
		int id = 245; 
		@SuppressWarnings("unused")
		String jtIdentifier = "201211201013";
		String jobs = "job_201211201013_0245";
		
		Job job = new Job(conf ,"CustomCounterTest");
		job.setJarByClass(CustomCounterTest.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
	
		JobConf jobConf = new JobConf(conf ,CounterTest.class);
	    jobConf.setJobName("CustomCounterTest");
	    
	    JobClient client = new JobClient(jobConf);
	    RunningJob runningJob = client.getJob(JobID.forName(jobs));
	 
	    System.out.println(String.format("runningJob1 %s %s " , runningJob.getID().getJtIdentifier() ,runningJob.getCounters().getCounter(CounterEnum.MAP)));
	    
		return 0;
	}

	public static void main(String[] args) throws Exception{
		int res = ToolRunner.run(new Configuration(), new CustomCounterTest() ,args);
		System.exit(res);		
	}

}
