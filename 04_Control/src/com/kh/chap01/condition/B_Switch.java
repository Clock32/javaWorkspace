package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);

	public void method() {
		/*
		 * switch 문과 if 문의 차이점
		 * if(조건식) -> 조건식을 복잡하게 기술할 수 있음
		 * switch 는 조건식이 없으며 확실한 값의 변수만 기술한다
		 * 
		 * 표현법
		 * switch(동등 비교 수행 대상) {
		 * 
		 * case 값1 : 실행할 코드;
		 * 				break;
		 * 
		 * case 값2 : 실행할 코드;
		 * 				break;
		 * ...
		 * 
		 * default : 실행할 코드
		 * 
		 * }
		 * 
		 * switch 문의 장법ㅁ
		 * case 문을 통해 내가 실행하고싶은 코드로 프리패스 하기 때문에
		 * if else 보다 훴신 더 빠르다
		 * 
		 *  switj
		 *
		 *	자주 사용되지는 않지만 정밀한 연산결과가 동일한 속도롤 수ㅐ괴러랴하는
		 *
		 * 키더르입러 마우ㅡ스 입려기
		 * 
		 */
		
		System.out.print("1~3중 누르시오 :");
		int num = sc.nextInt();
		
		
		
		if (num == 1) {
			
			System.out.println("빨간불");
		}else if (num == 2) {
			
			System.out.println("파란불");
		}else if (num == 3) {
			
			System.out.println("초록불");
		}else {
			
			System.out.println("잘못입력했습니다");
		}
	}
	
	public void method2() {
		
		// 사용자에게 구매할 과일명을 입력받아
				// 각 과일마다의 가격을 출력
				// 사과(1000), 바나나(2000), 복숭아(5000)
				System.out.println("KH 과일가게");
				System.out.println("구매할 과일(사과, 바나나, 복숭아) : ");
				
				String fruit = sc.next();
				int price = 0;
				
				switch(fruit) {
				case "사과" :
					price = 1000;
					break;
				case "망고" :
				case "복숭아" :
					price = 5000;
					break;
				case "바나나" :
					price = 2000;
					break;
				}
				System.out.println(fruit + "의 가격은 " +price + "입니다");
		
		
	}
}
