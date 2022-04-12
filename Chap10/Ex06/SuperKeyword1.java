package Chap10.Ex06;

//super : 부모클래스(상속관계에서 부모를 가르킴) 
//this : 자심의 객체
//오버 라이딩 : 부모의 메소드가 완전히 삭제되지 않았음.


class A{
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}
class B extends A{
	void abc () {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		abc();
		super.abc(); //this.abc생략 //this는 자신의 객체
	}
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		// 1. 객체 생성
		B bb= new B();
		//2.메서드 호출
		bb.bcd(); //B클래스의 
	}

}
