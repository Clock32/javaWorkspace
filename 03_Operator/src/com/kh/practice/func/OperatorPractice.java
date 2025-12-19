package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice01() {

		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();

		System.out.println("\n");
		
		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남는 사탕 개수 : " + num2 % num1);

	}

	public void practice02() {

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리 까지) : ");
		double grade = sc.nextDouble();

		System.out.println(year + "학년 " + group + "반 " + num + "번 "+ name + " " + (gender == 'M' || gender == 'm' ? "남" : "여")
				+ "학생의 성적은 " + grade + "이다.");

	}

	public void practice03() {

		System.out.print("나이 : ");
		int num = sc.nextInt();

		System.out.print(num <= 13 ? "어린이" : 
						(num <= 19 ? "청소년" : "성인"));

	}

	public void practice04() {

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "합격" : "불합격");

	}

	public void practice05() {

		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char ch = sc.nextLine().charAt(7);

		System.out.println(ch == '3' || ch == '1' ? "남자" : "여자");
	}

	public void practice06() {

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean result = num3 <= num1 || num3 > num2;
		System.out.println(result);
	}

	public void practice07() {

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);

	}

	public void practice08() {

		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();

		double a = 0.4;
		double b = 0.0;
		double c = 1.15;

		double ma = (A * a) + A;
		double mb = (B * b) + B;
		double mc = (C * c);

		System.out.println("A사원 연봉/연봉+a : " + A + "/" + ma);
		System.out.println(ma >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("B사원 연봉/연봉+a : " + B + "/" + mb);
		System.out.println(mb >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("C사원 연봉/연봉+a : " + C + "/" + mc);
		System.out.println(mc >= 3000 ? "3000 이상" : "3000 미만");

		//C사원만 숫자나 계산 기능이 다른 이유는 예시 문제와 정확하게 하려고 바꾼것이니 제대로 작동하려면 A와 B처럼 조정 해야한다.
	}

	public void why() {

		System.out.print("2600 : ");
		int C = sc.nextInt();

		double c = 1.15;

		double mc = (C * c);

		System.out.println(mc + " / 2989.9999999999995 이 나와야 한다");

	}
}
