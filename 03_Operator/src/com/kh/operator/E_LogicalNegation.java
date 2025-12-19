package com.kh.operator;

public class E_LogicalNegation {

	/*
	 * 논리부정 연산자 !(단항연산자)
	 * 논리값을 반대로 출력해주는 것
	 * true 면 false 간단하잖아
	 */
	
	public void method() {
		
		System.out.println("true의 부정"+ !true);
		
		boolean b = true;
		boolean b2 = !b;
		
		boolean b3 = !(5 > 3);
	}
}
