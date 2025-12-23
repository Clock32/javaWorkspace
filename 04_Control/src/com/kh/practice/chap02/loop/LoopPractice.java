package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {

			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {

					System.out.print(i + " ");

				}

				break;
			}

			System.out.println("다시한번 입력하십시오");

		}

	}

	public void practice2() {

		while (true) {

			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i >= 1; i--) {

					System.out.print(i + " ");

				}

				break;
			}

			System.out.println("다시한번 입력하십시오");

		}

	}

	public void practice3() {

		// 훨씬 더 좋은 버전 코드 공유 참조

		int sum = 0;

		System.out.print("정수를 하나 입력하세요 : ");
		int ran = sc.nextInt();

		for (int i = 1; i <= ran; i++) {
			System.out.print(i + "+");

			sum += i;

			if (i == ran - 1) {

				System.out.println(ran + " = " + (sum + ran));
				break;
			}
		}
		System.out.print("    1부터 " + ran + "까지의 총합 : " + (sum + ran));

	}

	public void practice4() {

		// 훠얼씬 더 좋은거 코드 공유 참조

		while (true) {

			// int min = num1<num2 ? num1 : num2 ;
			// int max = num1>num2 ? num1 : num2 ;

			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 <= 0 || num2 <= 0) {

				System.out.println("1 이상의 숫자를 입력해 주세요");

			} else if (num1 > 0 && num2 > 0 && num1 < num2) {

				for (int i = num1; i <= num2; i++) {

					System.out.print(i + " ");
				}

			} else if (num1 > 0 && num2 > 0 && num1 > num2) {

				for (int i = num2; i <= num1; i++) {

					System.out.print(i + " ");

				}

			} else if (num1 == num2) {
				System.out.println("두 숫자가 같습니다.");

			}

		}

	}

	public void practice5() {

		while (true) {

			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if (dan <= 0 || dan >= 10) {

				System.out.println(" 1부터 9까지의 단을 입력해 주세요.");
				continue;

			} else {

				for (int i = dan; i <= 9; i++) {

					for (int x = 1; x <= 9; x++) {

						System.out.print(i + "x" + x + "=" + i * x + " | ");

					}

					System.out.println(
							"\n------------------------------------------------------------------------------");

				}
				return;
			}
		}

	}

	public void practice6() {

		while (true) {

			System.out.print("시작 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("공차 : ");
			int num2 = sc.nextInt();

			int sum = 0;

			if (num1 > 0 && num2 > 0) {
				sum = num1;
				for (int i = 1; i <= 10; i++) {

					sum += +num2;
					System.out.print(sum + " ");

				}

				break;
			}

			System.out.println("다시한번 입력하십시오");

		}

	}

	public void practice7() {

		char yoon = 'd';

		while (true) {
			System.out.print("연산자 (+,-,*,/,%) : ");
			String yon = sc.next();

			if (yon.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			System.out.print("첫번째 정수 : ");
			int num1 = sc.nextInt();

			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();

			if (yon.length() == 1) {
				yoon = yon.charAt(0);

				switch (yoon) {

				case '+':
					System.out.println(num1 + " " + yon + " " + num2 + " = " + (num1 + num2));
					return;

				case '-':
					System.out.println(num1 + " " + yon + " " + num2 + " = " + (num1 - num2));
					return;

				case '*':
					System.out.println(num1 + " " + yon + " " + num2 + " = " + (num1 * num2));
					return;

				case '/':
					if (num2 <= 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
						break;
					}

					System.out.println(num1 + " " + yon + " " + num2 + " = " + (num1 / num2));
					return;

				case '%':
					System.out.println(num1 + " " + yon + " " + num2 + " = " + (num1 % num2));
					return;

				default:
					System.out.println("없는 연산자 입니다 다시 시도해 주십시오.");
					break;
				}

			}

		}

	}

	public void practice8() {

	}

	public void practice9() {

	}

	public void practice10() {

		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i <= 0; i--) {

			if (i % num == 1 && i % num == num) {

				System.out.println("소수입니다");

			}

			if (!(i % num == 1 && i % num == num)) {

				System.out.println("소수가 아닙니다");
			}

		}

	}

	public void practice11() {

	}

	public void practice12() {

	}
}
