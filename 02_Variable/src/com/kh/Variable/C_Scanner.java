package com.kh.Variable;

import java.util.Scanner;

public class C_Scanner {
	//실무에서는 사용안하는 Scanner이다
	// 사용자가 키보드로 직접 입력한 값을 변수에 저장할 수 있게 도와주는 클래스이다
	
	public void inputTest01() {
		
		Scanner sc = new Scanner(System.in);
		
		//사용자의 인적사항 정보 입력받기
		
		System.out.print("당신의 이름을 입력해 주세요 : ");
		/*
		 * 사용자가 입력한 값을 문자열로 받아오는 메서드
		 * 1. nextline() : 사용자가 입력한 값을 엔터 기준으로 모두 가져오는 메서드 - 값을 가져온 후 '개행문자 - 엔터'를 비워준다
		 * 
		 * 2. next() : 사용자가 입력한 값을 공백 기준으로 가져오는 메서드. - 히히 안비워줘
		 */
		
		//String name = sc.nextLine();
		//System.out.println(name);
		
		String firstName = sc.next();
		sc.nextLine(); //이런식으로 고칠수는 있는데 드럽게 번거롭고 귀찮고 보기나쁘다 제대로 작동도안하고 안내글자 추가해야하고 그냥 드러워
		String lastName = sc.nextLine();
		
		System.out.println(firstName + lastName);
		//next는 개행문자를 안없애주기때문에 성만치고 엔터를치면 개행문자가 살아서 이름을 입력하기전에 지 마음대로 끝내버린다 
		
		System.out.println("당신의 나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		System.out.println("당신의 키를 입력해 주세요 : ");
		Double height = sc.nextDouble();
		
		//입력한 데이터를 문자형으로 뽑기
		// String의 charAt(0)을 이용하여 문자열을 문자로 뽑자
		System.out.println("당신의 성별을 M 혹은 F 로 입력해 주세요 : ");
		//char gender = sc.next().charAt(0);
		
		String gender = sc.next();
		char gender2 = gender.charAt(0);
		
		System.out.println("당신의 이름은 "+firstName+lastName+"\n당신의 나이는 "+age+"\n당신의 키는 "+height+"\n당신의 성별은 "+gender2);
		
		
	}
}
