package Chap13.Ex06;

//1.인터페이스의 추상메소드를 구현한 <<<클래스>>>를 생성 후 호출 : 빈번하게 사용하는 경우 

interface AA{ //인터페이스, 추상메소드를 정의 ,
	public abstract void cry(); 	//추상메소드 ==> 인터페이스는 따로 적지 않아도됨 인터페이스가 미완성이라서 
	void fly();		//public abstract
}
class BB{
	AA a =new C();
	void abc() {
		a.cry();
		a.fly();
	}
	class C implements AA{ //class C는 AA인터페이스의 메소드를 구현한 클래스
		@Override
		public void cry() {
			System.out.println("멍멍");
		}
		@Override
		public void fly() {
			System.out.println("날지 못합니다.");
		}
	}
}

public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		/* 직접 접근해서도 가능하네~
		 * BB b=new BB();
		BB.C c=b.new C();
		c.cry();
		c.fly();*/
		//바로 BB만 꺼낼때 사용할 수 있는 방법
		BB b = new BB();
		b.abc();
	}

}
