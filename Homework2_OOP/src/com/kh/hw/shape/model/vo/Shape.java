package com.kh.hw.shape.model.vo;

public class Shape {

	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	
	public Shape() {
		
		
	}
	
	public Shape(int type,double height,double width ) {
		
		
		
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
