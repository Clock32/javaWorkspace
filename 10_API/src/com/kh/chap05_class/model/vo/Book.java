package com.kh.chap05_class.model.vo;

public class Book {

	//필드부
	public String tile;
	public String author;
	
	
	//생성자부
	public Book() {
		
	}

	public Book(String tile, String author) {
		super();
		this.tile = tile;
		this.author = author;
	}

	
	//메서드부
	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
