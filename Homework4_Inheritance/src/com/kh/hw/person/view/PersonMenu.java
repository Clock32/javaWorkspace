package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public PersonMenu() {
		
	}
	
	
	public void mainMenu() {
		
		while (true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.\r\n"
				+ "현재 저장된 학생은 "+pc.personCount()+"명입니다.\r\n"
				+ "사원은 최대 10명까지 저장할 수 있습니다.\r\n"
				+ "현재 저장된 사원은 "+pc.personCount()+"명입니다.\\r\\n");
		
		System.out.print("1.학생 메뉴\n2. 사원 메뉴\n9. 끝내기\n 메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch (mNum) {
		
		case 1 : studentMenu();break;
			
		case 2 : employeeMenu(); break;
			
		case 9 : System.out.println("종료합니다."); return;
			
		default : 	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		
		
		}
		
		}
	}
	
	public void studentMenu() {
		
		while(true) {
		System.out.print("1. 학생 추가\n2. 학생 보기\n9. 메인으로\n메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch (mNum) {
		
		case 1 : insertStudent(); break;
			
		case 2 : printStudent(); break;
			
		case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu();
			
		default  : 	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
		
		
		}
		}
		
	}
	
	public void employeeMenu() {
		
		while(true) {
			System.out.print("1. 사원 추가\n2. 사원 보기\n9. 메인으로\n메뉴 번호 : ");
			int mNum = sc.nextInt();
			
			switch (mNum) {
			
			case 1 : insertEmployee(); break;
				
			case 2 : printEmployee(); break;
				
			case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu();
				
			default  : 	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
			
			
			}
			}
		
	}
	
	public void insertStudent() {
		
		while(true) {
		
		System.out.print("학생 이름 : ");
		String name = sc.next();
		
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		
		System.out.print("학생 키 : ");
		double height = sc.nextDouble();
		
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		
		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("학생 전공 : ");
		String major = sc.next();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		System.out.println("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		char yn = sc.next().charAt(0);
		
		if(yn == 'n' || yn == 'N') {
			
			break;
			
		}else {
			
			continue;
		}
		
		
		
		}
		
		
	}
	
	public void printStudent() {
		
		
	}
	
	public void insertEmployee() {
		
		
	}
	
	public void printEmployee() {
		
		
	}
	
	
	
}
