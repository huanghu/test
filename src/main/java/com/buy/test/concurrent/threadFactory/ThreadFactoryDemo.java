package com.buy.test.concurrent.threadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class ThreadFactoryDemo {
	
	/**
	 * 这就是自定义的ThreadFactory
	 * @author HUANGHU
	 *
	 */
	public static class MyThreadFactory implements ThreadFactory{
		@Override
		public Thread newThread(Runnable r) {
			System.out.println("测试自定义ThreadFactory");
			
			return new Thread(r);
		}
		
	}
	
	public static void main(String[] args){
		/**
		 * int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory
		 */
		int corePoolSize = 2;
		int maximumPoolSize = 4;
		long keepAliveTime = 1000;
		int capacity = 16;
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(capacity);
		
		ExecutorService executor = new ThreadPoolExecutor(corePoolSize ,maximumPoolSize , keepAliveTime ,
				TimeUnit.SECONDS ,workQueue ,new MyThreadFactory());
		
		executor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("测试executor");
			}
		});
		
	}
}
