package Chap06_07.Ex05;

public class BB {  //Ŭ���� �̸� : public(���� ��Ű������ ������ ���� , �ٸ���Ű���� Ŭ�������� ������ ����)
	
	private int a=1;	//private : ���� Ŭ���������� ��밡��
	int b=2;			//default : ���� ��Ű������ �ٸ� Ŭ�������� ���ٰ���
	protected int c=3;	//protected : default ���� + �ٸ� ��Ű���� ���� ����(��ӵ� ��츸 ����)
	public int d=4;		//public : �ٸ� ��Ű������ ������ ����
	
	//private<default<protected<public
	
	private void print1() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 30;
		b = 40;
		c = 50;
		d = 60;
	}
	protected void print3() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 20;
		b = 30;
		c = 90;
		d = 70;
	}
	public void print4() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 60;
		b = 60;
		c = 60;
		d = 60;
	}
}
