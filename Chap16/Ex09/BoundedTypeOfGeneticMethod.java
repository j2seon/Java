 package Chap16.Ex09;

import Chap14.Ex10.MyException;

//���ʸ� �޼ҵ��� ���� ���� :

class A{ //�Ϲ�Ŭ���� 
	
	//Number : Boolean, Character�� ������ 6�� Ÿ��(Byte, Short,Integer, Long, Float,Double)
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue()); //Number Ÿ���� �޼ҵ�. t.intValue(): ������ ���!!
	}
}

interface Myinterface{
	void print(); //public abstract�� ����.
}

class C implements Myinterface{  //�������̽��� ������ Ŭ���� 
	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
	
}



class B {   	//���ʸ� Ÿ�� ���ο��� �������̽��� ������ ���� extends Ű�� ����Ѵ�.
	public <T extends Myinterface> void method2(T t) { //T�� Ÿ���� �� �� �ִ� ���� Myinterface �� ������ Ŭ������ �ü� �ִ�.
		t.print();
	}
}

class D{
	public <T extends String> void abc(T t) {
		System.out.println(t);  			//String toString �޼ҵ尡 ������ �Ǿ��ִ�.
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGeneticMethod {

	public static void main(String[] args) {
		A a =new A();  //�Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		
		a.<Double>method1(5555.55); 
		a.method1(22.2);  // �Ű������� ������ ���� Ÿ���� �ĺ��� �� �ִ� ��� ���� ����.
		a.<Long>method1(1000L);  //Long
		a.<Float>method1(100.555555F);  //Float
		//a.<Booldean>method1(true); //�����߻�
		
		B b =new B(); //		//Method2�� �Ű������� �� �� �ִ� ���� �����佺Ÿ��, �������̽��� ������ �ڽ�Ŭ����
		//�������̽��� ������ ���� �͸�Ŭ���� 
		b.<Myinterface>method2( new Myinterface() {
			
			@Override
			public void print() {
				System.out.println("print() �͸�Ŭ������ ���");
			};
		});
		b.<Myinterface> method2(new C()); //�Ű������� �������̽��� �ڽ� ��ü�� ���� �� �ִ�,
		
		//�͸�Ŭ������ ���ʸ� �޼ҵ� ȣ�� �� �Ű������� �����ֱ� 

		b.method2(new Myinterface() {
			@Override
			public void print() {
				System.out.println("�͸����� ó��� Ŭ���� ���");
			}
			
		});
		D d =new D();
		d.<String>abc("�ȳ�");
		d.abc("�ϼ���");
	}

}
