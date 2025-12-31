package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		int arr[] = new int [3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		// basic 루프문
		for(int i = 0 ; i < arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		//향상된 , 개선된 반복문 advanced loop / foreach 문 
		/*
		 * for each 문 
		 * 배열 또는 컬렉션과 함께 사용되는 반복문으로 배열 또는 컬렉션의
		 * 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근할때 사용
		 * 
		 * 초기식 조건식 증감식 X
		 * 반복 횟수는 배열의 크기. 
		 * 
		 * 표현법
		 * for(순차적으로 접근한 값을 담을 변수 : 반복하고자 하는 배열 또는 컬렉션의 이름(주소값)){
		 * 
		 *     //반복적으로 실행할 내용
		 * }
		 * 
		 */
		int arr2[] = {10,20,30};
		
		for (int num : arr2) {
			
			System.out.println(num);
		}
		
		//Phone Phone = new Phone();
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("갤럭시","삼암성","노트25",100);
		phones[1] = new Phone("갤럭","삼성","노트2",10);
		phones[2] = new Phone("갤","삼","노트",1);
		
		//phone 객체 배열에 저장된 핸드폰 가격의 총 합 구하기
			int sum = 0;
		
		for (Phone p : phones) {
			
			 sum += p.getPrice();
			
		}
		System.out.println("총 가격의 합 : "+sum);
		
		
		
	}
	
	
}
