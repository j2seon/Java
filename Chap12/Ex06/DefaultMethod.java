package Chap12.Ex06;

//Interface �� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼ҵ带 ������ �� ���.
	//������ �����Ǿ��ִ� �������̽����� ���ο� ����� �߰��Ҷ� ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰��� �� ���.
	//public default void bcd() {}
		//java 1.8�̻󿡼� ���Ӱ� �߰��� ���..
	//default Ű�� �־���Ѵ�. , default�� ���������ڰ� �ƴϴ�.

interface A{
	void abc();	//2005�� ���� �޼ҵ� ,public abstract�� ������. �����ΰ� ���� �߻� �޼ҵ�
	default void bcd() { //2020 ���� �޼ҵ�
		System.out.println("A�������̽��� bdc()");
	}
	
}
class B implements A{ //2005�� ������ Ŭ����
	public void abc() {
		System.out.println("BŬ������ abc()");
	}
	//void ttt(): //���� Ŭ�������� ���ο� �߻�޼ҵ带 �߰��ϸ� ��ӵ� ��� ���� Ŭ������ �����߻� 
}

class C implements A{
	public void abc() {
		System.out.println("CŬ������ abc()");
	}
	public void bcd() {		//default �޼ҵ嵵 �������̵� �� �� �ִ�.
		System.out.println("CŬ������ bcd()");
	
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//1. ��ü����
		A a1 =new B();
		A a2 =new C();
		
		//2. �޼ҵ� ȣ��
		a1.abc(); //
		a1.bcd();
		a2.abc();
		a2.bcd();
	}

}
