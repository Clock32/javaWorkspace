package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	private Book[] bArr;
	
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		
	}
	
	public void mainMenu() {
		
		
		while(true) {
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch(mNum) {
		
		case 1 : fileSave(); break;
			
		case 2 : fileRead(); break;
			
		case 9 : System.out.println("프로그램 종료"); return;
			
		default :	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		     		break;
			}
		}
		
	}
	
	public void fileSave() {
		
		System.out.print("도서 명 : ");
		String title = sc.next();
		
		System.out.print("저자 명 : ");
		String author = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.next();
		
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		String srr[] = (date.split("-"));
		
		int irr[] = new int[3];
		
		//반복문?
		irr[0] = Integer.parseInt(srr[0]);
		irr[1] = Integer.parseInt(srr[1]);
		irr[2] = Integer.parseInt(srr[2]);
		//
		
		Calendar cal = new GregorianCalendar(irr[0],irr[1],irr[2]);
		
		
		
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		
		//반복문?	
		Book bTemp = new Book(title, author, price, cal, discount);
		
		bArr[0] = bTemp;
		
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		
		
		System.out.println(bc.fileRead());  // ? 
		
	}
	//일반 ㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌ
	
	
}
