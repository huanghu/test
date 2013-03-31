package com.buy.test.concurrent.cancel;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.derby.tools.sysinfo;

/**
 * 对应着《java并发编程实战》 程序清单7-9
 * @author huanghu
 *
 */
public class TimeOut {
	
	Runnable r;
	long timeout;
	TimeUnit unit;
	ScheduledExecutorService service;
	
	public TimeOut(final Runnable r ,
					long timeout ,
					TimeUnit unit){
		this.r = r;
		this.timeout = timeout;
		this.unit = unit;
		service = Executors.newScheduledThreadPool(3);
	}	
	
	class RethrowableTask implements Runnable{
		private volatile Throwable t;
		
		public void run() {
			try {
				r.run();
			} catch (Throwable t) {
				this.t = t;
			}
		}
		
		public void rethrow(){
			if(t != null){
				try {
					throw t;
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("no exception");
			}
		}
		
	}
	
	public void timedRun() throws InterruptedException{
		RethrowableTask task = new RethrowableTask();
		final Thread taskThread = new Thread(task);
		
		taskThread.start();
		service.schedule(new Runnable() {
			
			public void run() {
				System.out.println("cancel");
				taskThread.interrupt();
			}
		}, timeout, unit);
		taskThread.join(unit.toMillis(timeout));
		task.rethrow();
	}
	
	public static void main(String[] args){

		try {
			
			Runnable r = new Runnable() {
				public void run() {
					System.out.println("run thread");
				}
			};
			
			long timeout = 2;
			TimeUnit unit = TimeUnit.SECONDS;
			TimeOut out = new TimeOut(r, timeout, unit);
			
			out.timedRun();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
