package com.buy.test.casual;


import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;


public class Casual1 {
	@Test
	public void test(){
		aa();
	}
	
	//正则表达式判断
	protected void partern(){
		String str = "${src_system}";
		Pattern p = Pattern.compile("(\\$\\{)|(\\})");
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println("is var");
		}else {
			System.out.println("no var");
		}
	}
	
	//正则表达式过滤 ${src_system}
	@SuppressWarnings("unused")
	private void repalceReg(){
		String prefixElement = "${src_system}";
		prefixElement = prefixElement.replaceAll("(\\$\\{)|(\\})", "");
		System.out.println("pri " + prefixElement);
	}
	
	@SuppressWarnings("unused")
	private void charLen(){
		String s = "";
		try {
			System.out.println("ss " + s.getBytes("utf-8").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	
	}
	
	
	@SuppressWarnings("unused")
	private void length(){
		/*
		 * 一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三
		 * */
		String str = "ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ";
		try {
			System.out.println(" sds " + str.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private void toLower(){
		String s = "ware_id ,ware_status ,UPC_CODE ,OFFLINE_TIME ,ONLINE_TIME,COL_TYPE,status,MODIFIED,CREATED ,'' as outTime ,'' as outTimeColumn";
		System.out.println("s.toLowerCase() " + s.toLowerCase());
		
	}
	
	@SuppressWarnings("unused")
	private void charTest(){
		char a = 's';
		System.out.println("rr " + a);
	}
	
	private void aa(){
		java.text.DecimalFormat myformat =new java.text.DecimalFormat("#.00");
		BigDecimal amount = new BigDecimal(myformat.format(0.185));
		System.out.println("amount " + amount);
		
	}
	
}
