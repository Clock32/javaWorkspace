package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	
	private Member mem;
	
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
				System.out.println(i+"번째 도서 : "+searchList[i]);
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
		
		Book b = bList[index];
		if(b instanceof AniBook && mem.getAge() < ((AniBook)b).getAccessAge()) {
			result = 1;
			
		}else if (b instanceof CookBook && (((CookBook) b).isCoupon())) {
			
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		
		
		
		
		return result;
		
		
		
		/*
		 * public Book[] searchBook(String keyword)
	{		
		int BookCount = 0;
		Book[] bookInKeyword;
		int bookIndex = 0;
		
		for (Book b : bList)
		{
			boolean inKeyword = false;
			
			for (int i = 0; i < b.getTitle().length(); i++)
			{
				if (b.getTitle().charAt(i) == keyword.charAt(0))
				{
					int index = i;
					
					for (int j = 0; j < keyword.length(); j++)
					{
						if (index >= b.getTitle().length())
	                    {
	                        inKeyword = false;
	                        break;
	                    }
						
						if (b.getTitle().charAt(index) == keyword.charAt(j))
						{
							inKeyword = true;
							index++;
						}
						else
						{
							inKeyword = false;
							break;
						}
					}
					
					if (inKeyword)
					{
						BookCount++;
						break;
					}
				}
			}
		}
		
		bookInKeyword = new Book[BookCount];
		
		for (Book b : bList)
		{
			boolean inKeyword = false;
			
			for (int i = 0; i < b.getTitle().length(); i++)
			{
				if (b.getTitle().charAt(i) == keyword.charAt(0))
				{
					int index = i;
					
					for (int j = 0; j < keyword.length(); j++)
					{
						if (index >= b.getTitle().length())
	                    {
	                        inKeyword = false;
	                        break;
	                    }
						
						if (b.getTitle().charAt(index) == keyword.charAt(j))
						{
							inKeyword = true;
							index++;
						}
						else
						{
							inKeyword = false;
							break;
						}
					}
					
					if (inKeyword)
					{
						break;
					}
				}
			}
			
			if (inKeyword)
			{
				bookInKeyword[bookIndex] = b;
				bookIndex++;
			}
		}
		
		return bookInKeyword;
		
	}
	
    모든 문자를 추출해서 문자열에 대조한다음 아라내기?? 어떻게하신거야?
		 */
	}
}
