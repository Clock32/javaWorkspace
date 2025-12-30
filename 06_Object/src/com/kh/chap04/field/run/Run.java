package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest1;
import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class Run {
public static void main(String[] args) {
	FieldTest1 f1 = new FieldTest1();
	FieldTest2 f2 = new FieldTest2();
	
	
	f1.test(0);
	
	System.out.println(f2.pub+" ");
	//protected,default 의 경우 같은 패키지의 경우에만 접근이 가능하다
	
	
	
	//fieldtest3 의 필드 및 메서드 호출
	// static 필드 및 메서드 호출 방법
	// 클래스명.static 필드명 혹은 클래스명.static메서드()
	
	System.out.println(FieldTest3.PI); //객체생성 불필요
	
	//객체를 생성하지 않아도 이미 메모리에 저장공간이 할당되어있기 때문에
	
	FieldTest3.test();
	//math.random(); 과 똑같다 

}
}
