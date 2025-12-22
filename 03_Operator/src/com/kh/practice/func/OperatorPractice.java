package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice01() {

		System.out.print("�ο� �� : ");
		int num1 = sc.nextInt();

		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();

		System.out.println("\n");

		System.out.println("1�δ� ���� ���� : " + num2 / num1);
		System.out.println("���� ���� ���� : " + num2 % num1);

	}

	public void practice02() {

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�г�(���ڸ�) : ");
		int year = sc.nextInt();

		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();

		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();

		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);

		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ� ����) : ");
		double grade = sc.nextDouble();

		System.out.println(year + "�г� " + group + "�� " + num + "�� " + name + " "
				+ (gender == 'M' || gender == 'm' ? "��" : "��") + "�л��� ������ " + grade + "�̴�.");

	}

	public void practice03() {

		System.out.print("���� : ");
		int num = sc.nextInt();

		System.out.print(num <= 13 ? "���" : (num <= 19 ? "û�ҳ�" : "����"));

	}

	public void practice04() {

		System.out.print("���� : ");
		int kor = sc.nextInt();

		System.out.print("���� : ");
		int eng = sc.nextInt();

		System.out.print("���� : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = sum / 3.0;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "�հ�" : "���հ�");

	}

	public void practice05() {

		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char ch = sc.nextLine().charAt(7);

		System.out.println(ch == '3' || ch == '1' ? "����" : "����");
	}

	public void practice06() {

		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean result = num3 <= num1 || num3 > num2;
		System.out.println(result);
	}

	public void practice07() {

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);

	}

	public void practice08() {

		System.out.print("A����� ���� : ");
		int A = sc.nextInt();

		System.out.print("B����� ���� : ");
		int B = sc.nextInt();

		System.out.print("C����� ���� : ");
		int C = sc.nextInt();

		double a = 0.4;
		double b = 0.0;
		double c = 1.15;

		double ma = (A * a) + A;
		double mb = (B * b) + B;
		double mc = (C * c);

		System.out.println("A��� ����/����+a : " + A + "/" + ma + "\n" + (ma >= 3000 ? "3000 �̻�" : "3000 �̸�"));

		System.out.println("B��� ����/����+a : " + B + "/" + mb + "\n" + (mb >= 3000 ? "3000 �̻�" : "3000 �̸�"));

		System.out.println("C��� ����/����+a : " + C + "/" + mc + "\n" + (mc >= 3000 ? "3000 �̻�" : "3000 �̸�"));

		// C����� ���ڳ� ��� ����� �ٸ� ������ ���� ������ ��Ȯ�ϰ� �Ϸ��� �ٲ۰��̴� ����� �۵��Ϸ��� A�� Bó�� ���� �ؾ��Ѵ�.
	}

	public void why() {

		System.out.print("2600 : ");
		int C = sc.nextInt();

		double c = 1.15;

		double mc = (C * c);

		System.out.println(mc + " / 2989.9999999999995 �� ���;� �Ѵ�");

	}
	
	
}
