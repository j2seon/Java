package Chap10.Ex01;

class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��ƸԽ��ϴ�");
	}
}

class Dog extends Animal{
	int dog;
	void dogEat() {
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Dogsub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("dog�� �ڽ� Ŭ�����Դϴ�.");
	}
}

class Eagle extends Animal{
	int eagle;
	void ealgeFly() {
		System.out.println("�������� ����ٴմϴ�.");
	}
}


public class Animal {
	String name;	 // ������ �̸�
	int age;		 // ������ ����
	String color;	 //������ ����
	
	void eat () {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	} 
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		// ��ĳ������ ���������� ó���ϱ� ������ ���־��� ȿ�������� ���α׷����� ó���� �� �ִ�.
			//������ : �������̵��� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���������� ó���� �� �ִ�.
		
		//1. Animal Ŭ���� ��äȭ
		Animal a1 = new Animal(); //�ڱ��ڽ��� �ʵ�� �żҵ����ٰ���
		
		//2. Dog Ŭ������ Dog Ÿ������ ��üȭ
		Dog d1=new Dog();  //animal,dog�� �ʵ�� �޼ҵ� ����
		//3.dog�� animal Ÿ������ ��ĳ����
		Animal a2= new Dog();	//Dog�� Animal,Dog�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ���� 
	
		//4.Dog_sub�� AnimalŸ������ ��ĳ����
		Animal a3= new Dogsub(); //a3�� Animal, Dog, Dog_sub�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ����
	
		//5. Dogsub�� Dog ������ Ÿ������ ��ĳ����
		Dog d2=new Dogsub(); //d2�� Animal, Dog, Dogsub�� �����ϰ� �ְ�, Animal,Dog�� �����Ѵ�.
		
		 //Animal <==Dog <==dogsub
		//6. Dogsub�� Dogsub ������ Ÿ������ ��üȭ
		Dogsub ds1=new Dogsub();
			//ds1�� Animal,Dog,Dogsub,�߿� Animal,Dog,Dogsub �ʵ�� �޼ҵ� ��� ���� 
			ds1.name = "������"; //Animal
			ds1.age=4; //Animal
			ds1.dog=3;//Dog
			ds1.dog_sub();//Dogsub
		
		//��ӿ��� ��ĳ����,�ٿ�ĳ����	
		//��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ����� Ÿ�����κ�ȯ
			//�θ�Ÿ���� �ʵ�� �޼ҵ常 ����
			//���� Ÿ�Ժ�ȯ ���� �ڵ����� ��ĳ���� ��.
			//ds1d �� Dogsub ������ Ÿ���� ������ �ִ�. (Animal,Dog,Dogsub�� ��� �ʵ�� �޼ҵ� ������ ����)
			Dog ds1_c1 = ds1; // ��ĳ���� : Dogsub ===> DogŸ������ ��ĳ����(Animal,Dog)
			Dog ds2_c1 =(Dog)ds1; //<==���� Ÿ�� ��ȯ 
			Animal ds1_c2 = (Animal)ds1; //��ĳ���� : Dogsub ===> AnimalŸ������ ��ĳ����(Animal)
			
			//ds1 : Dogsub(Animal,Dog,Dogsub)
			//ds1_c1 : Dog(Animal,Dog)
			//ds1_c2 : Animal(Animal)
			
			
		//�ٿ�ĳ���� : �θ� ������ Ÿ���� �ٽ� �ڽ� ������ Ÿ������ ��ȯ
			//������ Ÿ�� ��ȯ�� �ʿ���.
			//a3�� Animal,Dog,Dogsub �� Animal Ÿ�Ը� ����ϵ��� ��ĳ���� �Ǿ��ִ�.
			Dog a3_down1 = (Dog) a3; //a3 [Animal] == a3_down1[Dog]
			Dogsub a3_down2 = (Dogsub) a3; // a3 [Animal] == a3_down2[Dogsub]
		
	
	}

}
