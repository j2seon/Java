package Chap06_07.Ex04;

/*������ this Ű���� �ڵ� �߰� */
//1. Ŭ���� ���ο��� �ڵ����� �ʵ�, �޼ҵ� �տ� �ڵ����� thisŰ���尡 �Ѵ´�.
	//this Ű�� �ڱ� �ڽ��� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī,

class A{  //��ü����� �� Ŭ���� ��ü�� A a=new A(); �� �����ؾ� ���������~
	int m;
	int n;
	
	//A(){}�� �⺻�����ڰ� ����
	
	 void init(int a, int b) {
		int c;			//a,b,c�� �������� (stack������ ������� ���� ����)
		c=3;			//init()�޼ҵ� ������ stack�� �����ǰ� �޼ҵ尡 ������ �Ҹ�. 
		this.m=a*c;		//thisŰ�� ������, �����Ϸ��� �ڵ����� �߰��ϰ� ��.
		this.n=b;
	}
	void work() {
		this.init(2,3);
		System.out.println(this.m+" , " +n); //this�� ��������, ������ �����Ϸ��� �ڵ����� ����
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		//2. ��ü ����
		A a = new A();
		//3. �ż��� ȣ��
		a.work();
	}

}
