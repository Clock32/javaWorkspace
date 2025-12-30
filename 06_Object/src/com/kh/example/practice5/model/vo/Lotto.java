package com.kh.example.practice5.model.vo;

public class Lotto {

	/*
	private int[] lotto() {
		
		int arr[] = new int [6];
		
		
		for(int count = 0; count <=arr.length;) {
			
			for(int i = 0; i<arr.length;i++) {
				int ran = (int)(Math.random()*45+1);
				
				if(arr[i] == ran) {	
					
					count --;		
				}
				
				arr[i] = ran;
				count ++;
				
		}
	}
		
		return arr;
	}
	
	public Lotto() {
		
	}
	 */
	
	private int[] lotto;{
		
		lotto = new int [6];
		
		for(int i = 0; i<lotto.length;i++) {
			for(int j=0;j<i;j++) {
				int ran = (int)(Math.random()*45+1);
				
				
				if(lotto[i]==lotto[j]) {
					
					i--;
					break;
				}
				lotto[j]=ran;
				
			}
			
		}
		
	}
	
	
	public void information() {
		
		for(int i =0;i<lotto.length;i++) {
			
			System.out.print(lotto[i]+" ");
		}
	}
	
	
}
