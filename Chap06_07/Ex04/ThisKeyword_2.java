package Chap06_07.Ex04;

//����� this Ű���� �߰� : �ݵ�� this key�� ����ؾ� �Ǵ� ��� : 
class Aa{		//this key�� ������� �ʴ� ��� : ���������� �ν�
	int m;
	int n;
	void init (int m, int n) {
		m = m; 		//this Ű�� ������� �ʴ� ��� m <== �������� m
		n = n;		//this Ű�� ������� �ʴ� ��� m <== �������� m
	}
}
class Bb{		//this Ű�� ����ϴ� ��� 
	int m;
	int n;
	void init ( int m, int n) {
		this.m=m;	//thisŰ�� ��������� �ݵ�� ����ؼ� m�� �ʵ��� m�̶�� �˷�����Ѵ�.
		this.n=n;
	}
}
public class ThisKeyword_2 {
	
	public static void main(String[] args) {
		
		// 1. �ʵ��� ��� ���������� ���� ���� ���(this �̻���� ��� : ���������� ����)
		Aa one = new Aa();
		one.init(3,6);
		System.out.println(one.m);  // 0
		System.out.println(one.n);  // 0
		// 2. �ʵ��� ��� ���������� ���� ���� ���(this ����� ���)
		Bb two = new Bb();
		two.init(2,4);
		System.out.println(two.m);  //2
		System.out.println(two.n);  //4
	}

}
