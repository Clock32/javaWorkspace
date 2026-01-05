package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		
		System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명입니다.\n현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
		
		if (!(mc.existMemberNum()>=mc.SIZE)) {
			System.out.println("1. 새 회원 등록");
		}else {
		System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
		}
		
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 모두 출력");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch (mNum){
			
		case 1 : insertMember();
		
		case 2 : searchMember();
			
		case 3 : updateMember();
			
		case 4 : deleteMember();
			
		case 5 : printAll();
			
		case 9 : System.out.println("프로그램을 종료합니다"); return;
		         
			
			default : System.out.println("잘못 입력하셨습니다;");	
						mainMenu();
						return;
			
		}
		
		
	
		
		
		
		
		//sjan whwhgg
		
		
	}
	
	public void insertMember() {
		
		System.out.println("새 회원을 등록합니다.");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("비밀번호 : ");
		String psw = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, psw, email, gender, age);
		
		mainMenu();
	} // member[] , = mc.priotnAll();
	//int memeberNum - nmc,existNumber
	// for (Member mem : m )
	public void searchMember() {
		
		
	}
	public void searchId() {
		
		//너무 졸려서 하나도 안들어오ㅔㅔ
		
		
	}
	public void searchName() {
		
		
	}
	public void searchEmail() {
		
		
	}
	public void updateMember() {
		
		
	}
	public void updatePassword() {
		
		
	}
	public void updateEmail() {
		
		
	}
	public void deleteMember() {
		
		
	}
	public void deleteOne() {
		
		mc.delete();
	}
	public void deleteAll() {
		mc.delete();
		
	}
	public void printAll() {
		
		
	}
	
	
	
	
	
}
