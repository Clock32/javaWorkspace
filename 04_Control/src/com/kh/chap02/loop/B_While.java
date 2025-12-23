package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * 표현법
	 * 
	 * 초기식 필수아님
	 * 
	 * while(조건식){ //반복적수행
	 * 
	 * (증감식) 필수아님
	 * 
	 * }
	 * 
	 * 
	 */
	Scanner sc = new Scanner(System.in);

	public void test() {
		// switch를 사용해서 만들어도 괜찮지 않읗ㄹ까 싶은데
		// switch 킬코들같은걸 만들어서 하면 좋징낳을까

		int end = 0;

		while (end == 9) {

			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			end = num;

			if (num > 0) {

				System.out.println("양수입니다.");

			} else if (num == 0) {

				System.out.println("0입니다.");

			} else {

				System.out.println("음수입니다.");
			}

		}

	}

	public void method1() {

		int i = 1; // 초기식
		while (i <= 5)// 조건식
		{

			System.out.println("Hello Wolrd!");

			i++; // 증감식

		}
	}

	public void method2() {

		int i = 0;
		int sum = 1;
		while (i < 5) {

			System.out.print(sum++ + " ");
			i++;
		}
	}

	public void method3() {
		// 1부터 랜덤값 까지의 총 합계를 whike 문으로 작성하라 출력예시 1부터 x 까지의 합계는 xxxㅇ빈디ㅏ

		int sum = 0;
		int ran = (int) ((Math.random() * 10) + 1);
		int i = 0;

		while (i <= ran) {

			sum += i;
			i++;

		}
		System.out.print("1부터 " + ran + "까지의 총합 : " + sum);

	}

	public void method4() {
		/*
		 * do-while문 표현법 - 한번도 안쓸정도로 잘 안쓴다
		 * 
		 * do { 반복실행 할 코드
		 * 
		 * }while(조건문){
		 *
		 * } do while은 별도의 조건검사 ㅇ벗이 최초 1회는 무조건 실행한다
		 * 
		 */
		do {
			System.out.println("Hello again");
		} while (false);
		{
		}

	}

	public void method5() {
		int i = 0;
		int sum = 1;
		do {

			System.out.print(sum++ + " ");
			i++;

		} while (i < 5);
		{

		}
	}

	public void method6() {
		
		
		
	}

}
