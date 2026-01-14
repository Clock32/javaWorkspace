package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	

	private HashMap<String,Member> map = new HashMap();
	Member mem = new Member();

	public boolean joinMembership(String id, Member m) {

		boolean result = map.containsKey(id);

		if (result) {

			return false;
		} else {

			map.put(id, m);
			return true;
		}

	}

	public String logIn(String id,String password) {
		
		String name = null;
		
		if (!(map.containsKey(id))) {
			
			return null;
			
		}
		
		if (map.get(id).getPassword().equals(password)){
			
			name = map.get(id).getName();
			
		}
		
		
		
		return name;
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
	}

	public boolean changePassword(String id, String oldPw, String newPw) {

		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			
			map.get(id).setPassword(newPw);
			return true;
			
		}
		return false;
		
		
		
	}

	public void changeName(String id, String newName) {

		map.get(id).setName(newName);
		
		
	}

	public TreeMap <String , String>sameName(String name) {
		
		TreeMap <String , String>tm = new TreeMap<>();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			
			String uName = map.get(key).getName();
			
			if(uName.equals(name)) {
				tm.put(key, uName);
			}
			
		}
		return tm;
		
		
		
	}
}
