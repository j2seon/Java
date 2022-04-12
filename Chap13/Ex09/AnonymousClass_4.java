package Chap13.Ex09;

//4. 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스 X,

interface A {
	void abc();	//public abstract
}
class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c =new C(); //cde() 호출을 위해 객체 생성
		//3. 인터페이스를 구현한 클래스X 참조변수O를 만들어서 전달 
		A a =new A () { 	//인터페이스를 구현한 자식 익명 객체 생성 후 타입을 A로 지정한 참조변수 생성
			@Override
			public void abc() {
				System.out.println("클래스 X + 참조변수 O");
			} 
		};
		c.cde(a); //참조변수를 매개변수로 전달
		//4. 인터페이스를 구현한 클래스X 참조변수(X)   <<===제일 많이 사용한다!!(임시로 한번만 사용할 때)
			//이벤트 처리 시 사용한다.
		c.cde(new A(){ 
			@Override
			public void abc() {
				System.out.println("클래스가 X 참조변수 X");
			}
		});
		
	}

}
