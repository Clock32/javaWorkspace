package com.kh.chap06.method.run;

import com.kh.chap06.method.model.vo.MethodTest1;
import com.kh.chap06.method.model.vo.MethodTest2;


public class Run {
public static void main(String[] args) {
	MethodTest1 mt1 = new MethodTest1();
	
	
	mt1.method1();
	
	System.out.println(MethodTest2.method(1));
	
	}
}
