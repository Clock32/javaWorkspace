package com.kh.chap02_abstract.part01.model.vo;

//추상클래스를 상속받게되면 추상클래스 내부의 미 구현된 추상클래스들을 구현해야만 컴파일 에러가 해결된다.
public class Football extends Sports{

	@Override
	public void rule() {
		// TODO Auto-generated method stub
		System.out.println("축구하는법.");
	}

	
	
}
