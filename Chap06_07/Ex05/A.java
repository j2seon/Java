package Chap06_07.Ex05;

	//����������(ĸ��ȭ:�����͸� �ܺηκ��� ��ȣ) : 
		//public, protected, default(�����ؼ� ���), private
		//Ŭ���� �̸�, �ʵ�� , �޼ҵ��, �����ڸ�  <<== ���������ڰ� �ݵ�� �Ҵ��� �Ǿ� �ֽ��ϴ�.
		//Ŭ���� �̸� : public, default

public class A {

	int m=3; 	//�ʵ��� �⺻ ���� �����ڴ� default : ������
						//default : ���� ��Ű�� ������ �ٸ� Ŭ���� ���� ����
						//�ٸ� ��Ű���� Ŭ���������� ���� �Ұ�.
	int n=4;
						// private: �ܺ� Ŭ�������� ���� �Ұ���
	
	public int k = 10;	//public : �ٸ� ��Ű������ ���� ����
	
	public void print2() {
		System.out.println("�ܺ���Ű���� �ٸ� Ŭ�������� ���� ����" +" "+k);
	}
	
	void print() {		//default : ���� ��Ű�� ���� Ŭ���������� ��� ���� 
		System.out.println("����Ʈ ����"+m+" "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
