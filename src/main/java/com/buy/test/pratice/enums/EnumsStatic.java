package com.buy.test.pratice.enums;

public class EnumsStatic {
	public static enum enumTest{
		ENUM1(1),
		ENUM2(2);
		
		private final int value;
		
		enumTest(int value){
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
	}
	
	public static void main(String[] args){
		System.out.println("ss " + EnumsStatic.enumTest.ENUM1.value);
	}
}
