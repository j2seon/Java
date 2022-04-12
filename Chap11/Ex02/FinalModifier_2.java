package Chap11.Ex02;

//final 메소드와 final class의 특징
  /*final매서드 : 오버라이딩이 불가 : 아주 중요한 메서드는 자식에서 재정의하지 못하도록 설정
   * - 자식클래스가 부모클래스를 재정의해서 사용하면 부모클래스의 기능이 없어지게된다. 따라서 아주 중요한 메소드는 변경하지 못하게 한다.
   *  final 클래스 : 상속이 불가한 클래스
   */

class A {
	void abc() {}
	final void bcd() {} //final이 할당된 메소드는 자식클래스에서 오버라이딩 할 수 없다
}
class B extends A {
	void abc() {} 		//메소드 오버라이딩 됨 : 부모의 메소드 기능을 자식에서 새롭게 기능 구현 가능
	//void bcd() {}		//메소드 오버라이딩 불가함.
}
final class C{}  	//final class는 상속이 불가한 클래스 

//class D extends C{}

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
