package Chap12.Ex04;

//인터페이스 상속 시 자식클래스 접근지정자 오류  <<중요>>
	//인터페이스의 메소드를 구혈 할떄 반드시 public을 사용해야한다.
interface A{
	public abstract void abc();
}
class F implements A{  //F클래스는 완성된 메소드가 구현되어 있어야함. //미완성된걸 완성시켜야한다.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	} 
	
}

interface B{
	void abc(); //Public abstract가 생략되어있음.
}
class C implements A{
	public void abc() {	 //A인터페이스의 abc()를 오버라이딩 해서 구현한 메소드 
					 // 자식은 부모보다 접근지정자가 크거나 같아야한다.
	}
}
class D implements B{
	public void abc() { //인터페이스의 메소드를 구현할떄는 반드시 public 접근지정자를 사용해야한다.
		
	}
}

class E implements B{
	@Override
	public void abc() {
		
	}
}

public class Interface_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


