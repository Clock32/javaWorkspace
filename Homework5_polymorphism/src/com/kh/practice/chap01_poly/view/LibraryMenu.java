package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이 페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 : ");
			int mNum = sc.nextInt();
			
			switch (mNum) {
			
			case 1 : lc.myInfo(); break;
				
			case 2 : lc.selectAll(); break;
				
			case 3 : System.out.print("검색할 제목 키워드 : ");
					 String key = sc.next();
					 lc.searchBook(key); break; 
				
			case 4 : lc.rentBook(0); break;
				
			case 9 : System.out.println("프로그램을 종료합니다."); return;
				
			default : System.out.println("잘못적으셨습니다. 다시 입력해주십시오"); break;	
			
			}
			
			
			
		}
		
		
	}
	
	public void selectAll()	{
		
		
	}
	
	public void searchBook() {
		
		
	}

	public void rentBook() {
		
		
	}
	
}
