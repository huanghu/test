package hadoop.job.zookeeper.demo.schedule;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;
import hadoop.job.zookeeper.demo.ZnodeCommon;

/**
 * 分布式调度 运行任务机
 * @author huanghu
 *
 */
public class ZnodeRun extends ConnectionWatcher{
	
	public void run(String path) throws KeeperException, InterruptedException{
		Watcher watcher = new NodeChangeWatcher(zk);
		
		ZnodeCommon.create(zk, path, CreateMode.EPHEMERAL);		
		while (true) {
			if(ZnodeCommon.exists(zk, path ,false) == true){
				zk.getData(path, watcher, null);				
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		ZnodeRun znodeRun = new ZnodeRun();
		znodeRun.connect(Constants.HOSTS);
		
		String path = String.format("/%s", Constants.SCHEDULE_NODE_MAIN_PATH);
		ZnodeCommon.create(znodeRun.zk, path, CreateMode.PERSISTENT);
		
		path = String.format("/%s/%s", Constants.SCHEDULE_NODE_MAIN_PATH ,Constants.SCHEDULE_NODE_SUB_PATH);
		znodeRun.run(path);
	}
}
