package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print(" 1. 입력\n 2.수정\n 3.조회\n 4.삭제\n 7.종료\n 메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("입력 메뉴입니다.");
			break;

		case 2:
			System.out.println("수정 메뉴입니다.");
			break;

		case 3:
			System.out.println("조회 메뉴입니다.");
			break;

		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;

		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;

		default:
			System.out.println("잘못된 번호 입니다.");

		}

	}

	public void practice2() {

		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("양수만 입력해 주세요");
		} else if (num % 2 == 0) {
			System.out.println("짝수다");

		} else if (num % 2 == 1) {
			System.out.println("홀수다");

		}
	}

	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int mat = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + mat + eng;
		int avg = sum / 3;

		if (sum >= 40 && avg >= 60)
			System.out.println("축하합니다, 합격입니다!");
		else
			System.out.println("불합격입니다.");

	}

	public void practice4() {

		System.out.print("1~12 사이의 정수 입력 : ");
		int we = sc.nextInt();

		switch (we) {

		case 1, 2, 3:
			System.out.println("봄 입니다");
			break;

		case 4, 5, 6:
			System.out.println("여름 입니다");
			break;

		case 7, 8, 9:
			System.out.println("가을 입니다");
			break;

		case 10, 11, 12:
			System.out.println("겨울 입니다");
			break;

		default:
			System.out.println(we + "월은 잘못 입력된 달입니다.");
		}

	}

	public void practice5() {

		String iid = "clock";
		int ppswd = 327;

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		int psw = sc.nextInt();

		if (id.equals(iid) && ppswd == psw) {

			System.out.println("로그인 성공");
		} else if (id.equals(iid)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (ppswd == psw) {

			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("다시한번 입력해 주세요.");
		}

	}

	public void practice6() {

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String r = sc.next();

		switch (r) {
		// break 없이 프린트문이 쌓이는 형태로 만들어라
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;

		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;

		case "비회원":
			System.out.println("게시글 조회");
			break;

		default:
			System.out.println(r + "는 올바른 회원 등급이 아닙니다.");
		}
	}

	public void practice7() {

		System.out.print("키(m)를 입력해주세요 : ");
		double h = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double w = sc.nextDouble();

		double bmi = w / (h * h);

		System.out.print("bmi 지수 : " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");

		} else if (bmi < 23) {
			System.out.println("정상체중");

		} else if (bmi < 25) {
			System.out.println("과체중");

		} else if (bmi < 30) {
			System.out.println("비만");

		} else if (bmi >= 30) {
			System.out.println("고도 비만");

		} else {
			System.out.println("다시한번 입력해주세요");

		}

	}

	public void practice8() {

		System.out.println("피연산자1 입력 : ");
		int p1 = sc.nextInt();

		System.out.println("피연산자2 입력 : ");
		int p2 = sc.nextInt();

		System.out.println("연산자를 입력 : ");
		char yon = sc.next().charAt(0);

		if (p1 <= 0 || p2 <= 0) {

			System.out.println("양수만 입력해 주세요.");
		} else {
			switch (yon) {

			case '+':
				System.out.println(p1 + " + " + p2 + " = " + (p1 + p2));
				break;
			case '-':
				System.out.println(p1 + " - " + p2 + " = " + (p1 - p2));
				break;
			case '*':
				System.out.println(p1 + " * " + p2 + " = " + (p1 * p2));
				break;
			case '/':
				System.out.println(p1 + " / " + p2 + " = " + (p1 / p2));
				break;
			case '%':
				System.out.println(p1 + " % " + p2 + " = " + (p1 % (double) p2));
				break;
			default:
				System.out.println("잘못입력하셨습니다 프로그램을 종료합니다.");
			}
		}

	}

	public void practice9() {

		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finalTest = sc.nextInt();

		System.out.print("과제 점수 : ");
		int gwaJe = sc.nextInt();

		System.out.print("출석 회수 : ");
		int chol = sc.nextInt();

		int gangE = 20;

		double scoreMid = midTest * 0.2;
		double scoreFinal = finalTest * 0.3;
		double scoreGwaJe = gwaJe * 0.3;

		double total = scoreMid + scoreFinal + scoreGwaJe;

		if (total >= 70 && chol > (gangE * 0.7)) {

			System.out.println("pass");

		} else if (total < 70 || chol <= (gangE * 0.7)) {

			System.out.println("fail");

		} else {

			System.out.println("다시 입력해 주세요");
		}

	}

	public void practice10() {

		System.out.print(
				" 실행할 기능을 선택하세요.\n 1. 메뉴 출력\n 2. 짝수/홀수\n 3. 합격/불합격\n 4.계절\n 5.로그인 \n 6. 권한 확인\n 7. BMI\n 9. 계산기");
		int we = sc.nextInt();

		switch (we) {

		case 1:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice1();
			break;

		case 2:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice2();
			break;

		case 3:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice3();
			break;

		case 4:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice4();
			break;

		case 5:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice5();
			break;

		case 6:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice6();
			break;

		case 7:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice7();
			break;

		case 8:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice8();
			break;

		case 9:
			System.out.print("선택 : " + we + "(실습문제" + we + " 실행)");
			practice9();
			break;

		default:
			System.out.print(we + "잘못 입력.");

		}
	}

	public void practice11() {

		int set = 0000;

		System.out.print("비밀번호 생성 : ");
		int psw = sc.nextInt();
			// 3자리수면 오류가 나니 자릿수 검사 후에 집어넣도록 설정
		String e = Integer.toString(psw);
		char a = e.charAt(0);
		char b = e.charAt(1);
		char c = e.charAt(2);
		char d = e.charAt(3);

		if (e.length() < 4 || e.length() > 4) {

			System.out.println("자리수 안맞음");
			
		} else if (a == b || b == c || c == d) {

			System.out.println("중복값 있음");
			
		} else if (psw >= 1000 && psw <= 9999) {

			System.out.println("비밀번호 생성 완료");
			set = psw;
			
		} else {
			
			System.out.println("다시 입력해 주세요.");
		}

		System.out.print("비밀번호를 입력하세요 : ");
		int ttry = sc.nextInt();

		if (set == 0000) {

			System.out.println("비밀번호 설정 안됨");
		} else if (ttry == set) {

			System.out.println("성공");
			
		} else {
			
			System.out.println("다시한번 해주세요");
			
		}

	}
	
	
	

}
