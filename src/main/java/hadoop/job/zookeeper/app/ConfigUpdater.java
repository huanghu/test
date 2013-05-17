package hadoop.job.zookeeper.app;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.zookeeper.KeeperException;

/**
 * @author huanghu
 *
 */
public class ConfigUpdater {
	public static final String PATH = "/config";
	
	private ActiveKeyValueStore store;
	private Random random = new Random();
	
	public ConfigUpdater(String hosts) throws IOException ,InterruptedException{
		store = new ActiveKeyValueStore();
		store.connect(hosts);
	}
	
	public void run() throws InterruptedException ,KeeperException{
		while (true) {
			String value = random.nextInt(100) + "";
			store.write(PATH, value);
			System.out.printf("Set %s to %s \n" ,PATH ,value);
			TimeUnit.SECONDS.sleep(random.nextInt(10));
		}
	}
	
	public static void main(String[] args) throws Exception{
		String hosts = "192.168.225.100";
		ConfigUpdater configUpdater = new ConfigUpdater(hosts);
		configUpdater.run();
	}
}
