package com.buy.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		timeStampToString();
	}
	
	/**
	 * 时间戳转换为时间字符串
	 */
	private static void timeStampToString(){
		String timeStamp = "1383814239";
		long time = Long.parseLong(timeStamp);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(new Date(time * 1000L));
		System.out.println("Date " + date);
	}
	
}
