package com.kh.chap04_assist.part02_object.model.vo;

public class Phone {

	
	private String name;
	private int price;
	private String password;
	
	public Phone() {
		
		
	}

	public Phone(String name, int price, String password) {
		super();
		this.name = name;
		this.price = price;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + ", password=" + password + "]";
	}
	
	
}
