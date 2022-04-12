package Chap11.Ex06;

abstract class Animal { 	//�߻�Ŭ���� : �߻�޼ҵ尡 �ϳ��̻� ���ԵǾ� �ִ� ���
							//�߻�Ŭ������ ��ü ���� �Ұ� , Ÿ���� ��� ����
							//�ڽ�Ŭ������ �θ� Ŭ������ �޼ҵ带 ���� �� ������ ���� 
							//�߻�Ŭ������ �߻�Ŭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ�������� �ݵ�� �����ϵ��� ����޴´�.
	String name;
	int age;
	
	abstract void cry(); //�߻�޼ҵ� : �����ΰ� ���� �޼ҵ�
		//void cry(){}  	< === �Ϲݸ޼ҵ�: ����Ÿ�� �޼ҵ��̸�(�Է¸Ű�����){�����ڵ�}
	abstract void run();
	@Override
	public String toString() { //��ü ��ü�� ��½� �޸��� ������ ���
		return "�̸� : "+name+", ���� : "+ age+ "��";
	}
	
}

class Cat extends Animal{		//Cat�� Animal��� �Ϻθ� ����� ��� �߻�Ŭ����,
								//��� �߻�޼ҵ带 ������ ��� ��ũ��Ʈ(������ ������) Ŭ����
	Cat(){};
	Cat(String name, int age){
		super.name=name;
		super.age=age;
	}
	@Override
	void cry() {	//�߻� �޼ҵ带 ������ �޼ҵ�
		System.out.println("�߿�");		//������
	}
	@Override
	void run() {
		System.out.println("�׹߷� �پ�ٴմϴ�.");
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
		System.out.println("����");
	}

	@Override
	void run() {
		System.out.println("�׹߷� ������ �پ�ٴմϴ�.");
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
		System.out.println("������������ �ϰ� ��ϴ�");
	}

	@Override
	void run() {
		System.out.println("�ϴ��� ���ϴ�.");
	}
}


public class AbstractModdifier_Quiz {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����" , 10);
		Animal a2 = new Tiger("ȣ����",5);
		Animal a3 = new Eagle ("������", 15);
		
		//1. Animal �迭 ��ü�� ���� �� 
		Animal[] array= {a1,a2,a3};
		
		//2. for ���� ����ؼ� ��ü�� ��½� �̸��� ���� ��� .run() .cry()
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);	//��ü ���, Animal�� toString()
			array[i].cry();	 	//��ü�� �������̵��� �޼ҵ� ���
			array[i].run();		//Animal�� cry(), run()======> �������̵�(�ڽ��� cry(),run())
			System.out.println("====================");
		}
		System.out.println();
		System.out.println("========���� for===========");
		//3. ���� for��
		for(Animal k : array) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
	}

}
