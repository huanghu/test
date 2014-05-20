package com.buy.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		dateSub();
	}
	
	/**
	 * 时间戳转换为时间字符串
	 */
	public static void timeStampToString(){
		String timeStamp = "1383814239";
		long time = Long.parseLong(timeStamp);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(new Date(time * 1000L));
		System.out.println("Date " + date);
	}
	
	/**
	 * 两个时间相减，转换为分钟
	 */
	public static void dateSub(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = df.parse("2014-05-13 12:00:01");
			Date date2 = df.parse("2014-05-13 12:00:00");
			
			long sub = date2.getTime() - date1.getTime();
			System.out.println("sub " + (sub / 1000));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
