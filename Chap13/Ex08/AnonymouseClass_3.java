package Chap13.Ex08;

// Ŭ���� ���� �� ���������� ��� / �̻���� ��� �Ű����� ������ ��ü�� ����

interface A{
	public abstract void abc();
}
//1. �ڽ�Ŭ������ ���� ����
class B implements A{
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}
class C {	//cde �޼ҵ忡 ��ǲ������ A Ÿ���� ��ü a�� ��ǲ���� �޴´�.
	void cde(A a) { 	//cde �żҵ带 ȣ���ϸ鼭 �Ű������� AŸ���� ��ü�� ����
		a.abc();
	}
}

public class AnonymouseClass_3 {

	public static void main(String[] args) {
		C c =new C(); 	//1. ��� : Ŭ������ 0 + ���������� 0 
		
		A a=new B(); 	// �������� ���� Ŭ������(A),������������(e)<=====ù��°���
		
		c.cde(a);  //�Ű������� ��ü a�� �����ؼ� ������.
		
		System.out.println("=================================");
		
		// 2. ��� : Ŭ���� �� 0 + ���������� x
		c.cde(new B());
	}

}
