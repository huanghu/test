package com.buy.test.concurrent.executors;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args){
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String ,String>();
		map.put("key", "value");
	}
}
