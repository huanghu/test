package hadoop.job.zookeeper.base;

import hadoop.job.zookeeper.ConnectionWatcher;

import java.util.List;

import org.apache.zookeeper.KeeperException;

/**
 * @author huanghu
 *
 */
public class ListGroup extends ConnectionWatcher {
	public void list(String groupName) throws KeeperException ,InterruptedException{
		String path = "/" + groupName;
		
		try {
			List<String> children = zk.getChildren(path, false);
			if(children.isEmpty()){
				System.out.printf("No members in group %s\n" ,groupName);
				System.exit(1);
			}
			
			for (String child : children) {
				System.out.println(child);
			}
		} catch (KeeperException e) {
			System.out.printf("Group %s does not exits\n" ,groupName);
			System.exit(1);
		}
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		String groupName = "zoo";
		
		ListGroup listGroup = new ListGroup();
		listGroup.connect(hosts);
		listGroup.list(groupName);
		listGroup.close();
	}
}
