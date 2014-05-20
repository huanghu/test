package com.buy.test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args){
		CalendarDemo demo = new CalendarDemo();
		demo.calendarAdd();
	}
	
	//获得年月日时分秒
	public void getYearMonthDate(){
		Calendar calendar = Calendar.getInstance();
		//now.get(Calendar.YEAR)
		String date = String.valueOf(calendar.get(Calendar.YEAR)) + String.valueOf((calendar.get(Calendar.MONTH) + 1)) + 
		String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)) 
		+ String.valueOf(calendar.get(Calendar.HOUR_OF_DAY))
		+ String.valueOf(calendar.get(Calendar.MINUTE)) 
		+ String.valueOf(calendar.get(Calendar.SECOND));
		System.out.println("date " + date);
	}
	
	//Calendar减分钟 
	public void calendarSub(){
		try {
			String dateStr = "2014-05-13 12:00:00";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = sdf.parse(dateStr);
			System.out.println("dateStr " + dateStr);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			calendar.add(Calendar.MINUTE, -60);
			
			Date dateSub = calendar.getTime();
			String dateSbuStr = sdf.format(dateSub);
			System.out.println("dateSbuStr " + dateSbuStr);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Calendar加秒钟
	public void calendarAdd(){
		try {
			String dateStr = "2014-05-13 12:00:00";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = sdf.parse(dateStr);
			System.out.println("dateStr " + dateStr);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			calendar.add(Calendar.SECOND, 1);
			
			Date dateSub = calendar.getTime();
			String dateSbuStr = sdf.format(dateSub);
			System.out.println("dateAddStr " + dateSbuStr);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
