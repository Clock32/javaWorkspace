package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	
	private Rectangle r = new Rectangle();
	
	
	public String calcArea(int x , int y, int height, int width) {
		
		
		String result = r.toString()+" / "+((2*height)+(2*width));
		
		return result;
	}
	
	
	public String calcPerimeter (int x,int y,int height,int width) {
		
		String result = r.toString()+" / "+(height*width);
		
		return result;
	}
}
