package Chap04;

import java.util.Scanner; 

public class IF_Ex05 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
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
			System.out.println("������ �����Դϴ�");
		}
		System.out.println("��� ���� : "+ result+" �Դϴ�.");
		sc.close();

	}

}
