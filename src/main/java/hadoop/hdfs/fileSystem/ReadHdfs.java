package hadoop.hdfs.fileSystem;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * 读取HDFS的文件。没测试过，只是代码
 * @author huanghu
 *
 */
public class ReadHdfs {
	public static void main(String[] args) throws IOException{
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path path = new Path("");
		FSDataInputStream inputStream = fs.open(path);
		BufferedInputStream bstream = new BufferedInputStream(inputStream);
		BufferedReader reader = new BufferedReader(new InputStreamReader(bstream));
		String line;
		while((line = reader.readLine()) != null){
			System.out.println("line" + line);
		}
		inputStream.close();
		bstream.close();
		reader.close();
	}
}
