package hadoop.hdfs.fileSystem;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * 读取HDFS的文件。没测试过，只是代码
 * @author huanghu
 *
 */
public class WriteHdfs {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        FileSystem hdfs = FileSystem.get(conf);
        byte[] buff = "hello hadoop world!\n".getBytes();
        Path dfs=new Path("/test");
        FSDataOutputStream outputStream=hdfs.create(dfs);
        outputStream.write(buff,0,buff.length);
    }
}
