package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
		
	LeapController lc = new LeapController();
	
	public LeapView() {
		
		Calendar now = Calendar.getInstance(); //현재시간
	
		int yon = now.getWeekYear();
		
		String what = "";
		
		if(lc.isLeapYear(yon)) {
			
			what = "윤년";
		}else {
			what = "평년";
		}
		
		
		
		
		
		
		System.out.println(yon+"년은 "+what+"입니다.");
		System.out.println("총 날짜 수 : "+lc.leapDate(now));
		
		
		
		
		
	}
	
	
}
