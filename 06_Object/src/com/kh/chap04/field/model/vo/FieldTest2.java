package com.kh.chap04.field.model.vo;

public class FieldTest2 {

	
	/*
	 * 접근 제한자
	 * (+) public => 어떤 패키지의 어떤 클래스에서든 접근 가능하도록 설정.
	 * (#) protected => 같은 패키지 내에서만 가능하도록 설정. 
	 * 					단, 다른 패키지일 경우 상속받은 클래스에서만 추가로 접근가능.
	 * (~) default => 같은 패키지 내에서만 접근 가능하도록 설정.
	 * 					접근 제한자를 사용하지 않는 경우 기본값.

	 * (-) private => 같은 클래스 에서만 접근 가능하도록 설정.
	 * 왠만하면 public 과 private 만 사용한다
	 */
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
}
