package Chap13.Ex08.EX01;
//3. 매소드의 매개변수로 전달 : 
	// 3-1 : 객체 생성 후 전달하는 매개 변수로 전달 (클래스명 O + 참조변수 O) 
	// 3-2 : 객체 생성 후 전달하는 매개 변수로 전달 (클래스명 O + 참조변수 X)

interface A{ //인터페이스, 추상메소드를 정의 ,
	public abstract void cry(); 	//추상메소드 ==> 인터페이스는 따로 적지 않아도됨 인터페이스가 미완성이라서 
	void fly();		//public abstract
}
class B implements A {	//B는 A 인터페이스를 구현한 클래스 
	@Override
	public void cry() {
		System.out.println("멍멍 : 매개변수 전달");
		}
	@Override
	public void fly() {
		System.out.println("날지 못합니다 : 매개변수 전달");
	}
}
class C {	//C 객체에 abc 메소드 호출 시 A 타입을 매개변수로 받는다.
	void abc(A a) { //하위 자식클래스가 매개변수로 들어올 경우 A타입으로 업캐스팅이 된다.
		a.cry();
		a.fly();
	}
}
public class Anonymous_3_1 {

	public static void main(String[] args) {
		//1. 클래스가 존재 O + 참조변수 O
		C c =new C();
		A a=new B();	//B를 객체화해서 A타입으로 생성, a : 참조변수
		
		c.abc(a);
		System.out.println("==================");
		//2.클래스가 존재 O + 참조변수 X
		c.abc(new B());
		
	}

}
