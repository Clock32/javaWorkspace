package com.kh.chap01.after.model.vo;


/*
 *  [접근제한자] class 클래스명 extends 클래스명 {}
 *  ^ 상속 표현법
 * 
 */
public class Desktop extends Product{

	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		
		/*
		 * 상속 메모리 구조 보여주기
		 	부모 객체 필드의 값 초기화하기
		 	
		 	방법 1 : 자식 클래스에서 부모클래스의 필드에 접근 가능하도록 접근제한자를 수정 - protected (같은 패키지 / 상속 한정 다른패키지까지)
		 	ㅂ
		 	
		 */
		
		//부모 클래스의 필드
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		
//		//현재 객체의 필드
//		this.allInOne = allInOne;	
		
		// 방법1번은 직접 접근이라 아무도 이렇게 안쓴다
		
		/*
		 * 방법 2번 부모 클래스에 있는 setter메서드 사용
		 */
		
//		setBrand(brand);
//		setpCode(pCode);
//		setpName(pName);
//		setPrice(price);
		//1번보다는 안전하지만 잘 안쓴다
		
		/*
		 * 방법 3 : 부모생성자 호출하기
		 * 위와같은 방법의 코드는 **항상** 가아아아장 위에 있어야만 한다 - 상속된것을 사용하기때문에
		 * 
		 * super = 부모의 주소값이 담긴 변수
		 * this = 자신의 주소값
		 */
		super(brand,pCode,pName,price);
		
		this.allInOne = allInOne;
		
		
		
	}

	
	
				//게터세터는 boolean의 경우 에 "만" getAll---이 아니라 isAll---처럼 is 를 사용한다
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	

	public String information() {
		
		return super.information()+", "+allInOne;
		      //기본값은 this 이니 무한반복문이 실행된다 // 식별자를 super. 로 바꿔주어 부모 클래스에 정의해놓은 information을 사용하게 한다
			// 오버라이트 == 부모클래스와 자식클래스의 메서드의 이름이 동일할때 생기는 케이스
	}
	
	
}
