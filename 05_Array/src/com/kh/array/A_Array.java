package com.kh.array;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간.
	 *   int a = 0;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다. (같은 자료형 기준)
	 * ex) int[] a = new int[3];
	 * 		int 자료형 값을 담을 수 있는 저장공간이 3번 할달된다. 4byte * 3
	 * 		[0, 0, 0]
	 * 		배열에서 저장된 데이터를 꺼낼때는 인덱스 값을 사용하며 인뎃스값은 0부터 사용한다
	 * 		arr[0] arr[1] arr[2]
	 * 		배열의 크기가 만약 5라면 . 배열의 마지막 인덱스는 4
	 * 		배열의 크기가 n 이라면 해당 배열의 마지막 인덱스는 항상 n-1 이다.
	 * 
	 */
	public void method() {
		/*
		 * 배열 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * 
		 * 
		 */
		int a;
		int arr[];
		
		/*
		 * 배열 할당
		 * - 이배열에 몇 개의 값들을 보관할지 그 배여ㅑㄹ의 크기를 지정해주는 과정
		 *   크기를 지장해주면 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 *   표현법
		 *   배열명 = new 자료형[배열크기]
		 */
		int arr3[] = new int[5];
		
		int arr2[] = new int[5];
		
	
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		
		System.out.println(arr3[2]);
	
		}
	public void method2() {
		int num = 10; //저장공간 스택
		
		int iArr[]/*저장공간 스택*/ = new int[3]; //저장공간 Heap - 적는 순간 heap구간에 저장이되며 heap구간은 빈 데이터가 없으면 안되니 바로 00000으로 채운다
		//heap 메모리 구간은 할당 뿐만 아니라 초기화가 필수이기때문에 다시 메모리 주소를 초기화해서 준다
		
		System.out.println("iArr : "+iArr); // 저장한 값이 아니라 배열의 주소값이 나오게 된다 왜냐면 모든 참조형 변수는 실제 담고있는 값이 전부 주소값이기 때문이다 16진수 형태
		System.out.println("iArr의 HashCode : "+iArr.hashCode());//주소값을 10진수형태로 변환해주는 함수
		//iArr : [I@27808f31
		//iArr의 HashCode : 662736689 - 중요 ******************************
		
		int iArr2[] = new int[5];
		System.out.println("iArr2 : "+iArr2.hashCode());
		//iArr2 : 1131316523 - 새로운 배열은 새로운 주소값을 가진다
		
		int iArr3[] = iArr2;
		//위는 이미 생성된 heap 메모리값을 그대로 사용하기때문에 새로운 주소값이 생성되지 않는다
		System.out.println("iArr3 : "+iArr3.hashCode());
		//iArr2 : 1131316523
		//iArr3 : 1131316523
		
	}
}
