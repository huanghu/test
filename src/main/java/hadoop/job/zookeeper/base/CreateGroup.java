package hadoop.job.zookeeper.base;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.Watcher.Event.KeeperState;

/**
 * @author huanghu
 *
 */
public class CreateGroup implements Watcher {

	private static final int SESSSION_TIMEOUT = 5000;
	
	private ZooKeeper zk;
	private CountDownLatch connectedSignal = new CountDownLatch(1);
	
	public void connect(String hosts) throws IOException ,InterruptedException{
		zk = new ZooKeeper(hosts ,SESSSION_TIMEOUT ,this);
		connectedSignal.await();
	}

	public void process(WatchedEvent event){
		if (event.getState() == KeeperState.SyncConnected) {
			connectedSignal.countDown();
		}
	}
	
	public void create(String groupName) throws KeeperException ,InterruptedException{
		String path = "/" + groupName;
		String createdPath = zk.create(path, null, Ids.OPEN_ACL_UNSAFE ,CreateMode.PERSISTENT);
		System.out.println("Created " + createdPath);
	}
	
	public void close() throws InterruptedException{
		zk.close();
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		String groupName = "zoo";
		CreateGroup createGroup = new CreateGroup();
		createGroup.connect(hosts);
		createGroup.create(groupName);
	}

}
