package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	
	/*
	 * 컬렉션(Collection)
	 * 자료구조가 내장되어있는 클래스로 자바에서 제공하는 자료구조를 담당하는 프레임워크
	 * 
	 * 자료구조
	 * 방대한 데이터들을 효율적으로 다룰때 필요한 개념
	 * 
	 * 프레임 워크
	 * 효율적인 기능들이 정의되어있는 틀
	 * 
	 * 
	 * 데이터들이 새롭게 추가되거나 삭제가되거나 수정이 되는 기능들을 이미 정의해놓은 틀이다
	 * 
	 * 배열과 컬렉션(List)의 차이점
	 * 
	 * 
	 * 배열의 담점
	 * -같은 지료형 데이터만 저장가능.
	 * -배열의 크기를 수정할 수 없다.
	 * -배열내부의 값들을 조작하기 불편하다
	 * 
	 * -컬렉션의 장점
	 * -여러 자료형의 값을 저장할 수 있다 제네릭 설정을 통해 한가지 유형의 데이터만 저장 가능하다 - 되는 이유 오브젝트 객체배열을 사용해서 가능하다
	 * -중간에 값을 추가하거나 삭제하는등 배열 내부의 값들을 조작하기위한 편리한 메서드가 정의되어있다.
	 * -크기에 대한 제약이 없다. - 알아서 배열복사를 해주기때문에 크기에 대한 제약이 없다
	 * 
	 * 
	 * 컬렉션의 3가지 분류
	 * List계열
	 * -담고자하는 값만을 저장
	 * -값을 저장시 순서를 유지한다 (index 존재)
	 * -중복값을 담아도 산관없다ㅣ.
	 * (굉장히 많이 사용된다 )ArryaList ,Vector, LinkedList 등이 존재
	 * 
	 * Set계열
	 * 담고자 하는 값만 저장
	 * 값 저장시 순서를 유지하지 않는다 index가 없다
	 * 중복값을 허용하지않는다
	 * HashSet , TreeSet
	 * 
	 * Map 계열
	 * 담고자 하는 값Value과 그 값을 저장하는 키Key 를 함계 저장
	 * 값 저장시 순서를 유지 하지 않느다 index X
	 * 키 값의 중복은 허용하지 않은 Value 의 중복은 허용한다
	 * HashMap Peroperties ...
	 * 
	 * 
	 * 
	 *  위에 Hash 들어가있는 것들은 전ㅂ ㅜHashcode를 사용해서 만드는거고 공통된 장저ㅗㅁ ---------빠름_----
	 */
	public static void main(String[] args) {
		
		
		//ArrayList al = new ArrayList(); //크기 10배열;
		
		// List al = new ArrayList(); 참조변수라 이게 더ㅚㄴ디
		
		/*
		 * 제네릭 ( <E> )
		 * 별도의 제네릭 설정 없이 컬렉션 객체 생성시 제네릭은 object로 설정된다
		 * 제네ㄱ릭을 설정하면 성정한 타입의 값들을 컨랙션에 담을 수 있다.
		 * 
		 * 제네릭을 사용하는 이유
		 * - 명시한 타입의 객체만 저장가능하도록하여 :타입의 안정성을: 확보하기 위해서
		 * - 컬렉션에 저장된 객체를 꺼내서 사용할때 직접 형변환하는 작업을 업애기 위해서
		 */
		
		ArrayList<Music> list = new ArrayList<>(3); //객체 생성시에는 제네릭을 생략 가능하다 '타입 추론 기능' (3) = 크기3칸짜리 배열을 만들어라
		
		//null null null
		System.out.println(list); // 출력 : [] -- size기준 내용 출력
		
		//add(E e) : 리스트의 끄에 전달된 e 를 추가시켜주는 메서드
		
		list.add(new Music("Music01","who"));
		list.add(new Music("Music02","how"));
		list.add(new Music("Music03","why"));
		System.out.println(list);
		
		//add(int index , E e )
		// 리스트에 전달되는 index값 위치에 e 를 추가하는 메서드
		
		list.add(0,new Music("Music00","what"));
		System.out.println(list);
		
		//리스트의 중간이나 앞에 값을 추가할때는 깊은복사하고 앞에넣고 어쩌저쩌 엄청 오래걸리고 메모리도 많이잡아먹으니
		//리스트뒤에 넣는게 아니라 앞이나 중간에 뭘 넣을거면 ArrayList말고 다른걸 썽라
		
		//3. set(int index , E e) // add는 추가이고 set 은 변경이다 헷갈리지마라
		//리스트에 해당 인덱스의 값을 전달되는 e로 변경시켜주는 메서드
		//
		list.set(0, new Music("순정","코요태"));
		System.out.println(list);

		//4. remove(int index) : 리스트에 인덱스 위치의 값을 삭제 시키는 메서드
		list.remove(1); // 1번 인덱스 삭제
		System.out.println(list);
		
		//5. size() 
		// 리스트에 초기화돤 데이터 수를 반환하는 메서드
		System.out.println("리스트에 담긴 데이터 수 : "+list.size());
		//출력 리스트에 담긴 데이터 수 : 3 // 하지만 배열의 크기는 4 
		
		//6.get(int index) : E
		//리스트에서 index위치의 값을 반환해주는ㅌ 메서드
		
		Music m = list.get(0);
		
		System.out.println(m);
		
		//만약 제네릭 설정을 안했다면?
		Music m1 = (Music) list.get(0); //강제 형변환 필요 //다운캐스팅
		
		ArrayList <Integer> Iarr  = new ArrayList<>(3); //int 담고싶으면 클래스인 Integer를 널어라
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		System.out.println(Iarr);
		
		//7. contains(E e) : boolean
		// 
		System.out.println(Iarr.contains(9));
		
		
		//8. indexOf(E e) : int
		//매게인자 요소가 몇번 인덱스에 있는지 그 값을 반환한다(없다면 -1)
		
		System.out.println(Iarr.indexOf(900));
		
		//1). list를 활용한 반복문 
		//
		System.out.println("=========================================================================================================");
		for(int i = 0; i < list.size();i++) { //배열의 크기가 1000 이어도 최기화된 값까지만 돌린다 그러니 3
			
			System.out.println(list.get(i));
			
		}
		System.out.println("=========================================================================================================");
		//2). 향상된 반복문
		for( Music mus : list ) { //향상된 반복문은 접근만할때
			
			System.out.println(mus);
			
		}
		System.out.println("=========================================================================================================");
		//  Iterator 반복자
		// 컬렉션 내부 인자를 Iterator 에 닫아서 관리하는 방식
		
		Iterator<Music> iter = list.iterator(); // 다 util을 임포트
		while(iter.hasNext()) {
			
			Music m5 = iter.next(); //Iterator 에 저장된 값을 꺼내는 함수
			//iter.remove(); //삭제하는 메서드
			System.out.println(m5);
			
		}
		//System.out.println(list);
		
		System.out.println("=========================================================================================================");
		
		//9. sublist(int index , int index2) 1부터 2 까지 untill 2는 포함 안됨
		// index1에서부터 index2 까지 데이터를 추출한 새로운 subList를 반환하는 메서드
		List<Music> list2 = list.subList(0, 1);
		System.out.println(list2);
		
		System.out.println("=========================================================================================================");

		//10. addAll(Collection c)
		// 리스트에 컬렉션에 있는 데이터를 모두 추가해주는 메서드.
		list.addAll(list2);
		System.out.println(list.size());
		
		//11. isEmpty()
		// 리스트가 비어있는지 체크하는 메서드
		
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		
		//12. clear()
		// 리스트에 저장한 모든 값을 비워주는 메서드
		list.clear();
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		
		
		
	}
	
	
	
}
