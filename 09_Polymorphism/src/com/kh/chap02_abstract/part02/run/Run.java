package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {

	public static void main(String[] args) {
		//추상클래스
		//객체생성불가 단 참조변수로는 사용 가능
		
		
		Person p1 = new Mother("이름",50,50,"출산");
		Person p2 = new Baby("이름",50,50);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		
		p1.sleep();
		p2.sleep();
		
		System.out.println("다음날");
		System.out.println(p1);
		System.out.println(p2);
		
		//인터페이스 
		//Basic b = new Basic; 객체생성 불가능
		/*
		Basic b1 = new Mother("이이름",50,70,"출산");
		Basic b2 = new Baby("응",3.5,70);
		
		b1.eat(); // 동적 바인딩
		b2.eat();
		
		System.out.println(b1); // 동적 바인딩
		System.out.println(b2);
		*/
		
		
	}
}
