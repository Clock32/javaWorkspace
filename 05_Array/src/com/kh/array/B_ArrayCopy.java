package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * -얕은 복사 : 배열의 주소값만을 복사. 
	 * -깊은 복사 : 동일한 새로운 배열을 하나 생성하여 내부의 값들 까지 복사하는 개념
	 * 
	 */
	public void method() {
		int arr[]  = {1,2,3,4};
		System.out.println("원본 배열 출력 : "+Arrays.toString(arr));
		
		//얕은 복사
		int arr2[] = arr;
		System.out.println("복사 배열 출력 : "+Arrays.toString(arr2));
		
		//복사 배열 수정
		arr[2] = 99;
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
	}
	//깊은 복사를 수행하는 4가지 방법
	public void method2() {
		// 1. for 문을 활용한 복사
		// - 새로운 배열을 생성 한 후 각 인덱스 별로 내부값을 일ㅇ일히 대입
		int arr[] = {1,2,3,4,5};
		
		int arr2[] = new int[arr.length];
		
		// int arr2[] = {arr.length}; == int arr2[] = {5};
		
		for (int i =0;i<arr.length;i++) {
			arr2[i] = arr[i];
		} 
		
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
		
		
	}
	public void method3() {
		//2. 새로운 배열 생성 후 System클래스의 Arraycopy매메서드를 통한 복사
		int arr[] = {1,2,3,4,5};
		//1번 001234500
		//2번 012300000
		//3번 034500000
		int arr2[] = new int [10];
		
		//System.arraycopy {원본배열,원본배열의 복사를 시작할 인덱스,복사본 배열,복사본 배열의 복사를 시작할 인덱스,복사할 갯수}
		
		System.arraycopy(arr, 0, arr2, 2, 5);
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
		arr2 = new int [10];
		
		System.arraycopy(arr, 0, arr2, 1, 3);
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
		arr2 = new int [10];
		
		System.arraycopy(arr, 2, arr2, 1, 3);
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
		arr2 = new int [10];
	}
	
	public void method4() {
		// 3. Array클래스의 copyOF 메서드 사용
		
		int arr[] = {1,2,3,4,5};
		//Arrays.copyOf(원본배열명,복사할 개수);
		int arr2[] = Arrays.copyOf(arr, 10); //복사할 개수가 곧 복사본 배열의 크기
		
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
		
	}
	
	public void method5() {
		// clone메서드를 사용한 복사 == 깊은복사지원
		int arr[] = {1,2,3,4,5};
		
		int arr2[] = arr.clone(); //원본 배열과 정확히 똑같은 값을 복사해준다
		
		System.out.println("\n원본 배열 수정 후 출력 : "+Arrays.toString(arr));
		System.out.println("복사 배열 수정 후 출력 : "+Arrays.toString(arr2));
	}
	
	
}
