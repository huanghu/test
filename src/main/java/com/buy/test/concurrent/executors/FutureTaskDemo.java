package com.buy.test.concurrent.executors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		int nThreads = 10;
		final BlockingQueue<String> queue = new ArrayBlockingQueue<>(nThreads);
		String[] names = new String[]{
				"http://dmimg.5054399.com/allimg/130209/6_130209110926_1.jpg",
				"http://dmimg.5054399.com/allimg/130210/6_130210115431_1.jpg",
				"http://dmimg.5054399.com/allimg/130106/6_130106101458_1.jpg"
		};
		for (int i = 0; i < names.length ;i ++) {
			queue.add(names[i]);
		}
		Executor executor = Executors.newFixedThreadPool(nThreads);
		FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
			public String call(){
				String url = queue.poll();
				System.out.println("url " + url);
				downloadFile(url, String.valueOf(System.currentTimeMillis()) + ".jpg");
				return "test";
			}
		});
		while (!queue.isEmpty()) {
			executor.execute(task);	
		}
		System.out.println("开始");
		System.out.println(String.format("task %s" ,task.get()));
	}
	
	/**
	 * 
	 */
	private static void downloadFile(String urlS ,String name){
		try {
//			String urlS = "http://pic.lovetu.net/smallupload/2012/6/30/s20126300858631.jpg";
			URL url = new URL(urlS);
			URLConnection conn = url.openConnection();
			InputStream inputStream = conn.getInputStream();
			String outPath = String.format("/Users/huanghu/Documents/%s", name);
			FileOutputStream outputStream = new FileOutputStream(new File(outPath));
			
			byte[] inBytes = new byte[1024];
			while (inputStream.read(inBytes) > -1) {
				outputStream.write(inBytes);
			}
			outputStream.flush();
			outputStream.close();
			
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
