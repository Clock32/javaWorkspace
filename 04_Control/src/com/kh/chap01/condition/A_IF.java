package com.kh.chap01.condition;

import java.util.Scanner;

public class A_IF {
	/*
	 * 조건문 - 조건식을 통해 참 거짓을 판단하여 그에 해당하는 코드를 실행할 수 있도록 합니다 조건식은 보통 비교연산자나 논리연산자를 사용하여
	 * 작성한다 조건문은 if문 switch문 으로 나뉜다
	 * 
	 */
	Scanner sc = new Scanner(System.in);

	public void method() {
		/*
		 * 단독 if문 표현법 if(조건식) { 조건식이 true일 경우 실행할 코드를 작성한다 }
		 */

		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		}

		if (num <= 0) {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void method2() {
		/*
		 * if else 문 if (조건식) { 조건식이 true일경우 }else { 조건식이 false일 경우 }
		 */

		System.out.println("정수를 입력하세요 : ");
		int num1 = sc.nextInt();

		if (num1 > 0)
			System.out.println("양수입니다.");
		else
			System.out.println("양수가 아닙니다.");
		// 한줄만 할거면 이렇게도 된다

	}

	public void method3() {
		/*
		 * if elseif 문 3항 연산자를 중첩으로 쓰는것과 비슷하다
		 * 
		 * 같은 비교대상으로 여러개의 조건을 제시해야하는경우 사용한다 if (조건문1) { 참일경우 } else if(조건식 2 ){ 조건식2 가
		 * true 일 경우 } else { 위 조건들이 모두 거짓일경우 실행할 노드 }
		 * 
		 * 
		 */

		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {

			System.out.println("양수입니다.");

		} else if (num == 0) {

			System.out.println("0입니다.");

		} else {

			System.out.println("음수입니다.");
		}

	}

	public void method4() {
		/*
		 * 사용자가 입력한 나이를 바탕으로 어닐ㄴ이 인지 청소년인지 성인인지 쓰시오 어르신까지 13 이하 어린이 , 13세 초과 19세 이하 청소년
		 * - 19세 초과 60세 이하 - 어르신 60세 초거ㅏ
		 */

		System.out.print("나이를 입력하세요 : ");
		int ni = sc.nextInt();

		if (ni <= 13) {

			System.out.print("어린이입니다.");

		} else if (ni <= 19) {

			System.out.print("청소년입니다.");

		} else if (ni <= 60) {

			System.out.print("성인입니다.");
		} else {

			System.out.print("어르신입니다.");
		}

	}

	public void method5() {
		// 설별과 이름을 이별받아 ㅏ나어마ㅓㄴㅇㅁ

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();

		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);

		String result;

		if (gender == 'm' || gender == 'M') {

			result = "남자";
		} else if (gender == 'f' || gender == 'F') {

			result = "여자";
		} else {

			result = "입력값 없음";
		}

		System.out.println(name + "님은 " + result + "입니다.");

		/*
		 * String result = "여자"
		 * 
		 * if (gender == 'm' || gender == 'M') {
		 * 
		 * result = "남자"; } else {
		 * 
		 * result = "입력값 없음"; }
		 * 
		 * 기본값을 어떤식으로 설정하느냐에따라 코드ㄹ가 많이 간편해진다
		 */

	}

	public void method6() {
		/*
		 * 사용자에게 본인의 이름을 입력받아 본인의 이름과 일치한는지 검사해보는 코드를 작성한다
		 *
		 * 참조 자료형은 주소값으로 대조를하기떄문에 == 를 이용ㅎ서 문자열을 동등비교할수가없다
		 * 
		 */

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		/*
		 * if (name == "허민혁") {
		 * 
		 * System.out.println("이름이 일치합니다."); } else {
		 * 
		 * System.out.println("이름이 일치하지 않습니다."); }
		 */
		if (name.equals(name)) {
			/*
			 * String처럼 문자가 맞는지 확인하려면 == 대신 equals 를 사용해야한다 boolean , char , byte, short,
			 * int, ling,float , double 은 기본가료형 String 포함 다른것들은 참조 자료형이라 제대로 비교 잘 안해준다 == +
			 * = / * 등
			 * 
			 * 기본 자료형간 비교시 == != 는 사용 가능하지만 단 참조 자료형은 동등비교시 정상적인 비교가 안된다 참조 자료형은 서로 ㄱ밧이 동일한지
			 * 비교할때 equals 를 사용한다 이건 주소값이 달라서 생기는 문제이다
			 */
			System.out.println("이름이 일치합니다.");

		} else {

			System.out.println("이름이 일치하지 않습니다.");
		}

	}
	
	

}
