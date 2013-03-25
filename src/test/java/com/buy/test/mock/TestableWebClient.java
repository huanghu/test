package com.buy.test.mock;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class TestableWebClient extends WebClient {
	private HttpURLConnection connection;
	
	public void setHttpURLConnection(HttpURLConnection connection){
		this.connection = connection;
	}
	
	@Override
	public HttpURLConnection createHttpURLConnection(URL url) throws IOException{
		return this.connection;
	}
	
	@Test
	public void test(){
		try {
			URL url = new URL("http://localhost");
			MockHttpURLConnection mockConnection = new MockHttpURLConnection(url);
			mockConnection.setExpectedInputStream(
					new ByteArrayInputStream("{\"name\":\"360buy\"}".getBytes()));
			
			TestableWebClient client = new TestableWebClient();
			client.setHttpURLConnection(mockConnection);
			String result = client.getContent(url);
			System.out.println("client " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
