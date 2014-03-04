package hadoop.oozie;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.oozie.WorkflowJobBean;
import org.apache.oozie.command.CommandException;
import org.apache.oozie.command.wf.NotificationCommand;
import org.apache.oozie.command.wf.SignalCommand;
import org.apache.oozie.store.StoreException;
import org.apache.oozie.store.WorkflowStore;
import org.apache.oozie.util.ParamChecker;
import org.apache.oozie.workflow.lite.LiteWorkflowApp;
import org.apache.oozie.workflow.lite.LiteWorkflowInstance;
import org.apache.oozie.workflow.lite.StartNodeDef;

public class ESingalCommand extends SignalCommand {
	protected String jobId;
	protected String actionId;
	Configuration conf;
	
	protected ESingalCommand(String name, int priority, String jobId) {
		super(name, priority, jobId);
	}
	
    public ESingalCommand(String jobId, String actionId) {
        super("signal", "signal");
        this.jobId = ParamChecker.notEmpty(jobId, "jobId");
        this.actionId = ParamChecker.notEmpty(actionId, "actionId");
    }
    
    public ESingalCommand(Configuration conf ,String jobId ,String actionId){
    	this(jobId, actionId);
    	this.conf = conf;
    }

    @Override
    protected Void call(WorkflowStore store) throws CommandException, StoreException{
    	WorkflowJobBean workflow = new WorkflowJobBean();
    	//String name, String definition, StartNodeDef startNode
    	String name = "testName";
    	String definition = "testDefinition";
    	
    	String transitionTo = "transitionTo";
    	StartNodeDef startNodeDef = new StartNodeDef(transitionTo); 
    	LiteWorkflowApp wapp = new LiteWorkflowApp(name ,definition ,startNodeDef);
    	//LiteWorkflowApp def, Configuration conf, String instanceId
    	String instanceId = "333";
    	
    	LiteWorkflowInstance instance = new LiteWorkflowInstance(wapp ,conf ,instanceId);
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	DataOutput dOut = new DataOutputStream(out);
    	try {
			instance.write(dOut);
			byte[] b = out.toByteArray();
	    	
	    	workflow.setWfInstance(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	queueCallable(new NotificationCommand(workflow));
    	return null;
    }
}
