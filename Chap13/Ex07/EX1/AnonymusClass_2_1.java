package Chap13.Ex07.EX1;

//2.인터페이스의 추상메소드를 구현한 <<<익명내부클래스>>>후 호출 : 한번만 사용하는 경우 

interface A{ //인터페이스, 추상메소드를 정의 ,
	public abstract void cry(); 	//추상메소드 ==> 인터페이스는 따로 적지 않아도됨 인터페이스가 미완성이라서 
	void fly();		//public abstract
}
class B{
	A a =new A() {  //인터페이스는 객체화 할수 없다. 하지만 익명 내부 클래스를 생성해서 구현 가능!!!
		//A 인터페이스를 구현한 자식 클래스 블락 : 클래스 이름이 없다.(컴파일러가 랜덤한 이름으로 자동으로 할당.)
		public void cry() { //public 은 생략하는 경우가 많다.
			System.out.println("왈왈");
		};	
		public void fly() {
			System.out.println("날지 못해~");
		};
	};		 
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymusClass_2_1 {

	public static void main(String[] args) {
		 B b =new B();
		 b.abc();
	}

}
