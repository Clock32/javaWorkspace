package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		String arr[][] = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ("(" + i + "," + j + ")");
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void practice2() {

		int arr[][] = new int[4][4];

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void practice3() {

		int arr[][] = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void practice4() {

		int arr[][] = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				int ran = (int) (Math.random() * 10 + 1);
				arr[i][j] = ran;
			}
		}
		arr[0][3] = (arr[0][0] + arr[0][1] + arr[0][2]);
		arr[1][3] = (arr[1][0] + arr[1][1] + arr[1][2]);
		arr[2][3] = (arr[2][0] + arr[2][1] + arr[2][2]);
		arr[3][0] = (arr[0][3]);
		arr[3][1] = (arr[1][3]);
		arr[3][2] = (arr[2][3]);
		arr[3][3] = ((arr[0][3]) + arr[1][3] + arr[2][3] + arr[3][0] + arr[3][1] + arr[3][2]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void test() {
		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값저장 후 아래의 내용처럼 처리하세요.
		 *
		 * ex) 6 6 1 13 4 10 8 22 8 6 5 19 18 22 14 108
		 * 하지만 배열을 2개를 사용한다는 단점이 있다.
		 */

		int arr[][] = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		int arr2[][] = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int total1 = 0;
			int total2 = 0;

			for (int j = 0; j < arr[i].length; j++) {
				total1 += arr[i][j];
			}
			arr2[i][3] = total1;

			for (int j = 0; j < arr[i].length; j++) {
				total2 += arr[j][i];
			}
			arr2[3][i] = total2;
		}
		int result = 0;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (j == 3 || i == 3) {
					result += arr2[i][j];
				}
			}
		}

		arr2[3][3] = result;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%d ", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {

		while (true) {
			System.out.print("행 크기 : ");
			int hang = sc.nextInt();

			System.out.print("열 크기 : ");
			int yeol = sc.nextInt();

			int arr[][] = new int[hang][yeol];

			
			
			if (!(hang > 0 && hang <= 10 && yeol > 0 && yeol <= 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
				} else {

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (int) (Math.random() * 26 + 65);
						System.out.print((char) arr[i][j] + " ");
					}
					System.out.println();
				}
				break;			
			}
		}
	}
	
	 public void practice6(){
		 
		 
	 }
	 
	 public void practice7(){
		 
		 
	 }
	 
	 public void practice8(){
		 
		 
	 }
	 
	 public void practice9(){
		 
		 
	 }

}
