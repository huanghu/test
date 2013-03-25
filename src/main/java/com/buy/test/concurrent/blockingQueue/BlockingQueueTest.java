package com.buy.test.concurrent.blockingQueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BlockingQueueTest {
	public static void main(String[] args){
		final int capacity = 10;
		final Queue<Object> queue = new ConcurrentLinkedQueue<Object>();
		final BlockingQueuePush push = new BlockingQueuePush(queue);
		final BlockingQueuePull pull = new BlockingQueuePull(queue);
		
		Executor executor = Executors.newCachedThreadPool();
		Executor executor2 = Executors.newCachedThreadPool();
		
		executor.execute(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				long i = 0 ;
				while (true) {
					try {
						System.out.println("×¼±¸²åÈë");
						i ++;
						if (queue.size() < capacity) {
							push.push(i);
//							Thread.sleep(500);
						}						
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				}
			}
		});
		
		while (true) {
			for(int i = 1 ;i <= queue.size(); i ++){
				executor2.execute(new Runnable() {
					
					public void run() {
						// TODO Auto-generated method stub
						try {
							System.out.println("pull.pull() " + pull.poll());					
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				});			
			}			
		}


	}
}
