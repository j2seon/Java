package Chap10.Ex06.EX01;


//�ڽ� ��ü�� �����Ҷ� �θ�Ŭ������ �⺻ �����ڸ� ���� ȣ�� : super()
//��� �ڽİ�ü�� �����ڿ��� super()�� �����Ǿ��ִ�.
class A {
	
	A(){
		System.out.println("AŬ������ �⺻�������Դϴ�.");
	}
	A(int a){
		System.out.println("AŬ������ �Ű����� ���� 1 ������ : "+ a);
	}
	A(int a,int b){
		System.out.println("AŬ������ �Ű����� ���� 2 ������ : "+a+", "+ b);
	}
}
class B extends A{
	B(){
//		super(5,3);
		System.out.println("BŬ������ �⺻������");
	}
	B(String a){
		super (3,5);
		System.out.println("b Ŭ������ ���ڿ� 1 �Է�" + a);
	}
}
class C extends B{
	C(){
		super("c���� ȣ��");
		System.out.println("CŬ������ �⺻ ������");
	}
}

public class SuperMethod2 {

	public static void main(String[] args) {
		C c =new C();
	
	}

}
