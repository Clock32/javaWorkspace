package com.kh.chap02.encapsulation.model.vo;

public class Student {
	/*
	 * 속성 == 필드 == 멤버변수 == 인스턴스 변수 == 전역변수
	 */
	private String name;
	private int age;
	private double height;

	/*
	 * 메서드 작성방법 표현법 접근제한자 (예약어) 반환형 메서드명 (매개변수) {} public void student() {}
	 * 
	 * 캡슐화된 필드에 접근하여 값을 조작할수있는 메서드 setter / getter 메서드
	 * 
	 * 
	 */

	// name 필드의 값을 최기화(대입)하는 용도의 메서드
	// 초기화를 위해선 값을 얻어와야 하므로 매게변수가 존재한다 . 초기화를 진행한 후 값을 반환할 칠요는 없기 때문에 반환형은 void
	// set + 필드명 이지만 낙타기법을 쓴다 setName,getName
	public void setName(String name) {
		/*
		 * 매개변수 : 메서드 호출 시 전달되는 값을 받아주기 위한 변수 선언방법
		 * 
		 */

		this.name = name;

		/*
		 * name = name; <= 필드명과 매개변수명이 동일한 경우 {} 내에서 선언한 변수의 우선순위가 높기 때문에 name은 항상 매개변수
		 * name 을 가리키게 된다 필드로서의 name 을 가리키고자 한다면 this.name을 사용하야한다.
		 */

		/*
		 * this 모든 메서드의 묵시적으로 존재하는 변수로 생성된 객체의 주소값이 담겨있다.
		 * 
		 * 
		 *
		 */

	}

	// 데이터를 반환하기 위한 용도의 getter 메서드
	public String getName() {
		/*
		 * 값을 반환하는 방법 : return; - > 메서드를 종료하는 기능 뿐만 아니라 ㄱ밧을 옮겨주는 기능도 있다
		 * 
		 * 생성자 최기화의 방식이있다
		 */
		return this.name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getAge() {

		return this.age;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void setHeight(double height) {

		this.height = height;
	}

	public double getHeight() {

		return this.height;
	}

}
