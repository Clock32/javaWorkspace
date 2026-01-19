package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	Member mm = new Member();
	
	
	public void mainMenu() {
		
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();
		System.out.print("회원 성별 : ");
		char gender = sc.next().charAt(0);
		
		Member pm = new Member (name,age,gender,0);
		
		
		lc.insertMember(pm);
		
		
		
		
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
				
			case 4 : rentBook(); break;
				
			case 9 : System.out.println("프로그램을 종료합니다."); return;
				
			default : System.out.println("잘못적으셨습니다. 다시 입력해주십시오"); break;	
			
			}
			
			
			
		}
		
		
	}
	
	public void selectAll()	{
		
		//lc에 구현
	}
	
	public void searchBook() {
		//lc에 구현
		
	}

	public void rentBook() {
		lc.selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		if(result == 0) {
			
			System.out.println("성공적으로 대여되었습니다.");
			
		}else if(result == 1) {
			
			System.out.println("나이 제한으로 불가합니다.");
		}else if (result == 2) {
			
			System.out.println("성공적으로 대여되었습니다. 쿠폰이 추가되었습니다.");
		}
		
	}
	
}
