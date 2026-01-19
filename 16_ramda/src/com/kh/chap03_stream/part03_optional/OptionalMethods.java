package com.kh.chap03_stream.part03_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethods {

	
	public static void main(String[] args) {
		
		/*
		 * Optional
		 * 	자바 8버전부터 추가된 클래스로 , 스트림에서 NPE . 기타 에러상황ㅇ들을 방지하기 위한 용도로 사용하나느 클래스
		 * Optional은 데이터를 직접 다루는 대신 optional 객체를 통해 간접적으로 다룬다
		 * Optional을 객체로 사용할 때 Optional 내부에 데이터가 있는지 없는지 항상 확아니하는 절차를 강제 함으로써 에러를 방지한다
		 * Optional 객체를 변수에 저장하여 관리하는 경우 , 변수명에 maybe , opt와 같은 Optional 타입을
		 * 암묵적으로 제시한다.
		 * 
		 */
		
		/*
		 * Optional 객체 생성 방법
		 * Optional.empty() : 내부적으로 값이 비어ㅏ있는 옵셔널 객체 생성
		 * Optional.of(obj) : 결고 null이 아닌 객체를 담은 옵셔널 객체 생성
		 * Optionmal.ofNullable(obj) : 널 일수도 있는 옵셔널 객ㅊ[ 생성
		 * 
		 * Optinal 객체 내부 메서드들
		 * get() : Optional 내부의 값을 반환하는 메서드 값이 없다면 NoSuchElement 예외 발생
		 * getAs자료형() : 해당 자료형의 값을 반환하는 메서드
		 * orElse(T) : get()으로 꺼낼 값이 존재하지 않을 경우 반환할 값.
		 * orElseGet(Suppleier) : get()으로 꺼낼 값이 존재하지 않을 경우 람다식을 통해 구현한 값을 반환
		 * orElseThrow(suppleier) : get()으로 꺼낼 값이 없을때 람다식을 통해 구현한 에러 객ㅊ를 호출하는 방법
		 * 
		 */
		
		
		OptionalMethods on = new OptionalMethods();
		
		//on.test1();
		
		on.test2();
		
		
		
		
		
	}
	
	public void test1() {
		
		List <String> list = Arrays.asList("홍길동","신사","",null);
		
		list.stream().forEach(s -> System.out.println(s+" : "+getStringLength(s)));
		
		
		
	}
	
	public int getStringLength (String str) {
		
		Optional <String> maybeStr = Optional.ofNullable(str);
		
		
		
		
		
		return maybeStr.map(s -> s.length())
				//.orElse(0);
				.orElseThrow(() -> new RuntimeException());
	}
	
	
	public void test2 () {
		
		Member member = new Member();
		member.setEmail("asd@nae.com");
		
		Order order = new Order();
		order.setMember(member);
		
		System.out.println(getEmailOfMemberFromOrder(order));
		System.out.println(getEmailOfMemberFromOrder(null));
		
		
		
		
	}
	
	public String getEmailOfMemberFromOrder(Order order) {
		
//		//최대한 안전하게 email 추출하기
//		
//	if(order != null) {
//		
//		Member member = order.getMember();
//		if (member != null) {
//			
//			String mail = member.getEmail();
//			return mail;
//		}
//		
//	}
//	
//	return "Email이 존재하지 않습니다.";
		
		//Optional을 통해 안전하게 Email값 추출하기
		
		return Optional.ofNullable(order)
						.map(o -> o.getMember())
						.map(m -> m.getEmail())
						.orElse("이메일이 존재하지 않습니다.");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	static class Order {
        Member member;
        int count;
        public Order() {
        }
        public Member getMember() {
            return member;
        }
        public void setMember(Member member) {
            this.member = member;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public Order(Member member, int count) {
            super();
            this.member = member;
            this.count = count;
        }
        @Override
        public String toString() {
            return "Order [member=" + member + ", count=" + count + "]";
        }
    }
    static class Member {
        String id;
        String email;
        public Member() {
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Member(String id, String email) {
            super();
            this.id = id;
            this.email = email;
        }
        @Override
        public String toString() {
            return "Member [id=" + id + ", email=" + email + "]";
        }
    }
	
	
}
