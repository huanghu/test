package com.buy.test.casual;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Casual2 {
	@Test
	public void test(){
		this.listEachNull();
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
	
	protected void listEachNull(){
		List<String> lists = null;
		Iterable<String> it = null;
		for (String string : it) {
			System.out.println("s1 " + string);
		}
	}
}
