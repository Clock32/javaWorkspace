package com.kh.hw.shape.model.vo;

public class Shape {

	private int type;
	private double height = 10.0; //기본값이 0.0인 것이 불편하여 기본값 10.0 , 5.0 설정
	private double width = 5.0;
	private String color = "white";
	
	
	public Shape() {
		
		
	}
	
	public Shape(int type,double height,double width ) {
		this.type = type;
		this.height = height;
		this.width = width;
		
		
		
		
	}
	
	public String information() {
		
		String info = (height+" "+width+" "+color);
		
		return info;
	}
	
	
	
	public void setType(int type) {	
		this.type = type;
	}
	public int getType() {
		return this.type;
	}
	
	public void setHeight(double height) {	
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setWidth(double width) {	
		this.width = width;
	}
	public double getWidth() {
		return this.width;
	}
	
	public void setColor(String color) {	
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
		
	
}
