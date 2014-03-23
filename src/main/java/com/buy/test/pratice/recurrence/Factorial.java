package com.buy.test.pratice.recurrence;

/**
 * 阶乘
 * @author huanghu
 *
 */
public class Factorial {
	private long limitNum;
	
	public Factorial(long limitNum){
		this.limitNum = limitNum;
	}
	
	public long math(long num ,long result){
		if(num > limitNum){
			return result;
		}
		result = result * num;
		long finalResult = this.math((num + 1), result);
		return finalResult;
	}
	
	public static void main(String[] args){
		long limitNum = 5;
		long num = 1;
		Factorial factorial = new Factorial(limitNum);
		long result = 1;
		long  finalResult = factorial.math(num, result);
		System.out.println("finalResult " + finalResult);
	}
}
