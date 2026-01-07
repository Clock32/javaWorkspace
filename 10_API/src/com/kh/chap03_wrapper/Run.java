package com.kh.chap03_wrapper;

import java.sql.Wrapper;

public class Run {

	/*
	 * wrapper 클래스
	 *  기본자료형을 객체로 포장해주는 클래스를 의미한다
	 *  기본자료형 <--------> wraaper 클래스
	 *  boolean            Boolean
	 *  char               Character *
	 *  byte               Byte
	 *  short              Short
	 *  int                Integer   *
	 *  long               Long
	 *  float              Float
	 *  double             Double
	 */
	
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 15;
		//기본 자료형은 값 만  존재하기때문에 특별한 기능이 존재하지않는다
		
		//기본 자료형을 wrapper 클래스로 변환
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()); //본인이 저장하고있는값을 주소값으로 사용하고있다
		System.out.println(i1.compareTo(i2));//-1이 나온다
		
		// A compareto B  ; b 크면 -1 / 같으면 0 / a크며ㅑㄴ 1
		
		
		//wrapper -> 기본자료형 (UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("================================================================");
		
		//δ ㄴㅁ인암니암니암ㄴ아ㅣ미니라배재으태ㅡㅊ키;ㅊㅌ민암니아;ㅁ니아마냅잙으ㅐㅈ비ㅡㄱ래ㅣㅡ,ㅐ브ㅐㄹ으배ㅣㅡㄹㅇ,ㅂㄹ배ㅣ르
		
		//String 문자열 형태로 이루어진 기본 자료ㅕ형을 기본자료형으로 변환하는 방법
		String str1 = "10"; //10.0 은 정수의 형태가 아니기 떄문에 10.0 혹은 !10같은거하면 망가진다 // 정확하게 어떤값인지 알아야 가능하다
		String str2 = "15.3";
		
		/*
		 * String 을 기본자료형으로 파싱하는방법
		 * wrapper.클래스.parseXXX(변환할 문자열);
		 */
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i+d);
		
		//기본자료형 --> String
		/*
		 * 10 -> "10"
		 * String str1 = String.valueOf(i);
		 * String str2 = i+"";   함수형 프로그램하다 안먹이면 위에꺼 써리ㅏ
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
}
