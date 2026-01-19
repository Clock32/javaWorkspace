package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	
	
	public TokenController() {
		
		
	}
	
	public String afterToken(String str) {
			
		//방법 1. replace
		
		//방법 2. split
		
		//방법 3. 토큰!
		StringTokenizer stn = new StringTokenizer(str," ");
		String result = "";
		while(stn.hasMoreTokens()){
			
			result += stn.nextToken();
		}
		

		
		
		return result;
	}
	
	public String firstCap(String input) {
		
		String first = input.substring(0,1);
		String bigFirst = first.toUpperCase();
		char f = bigFirst.charAt(0);
		
		String result = input.replace(input.charAt(0),f); //모든 a 를 A 로 변경한다 다시 
		
		return result;
	}
	
	public int findChar(String input,char one) {
		
		char car[] = input.toCharArray();
		int count = 0;
		
		/*
		 * for(char ch : car){
		 * 	if()ch ==car
		 * }
		 */
		
		for (int i = 0; i<car.length;i++) {
			
			if(car[i]==one) {
				count++;
			}
		}
		return count;
	}
}
