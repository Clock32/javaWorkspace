package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	
	public void mainMenu() {
		
		
		
		while(true) {
		System.out.println("***** My Note *****");
		System.out.println("1.노트 새로 만들기");
		System.out.println("2.노트 열기");
		System.out.println("3.노트 열어서 수정하기");
		System.out.println("9.끝내기");
		
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
			
			switch (mNum) {
			
			case 1 : fileSave(); break;
			
			case 2 : fileOpen(); break;
				
			case 3 : fileEdit(); break;
				
			case 9 : System.out.println("프로그램을 종료합니다."); return;
				
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			
			}
		}
		
	}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		
		String c = "";
		StringBuilder context = new StringBuilder("");
		
		while (!(c.equals("ex끝it"))) {
		System.out.print("내용 : ");
		 c = sc.next();
		 context.append(c+"\n");
		}
		
		while(true) {
		System.out.print("저장할 파일 명을 입력해주세요.(ex. myFile.txt) : ");
		String fileName = sc.nextLine();
		
  		if(fc.checkName(fileName)) {
			
  			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
			char yn = sc.next().toUpperCase().charAt(0);
  			
			if(yn == 'Y') {
  				
  				fc.fileSave(fileName, context);
  				break;
  				
  			}else {
				
  				
  				continue;
				
				
			}
			
			
		}
  		fc.fileSave(fileName, context);
			break;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		
			
		
	}
	
	public void fileOpen() {
		
		System.out.println("");
		String open = sc.next();
		
		if(fc.checkName(open)) {
			
		fc.fileOpen(open);	
		}else {
			
			System.out.println("없는 파일입니다.");
			mainMenu();
			return;
			
		}
		
		
		
		
	}
	
	public void fileEdit() {
		
		
	}	
}
