package com.kh.example.practice3.model.vo;

import java.util.Scanner;

public class Circle {
	

	Scanner sc = new Scanner(System.in);
	
	private static final double PI() {
		return 3.14;	
	}
	
	private static int radius = 1;
	
	
	public Circle() {
		
		
	}
	
	public void incrementRadius() {
		//System.out.println("증가할 값을 적으시오");
		
		//double num = sc.nextDouble();
		//this.radius()+num = radius();
		radius += 1;
		
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	public void getAreaOfCircle() {
		System.out.println(2*(PI())*radius);
		
	}
	
	public void getSizeOfCircle() {
		
		
		System.out.println(PI()*radius*radius);
		
	}
}
