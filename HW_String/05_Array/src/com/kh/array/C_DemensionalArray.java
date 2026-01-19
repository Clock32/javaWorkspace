package com.kh.array;

public class C_DemensionalArray {

	/*
	 * 이차원 배열 선언 표현법 자료형 배열명 [][]; 자료형[] 배열명[]; 자료형 [][]배열명; []가 두개면 이차원 세개면 삼차원 등등
	 */

	public void method1() {
		// int arr [][];
		int[] arr1[];
		int[][] arr2;

		/*
		 * 이차원 배열 할당 (크기지정) 배열명 = new 자료형 [행][열]
		 * 
		 */

		int arr3[][] = new int[2][3];

		/*
		 * 이차원 배열 선언과 동시에 할당
		 */

		int arr[][] = new int[3][5];
		/*
		 * [0,0,0,0,0] [0,0,0,0,0] [0,0,0,0,0]
		 */
		System.out.println(arr); // 주소값 - [[I@32d2fa64 - [[ 두개이니 이차원배열
		System.out.println(arr[0]); // 1행의 주소값 - [I@1d8d30f7 - [ 한개이니 일차원 배열
		System.out.println(arr[0][0]); // 1행 1열의 값 - 0
		System.out.println(arr.length);// 3
		System.out.println(arr[0].length);// 5

		// 중첩 반복문을 총한 이차원 배열 순환

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		// ystem.out.println(arr.toString());
	}

	public void method2() {

		/*
		 * 1행 [1,2,3,4,5] 2행 [6,7,8,9,10] 3행 [11,12,13,14,15] 2차원 배열을 선언 및 할당하고 위 데이터
		 * 형식으로 초기화하라
		 */

		int arr[][] = new int[3][5];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				arr[i][0] = (i + 1) * 5;
				arr[i][j] = (j + 1);
				System.out.print(arr[i][j] + " ");

			}
			System.out.print("\n");
		}

	}

	public void method3() {

		// 배열 선언과 초기화
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[][] = { { 1, 2, 3 }, { 6, 7, 8, 9, 10 }, { 11 } };

		/*
		 * 가변 배열 행의 크기는 정해져 있으나 행별 열의 개수가 정해지지 않은 배열을 의미함 이차원 배열은 1차원 배열을 여러개 묶음으로 관리하는
		 * 형태긴 하지만 일차원 배열의 크기가 꼭 같은 필요는 없다.
		 */

		int arr3[][] = new int[3][1];

		System.out.println(arr2); // - 1차원 배열크기
		System.out.println(arr2[0]); // - null

		arr3[0] = new int[2];
		arr3[1] = new int[3];
		arr3[2] = new int[1];

		int value = 1;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = value++;
				System.out.print(arr2[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void method4() {
		/*
		 * char[][] 가변배열을 설정 후 문자를 출력하시오
		 * 
		 * 최ㅏ종 1행 [a,b,c] 2행 [d,e] 3행 [f,g,h,i]
		 */
		char arr[][] = { 	{ 'a', 'b', 'c' }, 
							{ 'd', 'e' }, 
							{ 'f', 'g', 'h', 'i' } };

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}
	public void test() {
		
		char arr[][] = new char[3][];
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		char ch = 'A';
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ch++;
				ch++;
				

			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		
		
	}
}
