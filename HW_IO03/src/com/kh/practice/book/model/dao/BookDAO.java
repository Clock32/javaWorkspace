package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {

	private Book[] bArr = new Book[10];
	

	public void A(Book[] bArr) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt")) ){
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Book[] fileRead()  {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));){
			
			int index = 0;
			while(true) {
				
				Book b = (Book) ois.readObject();
				bArr[index] = b;
				index += 1;
			}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Book[] b = new Book[10];
		
		
		return b;
	}
	
}
