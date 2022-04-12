package Chap14.Ex08;
//����� ���� ����
// 1. Exception�� ����ϴ� ���� : Checked Exception (������ �ܰ迡�� ���� ó�� �ʿ�)
// 2. RuntimeException�� ����ϴ� ���� : Unchecked Exception, Runtime Exception- ���� �ÿ� ����

import java.util.Scanner;

class MyException extends Exception{ //�Ϲݿ���
	public MyException() {//�⺻������
		super();
	} 
	public MyException(String message) { //���� �޼��� ��� �� ���.
		super(message);
	}
}
class MyRtException extends RuntimeException{ // ���� ����
	public MyRtException() { //�⺻������
		super();
	}
	public MyRtException(String message) { //���� �߻� �� �޼����� ����ϴ� ������
		super(message);
	}
}
class A {
	//1. ����� ���� ���� ��ü ���� (�Ϲ� ���� ��ü)
	MyException me1 = new MyException();	//�⺻������ ȣ�� 
	MyException me2 =new MyException("���� �޼��� : MyException");  //���ܰ� �߻� �� ���� �޼����� ����ϴ� ������.
	//2. ��Ÿ�� ���� ��ü
	MyRtException mre1 = new MyRtException(); //�⺻������ ȣ��
	MyRtException mre2 = new MyRtException("���� �޼��� : MyRTException");
	
	//���ܸ� ������ �߻� ��Ű��(throw) : 
	void abc_1(int num) {
		try {
			if(num>70) {		//abc_1()
				System.out.println("�����۵�");
			}else {
				throw me2;	// ���ܸ� ������ �߻� ��Ŵ
			}
		}catch (MyException e) {		//me1�� ������ throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ.
			System.out.println("70�����Դϴ�. 70�̻� ���� ��������");
			System.out.println(e.getMessage());
			
		}
	}
	
	//������ ����(throws) : abc_2()�޼ҵ带 ȣ���ϴ� ������ ����ó���� �ؾ��Ѵ�. 
	void abc_2(int num) throws MyException {
		if(num>70) {
			System.out.println("���� �۵�");
		}else {
			throw me2;  //throw�� ���� ���� �߻�
		}
	}
	void bcd_1() {
		abc_1(65);		//���ܰ� �߻�.
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70�����Դϴ�. 70�̻� ���� ��������");
			System.out.println(e.getMessage());
		}
	}
}
public class CreatUserExcetion_1 {
	public static void main(String[] args) {
		A a =new A();
		a.bcd_1();		//���ܸ� ���� ����,
		a.bcd_2();		//throws�� ���ܸ� ����, ȣ���ϴ� ������ ����ó�� 
		
	}
}
