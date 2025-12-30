package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

/*
 * 캡슐화
 * 추상화를 통해 정의된 속성과 기능들을 묶어서 관리하는 ㅣㄱ법으로 데이터의 접근제한을 원칙으로 둔다
 * 외부로부터 데이터으ㅟ 접근을 막는 역ㅎ라을 수행한다
 * 객체 내부의 데이터를 반드시 확인하거나 사용해야하는 경우, 객체 내부의 값을 조작할 수 있는(간접적인) 메서드를 추가로 작성해줘야 한다.
 */

public class Run {
public static void main(String[] args) {
	
	Student ps = new Student();
	
	//ps.name = "han";  캡슐화를 통해 데이터가 은닉되었다.
	
	ps.setName("허민혁");
	String name = ps.getName();
	
	ps.setAge(25);
	int age = ps.getAge();
	
	ps.setHeight(180.0);
	double height = ps.getHeight();
}
}
