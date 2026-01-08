package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {
public static void main(String[] args) throws C_CustomException {
	A_UncheckedException au = new A_UncheckedException();
	B_CheckedException bc = new B_CheckedException();
	
	/*
	 * 에러 의 종류
	 * 시스템 오류
	 * 		컴퓨터상의 오작동으로 발생하는 에러
	 * 		소스코드로 수정이 불가능하다
	 * 		 
	 * 컴파일 에러
	 * 		소스 코드상의 문법적인 문제로 발생하는 에러
	 * 		컴파일러가 빨간줄로 오류를 알려준다
	 * 		소스코드 수정으로 문제를 해결할 수 있다.
	 * 
	 * 런타임 에러
	 * 		소스코드상으로는 문제가 없는데 프로그램 실행 중에만 발생하는 에러
	 * 		nullpointexception 등 
	 * 		사용자가 잘못된 방식으로 사용하거나 . 개발자가 충분히 예측을 하지 못한 경우 발생하는 오류
	 * 		소스코드 수정으로 해결할 수 있다.
	 * 
	 * 논리 	에러
	 * 		소스코드상의 문법적인 문제도 없고 싱행시 에러도 없지만 프로그램의 의도와
	 * 		다른 경과를 반환하는 에러
	 *		소스코드 수정으로 새결 가능하다 
	 *
	 *
	 *예외처리
	 *위와가ㅣㅌ은 에러들이 발생했을 경우를 대비하여 처리하는 방법을 사전에 정의해두는것을
	 *예외처리 라고 한다
	 *예외처리를 하지 않으면 프로그램 실행중 에외 각 방생하는 경우 프로그램이 작동 중지 한다.
	 *
	 *
	 */
	
	//au.method1();
	//bc.method1();
	
	
	/*
	 * 에러 강제 발생
	 * throw ne w애러클래스 생성자(ㅔㅇ러메세지)
	 * 
	 * 
	 */
		
	throw new C_CustomException("에러발생");
	
	
	
}
}
