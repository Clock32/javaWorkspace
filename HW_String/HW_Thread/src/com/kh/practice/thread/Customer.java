package com.kh.practice.thread;

public class Customer implements Runnable{

	private Data data;
	
	public Customer(Data data) {
		
		this.data = data;
	}
	
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			
			
			try {
				int value = data.getValue();
			} catch (EmptyException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}
