package oozie.oozieClient;

import org.apache.oozie.client.OozieClient;
import org.apache.oozie.client.OozieClientException;

public class GetJobId {
	public static void main(String[] args){
		String oozieUrl = "http://hadoop-test-sl003.360buy.com:11000/oozie/";
		String externalId = "";

		try {
			OozieClient client = new OozieClient(oozieUrl);
			client.getJobId(externalId);
		} catch (OozieClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
