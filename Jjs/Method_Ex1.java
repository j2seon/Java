package Jjs;


class A {
	void print() {
		System.out.println("�ȳ�");
	}
	int data() {
		return 3;
	}
	double sum(int a,double b) {
		return a+b;
	}
	void printMonth(int a) {
		if(a<0||a>12) {
			System.out.println("�߸��Է��߽��ϴ�.");
			return;
		} 
			System.out.println(a+"��");
	}
}

public class Method_Ex1 {
	public static void main(String[] args) {
		
		A a = new A(); //��ü����
		a.print();
		a.data(); //���� �ȳ��´�~ �ֳ�? AŬ������ sysout �� ����!! ���� �����������ؾ���
		int i=a.data();//������ �����ؼ�
		System.out.println(i); //����Ѵ�!
		double k=a.sum(3,5.5);
		System.out.println(k);
		a.printMonth(12);
		
		
		
	}

}
