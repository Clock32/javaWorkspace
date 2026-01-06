package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	
	public int[] personCount() {
		
		int arr[] = new int [2];
		
		
		//학생의 숫자 
		int count = 0;
		
		for(Student srr : s) {
			
			if(srr != null) {
				count++;
			}
		}
		
		arr[0] = count;
		
		count = 0;
		
		
		for (Employee err : e) {
			if(err != null) {
				
				count++;
			}
			
		}
		arr[1] = count;
		
		
		return  arr;
	}
	
	public void insertStudent(String name,int age,double height,
							  double weight, int grade,String major) {
		
			
		
		
		for (int i = 0; i<s.length;i++) {
			
			if (s[i]==null) {
			s[i] = new Student(name,age,height,weight,grade,major);
			break;
			
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
