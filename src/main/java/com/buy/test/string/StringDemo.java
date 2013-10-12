package com.buy.test.string;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
	}
	
	@SuppressWarnings("unused")
	//String.format是否会有空的。
	private void stringFormatWillNull(){
		String a = String.format("%s%s", null 
				,null);
		System.out.println("a " + a.length());	
	}


}
