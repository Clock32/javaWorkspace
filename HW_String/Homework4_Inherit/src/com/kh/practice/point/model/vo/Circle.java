package com.kh.practice.point.model.vo;

public class Circle extends Point {

	
	private int radius;
	
	
	public Circle() {
		
	}
	
	public Circle(int x , int y , int radius) {
		this.radius = radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		
		String str = getX()+" "+getY()+" "+radius;
		
		return str;
	}
}
