package com.kh.chap01_thread.model.thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<100;i++) {
			
			System.out.println("2번 스레드 "+(i+1));
			
			//스레드 생성방
		}
		
		
	}

}
