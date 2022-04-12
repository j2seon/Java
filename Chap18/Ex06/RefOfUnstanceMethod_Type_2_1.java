package Chap18.Ex06;

interface A{
	void abc(B b, int k);
}

class B{
	void bcd(int k) {		//인스턴스 메소드 : 
		System.out.println(k);
	}
}

public class RefOfUnstanceMethod_Type_2_1 {

	public static void main(String[] args) {
		// 인스턴스 메소드 참조  Type2
		//익명 이너클래스
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		}; 
		//람다식 표현
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		//인스턴스 메소드 참조
		A a3= B::bcd;		//인스턴스 메소드나 B 객체를 인풋받아서 bcd 메소드 호출
			//1. 객체명 ::메소드명;
			//B - 정적메소드 호출일때 , 인스턴스메소드지만 매개변수로 B객체가 들어갈때 사용가능
		
		B b= new B();
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
	}

}
