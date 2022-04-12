package Chap14.Ex09;

import java.util.Scanner;

class MinException extends Exception{
	public MinException() {
		super();
	}
	public MinException(String message) {
		super(message);
	} // 음수값
}

class overException extends Exception{
	public overException() {
		super();
	}
	public overException(String message) {
		super(message);
	}
}

class AA{
	int age;
	int height;
	void checkAge(int age) throws MinException{
		if(age<20) {
			throw new MinException("미성년자입니다.");
		}else {
			this.age=age;
			System.out.println(age+" 성인입니다");
		}
	}
	void checkHeight(int height) throws overException{
		if(height<162) {
			throw new overException("평균 미달"); 
		}else {
			this.height=height;
			System.out.println(height + " 평균이상입니다.");
		}
	}
}

public class ddd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AA aa =new AA();
		try {
			int c=sc.nextInt();
			aa.checkAge(c);
		} catch (MinException e) {
			System.out.println(e.getMessage());
		}
		try {
			int d=sc.nextInt();
			aa.checkHeight(d);
		} catch (overException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

