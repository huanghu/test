package com.buy.test.concurrent.executors;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayBlockingQueueDemo<E> {
	
	private ArrayBlockingQueue<E> queue = new ArrayBlockingQueue<E>(20);
	private AtomicInteger value = new AtomicInteger();
	

	public void setElement(E element){
		queue.add(element);
	}
	
	public void pollAll(){
		Iterator<E> it = queue.iterator();
		while (it.hasNext()) {
			E e = it.next();
			System.out.println("queue value " + e.toString());
		}
	}
	
	public AtomicInteger getValue(){
		value.getAndIncrement();
		return value;
	}
	
	public static void main(String[] args){
		ExecutorService service = Executors.newCachedThreadPool();
		final ArrayBlockingQueueDemo<Integer> demo = new ArrayBlockingQueueDemo<Integer>();
		
		addQueue(service, demo);
		
		demo.pollAll();
		
		System.out.println("end");

	}
	
	private static void addQueue(ExecutorService service ,final ArrayBlockingQueueDemo<Integer> demo){
		int count = 0;
		while (count < 20) {
			System.out.println(String.format("count %d", count));
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					AtomicInteger value = demo.getValue();
					demo.setElement(value.get());
					
				}
			};		
			service.execute(runnable);
			count ++;
		}
	}
}
