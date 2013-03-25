package com.buy.test.concurrent.blockingQueue;

import java.util.Queue;

public class BlockingQueuePull {
	final Queue<Object> queue;
	
	public BlockingQueuePull(Queue<Object> queue){
		this.queue = queue;
	}
	
	public Object poll(){
		return queue.poll();
	}
}
