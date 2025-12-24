package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);

		}

		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice2() {

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {

			arr[i] = i + 1;
		}

		System.out.println(Arrays.toString(arr));
	}

	public void practice3() {

		int arr[] = { (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1) };
		System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
		String day[] = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0~6 까지의 정수를 입력하세요 : ");
		int d = sc.nextInt();

		switch (d) {

		case 0:
			System.out.println(day[d] + "요일");
			break;
		case 1:
			System.out.println(day[d] + "요일");
			break;
		case 2:
			System.out.println(day[d] + "요일");
			break;
		case 3:
			System.out.println(day[d] + "요일");
			break;
		case 4:
			System.out.println(day[d] + "요일");
			break;
		case 5:
			System.out.println(day[d] + "요일");
			break;
		case 6:
			System.out.println(day[d] + "요일");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다");
			return;

		}

	}

	public void practice5() {

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int sum = 0;

		for (int i = 0; i <= num - 1; i++) {

			System.out.print(i + "번째 인덱스에 넣을 값 : ");
			int a = sc.nextInt();
			arr[i] = a;
			sum = sum += a;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);

	}

	public void practice6() {

		// 중복 검사 기능 없음
		// -----------------------------------------------------------------------

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char arr1[] = str.toCharArray();
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr1));
		System.out.print("문자 개수 : " + arr1.length);

		/*
		 * System.out.print("문자열 : "); String str = sc.nextLine();
		 * 
		 * boolean isDup = false;
		 * 
		 * char arr[] = str.toCharArray();
		 * 
		 * 
		 * for (int i = 0; i<arr.length;i++ ) {
		 * 
		 * char ch[] = att[i];
		 * 
		 * for(int j =0;j<i;j++) {
		 * 
		 * if(ch==arr[j]) { isDub = true; break;
		 * 
		 * } if(!isDub) { System.out.println(ch + " "); } }
		 * 
		 * 
		 * }
		 */

	}

	public void practice7() {

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char i = sc.next().charAt(0);

		int count = 0;

		char strc[] = str.toCharArray();

		System.out.print(str + "에 " + i + "가 존재하는 위치(인덱스) : ");
		for (int j = 0; j < strc.length; j++) {

			if (strc[j] == i) {

				System.out.print(j + " ");
				count++;

			}

		}
		System.out.println("\n" + i + " 개수 : " + count);
	}

	public void practice8() {

		System.out.println("주민등록번호(-포함) : ");
		String onum = sc.nextLine();

		char oc[] = onum.toCharArray();
		char cc[] = { '*', '*', '*', '*', '*', '*', '-', '*', '*', '*', '*', '*', '*', '*' };
		System.arraycopy(oc, 0, cc, 0, 8);

		System.out.println(cc);

	}

	public void practice9() { // --------------------------------------------------------

		int arr[] = { (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1) };

		System.out.println(Arrays.toString(arr));

		int min = 10;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j] && arr[i] < min) {

					min = i;

				}

			}

		}

		System.out.println(min);

	}

	public void practice10() { // -------------------------------------------------

		int arr[] = { (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1),
				(int) ((Math.random() * 10) + 1), (int) ((Math.random() * 10) + 1) };

		int cc[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					cc[i] = j;

				}
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(cc));

	}

	public void practice11() {

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int jung = (num / 2) + 1;

			if (num >= 3 && num % 2 == 1) {
				int arr[] = new int[num];
				System.out.println("중앙값 : " + jung);

				for (int i = 0; i < jung; i++) {
					arr[i] = i + 1;
				}

				for (int j = jung; j < arr.length; j++) {

					arr[j] = jung -= 1;
				}

				System.out.println(Arrays.toString(arr));

			} else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}

	}

	public void practice12() 
	{

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		String arr[] = new String[num];

		while (true) 
		{

			for (int i = 0; i <= num - 1; i++) 
			{

				System.out.print(i + "번째 문자열 : ");
				String a = sc.next();
				arr[i] = a;

			}

			System.out.print("더 값을 입력하시겠습니다? (y/n) : ");
			char yn = sc.next().charAt(0);

			if (yn == 'y') 
			{

				System.out.println("더 입력하고 싶은 개수 : ");
				int nNum = sc.nextInt();

				String arr2[] = Arrays.copyOf(arr, (num + nNum));

				for (int i = num; i <= (num + nNum) - 1; i++) 
					
				{

					System.out.print(i + "번째 문자열 : ");
					String a = sc.next();
					arr2[i] = a;

				}
				
				System.out.println(Arrays.toString(arr2));
				return;

			} else 
				
				{
				
				System.out.println(Arrays.toString(arr));
				return;
				
				}

		}
	}

}
