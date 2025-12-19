package com.kh.Variable;

public class A_Variable {
	
	
	//시급과 근무시간 근무일수를 곱해 월급계산
	public void printVariable() {
		
		System.out.println("======== 변수 사용 전 ========");
		
		System.out.println("시급 : 8500");
		System.out.println("근무시간 : 6");
		System.out.println("근무 일수 : 5");
		
		System.out.println("허민혁 : " + 8500 * 6 * 5);
		System.out.println("허민혁1 : " + 8500 * 6 * 5);
		System.out.println("허민혁2 : " + 8500 * 6 * 5);
		System.out.println("허민혁3 : " + 8500 * 6 * 5);
		System.out.println("\n");
		
		int pay = 9000;
		int time = 6;
		int day = 5;
		
		System.out.println("======== 변수 사용 후 ========");
		
		System.out.println("시급 : "+pay);
		System.out.println("근무시간 : "+time);
		System.out.println("근무 일수 : "+day);
		
		System.out.println("허민혁 : " + pay * time * day);
		System.out.println("허민혁1 : " + pay * time * day);
		System.out.println("허민혁2 : " + pay * time * day);
		System.out.println("허민혁3 : " + pay * time * day);
		System.out.println("\n");
		
	/* 변수를 사용한 후 생기는 이점
	 * 가독성 확보
	 * 재사용성 증대
	 * 유지보수성 증대
	 */
		
	}
	
	public void declareVariable() {
		
		/*	
		 * 변수의 선언
		 * [표현법]
		 * 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지 어떤 크기의 값을 담아낼지에 따라 다르게 지정하는 부분.
		 * 
		 * 변수명 : 변수의 이름을 지정하는 부분. 담겨있는 값을 최대한 잘 표현해야 한다.
		 * 
		 * 변수명 명명 규칙
		 *  
		 * 변수명은 영어 소문자로 시작한다
		 * 낙타증 표기법을 사용한다 (camel case = String userFirstname; 단어간 대문자)
		 * 
		 * 주의점
		 * 변수선언은 클래스 아래 영역 매서드 내부에서만 가능
		 * 같은 영억 안에서 동일한 이름의 변수명 사용불가
		 * 해당 영역 안에서 선언한 변수는 해당 영역에서만 사용가능
		 * 
		 */
		
		// 1. 논리형 변수 선언
		boolean isTrue;
		
		// 2-1. 숫자형 변수 선언 - 정수형
		byte bNum; // 1byte  8bit -128 ~ 127
		short sNum; // 2byte 16bit -3만2천 ~ 3만2천 쯤
		int iNum; // 4byte 32bit 대표 자료형
		long lNum; //8byte 64bit
		
		// 2-2. 숫자형 변수 선언 - 실수형
		float fNum; // 4byte 소수점 7자리까지 
		double dNum; // 8byte 소수점 15자리까지 - 대표 자료형
		//계산에 민감한것은 계산을위한 '클래스'를 따로 사용한다
		
		// 3. 문자형 변수 선언
		char ch; //2byte 0~65,535
		
		//기본 자료형 끝 --------------------------
		
		// 4. 문자열 [참조 자료형]
		String str; //8아님 16byte
		
		//============= 변수에 값을 대입 ==============
		//변수를 사용하기전에 반드시 초기화 하고 사용하라

		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;  //변수명 long 부터는 뒤에 L 을 붙여서 long인지 int인지 확실하게 구별한다
		
		fNum = 4.0f;  //실수 리터럴값 뒤엔 항상 f 붙여라
		dNum = 8.0;  //대표 자료형이라 뒤에 f 필요없다 그냥 소수점일때 float만 float의 f 를 붙힌다 라고 생각하면 편하다
		
		ch = 'A';  //문자 '' 문자열 ""
		str = "Hello World!";
		
		
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 값을 대입
		boolean isTrue = false;
		
		int longInteger = 999_999_999; //너무 기니까 3개씩 _ 로 묶자 실제 값에는 _ 포함 X 걱정 X
		
		byte bNum = 1; // -128 ~ 127
		System.out.println(bNum);
		
		int iNum = 127;
		bNum = (byte)(iNum+15);
		System.out.println(bNum);
		
	}
	
	public void constant() {
		
		int age = 20;
		
		final int AGE = 21; //진짜 절대바뀌지않는 최종 찐최종 완성본 값을 표시할땐 final을 사용한다 그리고 절대 +++절대+++ 대문자 왕큰 문자 진짜 딱 대문짝만한거
		//AGE = 22; - 주석풀면 절대 못푸는데 왜 값 바꿀려고하냐며 혼남
		//전부대문자니까 낙타방법못쓰니 언더바를 사용하라 USER_FIRSTNAME
		
		
	}

}
