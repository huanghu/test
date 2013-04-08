package hadoop.job.zookeeper.demo.distributeLock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;
import hadoop.job.zookeeper.demo.ZnodeCommon;

/**
 * 分布式锁
 * 集群中的一个节点
 * @author huanghu
 *
 */
public class ZnodeCluter extends ConnectionWatcher {
	
	public void run(String path) throws KeeperException, InterruptedException{
		String fullPath = ZnodeCommon.create(zk, path, CreateMode.EPHEMERAL_SEQUENTIAL);
		String mainPath = String.format("/%s", Constants.SCHEDULE_NODE_MAIN_PATH);
		List<String> nodes = ZnodeCommon.getNodes(zk, mainPath, false);
		
		//假设nodes是降序排序的，第一个为最小，这个得看过源码才能确定
		if((fullPath == null || fullPath.equals("")) || 
				(nodes == null || nodes.size() == 0)){
			System.out.println("创建节点不成功或者当前父节点下没有子节点");
			return;
		}
		
		String minNode = nodes.get(0);
		String currentNode = fullPath.replace(mainPath + "/", "");
		if(currentNode.equals(minNode)){
			//是序号最小的节点
			while(true){
				System.out.println("开始执行。");
				TimeUnit.SECONDS.sleep(60);
			}
		}else{
			//监听minNode
			ZnodeCluterWatcher watcher = new ZnodeCluterWatcher(zk);
			String preNode = Utils.getPreviousNode(nodes, currentNode);
			String preNodePath = String.format("/%s/%s", Constants.SCHEDULE_NODE_MAIN_PATH ,preNode);
			System.out.println("preNodePath " + preNodePath);
			zk.exists(preNodePath, watcher);
			while (!watcher.getIsDelete()) {
				System.out.println("等待节点删除.");
				TimeUnit.SECONDS.sleep(30);
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		ZnodeCluter cluter = new ZnodeCluter();
		
		cluter.connect(Constants.HOSTS);
		String path = String.format("/%s/%s", Constants.SCHEDULE_NODE_MAIN_PATH ,Constants.SCHEDULE_NODE_SUB_PATH);
		cluter.run(path);
		
	}
}
