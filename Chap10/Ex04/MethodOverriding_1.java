package Chap10.Ex04;

class Animal{
	void cry() {}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("짹쨱");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		// 1.각각의 타입으로 선언+ 각각의 타입으로 생성.
		Animal aa= new Animal();
		Bird bb=new Bird();
		Cat cc=new Cat();
		Dog dd=new Dog();
			aa.cry(); 		//Animal 클래스의 cry
			bb.cry();		//Bird의 cry
			cc.cry();		//Cat의 cry
			dd.cry();		//Dog의 cry

		//2. animal  타입으로 선언 + 자식타입으로 생성 : 동적 바인딩에 의해서 부모의 cry()를 호출한 경우
				//오버로딩된 메소드로 바인딩 됨.
		Animal ab = new Bird(); //Animal,Bird 타입을 내포 Animal필드와 메소드만 접근
		Animal ac = new Cat();  //ac는 Animal,Cat타입을 내포, Animal필드와 메소드만 접근
		Animal ad = new Dog();  //ad는 Animal,dog타입을 내포, Animal필드와 메소드만 접근
			
			ab.cry(); 	//Animal의 cry()를 호출할 경우 동적바인딩에 의해서 Bird의 cry()호출
			ac.cry();	//Animal의 cry()를 호출할 경우 동적바인딩에 의해서 Bird의 cry()호출
			ad.cry();	//Animal의 cry()를 호출할 경우 동적바인딩에 의해서 Bird의 cry()호출
			
		//3. 객체 배열로 관리
			
		Animal[] animal = {ab,ac,ad};
		//객체타입 배열 배열이름={객체,객체,객체}
		for(Animal k:animal) {
			k.cry();
		}
		System.out.println("=============");
		for(int i=0; i<animal.length; i++) {
			animal[i].cry();
		}
	}

}
