package Chap19.Ex04;

public class Charator_EX1 {

	public static void main(String[] args) {
		
		//1. char ==> int�� ��ȯ
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //�ƽ�Ű�ڵ�� ���ִ�. //char : 2byte
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 ='Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch2_1 ='z';
		System.out.println(ch2_1);
		System.out.println((int)ch2_1);
		
		
		//2. char�� ���� (�ƽ�Ű�ڵ�)�� ������ �� �ִ�.
		
		char ch3 = 66;		//< == char�� ���� ������ ������ �����ϴ�.
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		
		int ch4 =65;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
	}
	
}
