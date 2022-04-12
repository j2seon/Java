package Chap10.Ex03;

//instanceof : ��ü ������ ĳ������ �������� ���θ� �˼� �ֵ����ϴ� Ű����
	//��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True,False�� ����
	//�ٿ� ĳ���� �� ��Ÿ�ӿ����� �߻� �� �� �ִ�. ��Ÿ�� ������ �����ϱ� ����
	//�ٿ� ĳ���ý� �ش� Ÿ���� ��ü�� ������ �� �ٿ�ĳ���� �ϵ��� ����.

class A{
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// 1. intstanceof : ��ü�� instanceofŸ��
		A aa= new A(); //aa�� A�� ������ �ִ�.
		A ab =new B(); //ab�� A,B�� �����ϰ� A�� ���(����)

		System.out.println(aa instanceof A); //true aa��ü�� AŸ���� �����ϴ�?
		System.out.println(ab instanceof A); //true
		System.out.println(aa instanceof B); //false
		System.out.println(ab instanceof B); //True
	
		if(aa instanceof B) { //aa��ü�� BŸ���� ���ԵǾ����� ��쿡�� ĳ�����Ѵ�. 
			B b=(B)aa; //instanceof�� ������ ���������� ������ �������� ������ ��Ÿ�� ������ �߻�
			System.out.println("aa�� B�� ĳ�����߽��ϴ�.");
		}else {
			System.out.println("aa�� BŸ������ ĳ���� �Ұ�");
		}
		
		if(ab instanceof B) { //ab�� BŸ���� �����ϴ� ��� �ٿ�ĳ����
			B b= (B) ab;
			System.out.println("ab�� BŸ������ ĳ���� �߽��ϴ�");
		}else {
			System.out.println("ab�� bŸ������ ĳ���� �Ұ�");
		}
		
		if("�ȳ�" instanceof String) { //��ü�� ������Ÿ���� Ȯ��
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");
		}
	}

}
