package Chap10.Ex07.EX02;

class A{
	String name;
	A(String name){
		this.name=name;
	}
}

class B {
	String name;
	B(String name){
		this.name=name;
	}
	@Override			//b1.equals(b2)
	public boolean equals(Object obj) { //객체를 매개변수로 넣을때 object타입으로 자동업캐스팅
		if(this.name == ((B)obj).name) { //B타입으로 다운캐스팅 후 각 객체의 name 필드의 값을 비교.
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectMethod_equals {

	public static void main(String[] args) {
		//1.객체 생성
		A a1 =new A("안녕");
		A a2= new A("안녕");
		/*두객체 비교(==, equals())
			//== : 기본타입일 경우 값을 비교해서 true,false리턴 
				 : 참조타입일 경우 객체의 번지를 비교
			equals():기본적으로 object클래스의 eqauls() 객체의 번지를 비교 
					객체내부의 트겆ㅇ 필드의 값을 비교하기 위해 재정의해서 사용한다.
				 */
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1 == a2);  //false
		System.out.println(a1.equals(a2));  //false
		
		System.out.println("======================");
		B b1 =new B("안녕");
		B b2=new B("안녕");

		System.out.println(b1==b2);
		System.out.println(b1.equals(b2)); //true //equals()를 재정의 하면서 name 필드의 값을 비교.
	
	}

}
