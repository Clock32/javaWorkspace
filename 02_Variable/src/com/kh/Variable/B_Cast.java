package com.kh.Variable;

public class B_Cast {
	
	/*
	 * (자료) 형변황 : 값을 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터의 값 처리 규칙
	 * 값 끼리 연산할때는 하상 같은 자료형으로만 연상해야한다
	 * 만약 왼쪽이나 오른쪽의 자료형이 다르다면 한쪽을 형변환을 해야한다
	 * 
	 * 형 변환의 좋류
	 * 
	 * 1. 자동 형변환
	 * - 자동으로 형변환이 진행되기 때문에 내가 직접 형변환을 할 필요가 없다
	 * - 작은 바이트의 자료형 -> 큰 바이트의 자료형
	 * 
	 * 2. 강제 형변힌
	 * -자동 형변환이 불가능한 경우 내가 직접 형변환 연산자를 사용하여 변환
	 * -큰 바이트의 자료형 => 작은 바이트의 자료형
	 */
	
	public void autoCasting() {
		
		// 1. int -> double 4 -> 8
		int i1 = 10;
		double d1 = i1;  //자료형이 다르지만 자동 변환이 가능하다
		System.out.println("d1 : "+d1);
		
		int i2 = 1000;
		double d2 = 3.3;
		double result = i2+d2; //당연히 작은게 큰걸로 그러니 i2 가 d2 로 변환이 간다 시스템적으로 double result = (double) i2+d2;
		
		System.out.println("result : "+result);
		
		// 2. int -> long 4 -> 8
		int i3 = 1000;
		long l3 = i3; //long l3 = (long) i3
		
		// &특이& 3. long -> float   8 -> 4 더 작은걸로 변환하는데 이것만 자동변환 작용한다
		
		long l5 = 1000000000L;
		float f5 = l5;  //실수의 지수표기법 : 4byte 짜리 float지만 지수 표기법을 사용하면 표현할수있는 값이 드으으으으럽게 많아진다 그래서 8 -> 4 임에도 자동 형변환이 발생한다
		
		// &특이& 4. char <-> int
		char ch = 65;
		System.out.println("ch : "+ch);
		
		int num = '허';
		System.out.println("num : "+num); //char 은 하나의 문자며 문자는 곧 정수이니 가능하다 -유니코드- 문자표의 65번 = A - 문자표의 허 = 54728 cpu의 입장에서 생각해라
		
		// &특이& 5. byte와 short
		byte b1 = 17;
		byte b2 = 17;
		
		byte b3 = (byte)(b1+b2); //이상하게 java는 byte 와 byte간의 연산 혹은 short간의 연산 결과는 항상 int로 취급한다 - 자동형변환이 되어야하는데 안되서 강제로 해줘야한다 
		
	}
	
	public void forceCasting() {
		
		//1. double -> float
		
		float f1 = 4.0f;
		double d2 = 8.0;
		
		float f2 = (float)d2;
		
		// 2. double -> int
		double d3 = 10.89;
		int i3 = (int)d3;
		
		System.out.println("f2 : "+f2);
		System.out.println("i3 : "+i3);
	
		int iNum = 10;
		double dNum = 5.89;
		
		int iSum = (int) (iNum+dNum);
		int iSum2 = iNum+(int)dNum;
		
		//int iSum = iNum+dNum; 
		/*
		 * 해결방법 1 - 연산결과를 int 에 맞춰 강제 형 변환 -- 연산 - 10 + 5.89 = 에서 소수점 때기
		 * int iSum = (int) (iNum+dNum); 
		 * 
		 * 해결방법 2 - 덧셈 연산 전에 dNum을 int로 강제 변환 -- 연산 10 + (5.89 에서 소수점 땐거)
		 * int iSum = iNum+(int)dNum;
		 * 
		 * 
		 */
	}
}
