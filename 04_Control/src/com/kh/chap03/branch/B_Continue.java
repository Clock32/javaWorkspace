package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue 프로그램 실행 중 컨티뉴 문을 만나면 그 아래의 코드는 실행하지않고 반복문의 처음으로 다시 돌악ㄱ다서 실행한다 break
	 * 하지만 다시
	 */

	public void method() {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");

		}

	}

	public void method2() {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			
			if (i % 6 == 0) continue;
			
			sum += i;
		}
		System.out.println("6의 배수를 제외한 1에서 100까지의 합은 : " + sum + "입니다.");
	}
	
	
}
