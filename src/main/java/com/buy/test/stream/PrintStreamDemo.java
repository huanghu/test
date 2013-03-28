package com.buy.test.stream;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PrintStreamDemo {
	
	BufferedOutputStream outputStream;
	
	private void getOutputStream(){
		try {
			ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
			String content = "ÊäÈë";
			byte[] contentB = content.getBytes();
			byteOutput.write(contentB);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private void toUnicode(){
		String s = "ÎÒ";
		int head = s.charAt(0) >>> 8;
		int end = s.charAt(0) & 0XFF;
		
		System.out.println(head + "" + end);;
	}
	
	public static void main(String[] args){

	}
}
