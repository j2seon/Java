package Chap13.Ex04;

//���� �̳�Ŭ���� : Ŭ������ �޼ҵ� ���ο� ����� Ŭ���� 
	//�޼��� ������ Ű�� final�̱� ������ ���� ������ �� ����.
	//���� �̳�Ŭ�������� ���Ǵ� ���������� �ڵ����� final�� ����ȴ�.

class A{
	int a=3;
	void ccc() {//��������
		int a =3; //��������
		a = 4; //a ������ ���� 
		int b;
		
		System.out.println(a);
		//System.out.println(b); //b�� �ʱ� ���� �Ҵ����� �ʾ���.
	}
	void abc() {
		int b = 5; //�������� : �޼ҵ� ���ο� ����� ���� (final�� �����Ϸ��� ���ؼ� �Ҵ��.)
					//final Ű�� �����Ϸ��� ���ؼ� �ڵ����� �Ҵ�
		int c =10;
		c=20; //��� ���� ���� �������!
		class B{	//�����̳�Ŭ����
			void bcd() {
				System.out.println(a);  //�ʵ�
				System.out.println(b);  //��������
				 a=5; //�ʵ�� �� ������ ����
			//	 b=7; //����Ŭ���� ���ο� ����� ���������� �ڵ����� finalŰ�� �����Ϸ��� ���ؼ� �҈Ե�.
			}
		}
		B bb=new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
	// 
		A a=new A();
		a.abc();
	}

}
