package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	
	
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("========== KH 추첨 프로그램 ==========");
		
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호 선택 : ");
		int mNum = sc.nextInt();
		
		
		switch (mNum) {
		
		case 1 : insertObject(); break;
		
		case 2 : deleteObject(); break;
			
		case 3 : winObject(); break;
			
		case 4 : sortedWinObject(); break;
			
		case 5 : searchWinner(); break;
			
		case 9 : System.out.println("프로그램 종료."); return;
			
		default : 	System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			
		 }
		}
		
	}
	
	public void insertObject() {
		
//		추가할 추첨 대상 수를 입력 받아 입력한 수만큼
//		추첨자 이름(String name)과 추첨자 핸드폰 번호(String phone)를 받고,
		
		System.out.print("추가할 추첨 대상 수 : ");
		int cNum = sc.nextInt();
		
		for (int i = 0; i<cNum;i++) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("핸드폰 번호(`-` 빼고) : ");
			String pNum = sc.next();
			
//		매개변수 생성자를 이용해 Lottery 객체에 추첨자 정보 저장.
			Lottery l = new Lottery (name,pNum);
			
			boolean result = lc.insertObject(l);
			
//		Lottery 객체를 lc(LotteryController)의 insertObject로 전달하는데
			if(result) {
				
//		단, 중복된 추첨 대상 입력했거나 또는 이미 추첨 Set에 대상이 있는 경우
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
//		“중복된 대상입니다. 다시 입력하세요.” 출력 후 이어서 다시 객체 입력.
				
			}
				
			
		}
		
//		모든 입력이 완료되면 “추가 완료되었습니다” 출력.
		System.out.println("추가 완료되었습니다.");	
		
	}
	
	public void deleteObject() {
		
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("핸드폰 번호(`-`빼고) : ");
		String pNum = sc.next();
		
//		삭제할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
		
		Lottery d = new Lottery (name,pNum);
		boolean result = lc.deleteObject(d);
//		객체에 정보를 담아 lc에 객체를 보냄.
		
//		받은 결과에 따라 true면 “삭제 완료 되었습니다.”,
		if(result) {
			System.out.println("삭제 완료 되었습니다.");
			
		}else {
			
			System.out.println("존재하지 않는 대상입니다.");
		}
		
//		false면 “존재하지 않는 대상입니다.” 출력

		
	}
	
	public void winObject() {
		
	Set s = lc.winObject();
	System.out.println(s);
		
	}
	
	public void sortedWinObject() {
		
		TreeSet<Lottery> set = lc.sortedWinObject();
		
		Iterator<Lottery> l = set.iterator();
		
		while(l.hasNext()) {
			
			System.out.println(l.next());
		}
		
	}
	
	public void searchWinner() {
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.println("핸드폰 번호(`-`빼고) : ");
		String pNum = sc.next();
		
		Lottery l = new Lottery(name,pNum);
		boolean result = lc.searchWinner(l);
		
		if(result) {
			
			System.out.println("축하합니다.");
		}else {
			System.out.println("다음 기회에");
		}
		
		
	}
	
	
}
