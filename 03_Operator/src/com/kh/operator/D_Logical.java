package com.kh.operator;
import java.util.Scanner;

public class D_Logical {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 논리 연산자 
	 * 논리 값 두개를 비교하는 연산자
	 * 
	 * AND 연산자 && : a&&b == a랑 b가 모두 참일 경우에만 true 를 반환하여라 == 그러니 둘 중 하나라도 false 면 false가 발생한다
	 * 
	 * OR 연산자 || : a||b == a혹은 b중 아무거나 참일 경우 true 를 반환한다 == 그러니 false를 반환하려면 둘다 false 여야한다
	 * 
	 * ~하면서 == AND // ~또는 == OR 
	 * 
	 */
	
	public void method1() {
		
		System.out.println("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		//넘의 값이 0보다 크면서 짝수입니까?
		
		boolean result = (num > 0) && (num%2 == 0);
		
		System.out.println("입력하신 숫자는 짝수가"+result+"입니다");
		
	}
	
	public void method2() {
		
		/*
		 * 입력한 값이 1 이상 100 이하의 숫자인지 확인
		 * 1<=x && x<= 100 
		 */
		
		System.out.println("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		
		boolean result1 = (num1 >= 1) && (num1 <= 100);
		
		System.out.println("입력하신 숫자는 1보다 크고 100보다 이하인 숫자가"+result1+"입니다");
		
		
	}
	
	public void method3() {
		
		//사용자가 입력한 값이 y거나 Y인 경우 참 아니면 거짓을 반환하라
		
		System.out.println("Y를 입력하시오 : ");
		char ch = sc.next().charAt(0); // 실무에서는 그냥 글자 빼서 자동대문자 변환을하지만 이건 실습이니 일부러 불편하게 구상
		
		boolean result2 = ch == 'y' || ch == 'Y';
		
		System.out.println("입력하신 문자는 Y가 "+result2+"입니다");
		
	}
	
	public void method4() {
		
		//and연산자의 경우 a and b 의 조건 중 a 의 값이 false 인 경우 뒤쪽 조건식은 실행하지않는다
		//그래서 결과가 10으로 나온다
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1<5) && (num1++ > 0);
		
		System.out.println(result1);
		System.out.println(num1);
		
		boolean result2 = (num2 <20) || (++num2 >0);
		
		System.out.println(result2);
		System.out.println(num2);
		
		//거짓 뿐만 아니라 참이어도 뒤쪽 실행하지않는다.
	}
	
	
}
