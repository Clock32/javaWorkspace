package com.kh.example.practice6.model.vo;

public class Book {

	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	
	public Book() {
		System.out.println("기본 생성자");
		
	}
	
	public Book(String title,String publisher,String author) {
		this.title = title;
		
		this.publisher = publisher;
		this.author = author;
		
	}
	
	public Book (String title,String publisher,String author
			,int price,double discountRate){
		this (title,publisher,author);
		
		this.price = price;
		this.discountRate = discountRate;
		
		
		
	}
	
	public void setTitle (String title) {
		this.title = title;	
	}
	
	public String getTitle(){
		return this.title;	
	}
	
	public void setPublisher (String publisher) {
		this.publisher = publisher;	
	}
	
	public String getPublisher(){
		return this.publisher;	
	}
	
	public void setAuthor (String author) {
		this.author = author;	
	}
	
	public String getAuthor(){
		return this.author;	
	}
	
	public void setPrice (int price) {
		this.price = price;	
	}
	
	public int getPrice(){
		return this.price;	
	}
	
	public void setDiscountRate (double discountRate) {
		this.discountRate = discountRate;	
	}
	
	public double getDiscountRate(){
		return this.discountRate;	
	}
	
	
	
	
	
	
	
	
	public void inform() {
		
		/*
		setTitle(title);
		setPublisher(publisher);
		setAuthor(author);
		setPrice(price);
		setDiscountRate(discountRate);
		*/
		System.out.println(title+" "+publisher+" "+author+" "+price+" "+discountRate);
		
	}
	
	
	
	
}
