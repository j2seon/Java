package Chap14.Ex09;

import java.util.Scanner;

class MinException extends Exception{
	public MinException() {
		super();
	}
	public MinException(String message) {
		super(message);
	} // ������
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
			throw new MinException("�̼������Դϴ�.");
		}else {
			this.age=age;
			System.out.println(age+" �����Դϴ�");
		}
	}
	void checkHeight(int height) throws overException{
		if(height<162) {
			throw new overException("��� �̴�"); 
		}else {
			this.height=height;
			System.out.println(height + " ����̻��Դϴ�.");
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
