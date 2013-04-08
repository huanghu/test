package hadoop.job.zookeeper.demo.distributeLock;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
import org.apache.zookeeper.ZooKeeper;

public class ZnodeCluterWatcher implements Watcher {
	
	ZooKeeper zk;
	
	private volatile boolean isDelete = false;
	
	public ZnodeCluterWatcher(ZooKeeper zk){
		this.zk = zk;
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getType() == EventType.NodeDeleted) {
			isDelete = true;
			System.out.println(String.format("%s node is delete", event.getPath()));
		}
	}

	public boolean getIsDelete() {
		return isDelete;
	}
	
	
}
