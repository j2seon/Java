package Chap18.Ex05;


//���� �޼ҵ� ����(���� �޼ҵ� ǥ��)
	//�޼ҵ� ���� : ���� �������� �ʰ� �����Ǿ��ִ� �޼ҵ带 �����ؼ� ���� ��.
	

interface A {
	void abc();
}

class B{
	static void bcd() {			//<<==static(����) : Ŭ�����̸����� ȣ���� ����.
		System.out.println("�޼ҵ�");
	}
}

public class RefOfUnstanceMethod_Type_2 {
	public static void main(String[] args) {
		//1.���� �޼ҵ� ���� :  �̳�Ŭ������ ó��
		A a1 =new A() {
			@Override 
			public void abc() {
				B.bcd(); 			//static�� ����� �����޼ҵ� ȣ��, ��ü ���� ���� Ŭ���� ������ ȣ��
			}
		}; 
		
		//2. ���ٽ� ǥ��
		A a2 = () -> {B.bcd();}; 		//���ٽ� ǥ��
		
		//3. �����޼ҵ� ����
		
		A a3 = B :: bcd; //���� �޼ҵ��̱� ������ ��ü ���� ���� �����.
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
	}

}
