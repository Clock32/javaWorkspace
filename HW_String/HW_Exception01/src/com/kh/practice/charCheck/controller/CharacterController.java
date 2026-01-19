package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		
		char arr[] = s.toUpperCase().toCharArray();
		
		int count = 0;
		
		for(char c : arr) {
			if(c == ' ') {
				
				
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다");
			}
			
			for(char ch : arr) {
				if(ch >= 'A' && ch<='Z') {
					
					count++;
				}
				
			}
			
		}
		System.out.println(s+"에 포함된 영문자 개수 : "+count);
		
		return count;
	}
	
}
