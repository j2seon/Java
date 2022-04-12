package Chap14.Ex02;
//Checked Exception(�Ϲݿ���) : ������ �ܰ迡�� ���ܰ� �߻�.
//	�������ϱ� ���� (����) *.java==>*.class, ���� ����ó��

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class A {
	B b;  //b =null
	A(){} //�⺻������
	A(B b){
		this.b=b;
	}
	interface B{  //�������̽� ����
		public void cry();
		}
	void abc() {
		System.out.println(b);
		b.cry();
	}
}


//unchecked Exception(���࿹��), Runtime Exception : ����ÿ� ���ܰ� �߻��� �� �ִ�.
	//���� �ʼ��� �ƴ����� ���� ó���� 
	
public class CheckedException {

	public static void main(String[] args) {
		//1. �Ϲ� ���� :������ �ܰ迡�� ����ó���� �ʿ�
		
		//InterrupteException : ������ �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
//		Thread.sleep(1000);
		
		//ClassNotFoundException :Ŭ������ ã�� ���ϴ� ����
		//Class cls = Class.forName("java.lang.Object");
		//IOException :��Ʈ��ũ���� ��(����) ���о� �� �� �ִ� ����
		//System.in : �ܼ��� ����.
		InputStreamReader in =new InputStreamReader(System.in);
		//in read();
		
		//FileNotFoundException : ������ ã�����ϴ� ���ܰ� �߻��� �� �ִ�.
		//FileInputStream fis =new FileInputStream("text.txt");
	
		//���࿹��(unchecked Exception) :����ÿ�
		//NullPointetException :��ü�� null�� ���¿��� 
		A a1 =new A();
		a1.abc(); //������ �ܰ迡���� ���ܰ� �߻����� �ʰ� ����� �߻�
	}

}
