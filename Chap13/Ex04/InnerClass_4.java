package Chap13.Ex04;

//지역 이너클래스 : 클래스의 메소드 내부에 선언된 클래스 
	//메서드 내부의 키는 final이기 때문에 값을 수정할 수 없다.
	//지역 이너클래스에서 사용되는 지역변수는 자동으로 final로 선언된다.

class A{
	int a=3;
	void ccc() {//지역변수
		int a =3; //지역변수
		a = 4; //a 변수의 값을 
		int b;
		
		System.out.println(a);
		//System.out.println(b); //b는 초기 값을 할당하지 않았음.
	}
	void abc() {
		int b = 5; //지역변수 : 메소드 내부에 선언된 변수 (final이 컴파일러에 의해서 할당됨.)
					//final 키가 컴파일러에 의해서 자동으로 할당
		int c =10;
		c=20; //사용 안한 경우는 상관없음!
		class B{	//지역이너클래스
			void bcd() {
				System.out.println(a);  //필드
				System.out.println(b);  //지역변수
				 a=5; //필드는 값 수정이 가능
			//	 b=7; //지역클래스 내부에 선언된 지역변수는 자동으로 final키가 컴파일러에 의해서 할댱됨.
			}
		}
		B bb=new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
	// 
		A a=new A();
		a.abc();
	}

}
