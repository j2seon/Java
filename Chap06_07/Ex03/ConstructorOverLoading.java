package Chap06_07.Ex03;

//������ �����ε� : �ϳ��� ������ �� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
	//����) ������Ÿ�Ե� ����, ������ ���� ��� �ΰ��̻� ������ ����.

class Abc{
	int a, b, c;
	String d;
	
	Abc(){System.out.println(a+ " , "+b+" , "+c);}//�⺻������
	Abc(int a){	//�Ű����� 1���� ������
		this.a=a;
		System.out.println(a);
	}
	Abc(String d){
		this.d=d;
		System.out.println(d);
	}
	Abc(int a, int b){ //�Ű����� 2���� ������
		this.a=a;
		this.b=b;
		System.out.println(a+ " , "+b);
		System.out.println();
	}
	Abc(int a, int b, int c){ //�Ű������� 3���� ������
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+ " , "+b+" , "+c);
	}
		Abc(int a, int b, int c, String d){ //�Ű������� 3���� ������
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
			System.out.println(a+ " , "+b+" , "+c+" "+d);
		
	}
}


public class ConstructorOverLoading {	

	public static void main(String[] args) {
		Abc empty=new Abc();
		Abc one=new Abc(1);
		Abc st = new Abc("����");
		Abc two=new Abc(1,4);
		Abc three=new Abc(96,04,01);
		Abc threest=new Abc(90,4,1,"�������");
		
		
	}

}
