package Chap06_07.Ex06;

import Chap06_07.Ex05.External_Abc; //External_Abc가 외부 클래스여서 import해야한다.

public class Bcd {		//부모클래스
	public  int a =10;
	protected int b = 20;	//자식클래스에서 접근이 가능(다른 패키지에서 접근이 간ㅇ)
	int c = 30;
	private int d = 40;
	
	//생성자가 생략되어있다.
	//Bcd(){} <=== 기본 생성자 : 필드의 초기값을 부여해서 객체를 생성, 

	public void print1() {
		System.out.println(" 다른패키지에서 접근 가능: public");
	}
	protected void print2() {
		System.out.println("다른패키지에서 접근 가능 : 상속관계가 구성되어 있는 경우");
	}
	void print3() {
		System.out.println("같은 패키지에서 접근 가능: default ");
	}
	private void print4() {
		System.out.println("같은 클래스에서만 접근 가능 ");
	}
}
