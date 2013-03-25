package com.buy.test.casual;


import java.io.UnsupportedEncodingException;
import org.junit.Test;


public class Casual1 {
	//["ID","REQUESTDATE","AMOUNT","ORGID","SUPPLIERPARENTID","SUPPLIERID"]}
	@Test
	public void test(){
		int i = 10;
		System.out.println(" & " + ( 1 << 30));
	}
	
	@SuppressWarnings("unused")
	private void charLen(){
		String s = "ÊÇ·ñ";
		try {
			System.out.println("ss " + s.getBytes("utf-8").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	
	}
	
	@SuppressWarnings("unused")
	private void toLower(){
		String s = "[\"AID\" ,\"NEWPATH\" ,\"SRC_REF_VALUE1\"]}";
		System.out.println("s.toLowerCase() " + s.toLowerCase());
		
	}
	
	@SuppressWarnings("unused")
	private void charTest(){
		char a = '·¢';
		System.out.println("rr " + a);
	}
}
