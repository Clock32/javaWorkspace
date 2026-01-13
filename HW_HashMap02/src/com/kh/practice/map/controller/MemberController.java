package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap map = new HashMap();
	
	
	public boolean joinMembership(String id, Member m ) {
		
		boolean result = false;
		
		
		if(!(boolean)(map.get(m))) {
			
			map.put(id, m);
			result = true;
			
		}else {
			
			result =false;
		}
		
		
		
		return result;
	}
	
	public String logIn(String id,String password) {
		
		if () {
			
			
		}else {
			
			
		}
		
		
		
		return "";
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
	}
	
	public boolean changePassword(String id,String oldPw , String newPw) {
		
		
	}
	
	public void changeName(String id , String newName) {
		
		
		
	}
	
	public TreeMap sameName(String name) {
		
		
	}
}
