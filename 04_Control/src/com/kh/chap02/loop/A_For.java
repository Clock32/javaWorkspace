package com.kh.chap02.loop;

import java.util.Random;

public class A_For {
	/*
	 * 반복문 실행할 코드를 반복적으로 수행시킬수 있도록 도와주는 제어문 크게 for 문과 while문으로 나뉜다
	 * 
	 * for(조기식,조건식,증감식){ 반복적으로 수행할 코드 }
	 * 
	 * 초기식 : 반복문이 시작될떄 초기에 단 한번만 실행되는 구문
	 * 
	 * 예시 int i = 0
	 * 
	 * 조건식 : 반복문이 수행될 조건을 작성하는 구문이다 조건식이 true일때 반복문을 수행한다 조건식이 false인 경우 반복문이 종료된다
	 * 보통 초기식에서 제시된 변수를 사용하며 조건식을 작성한다 i < 10
	 * 
	 * 증감식 : 반복문을 제어하는 변수값을 증감 시키는 구문이다 보통 초기식에서 제시된 변수를 증감한다 i++
	 * 
	 * for 문 실행 흐름
	 * 
	 * 1. 초기식 실행 2. 조건식 실행 3-1. 조건식 결과가 true라면 for문 내부코드 실행 3-2. 조건식 결과가 false라면
	 * for문을 종료한다 4. 증감식 실행 for문 내부코드 실행후 증감식이 실행된다 5. 다시 조건식부터 반복진행
	 * 
	 * 
	 */
	public void method1() {
		// 5회 반복하는 반복문

		for (int i = 0; i < 5; i++) {

			System.out.println("Hello World!");
		}

		for (int i = 11; i < 16; i++) {
			System.out.println("hi");
		}

		for (int i = 0; i < 10; i += 2) {

			System.out.println("hiieeeee");
		}

	}

	public void method2() {
		// 1234
		for (int i = 1; i <= 5; i++) {

			System.out.println(i);
		}
	}

	public void method3() {
		// 1과 10 사이의 정수중 "홀수"만 출력하는 방복문을 만드시오
		// 출력 결과는 13579

		for (int i = 1; i < 10; i += 2) {

			System.out.print(i + " ");
		}

	}

	public void method4() {
		// 1 ~ 10까지의 총 합
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum += i;

		}
		System.out.print("1부터 10까지의 총합 : " + sum);

	}

	public void method5() {
		// 1에서부터 매번 달라지는 랜덤ㄱ밧 까지의 총 합계

		int sum = 0;
		int ran = (int) ((Math.random() * 10) + 1);
		for (int i = 1; i <= ran; i++) {

			sum += i;
		}
		System.out.print("1부터 랜덤까지의 총합 : " + sum);
	}

	public void method6() {
		String str = "Hello World!";
		int l = str.length();

		for (int i = 0; i <= l; i++) {
			char a = str.charAt(i);

			System.out.println(a);
		}

	}

	public void method7() {

		for (int i = 2; i <= 9; i++) {

			for (int x = 1; x <= 9; x++) {

				System.out.print(i + "x" + x + "=" + i * x + " | ");

			}

			System.out.println("\n------------------------------------------------------------------------------");

		}

	}

	public void method8() {
		/*
		 * *****\n *****\n *****\n *****\n *****\n *****\n 이걸 중첩반복문으로 만들어라
		 */
		String star = "";
		String a = "*";

		for (int i = 1; i <= 4; i++) {

			for (int s = 1; s <= 5; s++) {

				star += a;

			}
			System.out.print(star + "\n");
			star = "";
		}

	}
	
	public void method9() {
		// 1***\n
		// *2**\n
		// **3*\n
		// ***4\n
		// if 를 활용하여 i==0 이면 * 혹은 i 값은 2 일떄 2를 출력해라 이런식으로 진행하는거지
		/*
		 * for (int i = 0; i<4;i++){
		 * 	for(int j =0; j<4;j++){
		 * 		if(j==i)
		 * 	
		 * }
		 * }
		 */
		
		/*
		 	String star = "****";
			String num = "1234";
			char temp = ' ';
			
			
			for (int i = 0; i <= 4; i++) {
				
				temp = num.charAt(i);
				num += star;
				
				for (int s = 0; s <= 4; s++) {
					
					System.out.print(temp);
						
				}
			
			*/
			
			String str = "*****";
			char[] arr = str.toCharArray();//['*','*','*' ]
			arr[0] = '1';
			System.out.println(arr);
			
			 //직접 String 위치를 변환하고싶으며ㅑㄴ 배열과 to chart 를 사용하여 
			 //스트링을 배열로 바꾼다음 특정 위치의 문자를 바꾸고 새로 적용하여 구현할수 있다
			 
			
			
			
	
	}

}
