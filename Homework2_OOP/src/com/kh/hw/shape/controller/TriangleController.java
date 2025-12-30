package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	Shape s = new Shape();
	
	
	public double calcArea(double height,double width) {
		s.setWidth(width);
		s.setHeight(height);
		
		double result = ((s.getHeight())*(s.getWidth())/2);
		
		return result;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
		
		System.out.println("색이 수정되었습니다.");
		
	}
	
	public String print() {
		s.getHeight();
		s.getWidth();
		s.getColor();
		
		String result = ("삼각형 "+s.information());
		return result;
	}
	
	
}



