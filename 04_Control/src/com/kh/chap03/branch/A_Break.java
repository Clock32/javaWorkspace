package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		/*
		 * break : 코드 실행중 break문을 만나게 되면 현재 속해있는 가장 가까운 반복문을 빠져나간다
		 * 
		 * continue ; 코드 실행중 continue문을 만나게 되면 현재 속해있는 가장 가까운 반복문을 반복한다
		 * 
		 * 
		 */

		for (int i = 0;; i++) {
			int ran = (int) ((Math.random() * 10) + 1);
			System.out.println("random 값 : " + ran);

			if (ran % 3 == 0) {
				System.out.println(i + "회 반복됨.");
				break;

			}

		}
	}

	public void method2() {

		while (true) {
			System.out.println("문자열 입력 : ");
			String str = sc.next();

			if (str.equals("exit")) {

				System.out.println("종료");
				break;
			}

		}

	}

	public void method3() {
		// 사용자에게 양수를 입력받아 1부터 사용자가 입력한 값까지 추렭하는 프로그램을 만드시오
		// 사용자가 양수를 입력하는경우 반복을 종료시키십시오

		while (true) {

			System.out.print("양수를 입력하십시오 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 0; i <= num; i++) {

					System.out.print(i);

				}
				System.out.println("   " + num + "은 양수입니다");
				break;
			}

			System.out.println("다시한번 입력하십시오");

		}

	}

	public void method4() {
		/*
		 * 심볼
		 */

		loop1: for (int i = 0; i < 10; i++) {

			loop2: for (int j = 0; j < 10; j++) {
				System.out.println(i);

				if (i == 5) {
					break loop1; //loop1`을 break해라
					//그냥 break만 쓰면 현재영역 혹은 가장 가까ㅜㄴ 구문이 탈출되지만 위의 심볼을쓰면 정확히 어디부터 종료할지 저장할 수 있다
				}
			}
		}

	}

}
