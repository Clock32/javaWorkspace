package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
public static void main(String[] args) {
	Person ps = new Person();
	
	ps.changeName("허민혁");
	
	ps.printName();
}
}
