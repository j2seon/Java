package Chap13.Ex07.EX1;

//2.�������̽��� �߻�޼ҵ带 ������ <<<�͸���Ŭ����>>>�� ȣ�� : �ѹ��� ����ϴ� ��� 

interface A{ //�������̽�, �߻�޼ҵ带 ���� ,
	public abstract void cry(); 	//�߻�޼ҵ� ==> �������̽��� ���� ���� �ʾƵ��� �������̽��� �̿ϼ��̶� 
	void fly();		//public abstract
}
class B{
	A a =new A() {  //�������̽��� ��üȭ �Ҽ� ����. ������ �͸� ���� Ŭ������ �����ؼ� ���� ����!!!
		//A �������̽��� ������ �ڽ� Ŭ���� ��� : Ŭ���� �̸��� ����.(�����Ϸ��� ������ �̸����� �ڵ����� �Ҵ�.)
		public void cry() { //public �� �����ϴ� ��찡 ����.
			System.out.println("�п�");
		};	
		public void fly() {
			System.out.println("���� ����~");
		};
	};		 
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymusClass_2_1 {

	public static void main(String[] args) {
		 B b =new B();
		 b.abc();
	}

}
