package hadoop.job.zookeeper.demo.exists;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.Stat;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;

/**
 * 通过exists监听节点，如果创建了，就响应。执行的watcher在link{#ZnodeWatcher.java}
 * @author huanghu
 *
 */
public class ZnodeExists extends ConnectionWatcher{
	
	public static final String groupName = "zoos";
	
	public void exists(String path){
		try {
			Watcher watcher = new ZnodeWatcher();
			Stat stat = zk.exists(path, watcher);
			System.out.println("stat " + stat);
			
		} catch (KeeperException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void create(String path){
		try {
			zk.create(path, null, Ids.OPEN_ACL_UNSAFE ,CreateMode.EPHEMERAL);
		} catch (KeeperException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String path){
		try {
			int version = -1;
			zk.delete(path, version);
		} catch (KeeperException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) throws Exception{
		ZnodeExists exists = new ZnodeExists();
		String path = "/" + groupName;
		exists.connect(Constants.HOSTS);
		exists.exists(path);
		exists.create(path);
		
	}
}
