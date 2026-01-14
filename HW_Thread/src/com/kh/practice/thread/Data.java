package com.kh.practice.thread;

public class Data {

	private int value;
	private boolean isEmpty = true;
	
	public Data() {
		
	}
	
	public void setValue(int value) throws EmptyException {
		
		synchronized (this) {
			
			if(isEmpty == false) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			value = value;
			isEmpty = false;
			//스레드 실행
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : "+value);
			
			notify(); //소비자가 대기중일 때 깨우는 메서드
			
		}
		
		
		
	}
	
	public int getValue() throws EmptyException {
		
synchronized (this) {
			
			if (isEmpty) {
				try {
					wait();
					//다른 스레드가 깨우기 전까지 대기상태로 전환.
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			//아이템소비
			
			
			
			isEmpty = true;
			
			System.out.println("get vlaue : "+value);
			value = 0;
			System.out.println("값을 꺼냈습니다. vlaue 가 비었습니다.");
			//스레드 실행
			notify();
			
			return value;
		}	
	}
	
	
}
