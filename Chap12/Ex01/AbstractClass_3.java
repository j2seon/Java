package Chap12.Ex01;

abstract class D{ 	//Ŭ���� ���ο� �߻�޼ҵ尡 �� ��� abstractŬ������ �Ǿ���Ѵ�.
					//�ڽ�Ŭ�������� �ݵ�� �������� �޼ҵ带 �� �����ϴ� ���� ����
	abstract void print();		//�߻�޼ҵ�, �����ΰ� ���� ���� �� �޼ҵ�
} 

class E extends D{		//�ڽ�Ŭ������ �߻�Ŭ������ �޼ҵ带 ������.
	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
	} 	
}


public class AbstractClass_3 {

	public static void main(String[] args) {
		//1.��üȭ �ؼ� ��� (��ü 3��)
			//�Ź� ���ֻ���ϴ� ���
		D d1 = new E(); //�ڽ�Ŭ���� �����ڸ� ȣ���ؼ� �θ�Ÿ������ ����.
		D d2 = new E();
		D d3 = new E();
			//�޼ҵ� ȣ��
			d1.print();
			d2.print();
			d3.print();
		
		//2.�͸�Ŭ������ �����ؼ� ���
			// D dd1 =new D(); <== xxx �߻�Ŭ������ ��üȭ �� �� ����!!!!
		D dd =new D() {
			void print() {
			System.out.println("EŬ������ print()");
			}
		};
		System.out.println("===========");
		dd.print();
		
		D dd1=new D() {
			@Override
			void print() {
				System.out.println("�͸�Ŭ����");
			}
		};
		D dd2= new D () {
			void print() {
				System.out.println("�͸�Ŭ����~~");
			}
		};
		dd1.print();
		dd2.print();
	}

}
