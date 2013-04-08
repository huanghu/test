package hadoop.zookeeper;

import hadoop.job.zookeeper.demo.distributeLock.Utils;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {
	List<String> nodes = null;
	@Test
	public void test(){
		String[] arr = new String[]{"nodes00001" ,"nodes00002" ,"nodes00003"};
		String node = Utils.getPreviousNode(Arrays.asList(arr), "nodes00003");
		System.out.println("node " + node);
	} 
}
