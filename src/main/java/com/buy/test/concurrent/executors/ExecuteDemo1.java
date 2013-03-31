package com.buy.test.concurrent.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**6-4
 * @author Huanghu
 *
 */
public class ExecuteDemo1 {
	private static final int NTHEREADS = 100;
	private static final Executor exec = Executors.newFixedThreadPool(NTHEREADS);
	public static int count = 0;

	
	public static void main(String[] args){
		byte[] b = new byte[1];
		while (true) {
			Runnable task = new Runnable() {
				volatile boolean sync = true;				
				public void run() {
					// TODO Auto-generated method stub
//					synchronized (this) {
//						count ++;
//					}
//					System.out.println("count " + count);
					if (sync) {
						sync = false;
						count ++;
					}
					System.out.println("count " + count);
					sync = true;
				}
			};
			exec.execute(task);
		}
	}
}
