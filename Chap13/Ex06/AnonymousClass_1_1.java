package Chap13.Ex06;

//1.�������̽��� �߻�޼ҵ带 ������ <<<Ŭ����>>>�� ���� �� ȣ�� : ����ϰ� ����ϴ� ��� 

interface AA{ //�������̽�, �߻�޼ҵ带 ���� ,
	public abstract void cry(); 	//�߻�޼ҵ� ==> �������̽��� ���� ���� �ʾƵ��� �������̽��� �̿ϼ��̶� 
	void fly();		//public abstract
}
class BB{
	AA a =new C();
	void abc() {
		a.cry();
		a.fly();
	}
	class C implements AA{ //class C�� AA�������̽��� �޼ҵ带 ������ Ŭ����
		@Override
		public void cry() {
			System.out.println("�۸�");
		}
		@Override
		public void fly() {
			System.out.println("���� ���մϴ�.");
		}
	}
}

public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		/* ���� �����ؼ��� �����ϳ�~
		 * BB b=new BB();
		BB.C c=b.new C();
		c.cry();
		c.fly();*/
		//�ٷ� BB�� ������ ����� �� �ִ� ���
		BB b = new BB();
		b.abc();
	}

}
