package Chap06_07.Ex06;

class Abc{	//�ܺ�Ŭ���� : public �����ڸ� ��� ���Ѵ�. default�� �⺻���� ����.
			//class : public, default�� �����ϴ�.
			//���� �����ڰ� ���� �� �ִ� Ű���� : class ��, �ʵ�, �޼ҵ�, ������
			//�ݵ�� ���������ڰ� �Ҵ� �Ǿ� �ִ�. �����Ǿ� ������ default�� �����Ǿ�����.
			//���� ������  
			//1. public : �ٸ���Ű������ ���� ����. //import �ʿ�
			//2. protected : �ٸ� ��Ű������ ������ ����(��ӱ����� �Ǿ��־�� ����) //import �ʿ�
			//3. default : ���� ��Ű������ ������ ����, ���� ��Ű���� �����ϴ� Ŭ������ import ���� ��밡��
			//4. private : ���� Ŭ���� ���ο����� ��밡��.
	public  int a =10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//�����ڰ� �����Ǿ��ִ�.
	//Abc(){} <=== �⺻ ������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����, 
	

	
	public void print1() {
		System.out.println(" �ٸ���Ű������ ���� ����: public");
	}
	protected void print2() {
		System.out.println("�ٸ���Ű������ ���� ���� : ��Ӱ��谡 �����Ǿ� �ִ� ���");
	}
	void print3() {
		System.out.println("���� ��Ű������ ���� ����: default ");
	}
	private void print4() {
		System.out.println("���� Ŭ���������� ���� ���� ");
	}
}

public class Ex06_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc abc1=new Abc(); //�⺻������ ȣ��
		//Abc : Ŭ������, abc1:�޸𸮿� �ε��� ��ü��, new=��ü�� Heap������ ����, Abc(): ������ ȣ��
		//Abc() : �⺻������
			//������ : 1. Ŭ�����̸��� ������ �޼ҵ��̴�.
			//		 2. ����Ÿ���� ����!!!! �ٸ� �޼ҵ��� void����� ����Ÿ���� �ִ�.
		
		//���� ��Ű�� ������ �ʵ� ȣ��
		abc1.a=100; //public
		abc1.b=200; //protected
		abc1.c=300; //default
		//abc1.d=400; //private //�ٸ�Ŭ���������� ���� �Ұ�
		
		//���� ��Ű�� ������ �޼ҵ� ȣ��
		abc1.print1();	//public 
		abc1.print2();	//protected
		abc1.print3(); 	//defalut
		//abc1.print4();  //private �ٸ� Ŭ���������� ���� �Ұ�
	}

}
