package Chap18.Ex04;

//���ٽ��� Ȱ��.

	// 1. �͸� �̳�Ŭ���� Ȱ���ϴ� ���.
	//2. �޼ҵ� ����(1. �ν��Ͻ� �޼��� ����, 2. ���� �޼ҵ� ���� )
			//�޼ҵ� ���� : �����Ǿ� �ִ� �޼ҵ带 ����.
				//�޼ҵ带 �����ϱ� ���ؼ� ����Ÿ�԰� �Ű������� �����ؾ��Ѵ�.


interface A{
	void abc();
}

class B {
	void bcd() {		//��üȭ �ؾ� ȣ���� �����ϴ�.
		System.out.println("�޼ҵ�");
	}
}

public class RefOfUnstanceMethod_Type_1 {

	public static void main(String[] args) {
		//1. �ν��Ͻ� �޼ҵ����� type 1 		<==�͸� �̳� Ŭ���� 
		A a1 = new A() {
			@Override
			public void abc() {
				B b= new B();
				b.bcd();
			}
		};
		
		//2. ���� �ó������� ���ٽ����� ǥ��
		A a2 = () ->{
			B b=new B();
			b.bcd();
		};
		
		//3. �ν��Ͻ� ����ǥ���� type1 
		B b = new B();		//�ν��Ͻ� ��ü�� ����, ��ü�� :: �޼ҵ��
		A a3 = b::bcd;  //�ν��Ͻ� ����ǥ�� ���� :����Ÿ���� ���� �Ű������� �����ؾ��Ѵ�. abc�� bcd�� ���ƾ���.
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		//
	}

}
