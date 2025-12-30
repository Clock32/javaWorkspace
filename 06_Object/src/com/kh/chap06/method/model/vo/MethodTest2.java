package com.kh.chap06.method.model.vo;

public class MethodTest2 {

/*
 * static 메서드
 * 표혅법
 * 접근제한자 static 예약어 반환형 메서드명 (매개변수){
 * 코드
 * return;
 * }
 * 
 * - 메서든 호출시 객체를 생성할 필요가 없다
 * - 프로그램 시작시 정적 메모리 영역에 메서드 정보가 저장되어있기 때문이다
 * 클래스명.메서드명(전달값); 으로 호출하면 된다.
 * 
 * 기억 안날때 math.random 을 생각해라
 */
		
	static int count = 1;
	int count2 = 2;
	
	public static int method(int num1) {
		
		
		/*
		 * static 메서드 안에서는 일반 field 는 접근이 불가능다
		 * -변수의 생성시점이 다르기떄문에
		 * static 메서드는 시작과 동시에 정적 메모리 구간에 할당되며
		 * 같은 시점에 static 변수도 함께 할당되기때문에 static 변수는 사용이 가능하지만
		 * 일반 전역변수는 생성시점에 메모리 공간이 할당되므로
		 * static 메서드에서 사용이 불가능하다
		 * 
		 * 
		 */
		
		//매개변수 * static 변수 (에러없음)
		return num1*count;
		
		//매개변수 * 필드 변수 (에러 남) -- 필드는 heap 메모리에 객체생성시 시작하지만 위의 메서드느 static 메서드라 생성 타이밍이 맞지않아 에러가 발생한다.
		//return num1*count2;
	}
	
	
	
}
