package hadoop.job.zookeeper.handleException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.SessionExpiredException;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;
import hadoop.job.zookeeper.demo.ZnodeCommon;

/**
 * 测试抛出KeeperException.SessionExpiredException后sessionId是否存在
 * @author huanghu
 *
 */
public class SessionTimeout extends ConnectionWatcher{
	
	public void session() throws KeeperException, InterruptedException{
		System.out.println("sesstionId " + zk.getSessionId());
	}
	
	public void closeSesstion() throws SessionExpiredException, InterruptedException{
		zk.close();
	}
	
	public static void main(String[] args) throws Exception{
		SessionTimeout timeout = new SessionTimeout();

		timeout.connect(Constants.HOSTS);
		
		timeout.session();
		timeout.closeSesstion();
		String path = String.format("/%s", Constants.SCHEDULE_NODE_MAIN_PATH);
		System.out.println("nodes " + ZnodeCommon.getNodes(timeout.zk ,path , false));
	}
}
