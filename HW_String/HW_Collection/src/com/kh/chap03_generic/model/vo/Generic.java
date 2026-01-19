package com.kh.chap03_generic.model.vo;

/*
 * 현재 클래스에서 사용할 타입변수 지정
 */

public class Generic < T , G >{

	/*
	 * 제네릭 설정 방법
	 * 제네릭 (타입변수)는 여러 참조 자료형으로 대체될 수 있는 부분을 하나의 ㅂ문자로 표현한다
	 * 
	 * ex) <T> , <G> , ...
	 * 제네릭은 class 및 method, 필드 에 각각지정할 수 있다.
	 */
	
	T t;
	G g;
	//이렇게 추상저긍로해도 문제가되지않으며 지정을안한다 해도 Object로 되기때문에 문ㄴ제없다
	
	public T getT() {
		
		return t;
	}
	
	
	
}
