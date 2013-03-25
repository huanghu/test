package com.buy.test.date;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class DateJunit {
	@Test
	public void test(){
		try {
			Date date = new Date();
			String dateStr = "2012-08-25 12:13:14";
			String dateFormat = "yyyy-MM-dd HH:MM:ss";
			SimpleDateFormat format = new SimpleDateFormat(dateFormat);
			String string = format.format(date);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MINUTE ,-5);
			
			System.out.println(String.format("date %s", calendar.getTime()));			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}
}
