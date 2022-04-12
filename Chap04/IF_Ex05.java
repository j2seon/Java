package Chap04;

import java.util.Scanner; 

public class IF_Ex05 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		int result = num1+num2;
		
		switch(operator) {
		case '+':
//			System.out.println(result);
			break;
		case '-':
//			System.out.println(result);
			break;
		case '*':
//			System.out.println(result);
			break;
		case '/':
//			System.out.println(result);
			sc.close();
			break;
			

		default:
			System.out.println("연산자 오류입니다");
		}
		System.out.println("결과 값은 : "+ result+" 입니다.");
		sc.close();

	}

}
