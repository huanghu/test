package com.buy.test.pratice;

public class StringTest {
	
	//输出字符串里的数字
	public static void printDigit(){
		String str = "123456s";
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if(Character.isDigit(chars[i])){
				System.out.println("char " + (int)chars[i]);	
			}else {
				System.out.println("no number " + (int)chars[i]);
			}
			
		}
	}
	
	//
	public static void printInteger_16(){
		int str = 0x00A0;
		System.out.println("str " + str);
	}
	
	public static void main(String[] args){
		StringTest.printDigit();
	}
}
