package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void sum() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫 번째 정수 : ");
		int i1 = sc.nextInt();
		
		
		System.out.println("두 번째 정수 : ");
		int i2 = sc.nextInt();
		
		
		System.out.println("더하기 결과 : "+(i1+i2));
		System.out.println("빼기 결과 : "+(i1-i2));
		System.out.println("곱하기 결과 : "+(i1*i2));
		System.out.println("나누기 결과 : "+(i1/i2));
	}
}
