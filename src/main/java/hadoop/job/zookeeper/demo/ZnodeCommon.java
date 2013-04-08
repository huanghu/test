package hadoop.job.zookeeper.demo;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.Stat;

/**
 * 一些常用的增删查改操作。
 * @author huanghu
 *
 */
public class ZnodeCommon {
	
	/**
	 * 创建节点
	 * @param zk
	 * @param path
	 * @param mode
	 * @return
	 * @throws KeeperException
	 * @throws InterruptedException
	 */
	public static String create(ZooKeeper zk ,String path ,CreateMode mode) 
		throws KeeperException, InterruptedException{
		String msg = null;
		
		if(exists(zk, path, false) == false){
			msg = zk.create(path, null, Ids.OPEN_ACL_UNSAFE, mode);
		}
		return msg;
	}
	
	/**
	 * 节点是否存在
	 * @param zk
	 * @param path
	 * @return
	 * @throws KeeperException
	 * @throws InterruptedException
	 */
	public static boolean exists(ZooKeeper zk ,String path ,boolean hasWatcher) throws KeeperException, InterruptedException{
		boolean isExists = true;
		
		Stat stat = zk.exists(path, false);
		if(stat == null){
			isExists = false;
			return isExists;
		}
		return isExists;
	}
	
	/**
	 * 获得znode的列表
	 * @param zk
	 * @param path
	 * @param watch
	 * @return
	 * @throws KeeperException
	 * @throws InterruptedException
	 */
	public static List<String> getNodes(ZooKeeper zk ,String path ,boolean watch) 
	throws KeeperException, InterruptedException{
		List<String> nodes = zk.getChildren(path, watch);
		
		return nodes;
	}
	
	public static String getData(ZooKeeper zk ,String path) 
		throws KeeperException, 
		InterruptedException{
		
		byte[] data = null;
		data = zk.getData(path, false, null);
		return new String(data);
	}
}
