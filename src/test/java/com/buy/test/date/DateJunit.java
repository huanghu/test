package com.buy.test.date;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;


public class DateJunit {
	@Test
	public void test(){
		try {
			Date date = new Date();
			
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
