package hadoop.job.har;

import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.tools.HadoopArchives;
import org.apache.hadoop.util.ToolRunner;

public class HarDemo {
	public static void main(String[] args){
//		args = new String[6];
//		
//		args[0] = "-archiveName";
//		args[1] = "files1.har";
//		args[2] = "-p";
//		args[3] = "/user/root/input_data/cash/orderRefund/archive";
//		args[4] = "*/part*.gz";
//		args[5] = "/user/root/input_data/cash/orderRefund/";
		
		System.out.println("args " + args);
		
//		HadoopArchives.main(args);
	    JobConf job = new JobConf(HadoopArchives.class);
	    HadoopArchives harchives = new HadoopArchives(job);
	    @SuppressWarnings("unused")
		int ret = 0;

	    try{
	      ret = ToolRunner.run(harchives, args);
	    } catch(Exception e) {
	      System.err.println(e.getClass().getSimpleName() + " in archives");
	      final String s = e.getLocalizedMessage();
	      if (s != null) {
	        System.err.println(s);
	      } else {
	        e.printStackTrace(System.err);
	      }
	      
	    }
	}
}
