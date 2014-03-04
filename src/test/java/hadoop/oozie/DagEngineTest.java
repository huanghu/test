package hadoop.oozie;

import hadoop.Base;

import org.apache.hadoop.conf.Configuration;
import org.apache.oozie.DagEngine;
import org.apache.oozie.DagEngineException;
import org.apache.oozie.client.OozieClient;
import org.apache.oozie.service.ServiceException;
import org.apache.oozie.service.Services;
import org.apache.oozie.service.WorkflowAppService;
import org.junit.Before;
import org.junit.Test;


public class DagEngineTest extends Base {
	
	DagEngine dagEngine;
	Configuration conf;
	
	@Before
	public void before(){
		try {
			String baseDir = "/D:\\Java\\oozie";
			System.setProperty(Services.OOZIE_HOME_DIR ,baseDir);
			Services service = new Services();
			service.init();

		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		String user = "oozie";
		String authoken = "hadoop-master.360buy.com";
		String group = "oozie";
		String jtKerbreosName = "mapred_HOST";
		String nnKerbreosName = "hdfs_HOST";
		
        conf = this.getConf();
		conf.set(OozieClient.USER_NAME, user);
		conf.set(OozieClient.GROUP_NAME, group);
		conf.set(WorkflowAppService.HADOOP_JT_KERBEROS_NAME, jtKerbreosName);
		conf.set(WorkflowAppService.HADOOP_NN_KERBEROS_NAME, nnKerbreosName);
        dagEngine = new DagEngine(user ,authoken);

        this.setConf();
	}
	
	private void setConf(){
		conf.set(OozieClient.APP_PATH, "/user/huanghu/oozie/workflow/main/vendor/cps/apSuppliersCps/workflow.xml");
		conf.set("hadoop.proxyuser.huanghu.hosts", "*");
		conf.set("hadoop.proxyuser.huanghu.groups", "*");
	}
	
	@Test
	public void test(){
		try {
			dagEngine.submitJob(conf, true);
		} catch (DagEngineException e) {
			e.printStackTrace();
		}
	}
}
