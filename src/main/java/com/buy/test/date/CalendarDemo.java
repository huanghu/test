package com.buy.test.date;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args){
		CalendarDemo demo = new CalendarDemo();
		demo.getYearMonthDate();
	}
	
	//获得年月日时分秒
	private void getYearMonthDate(){
		Calendar calendar = Calendar.getInstance();
		//now.get(Calendar.YEAR)
		String date = String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf((calendar.get(Calendar.MONTH) + 1)) + 
		String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)) 
		+ String.valueOf(calendar.get(Calendar.HOUR_OF_DAY))
		+ String.valueOf(calendar.get(Calendar.MINUTE)) 
		+ String.valueOf(calendar.get(Calendar.SECOND));
		System.out.println("date " + date);
	}
}
