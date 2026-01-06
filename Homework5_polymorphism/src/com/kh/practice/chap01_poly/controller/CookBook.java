package com.kh.practice.chap01_poly.controller;

public class CookBook extends Book {

	private boolean coupon;
	
	
	public CookBook() {
		
	}


	public CookBook(String title, String author, String publisher,boolean coupon) {
		super(title, author, publisher);
		
		this.coupon = coupon;
		// TODO Auto-generated constructor stub
	}


	
	
	public boolean isCoupon() {
		return coupon;
	}


	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}


	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
