package Chap10.Ex04;

//�޼ҵ� �������̵�(MethodOverriding) 
	//1. �ݵ�� ��Ӱ��迡���� �޼ҵ� �������̵��� �����ȴ�.
	//2. �θ� Ŭ�������� ����� �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� �����ؼ� ����ϴ� ��.
	//3. @override ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�.
	//4. �ñ״��İ� ���ƾ��Ѵ�.(�޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
	//5. �޼ҵ��� ���� �����ڰ� ���ų� �о���Ѵ�.
	


class A{
	void print() {
		System.out.println("AŬ����");
	}
}
class B extends A{
	//@Override		//�޼ҵ� �������̵� ��, �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����.
					//@override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ���
					//������ �޼ҵ�� ����
	void print() {
		System.out.println("BŬ����");
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. AŸ��
		A aa=new A();
		aa.print(); 		//AŬ������print()���
		
		//2.B Ÿ��
		B bb = new B();
		bb.print();		//BŬ������ print()���
		
		//3. AŸ�� ��ĳ���� <==B�� ��ĳ�����ؼ� AŸ������ �θ�
		A ab = new B();
		ab.print();			//BŬ������ print() ���
			//ab.print()�� AŬ������ print()�� ȣ��, ���� ���ε��� ���ؼ� BŬ������ print()�� ���
		
		
		
	}
	
	
}
