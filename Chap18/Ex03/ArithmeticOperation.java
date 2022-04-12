package Chap18.Ex03;

import java.util.Scanner;

//1. 스캐너로 double의 두수를 인풋 받는다. 
//2. 방법1. 람다식을 사용해서 인풋받은 두값을 +,-,*,/ 사칙연산을 구현해서 출력. 
//3. 방법2. 인터페이스를 구현한 자식 객체를 사용해서 인풋받은 두값을 +,-,*,/ 사칙연산을 구현해서 출력. 
//4. 방법3. 익명이너클래스를 사용해서 
//5. Arithmetiception 처리 0으로 나누면 예외발생 int일때 실시 double은 해당사항이 아니다.
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
				System.out.println("0으로 나눌수 없습니다.");
			}
		}else {
			System.out.println(" a/b : "+(a/b));
		}
	}
	
}


public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		double num1 = scanner.nextDouble();
		System.out.println("두번째 숫자를 입력해주세요");
		double num2 = scanner.nextDouble();
		
		//람다식
		Arithmetic a1 =(double a, double b) -> {
			System.out.println(" a+b : "+(a+b));
			System.out.println(" a-b : "+(a-b));
			System.out.println(" a*b : "+(a*b));
			if(b==0) {
				try {
					System.out.println(" a/b : "+((int) a/(int)b));
				} catch (ArithmeticException e) {
					System.out.println("0으로 나눌수 없습니다.");
				}
			}else {
				System.out.println(" a/b : "+(a/b));
			}
		};
		System.out.println("---------------람다식--------------");
		a1.ArithmericOpr(num1, num2);
		
		
		
		System.out.println("---------------구현----------------");
		//구현
		A aa = new A();
		aa.ArithmericOpr(num1, num2);
		
		System.out.println();
		System.out.println("---------------익명----------------");
		//익명
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
						System.out.println("0으로 나눌수 없습니다.");
					}
				}else {
					System.out.println(" a/b : "+(a/b));
				}
			}};
			a2.ArithmericOpr(num1, num2);
		
		
		
	}

}
