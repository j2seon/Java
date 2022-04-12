package Chap06_07.Ex02;

import java.security.PublicKey;

class B {
	 static String name = "BTS";  //static키가 할당이 되면 객체생성없이 호출가능
	
	 static void print() {
		System.out.println(name);
		System.out.println("static이 붙은 메소드입니다.");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		//메소드 오버로딩 : 하나의 메소드명에 매개변수타입,갯수에 따라서 각각 다른 메소드가 호출됨.(JAVA)
		//메소드 오버라이딩 : 상속에서 부모클래스에 메소드를 재정의 해서 사용.
		
		//static : 객체 생성없이 바로 호출해서 사용 가능하도록 할 수 있는 키워드
		//객체이름이 아니라 클래스 이름으로 호출해서 사용가능
	
		System.out.println(B.name); //객체이름이 아닌 클래스 이름으로 호출이 가능
		B.print(); //클래스 이름으로 호출
		
		System.out.println("=====================");
		
		print1(); 	// static가 들어가 있고 동일한 클래스에 생성된 메소드는 바로 호출 가능.
		print1(3);  // 매개변수가 1개이고 int타입의 메소드를 호출 
		print1(30.3); // 매개변수가 1개이고 double타입의 메소드를 호출
		print1(1, 4); //매개변수가 2개이고 int, int타입의 메소드 호출
		
		}
	//메소드 오버로딩 : 메소드 이름은 동일!!! , 매개변수 타입, 매개 변수개수에 따라 해당 메소드를 호출
	//JVM이 동일한 메소드 이름의 데이터 타입이나 갯수에 따라서 해당 메소드를 작동
	
	public static void print1() {		//static 없으면 오류발생 / 메소드 이름앞에 static : 
		System.out.println("데이터가 없습니다.");
	}
	public static void print1(int a) {
		System.out.println("정수 : "+a);
	}
	public static void print1(double a) {
		System.out.println("double : "+a);
	}
	//주의 : 동일한 매개변수 타입과 갯수가 같으면 오류를 발생 시킴
//	public static void print1(double k) { 
//		System.out.println("double : "+k);
//	}
	public static void print1(int a, int b) {
		System.out.println("a : "+ a+" b : "+b);
	}
	//주의 : 동일한 매개변수 타입과 갯수가 같으면 오류를 발생 시킴
//	public static void print1(int c, int d) {
//		System.out.println("c : "+ c+" d : "+d);
//}
	
}
