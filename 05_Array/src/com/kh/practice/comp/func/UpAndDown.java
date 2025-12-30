package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
		
		Scanner sc = new Scanner(System.in);
	
	public void upDown() {
		
		int ran = (int) (Math.random()*100)+1;
		int count = 1;
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			
			if(num == ran) {
				
				break;
			}
			
			if(!(num >=1 && num <=100)) {
				
				System.out.println("1~100 사이의 숫자를 입력하세요.");
				continue;
			}
			
			if(num > ran) {
				System.out.println("Down");
			}else {
				System.out.println("Up");
			}
			
			count++;
		}
		System.out.println(count+"만에 맞췄습니다.");
		
	}
}
