package Chap10.Ex06.EX01;


//자식 객체를 생성할때 부모클래스의 기본 생성자를 먼저 호출 : super()
//모든 자식객체의 생성자에는 super()가 생략되어있다.
class A {
	
	A(){
		System.out.println("A클래스의 기본생성자입니다.");
	}
	A(int a){
		System.out.println("A클래스의 매개변수 정수 1 생성자 : "+ a);
	}
	A(int a,int b){
		System.out.println("A클래스의 매개변수 정수 2 생성자 : "+a+", "+ b);
	}
}
class B extends A{
	B(){
//		super(5,3);
		System.out.println("B클래스의 기본생성자");
	}
	B(String a){
		super (3,5);
		System.out.println("b 클래스의 문자열 1 입력" + a);
	}
}
class C extends B{
	C(){
		super("c에서 호출");
		System.out.println("C클래스의 기본 생성자");
	}
}

public class SuperMethod2 {

	public static void main(String[] args) {
		C c =new C();
	
	}

}
