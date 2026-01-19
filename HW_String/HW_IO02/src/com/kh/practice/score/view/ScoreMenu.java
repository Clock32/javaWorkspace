package com.kh.practice.score.view;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.naming.ldap.StartTlsRequest;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {

		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		int mNum = sc.nextInt();

		while (true) {

			switch (mNum) {

			case 1:
				saveScore();
				return;

			case 2:
				readScore();
				return;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}

		}

	}

	public void saveScore() {

		int num = 0;
		char yn = ' ';

		while (true) {

			System.out.println(++num + "번 째 학생 정보 기록");

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();

			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			int math = sc.nextInt();

			int sum = kor + eng + math;

			double avg = (sum) / 3;

			scr.saveScore(name, kor, eng, math, sum, avg);
			num++;

			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속하시려면 아무 키나 입력하세요 : ");

			yn = sc.next().toUpperCase().charAt(0);

			if (yn == 'N') {

				break;

			}
				saveScore();

			

		}

	}

	public void readScore() {

		int count = 0; // 몇명의 학생인지 담는거 (반복문실행횟수)

		int sumAll = 0; // 다 더 하 ㄴ 거

		double avgAll = 0.0; // 모든 학생 평균

		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여

		try (BufferedReader br = new BufferedReader(new FileReader("이번학생 점수"));){
			
			//System.out.println(br.readLine()); // 한 줄 씩 값을 문자열로 반환
			String value = null;
			while( (value = br.readLine()) != null) {
				
				System.out.println(value);
				count++;
				
			}
			
			System.out.println("읽은 횟수 전체 합계 전체 평균\n"
							+count+" "+sumAll+" "+avgAll);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// \t 탭 
		
		
		// 안에 들어가있는 데이터를 가지고 와서 출력
		
		//               <^^^`< 악어
		
		
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여

		
		
		
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력

	}

}
