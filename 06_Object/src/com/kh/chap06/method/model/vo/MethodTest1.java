package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	
	/*
	 * 표현접
	 * 접근제한자 예약어 자료형 메서드명((매개변수 생략가능)) {
	 *  수행할 코드
	 *  
	 *  return 반환할 값; (생략가능)
	 * 
	 * }
	 */
	
	
	/*
	 * 1. 매개변수가 없고 반환할 값도 없는 메서드
	 */
	public void method1() {
		
		System.out.println("매개변수 x , 반환값 x");
		
		//return; // return 뒤에 아무것도 없는 이유는 void라서 그렇다 모든 메서드는 return이 들어가야하며 자료형이 맞는 값이 들어가야한다.
	}
	
	//2. 매개변수 x 반환형 o
	
	public int method2() {
		
		int ran = (int) (Math.random()*10+1);
		System.out.println("매개변수 x , 반환값 o");
		
		return ran;
		//반환시키고자하는 자료형과 메서드의 반환ㄱ밧이 같아야 한다
	}
	
	//3. 매개변수  o 반환형 x
	
	public void method3(int x, int y) {
		int min = 0;
		int max = 0;
		
		if (x>y) {
			min = y;
			max = x;
			
		}else {
			min = x;
			max = y;
		}
		
		System.out.println("최대값은 : "+max+"최소값은 : "+min);
		//void라 return 은 생략가능하다 jvm이 알아서 해준다
	}
	
	//4. 매개변수 o 반환값 o
	public int multiple(int a, int b) {
		
		return a*b;
	}
	
	
	
	
}
