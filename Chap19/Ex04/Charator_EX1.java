package Chap19.Ex04;

public class Charator_EX1 {

	public static void main(String[] args) {
		
		//1. char ==> int로 변환
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //아스키코드로 들어가있다. //char : 2byte
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 ='Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch2_1 ='z';
		System.out.println(ch2_1);
		System.out.println((int)ch2_1);
		
		
		//2. char에 정수 (아스키코드)로 저장할 수 있다.
		
		char ch3 = 66;		//< == char에 정수 값으로 저장이 가능하다.
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		
		int ch4 =65;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
	}
	
}
