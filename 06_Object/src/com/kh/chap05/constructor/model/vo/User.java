package com.kh.chap05.constructor.model.vo;

public class User {
	/*
	 * 필드부
	 */
	private String userId;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자
	 * 객체를 생성하는 기능을 담당
	 * 
	 * 표현법
	 * 
	 * public 클래스명 (매개변수 (생략가능)){
	 * 
	 * 	생성자 객체 생성시 실행할 코드
	 *  
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 객체생성과 동시에 매새변수로 전달된 값을 통해 필드를 초기화할 목적으로 사용
	 * 
	 * 
	 * 생성자 작성 시 주의 사항
	 * 
	 * 클래스명과 동일해야한다 (대 소문자 포함)
	 * 반환형이 존재하지 않는다
	 * 여러개 생성이 가능함지만 배개변수가 중복되면 안된다(메서드 오버로딩과 동일한 개념)
	 * 먀개뵨슈 새ㅑㅇ성자를 명시적으로 작성하게되면 기본 생성자를 jvm 이 만들어 주지 않는다.
	 * 
	 * 
	 * 
	 */
	
	
	//기본 생성자
	// 생성자 마 작성시 jvm이 자동으로 생성해주는 생성자
	public User() {
		System.out.println("기본 생성자 호출");
	}
	/*
	 * 전달받은 배게변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	 * 되도록 항상 기본 생성자를 추가하는 습관을 가질 것ㅅ.
	 * 
	 */
	public User(String userId) {
		
		this.userId = userId;
	}
	
	/*
	 * 매개변수있는 생성자2
	 */
	public User(String userId,int age, char gender) {
		//다른 생성자에서 동일한 필드값을 최기화 하고 있는 경우 현재 생성자에서 다른 생성자를 호출하는 ㅂ방식으로 ㅋ노드르ㅡㅡㄹ켤 수 있다
		this(userId); // 생성자에서 다른 생성자의 값을 사용혀면 무조건 첫번째 줄에 넣어놔야한다
		
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
	
	
	
	
	
	//메서드부
	/*
	 * ser/get 메서드 생성
	 */
	public void setUserId(String userId) {

		this.userId = userId;
	}

	public String getUserId() {

		return this.userId;
	}
	
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	
	public void setGender(char gender) {
		
		this.gender = gender;
	}
	
	public char getGender() {
		
		return this.gender;
	}
	
	
	
	
}
