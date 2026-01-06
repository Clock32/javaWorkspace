package com.kh.chap02_abstract.part02.model.vo;

public class Mother extends Person /*implements Basic*/{
	
	//인터페이스 상속 (implements)
	//클래스와 클래스의 상속관계(단일상속) 클래스명 extends 부모크래스
	//클래스와 인터페이스의 상속관계(다중상속) 클래스명 implements 인터페이스1 , 인터페이스2 ...
	//인터페이스와 인터페이스의 상속관계 (다중상속) 인페명 extends 잍페1,인페2,인페3
	private String babyB; // 아기의 탄생여부 : 출산,입양,없음

	public Mother() {

	}

	public Mother(String name, double weight, int health, String babyB) {
		super(name, weight, health);
		// TODO Auto-generated constructor stub

		this.babyB = babyB;
	}

	public String getBabyB() {
		return babyB;
	}

	public void setBabyB(String babyB) {
		this.babyB = babyB;
	}

	@Override
	public String toString() {
		return "Mother [babyB=" + babyB + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		//엄마가 밥을 먹으면
		//몸무게 10 증가 건강 10 감소
		setWeight(getWeight()+10);
		setHealth(getHealth()-10);
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+10);
	}

}
