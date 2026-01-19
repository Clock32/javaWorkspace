package com.kh.chap05_synccontrol.model.thread;

//공유자원
public class Data {

	private int item; // 생산 및 소비되는 아이템
	// 1== 생산 / 0 == 소비
	
	private boolean empty = true; // 아이템의 상태를 저장학 ㅗ스레드의 흐름을 ㅓ잦ㅇ하기위한 변수
	
	
	
	//아이템 소비 메서드
	public void getData() {
		//만약 아이템이 생산되기 전이라면 item을 소비하지 않도록 waiting 상태로 전환한다
		synchronized (this) {
			
			if (empty) {
				try {
					wait();
					//다른 스레드가 깨우기 전까지 대기상태로 전환.
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			//아이템소비
			item =0;
			empty = true;
			System.out.println("소비자가 아이템을 소비하였습니다. ----------------");
			notify();
		}	
	}
	
	
	
	//아이템 공급용 메서드
	public void setData() {
		
		synchronized (this) {
			
			if(empty == false) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			item = 1;
			empty = false;
			System.out.println("생산자가 아이템을 생산했습니다.++++++++++++++++");
			notify(); //소비자가 대기중일 때 깨우는 메서드
			
		}
		
		
	}
	
}
