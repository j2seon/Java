package Chap10.Ex04;

class Animal{
	void cry() {}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("±��");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		// 1.������ Ÿ������ ����+ ������ Ÿ������ ����.
		Animal aa= new Animal();
		Bird bb=new Bird();
		Cat cc=new Cat();
		Dog dd=new Dog();
			aa.cry(); 		//Animal Ŭ������ cry
			bb.cry();		//Bird�� cry
			cc.cry();		//Cat�� cry
			dd.cry();		//Dog�� cry

		//2. animal  Ÿ������ ���� + �ڽ�Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry()�� ȣ���� ���
				//�����ε��� �޼ҵ�� ���ε� ��.
		Animal ab = new Bird(); //Animal,Bird Ÿ���� ���� Animal�ʵ�� �޼ҵ常 ����
		Animal ac = new Cat();  //ac�� Animal,CatŸ���� ����, Animal�ʵ�� �޼ҵ常 ����
		Animal ad = new Dog();  //ad�� Animal,dogŸ���� ����, Animal�ʵ�� �޼ҵ常 ����
			
			ab.cry(); 	//Animal�� cry()�� ȣ���� ��� �������ε��� ���ؼ� Bird�� cry()ȣ��
			ac.cry();	//Animal�� cry()�� ȣ���� ��� �������ε��� ���ؼ� Bird�� cry()ȣ��
			ad.cry();	//Animal�� cry()�� ȣ���� ��� �������ε��� ���ؼ� Bird�� cry()ȣ��
			
		//3. ��ü �迭�� ����
			
		Animal[] animal = {ab,ac,ad};
		//��üŸ�� �迭 �迭�̸�={��ü,��ü,��ü}
		for(Animal k:animal) {
			k.cry();
		}
		System.out.println("=============");
		for(int i=0; i<animal.length; i++) {
			animal[i].cry();
		}
	}

}
