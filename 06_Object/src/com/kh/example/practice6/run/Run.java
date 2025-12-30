package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
public static void main(String[] args) {
	Book b = new Book();
	
	
	Book b1 = new Book("책1","출판사1","작가1");
	b1.inform();
	
	Book b2 = new Book("책2","출판사2","작가2",3500,30.0);
	b2.inform();
	
	/*
	 * jvm 자동 초기화
	 * 초기화 블럭 초기화 {}
	 * set
	 * 
	 * 생성자
	 * 
	 * 초기화의 순서 
	 * 클래스 변수
	 * jvm기본 초기화 -> 명시적 초기값 -> 클래스 초기화블록 초기값
	 * 인스턴스변수
	 * jvm기본ㄱ밧 -> 명시적 초기값 -> 인스턴스 초기화 블록 초기값 -> 생성자를 통한 초기화 -> (아마도?) 생성자를 통한 초기화
	 * 
	 */
}
}
