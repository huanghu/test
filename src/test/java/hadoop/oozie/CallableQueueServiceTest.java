package hadoop.oozie;

import hadoop.Base;

import org.apache.hadoop.conf.Configuration;
import org.apache.oozie.command.Command;
import org.apache.oozie.command.CommandException;
import org.apache.oozie.service.CallableQueueService;
import org.apache.oozie.service.ServiceException;
import org.apache.oozie.service.Services;
import org.apache.oozie.store.WorkflowStore;
import org.junit.Before;
import org.junit.Test;


public class CallableQueueServiceTest extends Base {

	Configuration conf;
	Services services;
	
	@Before
	public void before(){

		try {
			String baseDir = "/D:\\Java\\oozie";
			System.setProperty(Services.OOZIE_HOME_DIR ,baseDir);
			services = new Services();
			services.init();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		conf = this.getConf();
	}
	
	@Test
	public void test() throws CommandException{
		CallableQueueService cservice = new CallableQueueService();
		cservice.init(services);
		String jobId = "1111";
		String actionId = "22222";
		Command<Void ,WorkflowStore> ca = new ESingalCommand(conf ,jobId, actionId);
		ca.call();
//		cservice.queue(ca);
	}
}
