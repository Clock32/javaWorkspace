package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class WrongSample {
	public static void main(String[] args) {
	
		Phone[] arr = new Phone[3];
		
		
		
		/*
		 *  i 의 범위가 잘못되었다. = <= 안된다 0.1.2 O / 1.2.3 X
		 *  
		 *  arr 배열의 객체가 초기화되지 않았다 = null,null,null이잖아
		 *  
		 *   - 변수가 null을 가지고 있는 상태에서 주소값이 있을때만 수행 가능한 어떤 행동을 수행하는 경우
		 *   NullPointerException(NPE) 가 발생한다.
		 *   널을/ 가리켜서/  예외처리했다.
		 *   
		 *   해결법 = 초기화하기 , 그냥 null값만 보내기 .getName()을 뺴고
		 *  
		 */
		for(int i = 0; i <= arr.length;i++) {
			
			System.out.println(arr[i].getName());
		}
		
		
		
}
}
