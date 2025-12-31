package com.kh.hw.shape.view;
	
import java.util.Scanner;
	
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
	
public class ShapeMenu {
	
	Scanner sc = new Scanner(System.in);
	
	SquareController scr = new SquareController();
	
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		

		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		
		switch (mNum) {

		case 3:
			triangleMenu();
			
			return; //break; 도 사용 가능하다

		case 4:
			squareMenu();
			
			return;
		
		case 9:
			
			System.exit(1);
			return;

		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요.\n\n\n");
			inputMenu();
			return;

		}
	}

	

	public void triangleMenu() {

		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();

		switch (mNum) {

		case 1:
			inputSize(3, 1);
			return;

		case 2:
			inputSize(3, 2);
			return;

		case 3:
			inputSize(3, 3);
			return;

		case 9:
			inputMenu();
			return;

		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요.\n\n\n");
			triangleMenu();
			return;

		}

	}

	public void squareMenu() {
			
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();
		
		switch (mNum) {

		case 1:
			inputSize(4, 1);
			return;

		case 2:
			inputSize(4, 2);
			return;

		case 3:
			inputSize(4, 3);
			return;

		case 4:
			inputSize(4, 4);
			return;
			
		case 9:
			inputMenu();
			return;

		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요.\n\n\n");
			squareMenu();
			return;

		}
	}

	public void inputSize(int type, int menuNum) {

		if (type == 3) {

			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("면적 : ");
				double weight = sc.nextInt();

				System.out.println("삼각형 면적 : " + tc.calcArea(height, weight));
				
				triangleMenu();
			case 2 : 
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				triangleMenu();
				
			case 3 :
				printInformation(3);
				
				

			}
		} else if (type == 4) {
			
			switch(menuNum) {
			
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("면적 : ");
				double weight = sc.nextInt();

				System.out.println("사각형 둘레 : " + scr.calcArea(height, weight));
				
				squareMenu();
				
			case 2:
				System.out.print("높이 : ");
				double height2 = sc.nextInt();
				System.out.print("면적 : ");
				double weight2 = sc.nextInt();

				System.out.println("사각형 면적 : " + scr.calcArea(height2, weight2));
				
				squareMenu();
				
			case 3 : 
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				squareMenu();
				
			case 4 :
				printInformation(4);
				
			
			
			
			}
			
		}

	}

	public void printInformation(int type) {
		
		switch (type) {
		case 3 :  System.out.println(tc.print());
					triangleMenu();
		
		case 4 :  System.out.println(scr.print());
					squareMenu();
		}

	}

}
