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
		
		System.out.println("1. 새 회원 등록");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 모두 출력");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch (mNum){
			
		case 1 : 
			
			
		}
		
		
	
		
		
		
		
		
		
		
	}
	
	public void insertMember() {
		
		
	}
	public void searchMember() {
		
		
	}
	public void searchId() {
		
		
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
		
		
	}
	public void deleteAll() {
		
		
	}
	public void printAll() {
		
		
	}
	
	
	
	
	
}
