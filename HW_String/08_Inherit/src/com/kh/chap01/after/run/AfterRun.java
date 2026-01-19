package com.kh.chap01.after.run;

//                                  ^ * = 모든 // model.vo 안에있는 모든 것을 import하겠다
import com.kh.chap01.after.model.vo.*;


public class AfterRun {
public static void main(String[] args) {
	Desktop dt = new Desktop("삼암성","d-02","데에탑",100,true);
	SmartPhone sp = new SmartPhone("애애애ㅐㅐㅐㅐㅐ플","s-01","아이폰",10,"KT");
	Tv tv = new Tv("LeeeeaaalG","t-01","Tv",1,45);
	
	
	System.out.println(dt.information());
	System.out.println(sp.information()); //만약 SmartPhone 의 information을 전부 지워도 에러없이 부모 클래스의 information을 자동으로 호출한다
	System.out.println(tv.information());
	
	/*
	 * 실행하고자 하는 메서드가 자식 클래스에 없다면 , 자동으로 부모클래스의 메서드를 실행한다
	 * 단, 자식클래스에 부모클래스에 존재하는 메서드를 재정의 했다면(오버 "라이드"). 
	 * ********자식 클래스가 실행 우선권을 가진다***********
	 * 다형성 들어가면 헷갈린다
	 * 
	 * 
	 * 상속의 장점
	 * 
	 * 1. 유지보수성 (생산성이 증가한다)
	 * 2. 작은양의 코드로 다양한 클래스들을 작성할 수 있다.
	 * 3. 정의해둔 부모 클래스를 통해 다른 클래스로의 확장이 용이하다. (확장성이 좋다.)
	 * 
	 * 
	 * 상속의 특징 (주의점)
	 * 
	 * 클래스간의 상속은 다중 상속이 불가능하다 (단일 상속만 지원) **********자바**********에서는
	 * 
	 * 명시되어있지 않지만 모든 클래스는 "Object" 클래스의 후손이다.
	 * => Object의 메서드를 사용할 수 있다. => Object 메서드가 마음에 안들면 "오버라이딩" 도 가능하다
	 * 
	 *  p1 -> p2 -> p3 -> sp,tv,dt 
	 */
	
	
	
	
	
}



}
