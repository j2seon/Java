package Chap06_07.Ex01;

//클래스(class) : 객체를 생성하기 위한 틀, 설계도, 붕어빵의 틀
//객체(Object) : 클래스를 복사해서 RAM에서 작동되는 실행코드(집, 붕어빵)
  //객체 = 인스턴스 , 인스턴스화(객체화)시킨다. (메인메소드에서 객체를 인스턴스화 시켜줘야한다.)
  // A a = new A();     <== 클래스를 객체화 시켜서 메모리에 로드

class A{  //외부클래스
	int m=3; 	// m: 필드(변수) : 클래스 블럭에서 선언된 변수를 필드라 호칭
				//필드는 인스턴스화(객체화)를 시켜야 사용할 수 있다.  //필드
				//필드는 메모리의 Heap영역에 생성 
	void print() {// 메소드 : 절차지향언어의 함수 ,객체지향언어에서 함수를 메소드라 호칭.
		System.out.println("객체 생성 및 활용");
	}
}

class B{ //외부 클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMember { // public클래스는 하나만!!
	//public이 위치한 클래스이름이 파일이름이다.
	public static void main(String[] args) {
		A a = new A(); //Class A를 객체화(인스턴스화) 시킨다.(RAM에 로드시킨다.)
		System.out.println(a.m);
		a.print();
		
		System.out.println("============");
		
		A b=new A(); //Class A를 객체화 (인스턴스화) 시켜서 RAM에 로드
		System.out.println(b.m);
		b.print();
		
		A c=new A();
		System.out.println(c.m); //.을 찍으면 해당 클래스에 있는 것들을 불러오게 할 수 있음.
		c.print(); 
		
		System.out.println("==============");
		
		B bb = new B();	//main메소드에서 B Class를 bb라는 이름으로 객체화(인스턴스)시킨다.
		  //new를 사용하는 순간 메모리에 class b를 틀로 bb라는 이름으로 스택에 로드시킨다.
		  //B클래스 안에 있는 필드 3개와 메소드 3개가 사용할 수 있게 됨.(힙에 위치하게됨)
		  // .을 찍으면 인제 호출할 수 있다!!!!
		bb.printName();  //bb객체의 메소드를 호출
		bb.printAge();	//bb객체의 메소드 호출
		bb.printPhone();	
		System.out.println(bb.name);
		
		B cc =new B();
		cc.printAge();
		cc.printAge();
		cc.printPhone();
		
		
	}

}
