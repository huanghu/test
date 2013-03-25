package com.buy.test.concurrent.blockingQueue;

import java.util.Queue;

public class BlockingQueuePush {
	
	final Queue<Object> queue;
	
	public BlockingQueuePush(Queue<Object> queue){
		this.queue = queue;
	}
	
	public void push(Object content){
		queue.offer(content);
	} 
}
