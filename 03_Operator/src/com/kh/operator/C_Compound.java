package com.kh.operator;

public class C_Compound {

	/*
	 * 복합 대입 연산자 산술연산자와 대입연산자를 함께 복합적으로 사용하는 연산자 연산속도가 빨라지므로 사용을 권장
	 * 
	 * A = A+5 A += 5
	 * 
	 */

	public void method() {

		int num = 12;
		String str = "Hello";

		num = num + 3;
		num += 3;

		// num값을 5 감소

		num -= 5;

		// num값을 7배 증가

		num *= 7;

		// num값을 2배 감소

		num /= 2;
		
		//num을 4로 나누었을때 나머지 값을 num에 대입 == 나머지 넣어라
		
		num %= 4;
		
		// +=일 경우 문자열 접합이 가능하다
		
		str += " World!!";

	}
}
