package com.kh.chap06.method.model.vo;

public class OverloadTest {

	/*
	 * 메서드 오버로딩
	 * 
	 * 한 클래스 내에 "닽은 이름의 메서드를 여러개 정의할 수 있는 방법."
	 * 단 , 매개변수의 자료형, 개수, 순서를 다르게 작성해줘야한다
	 * 그 회 매개변수의 이름이다 접근제한자 반환형은 다르더라도 메서드 오버로딩에 영향을 주지 않는다.
	 * 
	 */
	
	
	public void test() {
		
		
	}
	
	
	public void test(int a) {
		//매개변수가 달라야 오버로딩이된다
	}
	
	public void test(int a,int b) {
		//public void test(int b){} 이건 오류난다 이름이 달랃도 같은 자료형에 개수가 같다
	}
	
	public void test(String a,String b) {
		//두 메서드의 개수는 같지만 자료형이 다르기 때문에 오버로드를 지원한다
	}
	
	public void test (int a, String b) {
		
		
	}
	
	public void test (String b, int a) {
		
		//위처럼 순서를 바꿔도 서로 다른 메서드 취급을 한다
		//왜 이게 되는거야
	}
	
	
	//private void test (String b, int a) { 접근 제한자는 오버로딩에 영향을 주지 않는다
		
		//위처럼 순서를 바꿔도 서로 다른 메서드 취급을 한다
		//왜 이게 되는거야
	//}
	
	//public int test (String b, int a) { 반환형을 바꿔도 오버로딩에 영향을 주지못하니 여전히 오류가 걸린다
		
		//위처럼 순서를 바꿔도 서로 다른 메서드 취급을 한다
		//왜 이게 되는거야
	//	return 1;
	//}
	
	//시험을 볼때 오버로드로 인해 오류가 나오는 열 모든것을 전부 적어야 감점이 나지 않는다
	
}
