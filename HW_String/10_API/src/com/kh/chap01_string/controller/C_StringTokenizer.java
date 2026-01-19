package com.kh.chap01_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	public void method() {
		String str = "Java,Oracle,JDBC,HTML,Spring";
		
		/*
		 * 구분자를 제시해서 문자열을 구분자 기준으로 분리 시키는 방법
		 * 방법 1. 문자열.slplit(구분자) : String[]
		 * -분리된 문자열들을 String[] 에 담아서 관리해주는 메서드 
		 */
		
		String arr[] = str.split(","); // {Java,sdka,asdka,sda}
		
		System.out.println(Arrays.toString(arr)+" / "+arr.length);
		
		/*
		 * 분리된 각각의 문자들을 토큰으로 취급하여 관리하는 방법
		 * StringTokenizer stn = new StringTokenizer(문자열,구분자);
		 */
		
		StringTokenizer stn = new StringTokenizer(str,",");
		
		System.out.println("분리된 문자열의 개수 : "+stn.countTokens());
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		/*
		 * 현재 남아있는 토큰의 개수 범위를 넘어가면 에러가 발생한다.
		 */
		//while (stn.countTokens()>0) {
		while (stn.hasMoreTokens()){ // stn에 토큰이 1개이상 있는 경우 true/false 
			System.out.println(stn.nextToken());
		}
		//중간값은 못뺀다 String split 쓰자
		
	}
	
}
