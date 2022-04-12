package Chap10.Ex05;

class AAAA{
	static void print() { 		//static ㅔㅁ소드 : 오버라이딩 되지 않는다.
		System.out.println("A 클래스");
	}
}
class BBBB extends AAAA {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		//1. 객체 생성없이 호출	
		AAAA.print();
		BBBB.print();
		System.out.println("=======");
		//2. 객체 생성 후 호출 
		AAAA aaaa= new AAAA();
		aaaa.print(); //A
		BBBB bbbb= new BBBB();
		bbbb.print();//B
		AAAA aabb=new BBBB();
		aabb.print();//A 오버라이딩 안됌!
	}

}
