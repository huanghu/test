package oozie.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.oozie.client.OozieClient;

public class OozieEmail {

	private static String url = "http://hadoop-sl002.360buy.com:11000/oozie/";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OozieClient client = null;
		Properties properties = null;
		@SuppressWarnings("unused")
		OozieEmail email = new OozieEmail();
		try {
			client = new OozieClient(url);
			//WorkflowJob job = client.getJobInfo("0000034-120906230005534-oozie-oozi-W");
			//System.out.println("job " + job);
		
			
			properties = new Properties();
			properties.load(new FileInputStream(new File("D:\\java\\program\\test\\target\\classes\\oozie\\test\\job.properties")));
			client.run(properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
