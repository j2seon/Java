package Chap06_07.Ex05;

//같은 패키지 내에서 class A를 접근

public class Ex_A {

	public static void main(String[] args) {
		// A class는 같은 패키지 내부에 존재하므로 import없이 사용 가능
		A a =new A();		//import 없이 사용: A class가 같은 패키지 내에 존재

		a.m = 10; //A class의 접근 제어자가, default
		a.n = 20;
		a.print();	//default 접근 제어자이므로 접근 가능
		
		
	}

}
