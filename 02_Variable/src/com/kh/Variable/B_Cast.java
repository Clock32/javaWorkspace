package com.kh.Variable;

public class B_Cast {
	
	/*
	 * (�ڷ�) ����Ȳ : ���� �ڷ����� �ٲٴ� ����
	 * 
	 * ��ǻ���� �� ó�� ��Ģ
	 * �� ���� �����Ҷ��� �ϻ� ���� �ڷ������θ� �����ؾ��Ѵ�
	 * ���� �����̳� �������� �ڷ����� �ٸ��ٸ� ������ ����ȯ�� �ؾ��Ѵ�
	 * 
	 * �� ��ȯ�� ����
	 * 
	 * 1. �ڵ� ����ȯ
	 * - �ڵ����� ����ȯ�� ����Ǳ� ������ ���� ���� ����ȯ�� �� �ʿ䰡 ����
	 * - ���� ����Ʈ�� �ڷ��� -> ū ����Ʈ�� �ڷ���
	 * 
	 * 2. ���� ������
	 * -�ڵ� ����ȯ�� �Ұ����� ��� ���� ���� ����ȯ �����ڸ� ����Ͽ� ��ȯ
	 * -ū ����Ʈ�� �ڷ��� => ���� ����Ʈ�� �ڷ���
	 */
	
	public void autoCasting() {
		
		// 1. int -> double 4 -> 8
		int i1 = 10;
		double d1 = i1;  //�ڷ����� �ٸ����� �ڵ� ��ȯ�� �����ϴ�
		System.out.println("d1 : "+d1);
		
		int i2 = 1000;
		double d2 = 3.3;
		double result = i2+d2; //�翬�� ������ ū�ɷ� �׷��� i2 �� d2 �� ��ȯ�� ���� �ý��������� double result = (double) i2+d2;
		
		System.out.println("result : "+result);
		
		// 2. int -> long 4 -> 8
		int i3 = 1000;
		long l3 = i3; //long l3 = (long) i3
		
		// &Ư��& 3. long -> float   8 -> 4 �� �����ɷ� ��ȯ�ϴµ� �̰͸� �ڵ���ȯ �ۿ��Ѵ�
		
		long l5 = 1000000000L;
		float f5 = l5;  //�Ǽ��� ����ǥ��� : 4byte ¥�� float���� ���� ǥ����� ����ϸ� ǥ���Ҽ��ִ� ���� �������������� �������� �׷��� 8 -> 4 �ӿ��� �ڵ� ����ȯ�� �߻��Ѵ�
		
		// &Ư��& 4. char <-> int
		char ch = 65;
		System.out.println("ch : "+ch);
		
		int num = 'A';
		System.out.println("num : "+num); //char �� �ϳ��� ���ڸ� ���ڴ� �� �����̴� �����ϴ� -�����ڵ�- ����ǥ�� 65�� = A - ����ǥ�� �� = 54728 cpu�� ���忡�� �����ض�
		
		// &Ư��& 5. byte�� short
		byte b1 = 17;
		byte b2 = 17;
		
		byte b3 = (byte)(b1+b2); //�̻��ϰ� java�� byte �� byte���� ���� Ȥ�� short���� ���� ����� �׻� int�� ����Ѵ� - �ڵ�����ȯ�� �Ǿ���ϴµ� �ȵǼ� ������ ������Ѵ� 
		
	}
	
	public void forceCasting() {
		
		//1. double -> float
		
		float f1 = 4.0f;
		double d2 = 8.0;
		
		float f2 = (float)d2;
		
		// 2. double -> int
		double d3 = 10.89;
		int i3 = (int)d3;
		
		System.out.println("f2 : "+f2);
		System.out.println("i3 : "+i3);
	
		int iNum = 10;
		double dNum = 5.89;
		
		int iSum = (int) (iNum+dNum);
		int iSum2 = iNum+(int)dNum;
		
		//int iSum = iNum+dNum; 
		/*
		 * �ذ��� 1 - �������� int �� ���� ���� �� ��ȯ -- ���� - 10 + 5.89 = ���� �Ҽ��� ����
		 * int iSum = (int) (iNum+dNum); 
		 * 
		 * �ذ��� 2 - ���� ���� ���� dNum�� int�� ���� ��ȯ -- ���� 10 + (5.89 ���� �Ҽ��� ����)
		 * int iSum = iNum+(int)dNum;
		 * 
		 * 
		 */
	}
}
