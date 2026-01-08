package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
/*
 * CheckedException 반드시 예외처리를 ㅐㅎ줘야되는
 * 예외들을 의미한다'
 * ㅜ요 외부데티러외ㅣㅇ니
 * 
 * 
 * 
 */
	
	public void method1() {
		
		try {
		method2();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void method2() throws IOException {
		//Scanner와 비슷한 키보드로 값을 입력받을수있느,ㄴ 객체
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//예외처리방법 1번 : try catch 방법
		
//		try {  
//		System.out.print("아무 문자열 입력해 보세요 : ");
//		
//		//readLine 호출 시 IO Exception 이 발생할 수 있으니
//		//강제로 예외처리를 해줘야한다
//		String str = br.readLine();
//		System.out.println("문자열의 길이 : "+str.length());
//		}catch(IOException e){
//			System.out.println("예외 발생.");
//		}
		
		//예외처리방법 2번 Throws 
		//현재 메서드에서 예외를 처리하지않고 위 메서드를 만든곳에 위임하기
		
		System.out.print("아무 문자열 입력해 보세요 : ");
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
		
		
		
	}
	
	
}
