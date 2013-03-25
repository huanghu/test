package com.buy.test.random;

import java.util.Random;

public class Main {
	
	@SuppressWarnings("unused")
	private static void random(){
		Random random = new Random();
		while(true){
			int i = random.nextInt(11);
			System.out.println("i " + i);
			
		}
	}
	
	public static void main(String[] args){
		//random();
		int i = 2 ^ 31;
		System.out.println("i " + i);
	}
}
