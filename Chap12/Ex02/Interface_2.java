package Chap12.Ex02;

//interface ������ Ŭ����,
	//overriding: ������ �޼ҵ带 �ڽ�Ŭ�������� ���������ϴ� ��.
	//implements : (�������̽��� ����)�̿ϼ��޼ҵ带 �ϼ���Ű�� ��.
	//extends :(���) �θ�Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� �߰��ؼ� Ȯ��
interface AA{
 	void cry(); //�߻� �޼ҵ�(�̿ϼ�), Public abstract ������
	void run(); //�߻� �޼ҵ�(�̿ϼ�),
}

class BB implements AA{

	@Override
	public void cry() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		System.out.println("qjsk");
	}

}
public class Interface_2 {

	public static void main(String[] args) {

		BB aa=new BB();	//BB: �������̽��� �̿ϼ� �޼ҵ带 ������ Ŭ����
		aa.run();
	
	
	}

}
