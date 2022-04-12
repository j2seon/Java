package Chap18.Ex03.Ex01;

import java.util.Scanner;

//1. ��ĳ�ʷ� double�� �μ��� ��ǲ �޴´�. 
//2. ���1. ���ٽ��� ����ؼ� ��ǲ���� �ΰ��� +,-,*,/ ��Ģ������ �����ؼ� ���. 
//3. ���2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ���� �ΰ��� +,-,*,/ ��Ģ������ �����ؼ� ���. 
//4. ���3. �͸��̳�Ŭ������ ����ؼ� 
//5. Arithmetiception ó�� 0���� ������ ���ܹ߻� int�϶� �ǽ� double�� �ش������ �ƴϴ�.
@FunctionalInterface
interface Arithmetic{
	void ArithmericOpr(double a, double b); 
}

class A implements Arithmetic{
	@Override
	public void ArithmericOpr(double a, double b) {
		System.out.println(" a+b : "+(a+b));
		System.out.println(" a-b : "+(a-b));
		System.out.println(" a*b : "+(a*b));
		if(b==0) {
			try {
				System.out.println(" a/b : "+((int) a/(int)b));
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
			}
		}else {
			System.out.println(" a/b : "+(a/b));
		}
	}
	
}


public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �Ǽ��� ������ �����ؼ� �Է��ϼ���");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		//���ٽ� : �������̽��� �߻� �޼ҵ带 �͸� Ŭ������ ������ ���� ��� ǥ���̴�.
		Arithmetic a1 =(double a, double b) -> {
			System.out.println(" a+b : "+(a+b));
			System.out.println(" a-b : "+(a-b));
			System.out.println(" a*b : "+(a*b));
			if(b==0) {
				try {
					System.out.println(" a/b : "+((int) a/(int)b));
				} catch (ArithmeticException e) {
					System.out.println("0���� ������ �����ϴ�.");
				}
			}else {
				System.out.println(" a/b : "+(a/b));
			}
		};
		System.out.println("---------------���ٽ�--------------");
		a1.ArithmericOpr(num1, num2);
		
		
		
		System.out.println("---------------����----------------");
		//����
		A aa = new A();
		Arithmetic aa2= new A();
		aa.ArithmericOpr(num1, num2);
		aa2.ArithmericOpr(num1, num2);
		
		System.out.println();
		System.out.println("---------------�͸�----------------");
		//�͸�
		Arithmetic a2 = new Arithmetic(){
			@Override
			public void ArithmericOpr(double a, double b) {
				System.out.println(" a+b : "+(a+b));
				System.out.println(" a-b : "+(a-b));
				System.out.println(" a*b : "+(a*b));
				if(b==0) {
					try {
						System.out.println(" a/b : "+((int) a/(int)b));
					} catch (ArithmeticException e) {
						System.out.println("0���� ������ �����ϴ�.");
					}
				}else {
					System.out.println(" a/b : "+(a/b));
				}
			}};
			a2.ArithmericOpr(num1, num2);
		
		
		
	}

}
