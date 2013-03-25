package com.buy.test.mock;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MockHttpURLConnection extends HttpURLConnection {
	
	private InputStream inputStream;
	

	
	public MockHttpURLConnection(URL u){
		super(u);
	}
	
	public void setExpectedInputStream(InputStream inputStream){
		this.inputStream = inputStream;
	}

	
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean usingProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void connect() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
