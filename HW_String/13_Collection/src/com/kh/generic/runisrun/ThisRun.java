package com.kh.generic.runisrun;

import com.kh.generic.model.vo.Child1;
import com.kh.generic.model.vo.Child2;
import com.kh.generic.model.vo.GenericExtends;
import com.kh.generic.model.vo.Parent;
import com.kh.generic.run.GenericRun;

public class ThisRun {

	public void what () {
		
		GenericRun<Integer,String> g1 = new GenericRun<>();
		
		g1.setT(11111);
		g1.setG("asd");
		GenericRun.printTest("laskdjfh"); //제네릭 미지정시 Object로 들어가기에 모든게 다 들어간다
		GenericRun.printTest(1231254);
		
		GenericRun.<String>printTest("al;egfk");
		
		//GenericRun.<String>printTest(123124); // 앞에 제네릭을 지정하면 지정한 값이 아닌 다른 ㄱ밧을 받으려고할때
		//오류가 발생한다 // 곧 생산성이 증가하며 타입의 안정성이 크게 증가한다
		
		//대입될 데이터의 자료형을 미리 지정하지 않고 컴파일 ㄱ시점에서 내 맘대로 지정하여
		// 사용하므로 재사요성이 크게 증가하였다.
		
		/*
		 * 3,제네릭의 extends문법
		 * 
		 * 제네릭에서는 extends 가 클래스간의 상속 개념이 아닌 제네릭으로 지정한 자료형의 범위를
		 * "제한" 시키는데 사용한다.
		 * 
		 * <T extends Parent(특정 클래스)> : T타입변수 에는 Parent 클래스나 Parent클래스를 사ㅣㅇ속받은 자료형만 대입가능
		 * <T extends Interface>  :Interface를 구현한 클래스만 대입 가능
		 */
		
	}
	
	public static void main(String[] args) {
		
		GenericExtends <Parent> parent = new GenericExtends();
		GenericExtends <Child1> child1 = new GenericExtends();
		GenericExtends <Child2> child2 = new GenericExtends();

		//GenericExtends <String> child2 = new GenericExtends();
		//Parent 및 Parent를 상속받는 자료형이 아니기때문에 타입 설정 오류
		
		parent.setType(new Parent());
		parent.printing();
		
		child1.setType(new Child1());
		child1.printing();
		
		
		child2.setType(new Child2());
		child2.printing();
		
		
		
		/*
		 *  와일드카드 (?)
		 *  Generic 에 들어가야할 자료형을 모르는 경우 사용
		 *  와일드 카드는 ? 를 사ㅓ용하는데 어떤 자료형이 들어올지 모른다  (unLnown)의 의미로 사용하며
		 *  모든 자료형이 들어올 수 있다는 의미는 아니다
		 *  
		 *  ?는 extneds와 super예약어로 자료형의 범위를 제한할 수 있다.
		 *  
		 *  ? extends T : 상한제한 = 와일드카의 범위를 T 또는 T의 자식들로 제한한다
		 *  ? super T : 하한제한 = 와일드카드의 범위를 T 또는 T의 "조상"들로 제한한다
		 *  
		 *  학습전 : ? 는 똑같이 타입변수이니 대충 T 가 String이라면 == T 가 String이다 보다는 T가 어떤 클래스이냐 가더 중요하니 클래스별로 상솟ㄱㄱ받은ㄴ 그런ㄱ가본데
		 *  
		 *  
		 *  
		 */
		
		
		//?는 어떤 범위가 정해져 있지 않는 상황이다
		GenericExtends <?> unknown = new GenericExtends<>();
		
		//unknown.setType(new Parent()); 
		// ? 로 타입변수 사용시 올바른 값을 사용중인지 검사가 불가능하기 때문에 에러가 발생한다.
		// ?의 제대로된 사용을 위해선 extends 의 super 를 사욯하여 ?> 의 범위를 제한해야 한다.
		
		// extends를 통한 와일드카드 상한제한
		GenericExtends<? extends Parent> unknown2 = new GenericExtends();
		// ? 의 범위 : Parent, Parent의 자식
		
//		Child1 c1 = (Child1)new Parent();
//		Child1 c2 = new Child2();
		
//		unknown2.setType(new Parent()); // ? 의 범위에 Parent의 자식 Child1 , Child2 가 포함될 수 있으므로
		//대입 불가능한 상황이 생긴다
//		unknown2.setType(new Child1()); // ? 객쳉에 Child2도 포함되어 있으므로 대입불가능 상황이 생간다
//		unknown2.setType(new Child2());
		
		
		//unknown 2 가 Child1이든 child2 dlems ㅖㅁㄱ둣ems 다형성에 의해 값을 추출하여 대입 가능하다
		// 즉 extneds를 통한 상한 제한은 데이터를 가져올때 자주 사용한다.
		
		Parent p = unknown2.getType();
		
		
		//super를 통한 와일드 카드 범위의 하한 제한
		// ? super Parent : 와일드카드의 범위는 최하 Parent부터 최상 Object 
		//
		GenericExtends<? super Parent> unknown3 = new GenericExtends<>();
		//? 의 현재정의  : Parent + Object 끝
		
		unknown3.setType(new Parent());  
		unknown3.setType(new Child1());		//다형성의 업캐스팅으로 문제없이 저장 가능.
		unknown3.setType(new Child2());
		
		//값을 "대입"하곻자 할때는 super를 통한 하한제한을 사용하는 것이 적절하다.
		
		Parent p3 = unknown3.getType(); // 원래같으면 문제가 되는 데 // ? 는 Object일 수 있음 , 단 클래스 레벨 제네릭 설정시
		//T extends Parent로 설정했기 때문에 T의 범위는 Parent ~ Parent의 자식 클래스로 한정/
		
		
		//type변수에 Extneds 를 통한 타입 제한이 없는 경우 데이터는 항상 Object 현태로만 추출이 가능하다/
		Object o3 = unknown3.getType();

		
		
		
		
		
		
		
		
		
		
	}
	
	
}
