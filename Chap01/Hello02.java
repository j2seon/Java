package Chap01;

public class Hello02 {
	//�޼ҵ� ���� (�޼ҵ� : ��ü������� �Լ�(input���� �־ ���α׷��� ���� ����� ���)�� �޼ҵ��� ȣĪ�Ѵ�.) 
	public static int sum(int n, int m) {
		return n+m;
	}
	public static void main(String[] args) {
		//���� ����
		
		int i = 20; //i������ ������ ���� �� �ְ�, �ʱ� ������ 20�� �Ҵ��ؼ� ����.
		int s ; //�������� ���� �� �ְ� �ʱⰪ�� �����.
		char a ; //a������ �ѱ��ڸ� ������ ����(�ƽ�Ű��) -char�� ''�� ����ؼ� ���� �Ҵ�
		String b ;
		
		b ="������ ������ �����ϴ�.";
		s = sum(i,10); //sum �޼ҵ�ȣ��
		a ='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
		
		
	}

}
