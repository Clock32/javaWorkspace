package com.kh.practice.list.library.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List list = new ArrayList();
	
	public BookController() {
		
//		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
//		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
//		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
//		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
		

	}
	
	public void insertBook(Book bk) {
		
		
		
		
	}
	
	public ArrayList selectList() {
		
		
		return null;
	}
	
	public Book deleteBook(String title,String author) {
		
		Book db = null;
		
		for (int i = 0; i < list.size();i++) {
			
			Book b = (Book) list.get(i);
			if(b.getAuthor().equals(author)&&
				b.getTitle().equals(title)) {
				
				db = (Book) list.remove(i);
				
			}
			
		}	
		
		return db;
		
	}
	
	public int ascBook() {
		
		Collections.sort(list);
		return 1;
		
		
		
	}
	
	public ArrayList searchBook(String keyword) {
		
		ArrayList searchList = new ArrayList();
		
		for (Object o : list) {
			
			Book b = (Book) o;
			if(b.getTitle().contains(keyword)) {
				
				searchList.add(b);
			}
		}
		return searchList;
		
	}
}
