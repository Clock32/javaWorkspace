package com.kh.example.practice4.model.vo;

public class Student {

	private static int grade() {
		return 0;
		
	}
	private int classroom() {
		return 0;
		
	}
	private String name() {
		return null;
		
	}
	private double height() {
		return 0.0;
		
	}
	private char gender() {
		return 'M';
		
	}
	/*
	 * private int classroom,;
	 * 
	 * 
	 * {
	 * 		//실행 될때마다 초기화 하느냐
	 * 	classromm = 3; 이런식으로
	 * 
	 * }
	 * 
	 * 
	 * static 
	 * {
	 * 		//실행될떄 1번씩만 초기화 하냐
	 *  grade = 1; 이런식으로 
	 * 
	 * }
	 * 
	 * 
	 */
	////////////////////
	public Student() {
		
		
	}
	////////////////////
	public void information() {
		
		
		System.out.println(grade()+", "+classroom()+", "+name()
							+", "+height()+", "+gender());
		
	}
}
