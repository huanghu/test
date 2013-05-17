package hadoop.job.zookeeper.demo.schedule;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.zookeeper.KeeperException;

import hadoop.job.zookeeper.ConnectionWatcher;
import hadoop.job.zookeeper.Constants;
import hadoop.job.zookeeper.demo.ZnodeCommon;

/**
 * 分布式调度 调度器
 * @author huanghu
 *
 */
public class ZnodeSchedule extends ConnectionWatcher{
	
	public void schedule(String path) 
		throws KeeperException, 
		InterruptedException, 
		UnsupportedEncodingException{
		
		List<String> nodes = ZnodeCommon.getNodes(zk, path, false);

		String runPath = null;
		for(String node : nodes){
			runPath = String.format("%s/%s", path , node);
			System.out.println("runPath " + runPath);
			this.setTask(runPath);
		}
	}
	
	/**
	 * 设置任务--往znode里写入任务id
	 * @throws InterruptedException 
	 * @throws KeeperException 
	 * @throws UnsupportedEncodingException 
	 */
	private void setTask(String path) throws 
		UnsupportedEncodingException, 
		KeeperException, 
		InterruptedException{
		
		//可以替换成从队列或数据库中取值
		String value = makeTask();
		zk.setData(path, value.getBytes(Constants.CHARSET), -1);
		zk.getData(path, false, null);
	}
	
	private String makeTask(){
		String value = "12343";
		return value;
	}
	
	public static void main(String[] args) throws Exception{
		ZnodeSchedule schedule = new ZnodeSchedule();
		String path = String.format("/%s", Constants.SCHEDULE_NODE_MAIN_PATH);
		
		schedule.connect(Constants.HOSTS);
		schedule.schedule(path);
	}
}
