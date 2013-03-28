package hadoop.job.zookeeper.base;

import hadoop.job.zookeeper.ConnectionWatcher;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;

/**
 * ��һ���������ٽ�һ�����飬����رպ�����ɾ����
 * @author huanghu
 *
 */
public class JoinGroup extends ConnectionWatcher {
	
	public void join(String groupName ,String memberName) throws KeeperException ,InterruptedException{
		String path = "/" + groupName + "/" + memberName;
		//ֹͣӦ�ó���󣬲���������ɾ��node����������һЩԶ��ͨ�ŵ����ӳ١�
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
