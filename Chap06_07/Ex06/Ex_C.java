package Chap06_07.Ex06;

import Chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		//�ٸ�Ŭ������ ������. /public�� ���� / model,color �޸𸮷� ���� �Ұ�
		// model�� color�� setter�� ���ؼ� 
		C c = new C(); //�ٸ� ��Ű���̹Ƿ� import

		//company, model,color�� �ٸ� ��Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		c.maxSpeed = 300;
		
		//setter�� ���ؼ� �޸��� ���� �ο�.
		c.setModel("����");
		c.setColor("������");
		c.setCompany("����");
		
		c.print();
	}

}
