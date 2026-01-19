package com.kh.chap01_string.controller;

public class D_Stringmethod {

	
	public void method() {
		String str1 = "Hello World";
		String str2 = "!!!";
		
		/*
		 * 1. 문자열.charAt(int index) : char
		 * 'W' 문자를 뽑을라면 6
		 */
		char ch = str1.charAt(6);
		System.out.println(ch);
		
		/*
		 * 2. 문자열의 길이를 반환하는 메서드
		 * 문자열.length() : int
		 */
		System.out.println(str1.length());
		
		/*
		 * 3. 문자열.concat(String str) : String
		 * 문자열과 문자열을 이어주는 메서드
		 */
		str2 = str1.concat(str2);
		
		System.out.println(str2);
		
		/*
		 * 4. 문자열.substring(int beginIndex) : String
		 * 문자열의 시작 인덱스 위치부터 끝까지 문자열을 추출하여 반환
			문자열 substring(int beginIndex,int endIndex) : String
			문자열의 시작 인데스 부터 종료 인덱스 위치까지(포함 안됨)의 문자열을 추출하여 리턴한다
			
		 */
		String str3 = str1.substring(6); // 6번 인덱스부터 끝까지
		System.out.println(str3);
		
		String str4 = str1.substring(0,5); // 6번 인덱스부터 끝까지
		System.out.println(str4);
		
		/*
		 * 5.문자열.replace(char old,char new) : String
		 *  문자열에서 old 문자를 new 문자로 반환한 문자열을 반환
		 *  
		 */
		String str5 = str1.replace('l', 'c');
		System.out.println(str5);
		
		/*
		 * 6. 문자열.trim() : String
		 * -> 문자열의 앞,뒤 공백을 제거한 문자열 리턴
		 */
		String str6 = "                J A V A       ";
		System.out.println(str6.trim());
		
		/*
		 * 7. 문자열.toUpperCase() - 문자열을 대문자로 변경
		 * 	  문자열.toLowerCase() - 문자열을 소문자로 변경
		 * 
		 * 
		 */
		System.out.println(str1.toUpperCase()+" "+str1.toLowerCase());
		
		/*
		 * 8. 문자열.toCharArry() : char[]
		 * 
		 */
		char car[] = str1.toCharArray();
		
		/*
		 * static valueOf (다양한 자료형) : String
		 * 전달된 자료형의 값을 문자형으로 반환해주는 메서드
		 * 1 -> "1"
		 * 
		 */
		// Sting str = "" + 1;
		System.out.println(String.valueOf(car));
		//함수형 프로그램에서 자주 사용되는 방식이다 
		
		/*
		 * indexOf(a) a라는 문자가 몇번 인덱스에 있는지
		 * lastIndex 문자열의 마지가이ㅏㄱ 마ㅣ언마ㅓㅏㅓㅁ러ㅓㅓㅎ냐매아.,,ㅊ
		 * contain()
		 * 등등
		 * Intern 
		 *
		 */
		
		
		
		
		
		
		
		
	}
}
