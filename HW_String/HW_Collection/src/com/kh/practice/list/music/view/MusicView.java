package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	
	public void mainMenu() {
		
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		
		
		System.out.println("메뉴 번호 선택 : ");
		int mNum = sc.nextInt();
		
		
		switch(mNum) {
		
		case 1 : addList(); break;
			
		case 2 : addAtZero(); break;
			
		case 3 : printAll(); break;
			
		case 4 : searchMusic(); break;
			
		case 5 : removeMusic(); break;
		
		case 6 : setMusic(); break;
			
		case 7 : ascTitle(); break;
			
		case 8 : descSinger(); break;
			
		case 9 : System.out.println("종료"); return;
			
		default : 	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); break;
					
		
		}
		
		
	}
	
	public void addList() {
		
		
	}
	
	public void addAtZero() {
		
		
	}
	
	public void printAll() {
		
		
	}
	
	public void searchMusic() {
		
		
	}
	
	public void removeMusic() {
		
		
	}
	
	public void setMusic() {
		
		System.out.println("****** 특정 곡 정보 수정 ******");
		
		System.out.print("검색할 곡명 : ");
		String title1 = sc.next();
		
		System.out.print("수정할 곡명 : ");
		String title2 = sc.next();
		
		System.out.print("수정할 가수명 : ");
		String singer = sc.next();
		
		Music m = mc.setMusic(title1, new Music(title2,singer));
		
		if(m == null) {
			System.out.println("수정할 곡이 없습니다");
		}else
			System.out.println("수정되었습니다.");
		
	}
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle();

		
		
	}
	
	public void descSinger() {
		
		System.out.println("가수 명 내림차순 정렬");
		int result = mc.descSinger();
		
		if(result == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
	
}
