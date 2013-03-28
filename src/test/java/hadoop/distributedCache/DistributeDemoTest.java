package hadoop.distributedCache;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.junit.Before;
import org.junit.Test;


public class DistributeDemoTest {
	private URI[] uri ;
	private String url = "/user/huanghu/abc-mapping.xml";
	private Configuration conf = null;
	private String HOST_NAME = "hadoop-master.360buy.com"; //开发集群
	private String FS_DEFAULT_NAME = String.format("hdfs://%s:8020/", HOST_NAME);
	private String MAPRED_JOB_TRACKER = String.format("%s:8021", HOST_NAME);
	
	@Before
	public void before(){
		try {
			uri = new URI[]{new URI(url)};
			conf = new Configuration();
			conf.set("fs.default.name", FS_DEFAULT_NAME);
			conf.set("mapred.job.tracker", MAPRED_JOB_TRACKER);
			conf.set("hadoop.job.user","root");
			conf.set("mapred.job.queue.name", "erpmerge");
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){
		try {
			DistributedCache.setCacheFiles(uri, conf);
			URI[] u = DistributedCache.getCacheFiles(conf);
			System.out.println("cache " + u);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		DistributedCache.setCacheFiles(uri, conf);
		
	}
}
