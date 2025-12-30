package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
public static void main(String[] args) {
	
	User u = new User();
	
	User u2 = new User("userID");
	
	User u3 = new User("user03",30,'M');
	System.out.println(u3.getUserId()+"\n"+u3.getAge()+"\n"+u3.getGender());
}
}
