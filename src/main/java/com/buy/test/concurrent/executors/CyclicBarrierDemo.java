package com.buy.test.concurrent.executors;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
	private CyclicBarrier barrier;
	private int nCpu;
	
	public CyclicBarrierDemo(){
		this.nCpu = Runtime.getRuntime().availableProcessors();
		barrier = new CyclicBarrier(nCpu , 
				new Runnable() {
					public void run() {
						System.out.println("end");
					}
				});
	}
	
	public void testBarrier(){
		ExecutorService service = Executors.newFixedThreadPool(nCpu);
		
		for (int i = 0; i < nCpu; i++) {
			service.execute(new Runnable() {
				
				public void run() {
					System.out.println("barrier start");
					try {
						barrier.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
				}
			});			
		}

	}
	
	public static void main(String[] args){
		CyclicBarrierDemo demo = new CyclicBarrierDemo();
		demo.testBarrier();
	}
}
