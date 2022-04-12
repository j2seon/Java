package Chap10.Ex02;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {

	public static void main(String[] args) {
		//1. 업캐스팅(자동으로변환): 자식 ==>부모(자동으로 변환)생략시 컴파일러가 자동으로추가
		A ac = new C(); //C - >A : C는 A이다. ,ac는 A,B,C의 필드와 메소드를 모두포함 , A의 필드와 메소드만 접근가능
		A ab = new B(); // B - >A : B는 A이다. A,B의 필드와 메소드를 모두 포함, A의 필드와 메소드만 접근가능
		B bd = new D(); //D - >B : D는 B이다. A,B,D의 필드와 메소드가 포함, A,B의 필드와 메소드만 접근가능
		C c = new C();  //C-> C : C는 C이디ㅏ. , c는 ABC의 필드와 메소드가 포함, ABC의 필드와 메소드 접근가능 
	
		
		//객체생성을 할 수 없는 경우(상속)
		//B b =new A(); //오류 //A는 B다.
		//C cc1 = new B();
		//D dd1 = new B();
		//C cd = new D();
		
		//3. 다운 캐스팅 : 부모 =>자식(수동변환) : 캐스팅이 불간증하면(실행시 오류발생 : 런타임 오류)
		A aa=new A(); //aa는 A타입만 내포하고있다.
			//B b1 = (B) aa; //A--> 다운캐스팅(수동변환)<== 실행시 오류발생
		//java.lang.ClassCastEeception :다운캐스팅시 객체 내의 해당타입이 존재하지 않는경우
		//C c2= (C) aa; //aa는 C타입을 내포하지 않는데 다운캐스팅을 할 경우 <==실행시 오류(런타임오류)
		
		//컴파일 오류 : 프로그램을 실행전 이클립스가 체크
		//런타임오류 : 실행시 발생되는 오류
		
		//4. 다운 캐스팅이 가능한 경우 (수동변환) : 객체 내부에 자식데이터타입을 가지고 있으면 캐스팅 가능
		A ac3 = new C(); //ac3는 A,B,C포함
		B ac5 = (B) ac3; //A - > B
		C ac6 = (C)ac3 ; //A - > C
		
		A ad2=new D();//ad2는 A,B,D 포함.A만 사용가능
		B bd3=(B) ad2;
		D bd4=(D) ad2;

	}
	

}
