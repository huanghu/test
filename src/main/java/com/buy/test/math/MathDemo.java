package com.buy.test.math;

public class MathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mod();
	}
	
	
	@SuppressWarnings("unused")
	private static void ceil(){
		double i = 10d / 3;
		System.out.println("i " + i);
		System.out.println("10/3 " + Math.ceil(i));
	}
	
	private static void mod(){
		System.out.println("10 % 3 " + (10 % 3));
	}

}
