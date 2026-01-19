package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	
	private Circle c = new Circle();
	double pi = Math.PI;
	
	
	public String calcArea(int x , int y , int radius) {
		
		
		
		
		
		String result = c.toString()+(pi*(radius*radius));
		return result;
	}
	
	public String calcCircum(int x , int y , int radius) {
		
		
		String result = c.toString()+(2*((pi*radius)));
		return result;
	}
	
	
	
	
	
	
	/*
	 * 2개 5개 5개 2개 순서대로 돌려놔
	 */
	
	
}
