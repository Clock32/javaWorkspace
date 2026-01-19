package com.kh.operator;

public class B_InDecrese {

	/*
	 * 증감 연산자 (단항 연산자) ++ --
	 * 
	 * ++ = 1증가 -- = 1감소
	 * 
	 * ++변수 처럼 전이 연산자와 변수++ 처럼 후위연산자로 나뉘며 각자 처리 방법이 다르다 1더하고 뭘하냐 아니면 뭘 하고 1을 더해주냐
	 * 아ㅏㅏㅏㅏㅏㅏㅏㅏ주 다르다
	 * 
	 * a = 1 ++a = 2
	 * 
	 * b = 1 b++ = 2지만 사이에 print 와 같은것이 있다면 1값을 보낸다음 2가 된다
	 * 
	 * 선증가 후처리 / 후증가 선처리
	 * 
	 */

	public void method1() {

		int num1 = 10;
		int num2 = 10;

		System.out.println("전위연산 적용 전 num1 : " + num1); // 10
		System.out.println("1회 수행 : " + (++num1)); // 11
		System.out.println("2회 수행 : " + (++num1)); // 12
		System.out.println("3회 수행 : " + (++num1)); // 13
		System.out.println("최종 num1 : " + num1); // 13

		System.out.println("\n");

		System.out.println("후위연산 적용 전 num2 : " + num2); // 10
		System.out.println("1회 수행 : " + (num2++)); // 10(11) 약간 11 진 느낌
		System.out.println("2회 수행 : " + (num2++)); // 11(12)
		System.out.println("3회 수행 : " + (num2++)); // 12(13)
		System.out.println("최종 num2 : " + num2); // 13(13)

	}

	public void method2() {

		// 전위연산
		int a = 10;
		int b = ++a;

		System.out.println("a : " + a); // 11나온다
		System.out.println("b : " + b); // 당연히 11

		// 후위연산
		int c = 10;
		int d = c++;

		System.out.println("c : " + c); // 11나온다
		System.out.println("d : " + d); // 당연히 10
		
		

	}
	
	public void method3() {

		int num1 = 20;
		int result = num1++ * 3;
		
		System.out.println(num1); // 21
		System.out.println(result); // 60
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println(num2); // 21
		System.out.println(result2); // 60
		
		
		

	}
	
	
	public void method4(){
        int a = 10;
        int b =20;
        int c = 30;
        //주석으로 어떻게 출력될거같은지 생각하기
        System.out.println(a++);
        System.out.println((++a) + (b++));
        System.out.println((a++)+(--b)+(--c));
        System.out.printf("a: %d , b: %d, c: %d",a,b,c  );
        
        // 10 
        // 12 + 20 = 32 
        // 12 + (20 + 29) = 61 
        // 13,20,29
    }
}
