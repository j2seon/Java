package Chap14.Ex03;

//여러개의 Exception이 동시에 발생될 경우

public class NultiCatch_1 {

	public static void main(String[] args) {
		// 1. 단일 Exception 처리 try catch
		//ArithmeticException
		try {
		System.out.println(10/0);
		}catch (ArithmeticException e) {
			//catch 블락의 아무내용이 없어도 예외처리
			System.out.println("정상 출력(ArithmeticException)");
		}
		
		//NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		}catch (NumberFormatException e) {
			System.out.println("정상 출력(NumberFormatException)");
		}
		
		System.out.println("===================================");
		//2. 다중 Exception 처리
		try {	//try 블락에서 여러 예외가 발생된 경우
			System.out.println(10/0);
			int num2 =Integer.parseInt("10a");
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		
		
		//3.다중 Exception 처리2
		
		try {	//try 블락에서 여러 예외가 발생된 경우
			System.out.println(10/0);
			int num2 =Integer.parseInt("10a");
		}catch (ArithmeticException | NumberFormatException e) {
			System.out.println("ArithmeticException");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
