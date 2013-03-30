package com.buy.test.concurrent.executors;

import java.io.File;

public class CompletionServiceDemo {
	public static void main(String[] args){
		String uri = "http://t2.baidu.com/it/u=700205379,1266368534&fm=24&gp=0.jpg";
		File file = new File(uri);
		System.out.println("file.length() " + file.length());
	}
}
