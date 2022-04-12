package Chap12.Ex01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}
class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("�߿�");
	}
	
	@Override
	void fly() {
		System.out.println("���� ����");
	}
}
class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("������");
	}
	
	@Override
	void fly() {
		System.out.println("��������");
	}
}


public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. �ڽ�Ŭ���� Cat,Eagle Ŭ������ ���� �� ��� 
		Abc a = new Cat();
		Abc b = new Eagle();
		
		a.cry();
		a.fly();
		b.cry();
		b.fly();
		
		
		//2. �͸� Ŭ���� ���� �� ���,
		Abc a1=new Abc() {
			void cry(){
				System.out.println("����̴� �߿˾߿�");
			}
			void fly() {
				System.out.println("����̴� ���� ����");
			}
		};
		Abc a2 =new Abc() {
			void cry() {
				System.out.println("�������� ������");
			}
			void fly() {
				System.out.println("�������� �ϴ��� ��");
			}
		};
		System.out.println("===================");
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		
	}

}


	

