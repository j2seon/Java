package Chap13.Ex10.EX01;

class A{
	B b; //B: �������̽� Ÿ��, b: �������� : ���� �Ҵ��ϴ� ���
		 //b: null
		 // 1. ��ü ���� �� ���� �Ҵ��ϴ� ��� 
		 // 2. �����ڸ� ���ؼ� ���� �Ҵ�.
		 // 3. setter�� ���ؼ� ���� �Ҵ�.
	A(){} 	//�⺻������
	A(B b){
		this.b=b;
	}
	public void setB(B b){
		this.b=b;
	}
	interface B{
		void play();
		void stop();
	}
	void abc() { //Play()������, stop()������
		b.play();
		b.stop();
	}
}
public class Innerinterface_1_1 {

	public static void main(String[] args) {
		A a = new A();
		//3. setter�� ���ؼ� ���� �Ҵ� 
		a.setB(new A.B() {
			@Override
			public void play() {
				System.out.println("����");
			}
			@Override
			public void stop() {
				System.out.println("����");				
			}
		});
		a.abc();
		
		
		System.out.println("============================");
		//1. ��ü ���� �� �ʵ��� ���� �Ҵ�.
		A a1= new A();
		a1.b =(A.B) new A.B() {//�������̽� : A.B
			@Override
			public void play() {
				System.out.println("±±");
			}
			@Override
			public void stop() {
				System.out.println("���� �ϴ��� ���ϴ�.");
			}  
		};
		a1.abc();
		System.out.println("========================");
		//2.�����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A(new A.B() {
					@Override
					public void play() {
						System.out.println("����");
					}
					@Override
					public void stop() {
						System.out.println("���� ����");
					}
				}
				);		//������ ���ο� A.BŸ���� ��ü ���� �� ����
		a2.abc();
		
	}
}
