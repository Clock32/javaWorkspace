package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	
	private Member mem = new Member ("허민혁",25, '남', 3);
	
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("a", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	
	
	
	
	public void insertMember(Member mem) {
		
		this.mem = mem;
	}
	
	public Member myInfo() {
		
		System.out.println(mem);
		
		return mem;
	}
	
	public Book[] selectAll() {
		
		
		
		for (int i = 0 ; i < bList.length;i++) {
			
			System.out.println(i+"번 도서 : "+bList[i]);
			
		}
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] searchList = new Book [bList.length];
		
		int count = 0;
		for (int i = 0 ; i < bList.length;i++) {
			
			if( bList[i].getTitle().contains(keyword) ||
				bList[i].getAuthor().contains(keyword) ||
				bList[i].getPublisher().contains(keyword) ) {
				
				searchList[i] = bList[i];
				System.out.println(searchList[i]);
				count++;
			}
			
			
		}
		
		if (count<1) {
			
			System.out.println("검색 결과 없습니다.");		
			
		}
		
		
		
		return searchList;
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
		
		
		
		return 1;
	}
}
