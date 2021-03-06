package Chap10.Ex07.Ex03;

import java.util.HashMap;
//HashMap : key =값으로 저장되는 자료구조.
	//key는 중복될 수 없다.
	//HashMap에 Key에 객체를 저장할 경우, key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장을 해야한다.
	//Object 클래스의 hashcode()를 사용해서 객체가 key에 저장될 경우 중복되지 않도록 설정할 수 있다.

class A{
	String name; 
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		}else {
			return false;
		}	
	}
	@Override
	public String toString() {
		return name;

	}
}

class B{			//hashCode()+equals() 재정의
	String name; 
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		}else {
			return false;
		}	
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}
public class ObjectMethodhashcode {
	public static void main (String[] args) {
		
		HashMap<Integer,String>hm1 = new HashMap<>(); //<Integer<==key, String<==value>
		hm1.put(1,"데이터1");
		hm1.put(1,"데이터2"); 		//1 : 데이터 1 ===> 데이터 2
		hm1.put(2,"데이터3");
		
		System.out.println(hm1); //1=데이터1, 2=데이터 3
		
		System.out.println("====================");
		
		HashMap<A,String>hm2 =new HashMap(); 		//equals()만 재정의 되어있다.
		hm2.put(new A("첫번째"), "데이터1");				//hashCode()재정의 안되엉 있다.
		hm2.put(new A("첫번째"),"데이터2");
		hm2.put(new A("두번째"),"데이터3");
		
		System.out.println(hm2);		//HashMap이 잘못 구현된 경우 > 하나의 키만 있어야함.
		
		System.out.println();
		
		HashMap<B,String>hm3 =new HashMap<>(); //hashCode()+equals() 재정의 ==> 동일객체
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"),"데이터2");
		hm3.put(new B("두번째"),"데이터3");
		System.out.println(hm3); //HashMap에 구현이 제대로 설정된 경우 :key가 중복되면 안된다.
		//hm3(HashMap)는 toString()가 재정의 되어있다.
		
		System.out.println("첫번째".hashCode());
		System.out.println("첫번째".hashCode());
		System.out.println("두번째".hashCode());
		
	}
}

