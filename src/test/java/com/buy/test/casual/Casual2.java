package com.buy.test.casual;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Casual2 {
	@Test
	public void test(){
		this.fileFormat();
	}
	
	protected void listEach(){
		List<String> lists = new ArrayList<String>();
		String s = null;
		lists.add("s");
		lists.add("t");
		lists.add(s);
		for (String s1 : lists) {
			System.out.println("s1 " + s1.length());
			System.out.println("s " + s1 + " " + (s1 == null));
			
		}
	}
	
	@SuppressWarnings("null")
	protected void listEachNull(){
		Iterable<String> it = null;
		for (String string : it) {
			System.out.println("s1 " + string);
		}
	}
	
	protected void fileFormat(){
		//D:\Java\program\test\target\test-classes
		File file = new File("/D:\\Java\\program\\test\\target\\test-classes");
		
		System.out.println("file " + file.exists());
	}
}
