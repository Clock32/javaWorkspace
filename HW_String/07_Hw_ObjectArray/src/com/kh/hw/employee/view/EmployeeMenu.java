package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	
	public EmployeeMenu() {
		
	}
	
	public void EmployeeMenu() {
		
		System.out.println("1.사원 추가");
		
		
		System.out.println("2.사원 수정");
		
		
		System.out.println("3.사원 삭제");
		
		
		System.out.println("4.사원 출력");
		
		
		System.out.print("9.프로그램 종료");
		
		System.out.print("메뉴 번호를 누르세요 : ");
		int mNum = sc.nextInt();
		
		switch(mNum) {
		
		case 1 : insertEmp();break;
			
		case 2 : updateEmp();break;
			
		case 3 : deleteEmp();break;
			
		case 4 : printEmp();break;
			
		case 9 :	System.out.println("프로그램을 종료합니다.");
					return;
					
				
			default : System.out.println("잘못 입력하셨습니다.");
			EmployeeMenu();
						
		}
		
	}
	
	public void insertEmp() {
		
		
		
		System.out.print("사원 번호 : ");
		int eNum = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String eName = sc.next();
		
		System.out.print("사원 성별 : ");
		char eGen = sc.next().charAt(0);
		
		System.out.print("전화번호 : ");
		String ePnum = sc.next();
		
		System.out.println("추가 정보를 더 입력하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		
		if(yn == 'y'||yn == 'Y') {
			
			System.out.print("사원 부서 : ");
			String eDep = sc.next();
			
			System.out.print("사원 연봉 : ");
			int eSal = sc.nextInt();
			
			System.out.print("보너스 율 : ");
			double eBon = sc.nextDouble();
			
			ec.add(eNum, eName, eGen, ePnum, eDep, eSal, eBon);
			EmployeeMenu();
			
		}else {
			
			
			ec.add(eNum, eName, eGen, ePnum);
			EmployeeMenu();
			
		}
		
		
		
	}
	
	public void updateEmp() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니다?");
		
		
		System.out.print("1.전화번호");
		
		
		System.out.print("2.사원 연봉");
		
		
		System.out.print("3.보너스 율");
		
		
		System.out.println("9.돌아가기");
		
		System.out.print("메뉴 번호를 누르세요 : ");
		int mNum = sc.nextInt();
		
		switch (mNum) {
		
		case 1 : System.out.print("수정할 전화번호 : ");
					String ePnum = sc.next();
					ec.modify(ePnum);
					break;
			
			
		case 2 : System.out.print("수정할 사원 연봉 : ");
					int eSal = sc.nextInt();
					ec.modify(eSal);
			
		case 3 : System.out.print("수정할 보너스 율 : ");
					double eBon = sc.nextDouble();
					ec.modify(eBon);
					break;
					
					
		case 9 :	System.out.println("메인메뉴로 돌아갑니다.");
		EmployeeMenu();
			
			default : System.out.println("잘못 입력하셨습니다.");
			EmployeeMenu();	
		
		
		
		
		}
		
		
		
	}
	
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		
		if (yn == 'y'||yn == 'Y') {
			
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
			EmployeeMenu();
			
		}else {
			
			System.out.println("데이터 삭제에 실패하였습니다.");
			EmployeeMenu();
			
		}
		
	}
	
	public void printEmp() {
		
		System.out.println(ec.inform());
		EmployeeMenu();
		
	}
	
	
	
	
}
