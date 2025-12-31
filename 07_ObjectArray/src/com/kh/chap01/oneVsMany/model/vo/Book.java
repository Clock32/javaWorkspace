package com.kh.chap01.oneVsMany.model.vo;

public class Book {

	/*
	 * 도서명 , 저자명 , 가격, 출판사
	 */
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
		
	}
	
	
	//각 필드에 대한 세터게터 메서드
	
	//******************************* ALT + SHIFT + S = 공짜 세터게터!!!!!!!! *************************************
	
	
	public void setTitle(String title) {
		this.title = title;		
	}
	public String getTitle() {
		return this.title;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;		
	}
	public String getAuthor() {
		return this.author;
	}
	
	
	public void setPrice(int price) {
		this.price = price;		
	}
	public int getPrice() {
		return this.price;
	}
	
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;		
	}
	public String getPublisher() {
		return this.publisher;
	}
	//엘리게터 _-^^^)`<
	
	
	public String information() {
		//모든 필드 정보를 하나의 문자열로 합쳐 반환시켜주는 메서드
			
		return title+", "+author+", "+price+", "+publisher;
	}
	
}
