package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
		
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		double mat = sc.nextDouble();
		
		double sum = kor+eng+mat;
		double avg = sum/3;
		
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+avg);
		
	}
}
