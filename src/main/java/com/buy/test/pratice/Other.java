package com.buy.test.pratice;

public class Other {
	public static void main(String[] args){
		Other other = new Other();
		other.testInstance();
	}
	
	private void testInstance(){
		ITest test = new Test();
		ITest test1 = test;
		System.out.println(String.format("test %s", test));
		System.out.println(String.format("test1 %s", test1));
		System.out.println(String.format("test==test1 %s", test.equals(test1)));
	}
	
	@SuppressWarnings("unused")
	private void caseTest(){
		int i = 4;
		switch (i) {
		case 1:
		case 2:
		case 3:
			System.out.println("1");
			break;
		
		default:
			break;
		}
	}
}
