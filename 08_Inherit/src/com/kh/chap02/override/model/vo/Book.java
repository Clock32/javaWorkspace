package com.kh.chap02.override.model.vo;

public class Book {

	private String name;
	private String author;
	private int price;
	
	
	public Book() {
			
	}


	public Book(String name, String author, int price) {
		super(); //-Object-jvm이 항상 넣어줘서 안쓰던거
		this.name = name;
		this.author = author;
		this.price = price;
	}

	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//  메서드 오버라이딩
	/*
	 * 오버라이딩
	 * - 상속받고있는 부모클래스의 메서드를 자식클래스에서 재정의 하는것
	 * - 부모가 제공하고있는 메서드를 자식이 일부 고쳐 사용하겠다는 의미이며 "자식 메서드가 우선권"을 가진다
	 * 
	 * 오버라이딩 성립조건
	 * - 부모 메서드의 명과 100% 동일해야한다.
	 * - 매개변수의 자료형 갯수 순서도 모두 동일해야한다
	 * - 반환형도 동일해야한다.
	 * - 접근제한자보다 공유범위가 더 크거나 같아야한다 
	 * 
	 * @Override 어노테이션
	 * - 생략가능
	 * -잘못된 조건으로 오버라이드 한 경우 오류를 통해 잘못됨을 알게 하기 위해서.
	 * -이 메서드가 오버라이딩된 메서드라는걸 알리는 목적으로 사용한다.
	 * 
	 */
	
	@Override
	public String toString() {
		
		return name+", "+author+", "+price;
	}
	
	
	
//	public String information() {
//		
//		return name+", "+author+", "+price;
//	}
	
}
