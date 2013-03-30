package com.buy.test.concurrent.executors;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledThreadPoolExecutor demo = new ScheduledThreadPoolExecutor(1);
		int initialDelay1 = 1;
		int period1 = 1;
		int initialDelay2 = 1;
		int period2 = 1;
		
		
		demo.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				throw new NullPointerException("tttttttttttttttttttt");
				
			}
		}, initialDelay1, period1, TimeUnit.MILLISECONDS);
		
//		demo.scheduleAtFixedRate(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("ʱ�� " + System.nanoTime());
//			}
//		}, initialDelay2, period2, TimeUnit.MILLISECONDS);
	}
}
