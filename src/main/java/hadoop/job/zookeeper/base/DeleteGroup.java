package hadoop.job.zookeeper.base;

import hadoop.job.zookeeper.ConnectionWatcher;

import java.util.List;

import org.apache.zookeeper.KeeperException;

/**
 * É¾³ýÒ»¸ö×é
 * @author huanghu
 *
 */
public class DeleteGroup extends ConnectionWatcher {
	
	public void delete(String groupName) throws KeeperException ,InterruptedException{
		String path = "/" + groupName;
		
		try {
			List<String> children = zk.getChildren(path, false);
			for(String child : children){
				zk.delete(path + "/" + child, -1);
			}
			zk.delete(path, -1);
		} catch (KeeperException e) {
			System.out.printf("Group %s does not exist\n" ,groupName);
			System.exit(1);
		}
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		String groupName = "zoo";
		
		DeleteGroup deleteGroup = new DeleteGroup();
		deleteGroup.connect(hosts);
		deleteGroup.delete(groupName);
		deleteGroup.close();
	}
	
}
