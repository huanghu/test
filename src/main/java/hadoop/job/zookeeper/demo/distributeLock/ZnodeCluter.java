package hadoop.job.zookeeper.demo.distributeLock;


import java.util.Arrays;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;
import hadoop.job.zookeeper.demo.ZnodeCommon;

/**
 * 集群中的一个节点
 * @author huanghu
 *
 */
public class ZnodeCluter extends ConnectionWatcher {
	
	public void run(String path) throws KeeperException, InterruptedException{
		String fullPath = ZnodeCommon.create(zk, path, CreateMode.EPHEMERAL_SEQUENTIAL);
		String mainPath = String.format("/%s", Constants.SCHEDULE_NODE_MAIN_PATH);
		List<String> nodes = ZnodeCommon.getNodes(zk, mainPath, false);
		String[] nodesArr = nodes.toArray(new String[nodes.size()]);
		
		Arrays.sort(nodesArr, new Compare<String>());
		System.out.println("nodeArr " + nodesArr);
	}
	
	public static void main(String[] args) throws Exception{
		ZnodeCluter cluter = new ZnodeCluter();
		
		cluter.connect(Constants.HOSTS);
//		cluter.run(path);
		
	}
}
