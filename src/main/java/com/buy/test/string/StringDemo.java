package com.buy.test.string;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		replaceAll();
	}
	
	@SuppressWarnings("unused")
	//String.format是否会有空的。
	private void stringFormatWillNull(){
		String a = String.format("%s%s", null 
				,null);
		System.out.println("a " + a.length());	
	}
	
	/**
	 * replaceAll
	 */
	private static void replaceAll(){
		String str = "sjdjksld--0000012234";
		str = str.replaceAll("(^|-)([0~9]*)(|$)", "");
		System.out.println("str " + str);
		
//		String str = "111.3.22.11";   
//		str=str.replaceAll("(^|\\.)(\\d)(\\.|$)","$100$2$3");   
//		str=str.replaceAll("(^|\\.)(\\d{2})(\\.|$)","$10$2$3");   
//		str=str.replaceAll("(^|\\.)(\\d{2})(\\.|$)","$10$2$3");   
//		str=str.replaceAll("(^|\\.)(\\d{1})(\\.|$)","$100$2$3");   
//		System.out.println("str " + str);
	}


}
