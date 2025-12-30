package com.kh.chap04.field.model.vo;

public class FieldTest3 {
/*
 * static : 정적인,고정된
 * static키워드는 특정 변수나 메서드를 static 메모리 영역에 고정시켜둔다
 * 따라서, 자주 사용하는 변수나 메서드를 static으로 관리하여 메모리영영에 고정시켜두고 사용하면 효율이 좋으며 
 * 가끔사용되는 변수나 메서드를 static 메모모리 영역에 보관하면 효율이 좋지 않다
 * 
 */
	public static String sta = "Static 변수";
	//일반 필드에 static 예약어르 붙이기만 하면 static으로 사용이 가능하다. static 하면 글꼴이 다르다.	
	
	//보통의 static 사용하는건 final과 public을 주로 사용한다
	//final은 상수를 ㅓㅈㅇ의하는 키워드이다 , 한번 저장된 값을 고정해서 사용하기 위해 대부분의 static 변수는 final 예약어를 함계 사용한다.
	public static final double PI = 3.14;
	
	
	public static void test() {
		
		System.out.println("Hello World!");
	}

}


