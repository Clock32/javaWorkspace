package com.kh.generic.model.vo;

public class GenericExtends <T extends Parent>{

	
	private T type;
	
	
	public void printing() {
		//do print 메서드를 가지고 있는 Parent 계여ㅛㄹ 클래스로 T의 범위를 제한하고 싶다면 extends 를 사요하아
		
		type.doPrint();
		
		
				

	
	}


	public T getType() {
		return type;
	}


	public void setType(T type) {
		this.type = type;
	}
	
	
	
	
}
