package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	public int personCount() {
		
		return  0;
	}
	
	public void insertStudent(String name,int age,double height,
								double weight, int grade,String major) {
		
		this.s = s;	
		
		
		for (int i = 0; i<s.length;i++) {
			
			if (s[i]==null) {
			s[i] = new Student(name,age,height,weight,grade,major);
			//???????????????????
			}else {
				
				System.out.println("학생꽉참");
			}
		}
		
		
		
	}
	
	public Student[] printStudent() {
		
		
		
		return null;
		
	}
	
	public int insertEmployee(String name,int age,double height,
								double weight, int salary, String dept) {
		
		this.e = e;
		
		
		return 3;
		
	}
	
	public Employee[] printEmployee() {
		
		
		
		return null;
	}
	
	
	
	
}
