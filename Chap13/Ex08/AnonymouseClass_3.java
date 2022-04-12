package Chap13.Ex08;

// 클래스 정의 및 참조변수를 사용 / 미사용인 경우 매개변수 값으로 객체를 전달

interface A{
	public abstract void abc();
}
//1. 자식클래스를 직접 생성
class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}
class C {	//cde 메소드에 인풋값으로 A 타입의 객체 a를 인풋으로 받는다.
	void cde(A a) { 	//cde 매소드를 호출하면서 매개변수로 A타입의 객체를 전송
		a.abc();
	}
}

public class AnonymouseClass_3 {

	public static void main(String[] args) {
		C c =new C(); 	//1. 방법 : 클래스명 0 + 참조변수명 0 
		
		A a=new B(); 	// 참조변수 생성 클래스명(A),참조변수생성(e)<=====첫번째방법
		
		c.cde(a);  //매개변수에 객체 a를 생성해서 던져줌.
		
		System.out.println("=================================");
		
		// 2. 방법 : 클래스 명 0 + 참조변수명 x
		c.cde(new B());
	}

}
