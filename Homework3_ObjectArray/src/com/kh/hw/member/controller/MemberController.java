package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	
	public static final int SIZE = 10;
	
	
	
	public int existMemberNum() {
		
		return 1;
	}
	
	public Boolean checkId(String inputId) {
		
		return true;
	} 
	
	public void insertMember(String id,String name,
	String password, String email,String gender,int age) {
		
		
	}
	
	public String searchId(String id) {
		
		return "";
	}
	
	public  Member[] searchName(String name) {
		
		return null; 
	}
	
	public  Member[] searchEmail(String email) {
		
		return null; 
	}
	
	public Boolean updatePassword(String id, String password) {
		
		return true;
	}
	
	public Boolean updateName(String id, String name) {
		
		return true;
	}
	
	public Boolean updateEmail(String id, String email) {
		
		return true;
	}
	
	public Boolean delete(String id) {
		
		return true;
	}
	
	public void delete() {
		
		
	}
	
	public Member[] printAll() {
		
		return null;
	}
	
	
	
	
	
	
	
}
