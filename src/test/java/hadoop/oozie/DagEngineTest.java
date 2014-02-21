package hadoop.oozie;

import hadoop.Base;

import org.apache.hadoop.conf.Configuration;
import org.apache.oozie.DagEngine;
import org.apache.oozie.DagEngineException;
import org.apache.oozie.client.OozieClient;
import org.apache.oozie.service.ServiceException;
import org.apache.oozie.service.Services;
import org.junit.Before;
import org.junit.Test;

public class DagEngineTest extends Base {
	
	DagEngine dagEngine;
	Configuration conf;
	
	@Before
	public void before(){
		try {
			System.setProperty(Services.OOZIE_HOME_DIR,"/user/huanghu");
			Services services = new Services();
			Services.setOozieHome();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
        dagEngine = new DagEngine();
        conf = this.getConf();
        this.setConf();
	}
	
	private void setConf(){
		conf.set(OozieClient.APP_PATH, "/user/huanghu/oozie/workflow/main/vendor/cps/apSuppliersCps/workflow.xml");
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
