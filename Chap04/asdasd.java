package Chap04;

import java.util.Arrays;

class A{
	int a=2;
	static int b=3;
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void abc1() {
		System.out.println(b);
	}
}
 
public class asdasd {
	public static void main(String[] args) {
	A a= new A() ;
		a.abc();
		
	}


}
