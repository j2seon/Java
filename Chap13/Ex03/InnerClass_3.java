package Chap13.Ex03;

//static �̳�Ŭ���� : �ܺ� Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ� ������ �Ұ���.
			//�ܺ� Ŭ������ static �ʵ峪 static �޼ҵ�� ������ �����ϴ�.

class A{
	int a =3; //�ν��Ͻ� �ʵ�
	static int b=4; //static �ʵ�, ��ü �������� ����, ��ü ���� �� ����
	void method1() { 		//�ν��Ͻ� �޼ҵ� : ��ü ���� �� ����
		System.out.println("Instance Method");
	}
	static void method2() {
		System.out.println("Static Method");
	}
	static class B { //static �̳�Ŭ���� : �ܺΰ�ü�� �������� �ʰ� ȣ���� ����
		void bcd() {
			//1. static Ŭ�������� �ܺ�Ŭ������ �ν��Ͻ� �ʵ� ���� (���ٺҰ�)
			//System.out.println(a);//�ܺ�Ŭ������ �ν��Ͻ� �ʵ�
			System.out.println(b);//static �̳� Ŭ�������� �ܺ�Ŭ������ static �ʵγ� �޼ҵ� ���ٰ���
			
			//2.�޼ҵ� ȣ��
			//method1(); //ȣ��Ұ�
			method2();
		
		}
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		//1. Static �̳�Ŭ���� ��ü����
		A.B b = new A.B(); 		//static �̳�Ŭ������ �ܺ� ��ü �������� ��ü����
		b.bcd();
		
	}

}
