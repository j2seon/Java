package Jjs;


public class Method_Ex2 {
	
	 static void print() {
		System.out.println("����");
	}
	static int twice(int a) {
		return(a*3);
	}
	static double avg(int a, double b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
		
		print(); // ���� Ŭ������ �ֱ� ������ ���� ��ü���� �ʿ䰡 ����.
		// �޼ҵ忡 ���� ��� ������ ������ ������ �޼ҵ常 ��� ���
		int a=twice(4); // return �����θ� �����߱� ������ ������ �����ؾ���.
		System.out.println(a);//���� �����ϰ� ��±������� �ҷ����Ѵ�.
		double b = avg(5,10);
		System.out.println(b);
		
	}

}
