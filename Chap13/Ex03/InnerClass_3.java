package Chap13.Ex03;

//static 이너클래스 : 외부 클래서의 인스턴스 필드, 인스턴스 메소드 접근이 불가능.
			//외부 클래스의 static 필드나 static 메소드는 접근이 가능하다.

class A{
	int a =3; //인스턴스 필드
	static int b=4; //static 필드, 객체 생성없이 접근, 객체 생성 후 접근
	void method1() { 		//인스턴스 메소드 : 객체 생성 후 접근
		System.out.println("Instance Method");
	}
	static void method2() {
		System.out.println("Static Method");
	}
	static class B { //static 이너클래스 : 외부객체를 생성하지 않고 호출이 가능
		void bcd() {
			//1. static 클래스에서 외부클래스의 인스턴스 필드 접근 (접근불가)
			//System.out.println(a);//외부클래스의 인스턴스 필드
			System.out.println(b);//static 이너 클래스에서 외부클래스의 static 필두나 메소드 접근가능
			
			//2.메소드 호출
			//method1(); //호출불가
			method2();
		
		}
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		//1. Static 이너클래스 객체생성
		A.B b = new A.B(); 		//static 이너클래스는 외부 객체 생성없이 객체생성
		b.bcd();
		
	}

}
