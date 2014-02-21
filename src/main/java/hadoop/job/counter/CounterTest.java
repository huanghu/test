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

/**
 * ���ü�����
 * @author huanghu
 *
 */
public class CounterTest extends Configured implements Tool {
	private String HOST_NAME = "hadoop-master.360buy.com";
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		conf.set("fs.default.name", FS_DEFAULT_NAME);
		conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
		conf.set("hadoop.job.user", "root");
		int id = 238; 
		String jtIdentifier = "201211201013";
		
		Job job = new Job(conf ,"CounterTest");
		job.setJarByClass(CounterTest.class);
		((JobConf)job.getConfiguration()).setJar("D:\\java\\program\\test\\target\\test-0.0.1.jar");
	
		JobConf jobConf = new JobConf(conf ,CounterTest.class);
	    jobConf.setJobName("counterTest");
	    
	    JobClient client = new JobClient(jobConf);
	    JobID jobId = new JobID(jtIdentifier ,id);
	    RunningJob runningJob = client.getJob(jobId);
	    String group = "org.apache.hadoop.mapred.Task$Counter";
	    String name = "REDUCE_INPUT_RECORDS";
	    System.out.println("runningJob " + runningJob.getCounters().findCounter(group, name).getCounter());
	    
		return 0;
	}
	
	public static void main(String[] args) throws Exception{
		int res = ToolRunner.run(new Configuration(), new CounterTest() ,args);
		System.exit(res);		
	}

}
