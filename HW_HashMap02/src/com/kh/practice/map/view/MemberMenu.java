package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	
	
	public void mainMenu() {
		
		
		System.out.println("========== KH 사이트 ==========");
		
		while (true) {
		
		System.out.println("******* 메인 메뉴 *******");
		
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호 선택 : ");
		int mNum = sc.nextInt();
		
		switch(mNum) {
		
		case 1  : joinMembership(); break;
		
		case 2  : logIn(); memberMenu(); break;
			
		case 3  : sameName(); break;
			
		case 9  : System.out.println("프로그램 종료."); return;
			
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
		}
		}
		
		
	}
	
	public void memberMenu() {
		
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		
		System.out.print("메뉴 번호 선택 : ");
		int mNum = sc.nextInt();
		
		switch (mNum) {
		
		case 1 : changePassword(); break;
		
		case 2 : changeName(); break;
			
		case 3 : System.out.println("로그아웃 되었습니다.");  mainMenu(); break;
			
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			
		
		
		}
		
		
		
		
	}
	
	public void joinMembership() {
		
//		회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		
		Member mem = new Member (name,pass);
		
		boolean result = mc.joinMembership(id, mem);
		
		if (result) {
			
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			
		}else {
			
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			joinMembership();
			return;
		}
		
//		Member객체에 담고 id와 객체는 MemberController(mc)의 joinMembership()로 보냄.
//		받은 결과에 따라 true면 “성공적으로 회원가입 완료하였습니다.”,
//		false면 “중복된 아이디입니다. 다시 입력해주세요.” 출력

		
	}
	
	public void logIn() {
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		String result = mc.logIn(id, pass);
		
		
		if (result != null) {
			
			System.out.println(result+"님, 환영합니다!");
			
		}else {
			
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			logIn();
			return;
		}
		
		
		
//		아이디와 비밀번호를 사용자에게 받아 mc의 logIn()메소드로 넘겨 줌
//		반환 값 있으면 “OOO님, 환영합니다!” 출력 후 로그인 된 화면으로(memberMenu()),
//		없으면 “틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.” 출력 후 반복
	}
	
	public void changePassword() {
		
		
	}
	
	public void changeName() {
		
		
	}
	
	public void sameName() {
		
		
	}
	
	
}
