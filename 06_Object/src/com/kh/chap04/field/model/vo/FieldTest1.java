package com.kh.chap04.field.model.vo;

public class FieldTest1 {

	FieldTest2 f2 = new FieldTest2();
	/*
	 * 
	 * 필드 == 인스턴스 변수 == 멤버 변수 == 속성
	 * 
	 * 변수의 구분
	 * 전역변수 : 클레스 영역 바로 아래에 선언하는 변수를 의미한다 클래스 내부라면 어디서든 사용가능하다
	 * 지역변수 : 클래스 영역 내에서 특정 영역 {} 에 선언한 변수를 의미한다 method , if , for 등등
	 * 			선언한 영역 내에서만 사용 가능하다 if절 메서드 for문 등...
	 * 
	 * 
	 * 전역변수 
	 * - 필드 == 인스턴스 변수 == 멤버 변수
	 * 생성시점 : 객체가 메모리에 할당되면서 생성된다 (heap 저장공간)
	 * 소멸시점 : 객체가 소멸될때 함께 소멸한다 (garbage colletor 에 의해 소멸하여 장담은 못한다)
	 * 
	 * -클래스 변수 == static 변수
	 * 생성 시점 : 프로그램 시작과 동시에 static 영역에 메모리할당 (static 저장공간)
	 * 소멸 시점 : 프로그램 종료시.
	 * 
			public static int age;
	 * 
	 * 지역 변수
	 * 생성 시점 : 특정 영역이 ({메서드})실행될때 저장공간이 할당 된다. (stack 저장공간)
	 * 소명 시점 : 특정 영역이 끝날때
	 */
	
	private int global; // 전역변수 (필드)
	{
		/*
		 * 초기화 블럭
		 * 객체 생성시 최초 1회 실행
		 * 
		 * static 도 붙일 수 있다
		 */
		global = 50;
		
	}
	public static int num;
	//static 초기화 능력
	static {
		//static 변수를 초기화 하는 데 사용하는 블럭
		//프로그램 실행 시  최초 1번 실행
		num = 55;
	}
	
	
	
	public void test(int num) { //()안에 있는것이 매개변수(지역변수)
		int local =0; //지역변수
		
		if(true) {
			int a = 0; //지역 변수
		}
		System.out.println(global+num+local);
		System.out.println(f2.def+" "+f2.pro+" "+f2.pub);
		
		//System.out.println(a);
		
		/*
		 * local 이 오류가 안나는 이유 =  / 초기화가 안되어있으면 에러가 발생한다
		 * global 이 오류가 안나는 이유 = 전역변수의 저장 위치는 heap 메모리에 저장이되며 heap메모리는 비버있을 수 없기 때문에 jvm이 자료형의 기본값을
		 * 으로 초기화를 해주었에 오류가 나지 않는다
		 * 
		 * 메서드 호출을 위해선 "반드시" 매개변수를 전달해야 하므로 값의 쵝화는 보장된것
		 * 
		 * num 이 오류가 안나는 이유 = 
		 */
	}
	
	
	
}
