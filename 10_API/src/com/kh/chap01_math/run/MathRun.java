package com.kh.chap01_math.run;

/*import java.lang.*;
* jaba.lang 패키지는 보이진않지만 항상 import가 되어있다.
*
*/
public class MathRun {

	public static void main(String[] args) {
		/*
		 * 웹개발자 기준 Math 클래스의 유용한 메서드들
		 */
		//파이
		System.out.println("파이 : "+Math.PI);
		
		// 올림 처리 메서드
		// 올림 -> Math.ceil(double) : double
		
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1));
		System.out.println("소수점 올림 : "+Math.ceil(num1 * 10)/10+"\n");
		
		//반올림 -> Math.round(double) : long
		
		System.out.println("반 올림 : "+Math.round(num1));
		System.out.println("소수점 반 올림 : "+Math.round(num1 * 100)/100.0+"\n");
		
		//버림 -> Math.floor(double) : double
		
		System.out.println("내림 : "+Math.floor(num1));
		System.out.println("소수점 내림 : "+Math.floor(num1 * 10)/10+"\n");
		
		//절대값 -> 절대값 Math.abs(int/double/long/float) : int/double/long/float 들어간대로 나온다
		
		int num2 = -10;
		
		System.out.println("절대값 : "+Math.abs(num2)+"\n");
		
		//최소값 -> Math.min(int,int) : int
		
		System.out.println("최소값 : "+Math.min(5, 10));
		
		//최대값 -> Math.max (int,int) : int
		
		System.out.println("최대값 : "+Math.max(5, 10)+"\n");
		
		//제곱근(루트) -> Math.sqrt(double) : double
		System.out.println("4의 제곱근 : "+Math.sqrt(4.0));
		
		//제곱 -> Math.pow(double,double) : double
		System.out.println("2의 10제곱 : "+Math.pow(2, 10)+"\n");
	
	
	
	
	}
	
}
