package com.kh.practice.thread;

public class MultiThreadTest {

	
	public static void main(String[] args) {
		Data data = new Data();
		
		Thread p = new Thread(new Provider(data));
		Thread c = new Thread(new Customer(data));
		
		p.start();
		c.start();
	}
}
