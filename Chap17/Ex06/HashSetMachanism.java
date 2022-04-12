package Chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : 중복된 값을 넣을 수 없다. 
	// equals() 메소드, hashCode()메소드가 정의 되어 있어야한다.
	// String, Integer 클래스는 equals()메소드와 hashCode()가 재정의 되어있다.
	// 특정 객체(내가 만든거나)를 Set에 저장할 경우 중복저장을 하지 못하도록 하기 위해서는 equals()와 hashCode() 메소드를 재정의 해야한다.
	//  Object 클래스에 equals() 메소드, hashCode()메소드가 있다.
		//Object 클래스의 equals()는 == 과 같다.
		//==은 Stack 메모리의 값을 비교.
 
//equals() hashCode() 재정의 되지 않은 상태 
class A{
	int data; 
	public A(int data) {
		this.data=data;
	}
}
//equals()는 재정의, hashCode()는 재정의 되지 않은 상태 

class B{
	int data; 		//두개의 객체가 data 필드의 값이 같을때, 동일하다라고 식별자를 넣어줘야한다.
					//equals(), hashCode() 두개를 재정의해야한다.
	public B(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) { //객체의 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정.
		if(obj instanceof B) { 	//obj에 B타입을 내하고 있을 때만 다운캐스팅
			if(this.data==((B)obj).data)		//주의 : 잘못 다운캐스팅을 할 경우: 예외가 발생됨.
				return true;
		}
		return false;
	}
}
//1.equals() hashCode() 재정의

class C{
	int data; 		//두개의 객체가 data 필드의 값이 같을때, 동일하다라고 식별자를 넣어줘야한다.
					//equals(), hashCode() 두개를 재정의해야한다.
	public C(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) { //객체의 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정.
		if(obj instanceof C) { 	//obj에 B타입을 내하고 있을 때만 다운캐스팅
			if(this.data==((C)obj).data)		//주의 : 잘못 다운캐스팅을 할 경우: 예외가 발생됨.
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {			//Objects.hash(필드명, 필드명,필드명)   <== 여러개의 필드의 해쉬코드를 같게 설정할 수있다.
		return Objects.hash(data);
		
		//return data;	//data필드의 값이 같으면  hashCode를 통일하게 생성.
	}
}


public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1.equals() hashCode() 재정의 되지 않은 상태 
		Set<A> hashset1= new HashSet<>();
		A a1 =new A(3);
		A a2 =new A(3);
		System.out.println(a1==a2);  //false
				// == : 스택메모리의 값을 비교한다. (주소를 비교한다.)
		System.out.println(a1); 	//객체명을 출력 : 패키지명.클래스명@힙메모리주소의 해쉬코드(16진수로) / Set은 중복된 값을 넣지 못한다.
		System.out.println(a2);
		
		System.out.println(a1.equals(a2)); //재정의가 안되어 있다. false, (Object equals()는 == 과 같다.)
		
		System.out.println(a1.hashCode()+","+a2.hashCode()); //10진수로 표현되었다.
		
		hashset1.add(a1); hashset1.add(a2);
		System.out.println(hashset1.size());   //2 < = equals()와 hashCode()메소드가 재정의 되어 있지 않다.
		
		//1.equals()는 재정의)(객체의 data필드의 값을 비교), hashCode() 재정의 되지 않은 상태 
		Set<B> hashset2 = new HashSet<>();
		B b1 =new B(3);
		B b2 =new B(3);
		
		System.out.println(b1 == b2); //Stack 메모리의 값을 비교. //false
		System.out.println(b1.equals(b2)); // equals를 재정의했기때문에 true
		
		hashset2.add(b1); hashset2.add(b2);
		System.out.println(hashset2.size()); //2   //equals()만 재정의, hashCode는 재정의하지 않음.
		System.out.println(b1.hashCode()+" , "+ b2.hashCode()); //다르다!!!!
		
		
		//1.equals() hashCode() 재정의
		Set<C> hashset3= new HashSet<>();
		C c1 =new C(3);
		C c2 =new C(3);
		System.out.println(c1==c2)  ;		//false, 스택의 주소
		System.out.println(c1.equals(c2)); // equals를 재정의했기때문에 true
		System.out.println(c1.hashCode()+","+c2.hashCode()); //data 필드를 기분으로 hashCode를 생성
				//두 객체는 동일한 객체이다.
		hashset3.add(c1);
		hashset3.add(c2);
		System.out.println(hashset3.size()); //1 equals()hashCode()가 재정의 되어있다. data필드에 대해서.
	}

}
