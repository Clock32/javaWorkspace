package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {

	public static void main(String[] args) {
		
		test5();
		
	}
	
	/*
	 * Calendar
	 * 날짜와 시간에 대한 데이터를 처리하는 추상 클래스
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void test1() {
		/*
		 * 현재 날짜, 시간정보 조회
		 */
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 =  Calendar.getInstance();

		System.out.println(cal1);
		System.out.println(cal2);
		
		/*
		 * 현재 년월일 정보 조회하기
		 * 
		 */
		
		System.out.println(cal1.get(Calendar.YEAR)+" "+(cal1.get(Calendar.MONTH)+1)+" "+cal1.get(Calendar.DATE));
		//월 은 0부터 센다 
		// 월    만     0   부  터  센 다
		//월    혽나만 0부터 센다
		//0부터
		//다른놈들 다 잘 뜨는데
		//월만 0ㅁ부터센다ㅏㅏ
		
		//시 분 초
		System.out.println(cal1.get(Calendar.HOUR)); //2
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY)); //24
		
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));
		
		printCalendar(cal2);
		
	
		
	}
	
	public static void test2() {
		/*
		 *  툭종알 툭종사건울 호초기ㅏ호ㅓㄷ환 cakebdar  객체 생성
		 */
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar(2027,1,1,0,0,0);
		
		//2027sus 1dnjf 1dlf 0tl 0qns 0ch
		cal1.set(2027,0,1,0,0,0);
		printCalendar(cal1);
		printCalendar(cal2);
		
		
		//날짜 차이 계산하기
		
		Calendar now = Calendar.getInstance(); //현재시간
		Calendar day = new GregorianCalendar(2026,0,27,0,0,0);
		
		
		//  두시간을 밀리초로 변환하여 차이를 구한다
		long n = now.getTimeInMillis();
		long d = day.getTimeInMillis();
		
		long c = (d-n)/1000/60/60/24;
		//밀리초니 1000 , 1분 , 1시 , 하루
		System.out.println("시험까지 "+Math.ceil(c+1)+"일 남았습니다.");
		
		
		
	}
	
	public static void test3() {
		/*
		 * java.util.Date 클래스
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * 자바 개발 초창기에 급하게 만들어진 클래스라 완성도가 높지않다. 
		 */
		/*
		 * 기본 생성자를 통해 Date 객체 생성
		 * 현재 날짜 및 시간을 가지고 생성
		 */
		//util
		Date today = new Date();
		
		System.out.println("기본 생성자 : "+today);
		
		//내가 원하는 날짜 (2025년 6월 19일)로 초기화
		/*
		 * 방법 1 년,월,일, 생성자를 사용
		 * 내부적으로 내가 전달한 년도 + 1900
		 */
		Date date1 = new Date(2025-1900,6-1,19,19,0,0); //작대기는 경고성 의미 = 다음버전에 사라진다 , 불안정하다 , 쓰지마라
		System.out.println("매개변수 생성자 : "+date1);
		
		/*
		 * 방법2 밀리세컨드를 매개변수로 받는 생성자를 이용.
		 * 
		 */
		Calendar cal2 = new GregorianCalendar(2025,5,19);
		long mil = cal2.getTimeInMillis();
		
		Date date2 = new Date(mil);
		System.out.println("밀리세컨드 생성자 : "+date2);
		
	}
	/*
	 * java.text.SimpleDateFormat;
	 */
	
	public static void test4() {
		//"xx년xx월xx일 몇심쳣ㅊ밀ㄴ암널ㅇ라ㅓ초"
		
		//SimpleDateFormat 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		//sdf.format (Date 객체)
		//포맷대로 지정된 문자열 반환
		String formatDate = sdf.format(new Date());
		
		System.out.println(formatDate);
		
		
		
		
	}
	
	//번외
	/*
	 * DecimalFormat
	 * 
	 * 
	 * #해당 자리에 데이터가 없는 경우 생략 시키는 형식
	 * 0 해당 자리에 데이터가 ㅇ벗는 경우 0으로 표시해주는 형식
	 * 
	 */
	public static void test5() {
		
		double num = 1234567890.123;
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		//1,234,567,890

		df.applyPattern("#.00000");
		System.out.println(df.format(num));

	}
	
	
	
	
	public static void printCalendar(Calendar c) {
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
                          c.get(Calendar.YEAR),
                          c.get(Calendar.MONTH) + 1,
                          c.get(Calendar.DATE),
                          c.get(Calendar.HOUR_OF_DAY),
                          c.get(Calendar.MINUTE),
                          c.get(Calendar.SECOND)
                );
    }





	
	
	
}
