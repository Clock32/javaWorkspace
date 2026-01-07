package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		
		
		
		boolean y;
		
		if(year % 4 == 0) {
			
			y = true;
			int yea = year;
			if(yea % 100 == 0) {
				y=false;
				int ye = yea;
				if(ye % 400 ==0) {
					y=true;
				}
			}else {
				y=true;
			}
		}else {
			y=false;
		}
					
		return y;
	}
	
	public long leapDate(Calendar c) {
		
		
		
		Calendar day = new GregorianCalendar(1,0,1);
		
		
		//  두시간을 밀리초로 변환하여 차이를 구한다
		long n = c.getTimeInMillis();
		long d = day.getTimeInMillis();
		
		long t = (n-d)/1000/60/60/24;
		
		int year = c.getWeekYear();
		int date = day.getWeekYear();
		int nDay = c.get(Calendar.DATE);
		
		System.out.println(nDay);
		
		int sum = 0;
		
		for (int i = date;i<year;i++) {
			if (isLeapYear(i)){
				sum += 366;
			}else {
				sum += 365;
			}
		} 
		
		sum += nDay;
		
		return sum;
	}
	
}
