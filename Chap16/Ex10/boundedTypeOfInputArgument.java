package Chap16.Ex10;

//일반 메소드에서 매개변수에서 값의 제한

class A{}
class B extends A{}
class C extends B{}
class D extends C{}


class Goods<T>{ //제너릭 클래스 
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
 
class Test {		//일반 메소드들, 매개변수로 들어오는 타입이 제너릭 타입 
	void method1(Goods<A> g) {} //g의 매개변수로 A클래스 타입만 전송
	void method2(Goods<?> g) {} //g의 매개변수로 A,B,C,D클래스 타입만 전송
	void method3(Goods<? extends B> g) {} //g의 매개변수로 B,C,D클래스타입만 전송
	void method4(Goods<? super B> g) {} //g의 매개변수로 A,B클래스 타입만 전송
}

public class boundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test t =new Test();
		
		//1.method1 : 
		t.method1(new Goods<A>());  	//정상 작동
	  //t.method1(Goods<B>()); 			//오류
	  //t.method1(Goods<C>()); 			//오류
	  //t.method1(Goods<D>()); 			//오류
		
		//2. method2 :
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3.method3 (Goods<? extends B> g) : B,C,D
		//t.method3(new Goods<A>());  //오류
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//method4(Goods<? super B> g)
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		//t.method4(new Goods<C>());
		//t.method4(new Goods<D>());
	}

}
