package Chap13.Ex10;

//�̳� �������̽�(InnerInterface):Ŭ���� ������ �������̽��� ����, �ܺη����� �����ϰ� ����� �������� Ŭ���� ���ο� ����
//static�� �ڵ����� �����Ϸ��� ���ؼ� ����.

class A {
	interface B{	//static�� �����Ǿ��ִ�. �����Ϸ��� ���ؼ� �ڵ����� �߰��ȴ�.
		void bcd();		//public abstract�� ����
	}
}

//�̳� �������̽��� ������ Ŭ���� C
class C implements A.B{ //A.B : AŬ������ �̳��������̽� B�� ����. A,B :A �������̽�, B �������̽� 
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ���� C");
	}
}

public class Innerinterface_1 {

	public static void main(String[] args) {
		//1.�ڽİ�ü�� ���� ���� �� ��� (�ڽ�Ŭ������ ������ ���)
		A.B ab=new C(); //�θ��� Ÿ������ ��ĳ������ �������̵��� ���� ���.
		ab.bcd();
		C c = new C(); //C �ڽ��� �޼ҵ带 ���� ȣ�� 
		c.bcd();
		//2. �͸� �̳�Ŭ���� (�ڽ�Ŭ���� ���� ���)
		A.B aa = new A.B() {
			@Override
			public void bcd() {
				System.out.println("�͸� �̳�Ŭ������ ��ü ���� �� ���");
			}	//A.B�� AŬ���� ������ �̳��������̽�
		}; 
		aa.bcd();
	}

}
