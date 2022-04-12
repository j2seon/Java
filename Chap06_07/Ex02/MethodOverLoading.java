package Chap06_07.Ex02;

import java.security.PublicKey;

class B {
	 static String name = "BTS";  //staticŰ�� �Ҵ��� �Ǹ� ��ü�������� ȣ�Ⱑ��
	
	 static void print() {
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ��Դϴ�.");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű�����Ÿ��,������ ���� ���� �ٸ� �޼ҵ尡 ȣ���.(JAVA)
		//�޼ҵ� �������̵� : ��ӿ��� �θ�Ŭ������ �޼ҵ带 ������ �ؼ� ���.
		
		//static : ��ü �������� �ٷ� ȣ���ؼ� ��� �����ϵ��� �� �� �ִ� Ű����
		//��ü�̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��밡��
	
		System.out.println(B.name); //��ü�̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print(); //Ŭ���� �̸����� ȣ��
		
		System.out.println("=====================");
		
		print1(); 	// static�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ�� ����.
		print1(3);  // �Ű������� 1���̰� intŸ���� �޼ҵ带 ȣ�� 
		print1(30.3); // �Ű������� 1���̰� doubleŸ���� �޼ҵ带 ȣ��
		print1(1, 4); //�Ű������� 2���̰� int, intŸ���� �޼ҵ� ȣ��
		
		}
	//�޼ҵ� �����ε� : �޼ҵ� �̸��� ����!!! , �Ű����� Ÿ��, �Ű� ���������� ���� �ش� �޼ҵ带 ȣ��
	//JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
	
	public static void print1() {		//static ������ �����߻� / �޼ҵ� �̸��տ� static : 
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print1(int a) {
		System.out.println("���� : "+a);
	}
	public static void print1(double a) {
		System.out.println("double : "+a);
	}
	//���� : ������ �Ű����� Ÿ�԰� ������ ������ ������ �߻� ��Ŵ
//	public static void print1(double k) { 
//		System.out.println("double : "+k);
//	}
	public static void print1(int a, int b) {
		System.out.println("a : "+ a+" b : "+b);
	}
	//���� : ������ �Ű����� Ÿ�԰� ������ ������ ������ �߻� ��Ŵ
//	public static void print1(int c, int d) {
//		System.out.println("c : "+ c+" d : "+d);
//}
	
}
