package Chap10.Ex06;

//super : �θ�Ŭ����(��Ӱ��迡�� �θ� ����Ŵ) 
//this : �ڽ��� ��ü
//���� ���̵� : �θ��� �޼ҵ尡 ������ �������� �ʾ���.


class A{
	void abc() {
		System.out.println("AŬ������ abc()");
	}
}
class B extends A{
	void abc () {
		System.out.println("BŬ������ abc()");
	}
	void bcd() {
		abc();
		super.abc(); //this.abc���� //this�� �ڽ��� ��ü
	}
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		// 1. ��ü ����
		B bb= new B();
		//2.�޼��� ȣ��
		bb.bcd(); //BŬ������ 
	}

}
