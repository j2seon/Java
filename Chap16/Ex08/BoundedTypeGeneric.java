package Chap16.Ex08;

class A {}
class B extends A {}
class C extends B{}

//제너릭 타입의 클래스 :제너릭 타입에 들어오는 객체를 제한.
class D <T extends B>{ //T :class B class C 만 올수있다  //B로 제한을 둔 상태
						//<T extends B> 의미 : T 타입에 접근을 제한.
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}	
}

public class BoundedTypeGeneric {
	public static void main(String[] args) {
		//D<A> d1 =new D<A>(); // 불가능 : <T>의 들어갈 객체를 제한을 둠, B 클래스와 C클래스만 타입지정이 가능하다.
		D<B> d2 =new D<B>();	//B,C를 타입으로 설정가능 
		D<C> d3= new D<C>();	//
		
		D d4=new D();	//D 생성자로만 생성했을때 =D(B) D(C) /타입을 지정하지않고 객체 생성시 최상위 타입으로 설정됨!
						//=D<B> d2 =new D<B>();
		
		d2.set(new B()); //B타입의 객체 저장. 
		d2.set(new C()); //C객체 저장.
		//d2.set(new A()); //오류
		
		
		d3.set(new C());   //d3는 C타입만 넣을 수 있다.
		//d3.set(new B());	//오류

		//d4.set(new A()); //오류 발생
		d4.set(new B());
		d4.set(new C());
		
	}
	

}
