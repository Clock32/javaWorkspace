package com.kh.chap01.after.model.vo;


/*
 * 세 클래스 모두 공통적으로 가지고있는 요소들을 정의해줄 클래스.
 * 
 */
public class Product {

	
	// 중복된 필드 
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		
		
	}
	
	public Product(String brand,String pCode,String pName,int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	
	
	// 중복된 게터세터들
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	// 중복된 information 메서드
	public String information() {
			
		return brand+", "+pCode+", "+pName+", "+price;
	}
	
	
}
