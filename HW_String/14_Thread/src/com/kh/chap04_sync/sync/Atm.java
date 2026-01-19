package com.kh.chap04_sync.sync;

import java.util.Random;

public class Atm implements Runnable{

	private Account acc;
	
	public Atm(Account acc) {
		
		this.acc = acc;
	}
	
	
	
	@Override
	public void run() {

		//잔액이 다 없ㄱ어질떔까지이
		while(acc.getBalance() > 200) {
			int money = (new Random().nextInt(3) + 1) * 300; //300원 600원 900원 중 하나
			
			acc.withdraw(money);
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println(Thread.currentThread().getName()+"종료 =============================");
		
	}

	
}
