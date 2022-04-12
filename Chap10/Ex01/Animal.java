package Chap10.Ex01;

class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다");
	}
}

class Dog extends Animal{
	int dog;
	void dogEat() {
		System.out.println("개는 잡식성입니다.");
	}
}

class Dogsub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("dog의 자식 클래스입니다.");
	}
}

class Eagle extends Animal{
	int eagle;
	void ealgeFly() {
		System.out.println("독수리는 날라다닙니다.");
	}
}


public class Animal {
	String name;	 // 동물의 이름
	int age;		 // 동물의 나이
	String color;	 //동물의 색깔
	
	void eat () {
		System.out.println("모든 동물은 음식을 먹습니다.");
	} 
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	public static void main(String[] args) {
		
		// 업캐스팅은 다형성으로 처리하기 때문에 아주아주 효율적으로 프로그램밍을 처리할 수 있다.
			//다형성 : 오버라이딩을 이용해서 상속에서 하나의 메소드로 여러정보를 처리할 수 있다.
		
		//1. Animal 클래스 객채화
		Animal a1 = new Animal(); //자기자신의 필드와 매소드접근가능
		
		//2. Dog 클래스를 Dog 타입으로 객체화
		Dog d1=new Dog();  //animal,dog의 필드와 메소드 접근
		//3.dog를 animal 타입으로 업캐스팅
		Animal a2= new Dog();	//Dog는 Animal,Dog를 내포하고 있고, Animal의 필드와 메소드만 접근 
	
		//4.Dog_sub를 Animal타입으로 업캐스팅
		Animal a3= new Dogsub(); //a3은 Animal, Dog, Dog_sub를 내포하고 있고, Animal의 필드와 메소드만 접근
	
		//5. Dogsub를 Dog 데이터 타입으로 업캐스팅
		Dog d2=new Dogsub(); //d2는 Animal, Dog, Dogsub를 내포하고 있고, Animal,Dog를 접근한다.
		
		 //Animal <==Dog <==dogsub
		//6. Dogsub를 Dogsub 데이터 타입으로 객체화
		Dogsub ds1=new Dogsub();
			//ds1은 Animal,Dog,Dogsub,중에 Animal,Dog,Dogsub 필드와 메소드 사용 가능 
			ds1.name = "진돗개"; //Animal
			ds1.age=4; //Animal
			ds1.dog=3;//Dog
			ds1.dog_sub();//Dogsub
		
		//상속에서 업캐스팅,다운캐스팅	
		//업캐스팅 : 자식타입의 데이터 타입에서 부모데이터 타입으로변환
			//부모타입의 필드와 메소드만 접근
			//강제 타입변환 없이 자동으로 업캐스팅 됨.
			//ds1d 은 Dogsub 데이터 타입을 가지고 있다. (Animal,Dog,Dogsub의 모든 필드와 메소드 접근이 가능)
			Dog ds1_c1 = ds1; // 업캐스팅 : Dogsub ===> Dog타입으로 업캐스팅(Animal,Dog)
			Dog ds2_c1 =(Dog)ds1; //<==강제 타입 변환 
			Animal ds1_c2 = (Animal)ds1; //업캐스팅 : Dogsub ===> Animal타입으로 업캐스팅(Animal)
			
			//ds1 : Dogsub(Animal,Dog,Dogsub)
			//ds1_c1 : Dog(Animal,Dog)
			//ds1_c2 : Animal(Animal)
			
			
		//다운캐스팅 : 부모 데이터 타입을 다시 자식 데이터 타입으로 변환
			//강제로 타입 변환이 필요함.
			//a3는 Animal,Dog,Dogsub 중 Animal 타입만 사용하도록 업캐스팅 되어있다.
			Dog a3_down1 = (Dog) a3; //a3 [Animal] == a3_down1[Dog]
			Dogsub a3_down2 = (Dogsub) a3; // a3 [Animal] == a3_down2[Dogsub]
		
	
	}

}
