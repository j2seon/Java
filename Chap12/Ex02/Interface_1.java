package Chap12.Ex02;

//���� ���̽� (interface) : �ܺο� ���θ� ���� �����ִ� ����... �ܼ�Ʈ(�ܺ�������ġ>>�ܼ�Ʈ(����)<<����)
						//������ (���, TV),API
	//Ÿ������ ����
	// ��� �ʵ�� �ݵ�� public static final
	// ��� �޼ҵ� : public abstract ���� (1.8) , (default �żҵ�� ����)

interface A{	//����ǥ��
	public static final int A =3;  	//Interface �ʵ��� ���� ǥ��
	public abstract void abc();		//Interface �żҵ��� ���� ǥ��		
}
interface B {	//������ ǥ��
	int A=3;
	void abc(); //�߻�޼ҵ� : 
}

abstract class C { 		//�߻�Ŭ���� �϶��� abstract�� ������ �� ����.
	abstract void abc();		//������ �����߻�
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//�������̽��� ��ü ���� �Ұ�. �������� �ʴ� �żҵ尡 ����.
		//A a =new A(); //A�� �������̽� �̹Ƿ� ��ü ���� �Ұ�
		//1.Interface static �ʵ��� ������ ���
		System.out.println(A.A); //�������̽��� �ʵ� ���, A <== static
		System.out.println(B.A);
		
		//2. final�� ���� �Ǿ� �ֱ� ������ ���� ���� �Ұ�
			//A.A=5; //final�� �����Ǿ� ���� ������ �� ����.
			
		
	}

}
