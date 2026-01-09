package com.kh.practice.book.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {

	private Book[] bArr = new Book[10];
	

	public void fileSave(Book[] bArr) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt")) ){
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Book[] fileRead() {
		
		
		Book[] b = new Book[10];
		
		
		return b;
	}
	
}
