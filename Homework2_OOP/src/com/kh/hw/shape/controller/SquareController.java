package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	Shape s = new Shape();
	
	
	public double calcPerimeter(double height,double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double result = ((height+width)*2);
		return result;
	}
	
	public double calcArea(double height,double width) {
		
		s.setHeight(height);
		s.setWidth(width);
		
		double result = (height*width);
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
		
		String result = ("사각형 "+s.information());
		return result;
		
	}
	
}
