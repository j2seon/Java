package Chap13.Ex06;

class A{
	C c =new B();
	void abc() {
		c.bcd();
	}
}
class B implements C{		//�������̽� C�� �߻�޼ҵ� ���� BŬ����

	@Override
	public void bcd() {
		System.out.println("�ν��Ͻ� �̳�Ŭ����");
	}
	
}
interface C{		//�������̽�, �߻�޼ҵ� ���� : void bcd()
	public abstract void bcd();
}

public class AnonymouseClass {

	public static void main(String[] args) {
		//1. ��ü ���� �� �޼ҵ� ȣ�� 
		A a =new A();
		a.abc(); //�ν��Ͻ� �̳�Ŭ����


	}

}
