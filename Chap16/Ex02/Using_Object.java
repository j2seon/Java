package Chap16.Ex02;


//Object는 모든 객체를 저장할 수 있다.
//상품을 저장하는 클래스에 Object 타입으로 저장하면 모든객체를 담을 수 있다.
//Object의 장점 : 모든 객체를 담을 수 있다.(casting)
		// 단점 : 매번 다운캐스팅을 해서 출력해야한다.
		// 약한 타입 체크 : 실행시 ClassCastException이 발생

class Apple{ //사과 클래스
	String name;
	int price;

	Apple(String name,int price){  //생성자
		this.name=name;
		this.price=price;
	}
	public void abc() {
		System.out.println("abc()메소드 출력");
	}
	
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아닌 필드의 정보를 출력. 
		return "이름 : " + name+" , " +"가격 : "+ price;
	}
}
class Pencil{ //연필클래스 
	String name;
	int price;
	public Pencil(String name,int price) { //생성자를 통해서 필드의 값 할당.
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아닌 필드의 정보를 출력. 
		return "이름 : " + name+" , " +"가격 : "+ price;
	}
}

class Goods{ //Object를 사용해서 모든 상품을 저장할 수 있다.
	
	private Object obj =new Object();   // Object: 모든클래스는 Object 타입으로 변환

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {  // Object타입으로 업캐스팅됨.
		this.obj = obj;
	}
}

public class Using_Object {
	public static void main(String[] args) {
		
		//1.Apple을 저장 후 출력. Object
		Goods goods1 =new Goods();
		goods1.setObj(new Apple("사과 3 ", 4000));
		System.out.println((Apple)goods1.getObj());
		((Apple)goods1.getObj()).abc(); //다운캐스팅을 해야하는 이유!  Apple 클래스에 다른 메소드,필드를 활용할수 있기 때문!!
		
		//2.Pencil을 저장후 출력 
		Goods goods2 = new Goods();
		goods2.setObj(new Pencil("연필 3",2000));
		System.out.println((Pencil)goods2.getObj());

		//3. 잘못된 캐스팅을 할 수 있다 (약한 타입 체크) : Object의 문제점.
		Goods goods3 =new Goods();
		goods3.setObj(new Apple("사과 4 ", 5000));
//		System.out.println((Pencil)goods3.getObj()); //약한타입체크  실행 시 오류발생
	}

}
