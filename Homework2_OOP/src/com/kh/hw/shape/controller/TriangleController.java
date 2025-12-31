package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	Shape s = new Shape();
	
	
	public double calcArea(double height,double width) {
		s.setWidth(width);
		s.setHeight(height);
		// 위의 셋을 개별적으로 하기보단 shape 에 있는 shape 를 사용하여 한번에 세팅하는것이 보는것도 실행면에서도 훌륭하다
		
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



