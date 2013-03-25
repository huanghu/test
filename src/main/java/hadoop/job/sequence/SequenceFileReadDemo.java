package hadoop.job.sequence;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.util.ReflectionUtils;

public class SequenceFileReadDemo {
	public static void main(String[] args) throws IOException{
		String uri = "/user/huanghu/sequ/part-m-00000";
		Configuration conf = new Configuration();
		conf.set("fs.default.name", "hdfs://192.168.225.99:8020/");
		conf.set("mapred.job.tracker", "192.168.225.99:8021");
		conf.set("hadoop.job.user","root");
		
		FileSystem fs = FileSystem.get(URI.create(uri) ,conf);
		Path path = new Path(uri);
		SequenceFile.Reader reader = null;
		
		try {
			reader = new SequenceFile.Reader(fs ,path ,conf);
			Writable key = (Writable)ReflectionUtils.newInstance(reader.getKeyClass(), conf);
			Writable value = (Writable)ReflectionUtils.newInstance(reader.getValueClass(), conf);
			long position = reader.getPosition();
			while(reader.next(key, value)){
				String syncSeen = reader.syncSeen() ? "*" : "";
				System.out.println(String.format("[%s%s]\t%s\t%s\n" ,position ,syncSeen ,key ,value));
				position = reader.getPosition();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			IOUtils.closeStream(reader);
		}
	}
}
