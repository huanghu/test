package com.buy.test.concurrent.synchron;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {
	private volatile int value;
	
	public int get(){
		return value;
	}
	
	public void set(int value){
		this.value = value;
	}
	
	public static void main(String[] args){
		int num = 3;
		ExecutorService service = Executors.newFixedThreadPool(num);
		final VolatileDemo volatileDemo = new VolatileDemo();
		
		while (true) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Random random = new Random();
					int ran = random.nextInt();
					volatileDemo.set(ran);
					System.out.println("ran " + volatileDemo.get());
				}
			};	
			service.execute(runnable);
		}

		

	}
}
