package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		/*
		 * Set
		 * 중복을 허용하지 않는다.
		 * 저장된 순서를 보장하지 않는다.
		 * 중복값을 허용하지 않는다.
		 * 
		 * HashSet : 중복을 허용하지않고 '빠르게' 저장 및 조회가 가능한 자료구조다
		 * LinkedHashSet : 중복을 허용하지 않지만 , 저장된 순서를 유지한다
		 * TreeSet : 중복을 허용하지 않지만 오름차순 정렬[기본값] 을 지원한다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Student s = new Student();
		s.method();
		
		
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("반갑습니다");
		hs1.add("반갑습니다");
		hs1.add("여러분");
		hs1.add("안녕하세요");
		hs1.add("여러분");
		//저장순서 X 중복값 저장 X
		System.out.println(hs1);
		
		System.out.println(hs1.size());
		//값 삭제
		System.out.println(hs1.remove("여러분"));
		System.out.println(hs1);
		
		System.out.println("===============================================================");
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("학생1",40,100));
		hs2.add(new Student("학생1",40,100));
		hs2.add(new Student("학생3",24,60));
		hs2.add(new Student("학생4",26,49));
		
		System.out.println(hs2);
		System.out.println(hs2.size());
		
		Student s1 = new Student("중복학생",30,30);
		Student s2 = new Student("중복학생",30,30);
		
		System.out.println(s1.equals(s2)); //오버라이딩 하여서 true
		
		
		//List < - > Set
		/*
		 * List에 set 데이터를 추가하는 방법 */
		  ArrayList<Student> list2 = new ArrayList<>(hs2);
		  //list 에 set 계열 데이터를 추가하는 방법 addAll()
		  list2.addAll(hs2);
		  //set계열 매개변수 생성자에 list 값 넣지
		  hs2.addAll(list2);
		  
		  /*
		   * LinkedHashSet : 순서유지 
		   * -저장순서유지
		   */
		  	Set<Integer> set1 = new LinkedHashSet<>();
		  	set1.add(34);
		  	set1.add(45445);
		  	set1.add(213124);
		  	set1.add(1234);
		  	set1.add(1);
		  	System.out.println(set1);
		  	
		  
		   /* 
		   * TreeSet : 오름차순(특정 정렬기준으로 정렬기준컴퍼레이터객체를 이용하면 변경가능)
		   * 데이터를 정렰;켜서 보관하는 특징이있다 기본값은 오른차순이다
		   */
		  	Comparator<Integer> comp = Collections.reverseOrder();
		  	Set<Integer> set2 = new TreeSet<>(comp);
		  	
		  	set2.addAll(set1);
		    System.out.println(set2);
		    
		  
	}
}
