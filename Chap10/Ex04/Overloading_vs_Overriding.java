package Chap10.Ex04;

//메소드 오버로딩 : 동일한 메소드 이름으로 (매개변수 타입, 매개변수 수에 따라 해당 메소드가 호출)
/*상속과는 관련 없다. 생성자에서 많이 사용한다.
 * 
 * 메소드 오버라이딩 : 반드시 상속관계에서 사용.
 * 부모의 메소드를 자식에서 새롭게 정의해서 사용.
 * 1.상속관계 2. 메소드의 시그니쳐가 같아야한다(메소드명, 매개변수 갯수 매개변수 타입)
 * 자식에서 부모의 접근제한자과 같거나 더 넓은 범위여아한다.	*/


class Ab{
	void print1() {
		System.out.println("Ab클래스의 print1()");
	}
	void print2() {
		System.out.println("Ab클래스의 print2()"); 
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("Bc클래스의 print1");
	}
	void print2(int a) { //오버로딩
		System.out.println("Bc클래스의 print2");
	}
}
public class Overloading_vs_Overriding {

	public static void main(String[] args) {
		// 1. Ab타입 선언 
		Ab aa = new Ab(); 
		aa.print1(); // Ab클래스의 print1 호출 
		aa.print2(); // Ab클래스의 print2 호출
		System.out.println("================");
		
		//2. Bc 타입 선언, 생성자 호출 Bc
		Bc bb=new Bc();
		bb.print1(); //Bc클래스의 print1()
		bb.print2(); //Ab클래스의 print2()호출 : 부모클래스의 메소드 호출
		bb.print2(3);//Bc클래스의 print2(3) 호출: 자식클래스의 메소드 ㅗㅎ출
		System.out.println("================");

		//3. Ab타입으로 선언 + Bc 타입 생성자 호출
		Ab cc= new Bc();
		cc.print1(); // 메소드 오버라이딩이 되어 있으므로 동적 바인딩에 의해서 Bc의 print1 호출
		cc.print2(); // Ab클래스의 메소드만 호출이 가능
		
		
		
		
		
	}

}
