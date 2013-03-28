package hadoop.job.zookeeper.base;

import hadoop.job.zookeeper.ConnectionWatcher;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;

/**
 * 在一个组下面再建一个子组，程序关闭后，子组删除。
 * @author huanghu
 *
 */
public class JoinGroup extends ConnectionWatcher {
	
	public void join(String groupName ,String memberName) throws KeeperException ,InterruptedException{
		String path = "/" + groupName + "/" + memberName;
		//停止应用程序后，并不会马上删除node，可能是有一些远程通信导致延迟。
		String createdPath = zk.create(path, null, Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
		System.out.println("Created " + createdPath);
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		String groupName = "zoo";
		String memberName = "panda";
		
		JoinGroup joinGroup = new JoinGroup();
		joinGroup.connect(hosts);
		joinGroup.join(groupName, memberName);
		
		Thread.sleep(Long.MAX_VALUE);
	}
}
