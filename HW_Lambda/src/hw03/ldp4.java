package hw03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ldp4 {

	
	public static void main(String[] args) {
//		
//		//MyFunction2<String,Integer> printer = (a,b);
//		
//		
//		printer.accept("홍길동", 95);
//		printer.accept("이순신", 88);
//		
		
		//set String
				/*
				 * 기존의 반복ㅇ은 조건문을 사용하여 자리하면 다양한 직업들을 람다식을 통해 제어가 
				 * 거눙헏ㅎㅀㄱ 다양한 메서드들을 탐제해 ㅜㄷ었다
				 * 가능한이ㅣㅆ도록 ㅔㅈ어

				 *
				 *
				 *스트림의 연산 메서드
				 *데이터를 처리하기위한 중간연산 메서더ㅡ들과 최종여ㅓㄴ산 메서드가 존재
				 *스트림의 데이터 처리 과정
				 *스트림 생성 및 초기화
				 *중간연산 n회 수행
				 *최종연산 1회 수행
				 *
				 *
				 *스트림 
				 *한버 ㄴ사용한 스트림은 재상용이 불가능하다
				 *스트링은 최종연산 메거드가 호출되가ㅣ 전까지 실제 연산 을 ㅜ샣ㅇ하지 않는다
				 *함께선의 기ㅏㅁㅁㅁㅁㅁㅁㅁㅁㅁ르비
				 *
				 *
				 *스트림 객체 생성 방법
				 *배열을 통한 스트림 생성
				 *배열을 선언 및 할당 , 초기화 수행 후 Arrays.stream()호출 == 배열데이터로 스트림 클래스생성가능
				 *
				 *컬렉션을 통한 스트림 생성
				 *컬렉션 생성 및 초기화 무 
				 *
				 *
				 *1.배열
				 */
				
				int[] arr = {1,2,3,4,5,6,7,8,9,10};
				
				IntStream intStream = Arrays.stream(arr);
				
				String[] sArr = {"단어1","단어2","단어3"};
				Stream <String> stream =  Arrays.stream(sArr);
		
				//컬렉션
				ArrayList<Integer> list = new ArrayList<>();
				Stream<Integer> arrayStream = list.stream();
				
				Set<Integer> set = new HashSet<>();
				Stream<Integer> setStream = set.stream();
				
				
				//Streamz dmf ltutkgkzdof
				//스트림의 반복문
				stream.forEach ((str) -> System.out.println(str));
				
				int sum = 0;
				for(int i : arr) {
					
					if(i % 2 == 0 && i % 4 == 0 ) {
						
						sum += i;
					}
				}
				
				//스트림을 통해 위 코드를 구형
				// filtrer 조건식의 결과가 t/f/가 나오는 람다식을 작성하는 증간연산 메서드
				IntStream iStream5 = intStream.filter(num -> num % 2 == 0).peek(num -> 
				System.out.println(num)).filter(num -> num % 4 == 0);
				//peek 은 현재 사용중인 스트림 값을 뽑는 메서드
				
				
				//sum 스트림 내부의 값을 모두 더해주는 최종연산 메서드
				
				int sum2 = iStream5.sum();
				System.out.println("sum2 : "+sum2);
				
				
	}
	
	
	
	@FunctionalInterface
	interface MyFunction2<K,A>{
		
		void accept(K k,A a);
		
	
		
	}
	
}
