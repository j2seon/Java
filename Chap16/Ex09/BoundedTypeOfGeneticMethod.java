 package Chap16.Ex09;

import Chap14.Ex10.MyException;

//제너릭 메소드의 범위 지정 :

class A{ //일반클래스 
	
	//Number : Boolean, Character를 제외한 6개 타입(Byte, Short,Integer, Long, Float,Double)
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue()); //Number 타입의 메소드. t.intValue(): 정수만 출력!!
	}
}

interface Myinterface{
	void print(); //public abstract가 생략.
}

class C implements Myinterface{  //인터페이스를 구현한 클래스 
	@Override
	public void print() {
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
	
}



class B {   	//제너릭 타입 내부에서 인터페이스를 적용할 때는 extends 키를 사용한다.
	public <T extends Myinterface> void method2(T t) { //T에 타입이 올 수 있는 것은 Myinterface 를 구현한 클래스만 올수 있다.
		t.print();
	}
}

class D{
	public <T extends String> void abc(T t) {
		System.out.println(t);  			//String toString 메소드가 재정의 되어있다.
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGeneticMethod {

	public static void main(String[] args) {
		A a =new A();  //일반 클래스 객체 생성 후 제너릭 메소드 호출
		
		a.<Double>method1(5555.55); 
		a.method1(22.2);  // 매개변수로 던지는 값이 타입을 식별할 수 있는 경우 생략 가능.
		a.<Long>method1(1000L);  //Long
		a.<Float>method1(100.555555F);  //Float
		//a.<Booldean>method1(true); //오류발생
		
		B b =new B(); //		//Method2에 매개변수로 올 수 있는 것은 인터페스타입, 인터페이스를 구현한 자식클래스
		//인터페이스를 구현한 내부 익명클래스 
		b.<Myinterface>method2( new Myinterface() {
			
			@Override
			public void print() {
				System.out.println("print() 익명클래스로 출력");
			};
		});
		b.<Myinterface> method2(new C()); //매개변수로 인터페이스를 자식 객체를 넣을 수 있다,
		
		//익명클래스로 제너릭 메소드 호출 후 매개변수로 던져주기 

		b.method2(new Myinterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처라된 클래스 출력");
			}
			
		});
		D d =new D();
		d.<String>abc("안녕");
		d.abc("하세요");
	}

}
