package Chap12.Ex01;

abstract class D{ 	//클래스 내부에 추상메소드가 올 경우 abstract클래스가 되어야한다.
					//자식클래스에서 반드시 오류없이 메소드를 재 정의하는 것을 보장
	abstract void print();		//추상메소드, 구현부가 없이 선언만 된 메소드
} 

class E extends D{		//자식클래스는 추상클래스의 메소드를 재정의.
	@Override
	void print() {
		System.out.println("E 클래스의 print()");
	} 	
}


public class AbstractClass_3 {

	public static void main(String[] args) {
		//1.객체화 해서 출력 (객체 3개)
			//매번 자주사용하는 경우
		D d1 = new E(); //자식클래스 생성자를 호출해서 부모타입으로 생성.
		D d2 = new E();
		D d3 = new E();
			//메소드 호출
			d1.print();
			d2.print();
			d3.print();
		
		//2.익명클래스를 생성해서 출력
			// D dd1 =new D(); <== xxx 추상클래스는 객체화 될 수 없다!!!!
		D dd =new D() {
			void print() {
			System.out.println("E클래스의 print()");
			}
		};
		System.out.println("===========");
		dd.print();
		
		D dd1=new D() {
			@Override
			void print() {
				System.out.println("익명클래스");
			}
		};
		D dd2= new D () {
			void print() {
				System.out.println("익명클래스~~");
			}
		};
		dd1.print();
		dd2.print();
	}

}
