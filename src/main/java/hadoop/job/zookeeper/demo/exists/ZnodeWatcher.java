package hadoop.job.zookeeper.demo.exists;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;

public class ZnodeWatcher implements Watcher {

	@Override
	public void process(WatchedEvent event) {
		if(event.getType() == EventType.NodeCreated){
			System.out.println(String.format("节点:%s创建了", ZnodeExists.groupName));
		}
	}
}
