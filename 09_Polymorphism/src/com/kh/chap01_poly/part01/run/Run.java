package com.kh.chap01_poly.part01.run;

import com.kh.chap01_poly.part01.model.vo.*;

public class Run {
public static void main(String[] args) {
	/*
	 * '='(대입연산자)를 기준으로 왼쪽과 오른쪽의 자료형은 항상 같아야 한다.
	 * 1.부모타입 참조변수로 부모타입 객체를 다루는 경우
	 */
	
	System.out.println("1. 부모타입 참조변수로 부모 객체 다루기");
	//부모타입 참조변수 p1 = 부모타입 객체
	Parent p1 = new Parent();
	
	p1.printParent();
	
	
	//2. 자식타입 참조변수로 자식타입 객체를 다루기
	System.out.println("2. 자식타입 참조변수로 자식타입 객체 다루기.");
	
	Child1 c1 = new Child1();
	
	c1.printParent(); // super(부모의) 메서드 호출
	c1.printChild1(); // this에서 메서드 호출
	
	//3. 부모타입 참조변수로 자식타입 객체를 다루는 방법.
	System.out.println("3. 부모타입 참조변수로 자식타입 객체 다루기.");
	
	Parent p2 = /*형변환 연산자(Parent) 이게 자동으로 추가됨*/new Child1(); // 다형성이 적용된 개념
	
	p2.printParent();
	
	//p2.printChild1(); //Parent로 형변환이 되어있으니 자식 크랠스의 메서드까지 접근이 불가하다
	((Child1)p2).printChild1(); // DownCasting
	//((Child2)p2).printChild2(); //에러난다 - 자식클래스끼리는 안된다? 
	/* 자식 객체에 있는 메서드에 접근하려면 DownCasting을 해야만 한다.
	 * 
	 * 
	 * 대입연산자 기준 양쪽의 자료형이다름에도 불구하고 오류가 나지 않는다 이유는 
	 * 자식객체가 부모자료형으로 자동 형변환 되고 있기 때문.
	 * 상속구조의 경우 클래스간의 형변환이 가능.
	 * 
	 * 
	 * 클래스간 형변환
	 * 1. UpCasting - 자식이 부모로 올라가는 업케스팅 이라고 부른다
	 * -자식 타입에서 부모 타입으로 자동 형변환될떄를 의미
	 * -자동 형변환이 가능하므로 형변환연산자는 생략이 가능하다
	 * -예) 자식객체.부모메서드();
	 * 부모참조변수 = 자식객체;
	 * 
	 * 
	 * 2. DownCasting - 부모가 자식으로 내려가는 다운 캐스팅
	 * -부모 타입에서 자식 타입으로 형변환되는 경우를 의미한다
	 * -형변환이 생략이 불가능하다 (강제 형변환 필요)
	 * 예) ((자식) 부모).자식매서드();
	 * 
	 * 
	 * 다형성을 사용하는 이유
	 * -부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 하나의 부모클래스로 다룰수 있기 때문이다.
	 * 
	 */
	
	//다형성 적용 전
	//Child1객체와 Child2객체를 객체배열로 다루기.
	
	Child1 arr1[] = new Child1[2];
	arr1[0] = new Child1 (1,2,4);
	arr1[1] = new Child1 (2,1,5);
	
	
	Child2 arr2[] = new Child2[2];
	arr2[0] = new Child2(1,2);
	arr2[1] = new Child2(3,4);
	
	
	//다형성이 적용된다면 부모타입 래퍼런스로 다양한 자식객체들을 받아줄 수 있다
	
	Parent arr[] = new Parent[4];
	
	arr[0] = new Child1 (1,2,4);
	arr[1] = new Child2 (3,4);
	arr[2] = new Child1 (2,1,5);
	arr[3] = new Child2 (5,6);
	
	//System.out.println( ); //무슨 참조변수를 넣든 print가 작동하는 이유는 Object 가 모든 것의 부모이기떄문
	
	//반복문을 활용한 메서드 호출
	
	for(int i =0; i <arr.length;i++) {
		//각 인덱스 별로 실제 참조하고 있는 자식 클래스로 적절히 다운캐스팅 후 , 
		// 메서드를 호출할면?
		
		/*
		 * 1. instanceof 자료형 연산자 활용.
		 * -객체가 실제로 참조하고있는 클래스를 확인하여 자료형과 같다면 True 다르다면 False를 반환한다
		
		 *
		 */
		/*
		if (arr[i] instanceof Child1) {
			((Child1) arr[i]).printChild1();
		}else if (arr[i] instanceof Child2) {
			
			((Child2) arr[i]).printChild2();
		}
		*/
		
		//2. 오버라이딩을 이용하기.
		/*
		 * 동적 바인딩 
		 * -프로그램이 실행되기 전에는 컴파일 단계에서 참조변수의 클래스의 메서드를 실행한다고 나오지만.
		 * 	실제 Runtime단계에서는 자식 객체 내부의 오버라이딩된 메서드를 찾아가서 실행하는 기능.
		 * 
		 */
		arr[i].print();
		
	}
	
	
	
	

}
}
