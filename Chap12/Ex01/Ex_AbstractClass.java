package Chap12.Ex01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}
class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("야옹");
	}
	
	@Override
	void fly() {
		System.out.println("날지 못함");
	}
}
class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("끼오오");
	}
	
	@Override
	void fly() {
		System.out.println("날수있음");
	}
}


public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. 자식클래스 Cat,Eagle 클래스를 생성 후 출력 
		Abc a = new Cat();
		Abc b = new Eagle();
		
		a.cry();
		a.fly();
		b.cry();
		b.fly();
		
		
		//2. 익명 클래스 생성 후 출력,
		Abc a1=new Abc() {
			void cry(){
				System.out.println("고양이는 야옹야옹");
			}
			void fly() {
				System.out.println("고양이는 날지 못함");
			}
		};
		Abc a2 =new Abc() {
			void cry() {
				System.out.println("독수리는 끼오오");
			}
			void fly() {
				System.out.println("독수리는 하늘을 남");
			}
		};
		System.out.println("===================");
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		
	}

}


	

