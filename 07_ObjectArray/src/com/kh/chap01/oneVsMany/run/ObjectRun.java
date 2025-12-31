package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class ObjectRun {
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//객체배열 없이 코딩하기
	
	
	//세터 방식 초기화 - 각 값이 어떤값인지 명확하지만 코드가 길어진다
	
	Book bk1 = new Book();
	
	bk1.setTitle("책 1");
	bk1.setAuthor("작가 1");
	bk1.setPrice(20000);
	bk1.setPublisher("퍼블리셔 1");
	
	
	// 매개변수 생성자로 객체 생성 및 초기화 - 훨씬 깔끔하고 코드가 적지만 무슨값에 어떤것이 들어가는지 확실하지않다
	Book bk2 = new Book("책 2","작가2",21000,"퍼블리셔2");
	
	
	// 매개변수 생성자로 객체생성 및 초기화
	Book bk3 = new Book("책 3","작가3",22000,"퍼블리셔3");
	
	
	/*
	 * 도서정보 출력서비스 
	 * 도서 갯수마다 if 문이 많아지니 관리가 비효율적이다
	 * 
	 * 그러니 객체배열을 사용하여 작업을 효율적으로 처리한다
	 */
	Book[] arr = new Book[3]; //[null,null,null]
	
	
	arr[0] = bk1;
	arr[1] = bk2;
	arr[2] = bk3;
	/*
	for (int i = 0; i < arr.length;i++) {
		
		arr[i] = bk(i+1);
	}
	*/
	
	
	for(int i = 0; i<arr.length; i++) {
		
		System.out.println(arr[i].information());
	}
	
	
	
	//사용자에게 검색할 도서 제목을 입력받아 전체 도서목록들 중 일치하는 제목의 도서 찾기
	System.out.print("검색할 책의 제목 : ");
	String searchTitle = sc.next();
	
	//객체배열 사용, 반복문 사용
	for(int i = 0; i<arr.length; i++) {
		Book bk = arr[i];
		
		if (searchTitle.equals(bk.getTitle()))
		System.out.println(bk.information()+"입니다.");
		
		
	}
	
}
}
