package Chap12.Ex02;

//interface 구현한 클래스,
	//overriding: 완전한 메소드를 자식클래스에서 새로정의하는 것.
	//implements : (인터페이스를 구현)미완성메소드를 완성시키는 것.
	//extends :(상속) 부모클래스의 기능을 상속받아서 자신의 기능을 추가해서 확장
interface AA{
 	void cry(); //추상 메소드(미완성), Public abstract 생략됨
	void run(); //추상 메소드(미완성),
}

class BB implements AA{

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("qjsk");
	}

}
public class Interface_2 {

	public static void main(String[] args) {

		BB aa=new BB();	//BB: 인터페이스의 미완성 메소드를 구현한 클래스
		aa.run();
	
	
	}

}
