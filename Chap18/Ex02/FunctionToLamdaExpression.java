package Chap18.Ex02;


//���ٽ� ����  ���ٽ��� �͸��̳�Ŭ������ ����� ǥ���̶�� �����ϸ�ȴ�.

//d�Ʒ� 4���� �������̽��� ���ٽ����� ó���� ���� : �Լ����������̽���

@FunctionalInterface
interface A{		//�Է¸Ű����� x, return x
	void method1();	
}
@FunctionalInterface
interface B{		//�Է¸Ű����� o, return x
	void method2(int a);
}
@FunctionalInterface
interface C{		//�Է¸Ű����� x, return o
	int method3();
}

@FunctionalInterface
interface D{		//�Է¸Ű����� o, return o
	double method4(int a, int b);
}


public class FunctionToLamdaExpression {

	public static void main(String[] args) {
		
		//�������̽��� �������� �ʴ� �Լ��� ���� --> ���ٽ� 
		
		//1. �Է�x,����x
		//1-1 : �͸� �̳�Ŭ������ ó�� 
		A a1 = new A () {
			@Override
			public void method1() {
				System.out.println("�޼ҵ� 1-1");
			}};
		a1.method1();
		
		//1-2.���ٽ����� ó��
			//���ٽ��� ����Ÿ��,�޼ҵ� �̸����� ����. 
			//(��ǲ �Է¸Ű�����)->{������}; 
		A a2 = () -> {System.out.println("�޼ҵ� 1-2");};	 //���ٽ� ��ü ����
		A a3 = () -> System.out.println("�޼ҵ� 1-3");		//�����ο� �Ѷ��θ� �����Ҷ� {};�� ��������
		
		a2.method1();
		a3.method1();
	
		//2. �Է�o ���ϰ�x
		//2-1 �͸��̳�Ŭ������ ó��
		B b1 =new B() {
			@Override
			public void method2(int a) {
				System.out.println("�޼ҵ� 2 - 4");
			}};
			
		b1.method2(0);
		
		//2-2 ���ٽ� ǥ��
		B b2 = (int a) ->{System.out.println("�޼ҵ� 2 - 4");}; //��ü ����
		B b3 = (a) ->{System.out.println("�޼ҵ� 2 - 5");}; //�Է¸Ű������� Ÿ���� ��������
		B b4 = (a) -> System.out.println("�޼ҵ� 2 - 6"); //���๮�� �� �����϶� �߰�ȣ ��������
		B b5 = a -> System.out.println("�޼ҵ� 2 - 7");	//�Է¸Ű������� �ϳ��ϋ� ()��������
		
		b2.method2(1);
		b3.method2(1);
		b4.method2(1);
		b5.method2(1);
		
		
		//3. �Է�x ���ϰ�o
		//3-1. �͸��̳�Ŭ����
		C c1= new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println("�������� ���� :"+ c1.method3());
		
		//3-2. ���ٽ����� ǥ��
		C c2 =() ->{return 5;}; 		//��ü����
		C c3 =() ->6;				//������ �� �������� ����� ���, �ݵ�� �߰�ȣ�� �Բ� ����!
		System.out.println("�������� ���� :"+ c2.method3());
		System.out.println("�������� ���� :"+ c3.method3());
	
		//4. �Է�o ���ϰ�o
		//4-1 �͸��̳�Ŭ����
		D d1= new D() {
			@Override
			public double method4(int a, int b) {
				return a+b;
			}
		};
		//4-2 ���ٽ����� ó��
		D d2 = (int a, int b) -> {return a+b;}; 	//��ü ǥ�� 
		D d3 = (a, b) -> {return a+b;}; 			//��ǲŸ�� ���� (D �������̽��� �̹� ���ǵǾ� �ֱ� ������)
		D d4 = (a, b) -> a+b;				//������ �ϳ��϶� ���� ����, �߰�ȣ�� �ݵ�� ���� ����{};
		
		
		System.out.println("�� ���� �� :"+d1.method4(1, 2));
		System.out.println("�� ���� �� :"+d2.method4(3, 4));
		System.out.println("�� ���� �� :"+d3.method4(5, 6));
		System.out.println("�� ���� �� :"+d4.method4(7, 8));
	

	
	
	
	
	
	}
}
