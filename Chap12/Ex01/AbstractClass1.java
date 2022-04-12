package Chap12.Ex01;

class AA{	//일반클래스 : 객체 생성 시 필드와 메소드는 Heap메모리에 저장
			// Heap : 반드시 초기화!
			// 필드는 : heap에 필드명과 값
			// 인스턴스 메소드 : 클래스영역의 인스턴스 영역에 메소드의 구현코드까지 저장
				// 인스턴스 메소드의 경우 Heap에 포인터정보(위치값)만 가진다.
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;
	
	void cry() {} //완전한 메소드
	@Override
	public String toString() {
		return a+","+b+","+c+","+d+","+e+","+f+","+g;
 	}
}

//1. 추상클래스를 객체화해서 출력하는 방법 1
	//상속을 통해서 자식클래스를 생성 후 자식클래스에서 추상메소드를 재정의하고, 자식클래스를 객체로 생성 후 출력
	//많은 객체를 생성해서 사용	<===계속 사용할 경우 
//2. 추상클래스를 객체화해서 출력하는 방법 2
	//자식클래스 생성없이 main 메소드에서 익명 객체를 생성해서 출력하는 방법
	//임시로 한번만 사용할 떄는 자식객체를 생성할 필요없이 임시로 사용할 경우
	//이벤트 처리할 때 (임시)

abstract class A {		//추상클래스
	abstract void abc(); // 추상메소드 (미완성 메소드) : 구현부가 존재하지 않는 메소드 
}
class B extends A{ //추상클래스를 구현한 객체 : 빈번하게 사용할 경우
	@Override
	void abc(){
		System.out.println("방법 1 : 자식클래스 생성 및 추상클래스 구현");
	}
	
}


public class AbstractClass1 {
	public static void main(String[] args) {
		//1. AA 클래스는 객체화가 가능하다. 
		AA aa = new AA(); //필드 : 초기화, 일반메소드(구현부가 존재하는 메소드)
		System.out.println(aa); //위에서 toString으로 정의해준 값이 나온다.
								//객체를 생성하려면 반드시 Heap영역에 값이 반드시 있어야한다.
		
		//2. 추상 메소드는 객체 생성 불가 : 메소드가 미완성 메소드이기 떄문
		//A a =new A(); //객체 생성이 불가, 추상메소드를 포함하기 때문
		
		//3. 추상클래스가 구현된 자식클래스 생성, 객체를 여러개를 생성 할때
		A a1 = new B();  //자식클래스를 생성, 타입은 부모타입
		A a2 = new B();
		A a3 = new B();
		
		//4. 메소드 호출 
		a1.abc();   //A의 abc()호출 ==> B의 abc() 작동 (오버라이딩에 의해서)
		a2.abc();
		a3.abc();
	
	}

}
