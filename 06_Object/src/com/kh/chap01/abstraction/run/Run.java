package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run {
	//필요없는것들을 추리고 핵심만 나믹는것 추상화
	
	/*
	 * 객체지향언어 : 객체를 중심으로 객체간의 상호작용을 통해 동작하는 프로그래밍 방식
	 * 객체(Object) : new 연산자와 클래스를 통해 메모리(heap)에 할당된 데이터를 의미한다 ---
	 * 객체지향 프로그래밍 : 현실세계에서 독립적인 객체간의 상호작용을 프로그래밍을 통해 코드로 구현하는 과정
	 * 구현하고자하는 프로그램상의 필요한 객체를 만들기 위해선 클래스 라는 틀을 먼저 만들어야 한다. => 클래스는 각 객체들의 속성들을 담아낼수있는
	 * 설계도의 역할을 하며 추상화와 캡슐화를 거쳐 만들어진다
	 * 
	 * 추상화 및 캡슐화를 하는 방법 
	 * -내가 구현하고자 하는 프로그램의 목적에 맞는 객체를 선정 후 ㅡ 객체들이 가지고있을 핵심적인 역할의 속성과 기능만 남긴다.
	 * -
	 * 	
	 * ----
	 * 클래스는 데이터 + 기능들을 합친 결과물이다.
	 * 객체지향적인 클래스를 만들기위해선 여러단계를 거쳐야하는데 이하는 다음과 같다
	 * 옛날에는 4단계라고 적었지만 첫번째인 추상화단계가 너무 당연하여 요즘엔 3단계로 표기하는곳이 많다
	 * 
	 * 추상화 : 필요한 부분만 추출하는 과정
	 * 
	 * 
	 */
public static void main(String[] args) {
	
	//학생 객체 생성
	Student han = new Student(); //name = null , height = 0.0 , age = 0
	Student min = new Student();
	
	
	han.name = "한동희";
	han.age = 25;
	han.height = 180.0;
	
	//새로운 학생 객체 생성
	min.name = "허민혁";
	min.age = 25;
	min.height = 180.0;
	min.study();
	
	
	
}
}
