package hadoop.job.zookeeper.demo.schedule;

import hadoop.job.zookeeper.demo.ZnodeCommon;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.Watcher.Event.EventType;

/**
 * 节点改变的监听器
 * @author huanghu
 *
 */
public class NodeChangeWatcher implements Watcher {

	ZooKeeper zk;
	
	public NodeChangeWatcher(ZooKeeper zk){
		this.zk = zk;
	}
	
	@Override
	public void process(WatchedEvent event) {
		if(event.getType() == EventType.NodeDataChanged){
			try {
				String data = ZnodeCommon.getData(zk, event.getPath());
				System.out.println("data change");
				System.out.println("data " + data);
			} catch (KeeperException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
