package com.buy.test.concurrent.cancel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 《java并发编程实战》 程序清单7-10
 * @author huanghu
 *
 */
public class TimeOutByFuture {
	int nThreads = 10;
	public ExecutorService taskExec = Executors.newFixedThreadPool(nThreads);
	
	public void timedRun(Runnable r ,
						long timeout ,
						TimeUnit unit) throws InterruptedException, ExecutionException{
		Future<?> task = taskExec.submit(r);
		
		try {
			task.get(timeout ,unit);
		} catch (TimeoutException e) {
			
		} catch (ExecutionException e) {
			throw e;
		} finally{
			task.cancel(true);
		}
	}
	
	public static void main(String[] args){
		try {
			Runnable r = new Runnable() {
				@Override
				public void run() {
					System.out.println("working...");
				}
			};
			
			long timeout = 2000;
			TimeUnit unit = TimeUnit.SECONDS;
			
			TimeOutByFuture timeOut = new TimeOutByFuture();
			timeOut.timedRun(r, timeout, unit);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
