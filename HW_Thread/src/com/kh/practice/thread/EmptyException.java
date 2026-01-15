package com.kh.practice.thread;

public class EmptyException extends Exception{

	
	public EmptyException() {
		
	}
	
	public EmptyException(String message) {
		
		super (message);
		
		System.out.println("오류");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
