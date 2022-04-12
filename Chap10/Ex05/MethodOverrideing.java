package Chap10.Ex05;

class A{
	A(){} //기본생성자 : 클래스 내의 다른 생서ㅇ자가 존재하지 않을 경우 생략가능
	//인스턴스 메소드 : 상속 관계에서 메소드 오버라이딩
		//상속관계에서 인스턴스 필드, stack 필드, static 메소드는 오버라이딩 되지 않습니다.
		//오버라이딩 시 시그니쳐가 같아야한다.리턴타입, 메소드명, 매개변수 타입, 매개변수 갯수
	void print() {
		System.out.println("Class A 출력");
	}
}
class B extends A{
	@Override
	void print() {
	System.out.println("Class B 출력");
	}
}

class C extends A{
	@Override
	void print() {
			System.out.println("Class C 출력");
		}
	}


public class MethodOverrideing {

	public static void main(String[] args) {
		//1. A타입 A 생성자
		A a=new A();
		a.print();
		//2. B타입, B생성자
		B b = new B();
		b.print();
		//3. B타입, B생성자
		C c =new C();
		c.print();
		
		//4. A타입, B생성자(오버라이딩 되어 A의 print() 호출 시 , B의 print() 출력됨)
		A ab=new B();
		ab.print();			//A의 print()메소드를 호출 ===>B의 print가 출력
		
		A ac =new C();
		ac.print(); 		//A의 print()메소드를 호출 ===> B의 print가 출력됨
		
		
		A[] arr= {ab,ac};	//배열에 A 타입의 객체를 저장
		
		for (int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		System.out.println("=======================");
		for(A k: arr) {
			k.print();
		}
		
	}

}
