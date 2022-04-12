package Chap11.Ex06;

abstract class Animal { 	//추상클래스 : 추상메소드가 하나이상 포함되어 있는 경우
							//추상클래스는 객체 생성 불가 , 타입은 사용 가능
							//자식클래스는 부모 클래스의 메소드를 구현 시 오류를 방지 
							//추상클래스는 추상클래스 내의 추상메소드를 자식클래스에서 반드시 구현하도록 보장받는다.
	String name;
	int age;
	
	abstract void cry(); //추상메소드 : 구현부가 없는 메소드
		//void cry(){}  	< === 일반메소드: 리턴타입 메소드이름(입력매개변수){구현코드}
	abstract void run();
	@Override
	public String toString() { //객체 자체를 출력시 메모리의 정보를 출력
		return "이름 : "+name+", 나이 : "+ age+ "살";
	}
	
}

class Cat extends Animal{		//Cat은 Animal상속 일부만 상속한 경우 추상클래스,
								//모든 추상메소드를 구현한 경우 콘크리트(완전히 구현된) 클래스
	Cat(){};
	Cat(String name, int age){
		super.name=name;
		super.age=age;
	}
	@Override
	void cry() {	//추상 메소드를 구현한 메소드
		System.out.println("야옹");		//구현부
	}
	@Override
	void run() {
		System.out.println("네발로 뛰어다닙니다.");
	}
	
}

class Tiger extends Animal{
	Tiger(){};
	Tiger(String name, int age){
		super.name=name;
		super.age=age;
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}

	@Override
	void run() {
		System.out.println("네발로 빠르게 뛰어다닙니다.");
	}
}

class Eagle extends Animal{
	Eagle(){};
	Eagle(String name, int age){
		super.name=name;
		super.age=age;
	}
	@Override
	void cry() {
		System.out.println("끼오오오오오 하고 웁니다");
	}

	@Override
	void run() {
		System.out.println("하늘을 납니다.");
	}
}


public class AbstractModdifier_Quiz {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이" , 10);
		Animal a2 = new Tiger("호랑이",5);
		Animal a3 = new Eagle ("독수리", 15);
		
		//1. Animal 배열 객체에 저장 후 
		Animal[] array= {a1,a2,a3};
		
		//2. for 문을 사용해서 객체를 출력시 이름과 나이 출력 .run() .cry()
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);	//객체 출력, Animal의 toString()
			array[i].cry();	 	//객체의 오버라이딩된 메소드 출력
			array[i].run();		//Animal의 cry(), run()======> 오버라이딩(자식의 cry(),run())
			System.out.println("====================");
		}
		System.out.println();
		System.out.println("========향상된 for===========");
		//3. 향상된 for문
		for(Animal k : array) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
	}

}
