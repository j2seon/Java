package Chap13.Ex08.EX01;
//3. �żҵ��� �Ű������� ���� : 
	// 3-1 : ��ü ���� �� �����ϴ� �Ű� ������ ���� (Ŭ������ O + �������� O) 
	// 3-2 : ��ü ���� �� �����ϴ� �Ű� ������ ���� (Ŭ������ O + �������� X)

interface A{ //�������̽�, �߻�޼ҵ带 ���� ,
	public abstract void cry(); 	//�߻�޼ҵ� ==> �������̽��� ���� ���� �ʾƵ��� �������̽��� �̿ϼ��̶� 
	void fly();		//public abstract
}
class B implements A {	//B�� A �������̽��� ������ Ŭ���� 
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű����� ����");
		}
	@Override
	public void fly() {
		System.out.println("���� ���մϴ� : �Ű����� ����");
	}
}
class C {	//C ��ü�� abc �޼ҵ� ȣ�� �� A Ÿ���� �Ű������� �޴´�.
	void abc(A a) { //���� �ڽ�Ŭ������ �Ű������� ���� ��� AŸ������ ��ĳ������ �ȴ�.
		a.cry();
		a.fly();
	}
}
public class Anonymous_3_1 {

	public static void main(String[] args) {
		//1. Ŭ������ ���� O + �������� O
		C c =new C();
		A a=new B();	//B�� ��üȭ�ؼ� AŸ������ ����, a : ��������
		
		c.abc(a);
		System.out.println("==================");
		//2.Ŭ������ ���� O + �������� X
		c.abc(new B());
		
	}

}
