package Chap06_07.Ex06;

import Chap06_07.Ex05.BB;	//�ٸ� ��Ű���� Ŭ�������� Ŭ������ ȣ���Ҷ� public ���������ڰ� �ο��Ǿ��־���Ѵ�.
//import Chap06_07.Ex05.B;  //class B�� class���������ڰ� default�̱� ������ �ٸ���Ű������ ���� �Ұ�.

public class ExternalClass_2 {

	public static void main(String[] args) {
		
		//B b =new B();
		
		//�ٸ� ��Ű���� Ŭ�������� BBŬ������ �����ϴ� ���
			// 1. import�� ���� ���.
			// 2. BBŬ������ Ŭ���� ���� �����ڴ� public
			// 3. �ʵ�, �޼ҵ��� ���������ڿ� ���� ������ ����,�Ұ���
		
		BB bb=new BB(); //�ٸ� ��Ű���� Ŭ���� 1. Ŭ���� ���� �����ڿ� public
		//bb.a = 10;   //private : ���� Ŭ���� �������� ����
		//bb.b = 20;   //default : ���� ��Ű�� ������ ���� ����
		//bb.c = 30;   //protected : default ���� + �ٸ� ��Ű������ ���ٰ��� (��Ӱ���)
		bb.d = 40;   //public : protected + �ٸ� ��Ű������ ���ٰ���
		
		//<<�޼ҵ� ����>> 
		// bb.print1();	//private 
		// bb.print2();	//default
		// bb.print3();	//protected   �ܺ��� �ٸ� ��Ű������ ���� �ҷ��� ��� ���谡 �ʿ�. 
		bb.print4();   // public
		
		
	}

}
