package hadoop.job.experiment;

import hadoop.job.experiment.ExpeBasic.MapClass;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * 在集群中通过命令行执行
 * @author huanghu
 *
 */
public class ExpeBasicCommandLine extends Configured implements Tool {

	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = getConf();
		
		Job job = new Job(conf ,"RPCtest");
		job.setJarByClass(ExpeBasic.class);
		
		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		job.setMapperClass(MapClass.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
		return 0;
	}
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//输入输出是oozie的examples的路径
			args = new String[]{"/user/root/examples/input-data/text" ,"/user/root/examples/output-data/map-reduce"}; 
			int res = ToolRunner.run(new Configuration(), new ExpeBasicCommandLine() ,args);
			System.exit(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
