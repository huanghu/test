package hadoop.job.sequence;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;

public class SequenceFileWriteDemo {
	private static final String[] DATA = {
		"One ,two ,buckle ,my shoe",
		"Three ,four ,shut the door",
		"File ,six ,pick up sticks",
		"Seven, eight, lay them straight"
	};
	
	public static void main(String[] args){
		SequenceFile.Writer writer = null;
		try {
			String uri = "/user/huanghu/sequ/";
			Configuration conf = new Configuration();
			conf.set("fs.default.name", "hdfs://192.168.225.99:8020/");
			conf.set("mapred.job.tracker", "192.168.225.99:8021");
			conf.set("hadoop.job.user","root");
			
			FileSystem fs = FileSystem.get(URI.create(uri) ,conf);
			Path path = new Path(uri);
			IntWritable key = new IntWritable();
			Text value = new Text();
			
			writer = SequenceFile.createWriter(fs, conf ,path ,key.getClass() ,value.getClass());
			for(int i = 0 ;i < 100 ;i ++){
				key.set(100 - i);
				value.set(DATA[i % DATA.length]);
				System.out.println(String.format("[%s\t%s\n]" ,writer.getLength() ,key ,value));
				writer.append(key, value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			IOUtils.closeStream(writer);
		}

	}
}
