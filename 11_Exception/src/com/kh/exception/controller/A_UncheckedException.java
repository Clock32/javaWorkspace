package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {

	Scanner sc = new Scanner(System.in);
	/*
	 * UncheckedException은
	 * RuntimeException처럼 프로그램 실행시 발생되는 예외들이 대표적인 
	 * Unchecked Exception계열의 예외들이다
	 * RuntimeException의 자식 클래스들
	 * 	ArrayIndexOutOutBoundsException
	 * 	NegativeArraySizeException
	 * 	ClassCastException
	 * 			허용할 수 없는 형 변환이 진행될 경우 발생하는 예외
	 * 			예) p1이 Child2객체로 생성된 참조변수일댸
	 * 			(Child1) p1 등을 수행하는 경우
	 * 	NullPointerException
	 * 			참조변수가 null인 상황에서 특정 메서드 및 필드에 접근하려고할때
	 * 	ArithmerticException
	 * 			
	 * = 이러한 RuntimeException과 관련한 예외는 충분히 예측가능한 ㅏㅇ황이다.
	 * 		예외처리가 애초에 발생이 안되게끔 대부분 조건문으로 해결이 가능하다
	 * 		즉 굳이 예외처리를 할 필요가 없다는 의미이다.
	 * 
	 * 
	 */
	
	
	
	public void method1() {
		
		//ArithmeticException
		//0으로 나눌때 수학적 에러
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		//예외처리방법 1 : 조건문으로 애초에 예외가 안나오게 막는거
		
//		if(num2 == 0) {
//			
//			System.out.println("0으로 못나눈다");
//		}else {
//			
//			System.out.println("나눗셈 연산 결과는 "+num1 / num2+"입니다.");
//			
//		}
		
		//2 try catch 문으로 해결하기
		/*
		 * 예외가 발생했을경우를 대비해서 실행할 내용을 정의 해 두는 문법
		 * 
		 * 표현법
		 * try {
		 * 		예외가 발생할 수 있는 코드
		 * }catch(발생할수 있는 예외 클래스){
		 * 		해당 예외가 발생시 실행할 구문
		 * }
		 * 
		 * 
		 */
		
		try {
			//ArithmeticException발생 가능
			System.out.println("나눗셈 연산 결과는 "+num1 / num2+"입니다.");
			
		}catch(ArithmeticException e) {
			
			System.out.println("0으로 못나눈다");
			e.printStackTrace(); //오류를 로그로 출력하는 기능
		}
		
		
		System.out.println("프로그램 종료");
		
		
		
		
	}
	
}
