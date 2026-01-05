package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.*;


public class Run {
public static void main(String[] args) {
	/*
	 * 추상클래스는 객체 생성이 불가능 하다
	 * -내부의 실행할수없는 메서드가 존재해서 불가능.
	 * 단 참조변수로는 사용이 가능하다.(다형성 때문)
	 */
	//Sports s = new Sports();
	
	Sports s = new Basketball();
	Sports arr[] = new Sports[2];
	
	arr[0] = s;
	arr[1] = new Football();
	
	for (Sports spo : arr) {
		
		spo.rule();
		
	}
	
	/*
	 * 추상클래스 정의
	 *  - 추상클래스란 미완성된 부분이 존재하는 클래스임을 의미한다(abstract class)
	 *  - 미완성된 클래스이기 때문에 객체 생성은 불가능하나 참조변수로는 사용이 가능하다.
	 *  - 추상 메서드가 포함된 경우 클래스는 반드시 추상 클래스로 정의해야한다
	 *  - 추상 클래스는 일반 필드, 일반 메서드 , 생성자 , 추상 메서드 로 이루어져있다.
	 *  -추상클래스는 클래스의 상속이 주된 목적이며 메서드강제구현은 곁다리다.
	 *  
	 *  
	 *  추상메서드
	 *  -미완성된 메서드를 의미한며 메서드의 몸통부가 구현되어있지않는 메서드다
	 *  -추상 메서드는 자식 클래스에서 오버라이딩을 통하여 완성되며 자식클래스에서 상속받은 추상메서드를
	 *  재정의하지않는경우 에러가 발생한다
	 *  
	 *  
	 */
}
}
