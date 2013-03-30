package com.buy.test.concurrent.executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo2 {

	
	private void start(){
		int nThread = 3;
		final CountDownLatch startGate = new CountDownLatch(1);
		final CountDownLatch endGate = new CountDownLatch(nThread);
		
		ExecutorService service = Executors.newFixedThreadPool(nThread);
		
		for(int i = 0 ;i < nThread ;i ++){
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						startGate.await();
						System.out.println("ok");
						endGate.countDown();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});			
		}

		try {
			System.out.println("start");
			startGate.countDown();
			endGate.await();
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args){
		CountDownLatchDemo2 demo2 = new CountDownLatchDemo2();

		
		
		demo2.start();
	}
}
