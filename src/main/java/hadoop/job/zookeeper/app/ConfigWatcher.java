package hadoop.job.zookeeper.app;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
/**
 * ����link{ConfigUpdater.java}���ɵ�����
 * @author huanghu
 *
 */
public class ConfigWatcher implements Watcher {
	
	private ActiveKeyValueStore store;

	public ConfigWatcher(String hosts) throws IOException, InterruptedException{
		store = new ActiveKeyValueStore();
		store.connect(hosts);
	}
	
	public void displayConfig() throws InterruptedException ,KeeperException{
		String value = store.read(ConfigUpdater.PATH, this);
		System.out.printf("Read %s as %s \n", ConfigUpdater.PATH ,value);
	}
	
	public void process(WatchedEvent event) {
		if(event.getType() == EventType.NodeDataChanged){
			try {
				displayConfig();
			} catch (InterruptedException e) {
				System.err.printf("Interrupted. Exiting.");
				Thread.currentThread().interrupt();
			} catch (KeeperException e) {
				System.err.printf("KeeperException:%s.Exiting.\n", e);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		ConfigWatcher configWatcher = new ConfigWatcher(hosts);
		configWatcher.displayConfig();
		
		Thread.sleep(Long.MAX_VALUE);
	}

}
