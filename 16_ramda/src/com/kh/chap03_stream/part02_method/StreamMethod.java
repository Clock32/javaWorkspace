package com.kh.chap03_stream.part02_method;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethod {

	public static void main(String[] args) {
		/*
		 * 
		 * 스트림의 중간연산 및 최종연산 메서드들
		 * 
		 * 중간연산 메서드 1) distinct : 중복값 제거 2) filter : 내부요소 필터링 3) map : 데이터 변환 peek : 궁간
		 * 확인 메서드 sort : 정렬 메서드 ........... 더 많은데 이것만 적었다 ............
		 * 
		 * 최종연산 메서드들 Iterating 계열 : forEach Collecting 계열 : collect(Collector.메서드) 스트림
		 * 내부 요소를 내가 원하는 계열의 컬렉션으로 반환
		 * 
		 * Calculating 계열 : min, max, sum, avarage 등 산술 연산 관련된 최종 처리 메서드들 (기본 자료형 스트림에만
		 * 존재)
		 * 
		 * Matching : anyMatch,allMatch,noneMatch ... 스트링 내부 요소에서 특정 조건을 만족하는 요소를 선택하기
		 * 위해 사용
		 * 
		 * Reduction 계열 : reduce 메서드를 통해 요소 내부의 값을 다양한 방법으로 연산 후 결과값을 반환하는 메서드
		 * Calculating 계열에서 제공하지 않는 연산 기능을 수행할때 사용한다
		 */

		// 중간연산 메서드 (distinct , filter , (반복문)forEach)

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 87, 1, 23, 1);

		Stream<Integer> stream = list.stream();

		stream.distinct().filter(i -> i % 2 == 1).forEach(System.out::println);

		String[] names = { "강감찬", "감원래", "홍길동", "강형욱", "이연복" };

		Arrays.stream(names).filter(name -> name.startsWith("강")).forEach(System.out::println);

		// map : 현재 스트림 요소를 다른 요소로 바꾸는 메서드

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

		list2.stream().map((i) -> i + "!") // Stream <String> 으로 바뀐다
				.forEach(System.out::println);

		// mapTo (int/double/long) : Stream 을 기본자료형 스트림으로 변경해주는 메서드.

		// Arrays.stream(names).mapToInt(name -> names.toString())
		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		//
		Map<Integer, String> result2 = list4.stream().distinct().collect(Collectors.toMap(i -> i, i -> "#" + i + "#"));
		System.out.println(result2);

		// Collect계열 메서드

		List<Integer> newList = list2.stream().map((i) -> i * 100).collect(Collectors.toList());
		System.out.println(newList);

		// Calculating 계열
		// 산술연산자를 ㅏㅅ용하는 메서드들로 기본 자료형 스트림에 존재
		// sum()
		int sum = IntStream.rangeClosed(1, 100).sum();

		// avg()
		double avg = DoubleStream.iterate(1, i -> i + 1).limit(100).average()// 반환형이 Optional이였다
				.getAsDouble();

		//

		int result3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
				// 펏번째 매개변수 : 초기값을 저장하는 변수
				// 두번째 매개변수 ㅣ 스트림 내부 ㅇ소
				.reduce(0, (sum2, n) -> {
					System.out.println("sum2 : " + sum2);
					System.out.println("n : " + n);

					return sum2 + n;
				});

		int result4 = Arrays
				.asList(1, 2, 3, 124, 1241, 21, 523, 523, 64, 4326, 232, 14124, 124, 4, 152, 1463, 346, 3, 154).stream()
				.reduce(0, (max, n) -> {
					return max < n ? n : max;
				});
		System.out.println(result4);

		
		////////////////////////////////////////////////////////////////////////////////////
		class Member {

			String name;
			int age;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public Member(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return "Member [name=" + name + ", age=" + age + "]";
			}

		}

		List<Member> arr = Arrays.asList(new Member("홍길동", 35), new Member("신사임당", 40), new Member("세종", 45),
				new Member("홍난파", 80), new Member("전달력", 69));
		
		//멤버 객체에서 최 고령자 구하기
		
		int maxP = arr.stream().map(m1 -> m1.age)
				//초기값 생략시 스트림의 첫버내 요소가 초기값으로 설정
				.reduce((m1,m2) -> {
					
					return m1 < m2 ? m2 : m1;
					
				}).get();
		// 초기값을 생략하는경우 반환형이 Optional이 된다
		System.out.println(maxP);
		
		//Membver 객체배열 arr에서 모든 회원의 나이의 합 구하기
		
		int sumP = arr.stream().map(m -> m.age).reduce(0,(sum3,n) -> {
			
			return sum3+n;
			
		});
			System.out.println(sumP);
			
			
			//match 계열
			//anyMatch
			//	stream의 요소들 중 하나라도 true 가 나오면 true
			boolean bool = Arrays.asList("1","b2","c","d4","5").stream()
								 .anyMatch(str -> str.startsWith("b"));
			
			
			//noneMatch : 스트림의 요소 모두가 false 이면 true를 반환하는 메서드
			
			bool = Arrays.asList("허민혁","123","가나다").stream().noneMatch(s -> s.length() > 4);
			
			
			
			//allMatch : 모든 요소가 true 여야만 true
			
			bool = Arrays.asList("허민혁","123","가나다").stream().allMatch(s -> s.length() < 4);
			
			
			//find first : 스트림 요소중 조건을 만족하는 첫번째 요소를 찾은 후 반환
			
			String s5 = Arrays.asList("허민혁","111","11111","1가나다").stream().filter(s1 -> s1.startsWith("1"))
					.findFirst().get();
				
			
			System.out.println(bool);
			System.out.println(s5);
			
			
			
			// findAny : 스트림 요소가 하나라도 존재한다면 해당 요소를 즉시 반환
			
			String str = Arrays.asList("허민혁","123","아무렇게").stream().filter(s -> s.length() <4).findAny().get();
			
			
			System.out.println(str);
	}
}
