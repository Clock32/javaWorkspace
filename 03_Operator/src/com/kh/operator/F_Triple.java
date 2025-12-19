package com.kh.operator;

public class F_Triple {

	/*
	 * 삼항연산자 3개의 항을 가지고 연산하는 연산자
	 * 
	 * 조건식 ? 조건이 true 인 경우 결과감 : 조건이 false인경우 결과값
	 * 
	 * a?b:c
	 */

	public void method1() {

		int num = 50;

		// num의 값이 양수인지 아닌지 판단

		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다" : "음수입니다");
	}

	public void method2() {

		int num = 0;
		// num의 값이 양수,음수,0중 무엇인지 판단

		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		
		System.out.println("num의 값은 "+result+"입니다.");

	}
	
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; 		// 5+1 + 10 = 6+10 = 16  // a = 6 , b = 10
        int d = c / a; 			// 16 / 6 = 2  // a = 6 , b = 10 , c = 16 , d = 2
        int e = c % a;			// 16 % 6 = 4 // a = 6 , b = 10 , c = 16 , d = 2 , e = 4
        int f = e++;			// 4++ (5) 	 // a = 6 , b = 10 , c = 16 , d = 2 , e = 5 , f = 4
        int g = (--b) +(d--);	// 9 + 10 (9) // a = 6 , b = 10 , c = 16 , d = 2 , e = 5 , f = 5 , g = 
        int h = 2;				// 2
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);	//
        System.out.println("a : "+a); 
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i); //(6+8) / (16/2) * (18 - 3) % (2+2)
        
        /*
         * 5
         * 10
         * 16
         * 3
         * 1
         * 1
         * 19
         * 2
         * 12
         */
        
        // a=7, b=8 이지만 후위 연산자이니 표시는 9 , c= 15, d= 3,e= 1,f= 1,g= 6,h= 2,i=
    }

}
