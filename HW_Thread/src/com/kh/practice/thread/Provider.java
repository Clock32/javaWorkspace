package com.kh.practice.thread;

import java.util.Random;

public class Provider implements Runnable {

	private Data data;
	
	public Provider(Data data) {
		
		this.data = data;
	}
	
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			int ran = (int)(Math.random()*100)+1;
			
			// ( new Random().nextInt(100)+1 );
		
			
			
			try {
				data.setValue(ran);
			} catch (EmptyException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	
}
