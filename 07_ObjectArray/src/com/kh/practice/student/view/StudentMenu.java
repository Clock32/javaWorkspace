package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {

		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		System.out.println("========== 학생 정보 출력 ==========");
		//이해를 위해 int [] arr = 이런식으로 굳이 옮겨 담아도 된다
		
		for (Student s : ssm.printStudent()) {

			System.out.println(s.inform());
		}

		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력 / ssm.avgScore()[0] 으로 sumScore 를 대신할수있다.
		System.out.println("\n========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);

		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		System.out.println("\n========== 성적 결과 출력 ==========");

		for (Student s : ssm.printStudent()) {
				// 3항연산자를 사용하면 훨씬 더 쉽다
				System.out.println(s.getName() + "은 "+(s.getScore() < ssm.CUT_LINE ? "재시험 대상" : "합격")+" 입니다.");	
		}
	}
}
