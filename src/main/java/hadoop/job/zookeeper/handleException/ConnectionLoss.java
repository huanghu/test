package hadoop.job.zookeeper.handleException;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.ConnectionLossException;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;

/**
 * 测试抛出KeeperException.ConnectionLossException后sessionId是否存在
 * @author huanghu
 *
 */
public class ConnectionLoss extends ConnectionWatcher {
	
	public void closeConncetion() throws KeeperException.ConnectionLossException{
		try {
			throw new KeeperException.ConnectionLossException();

		} catch (ConnectionLossException e) {
			throw new KeeperException.ConnectionLossException();
		} finally{
			System.out.println("sesstionId " + zk.getSessionId());
		}
	}
	
	public void session() throws KeeperException.ConnectionLossException{
		System.out.println("sesstionId " + zk.getSessionId());
	}	
	
	public static void main(String[] args) throws ConnectionLossException{
		ConnectionLoss timeout = new ConnectionLoss();
		
		try {
			timeout.connect(Constants.HOSTS);
			timeout.closeConncetion();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch(KeeperException.ConnectionLossException e){
			e.printStackTrace();
		}
		
		timeout.session();
	}
}
