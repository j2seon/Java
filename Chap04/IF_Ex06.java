package Chap04;

import java.util.Scanner; 
public class IF_Ex06 {
	
	public static void main(String[] args) {
		System.out.println("����ϰ��� �ϴ� ���� �Է����ּ���.");
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		char operator = scn.next().charAt(0) ;
		int num2 = scn.nextInt();
		
		int result = 0;
		
		if(operator == '+') {
			result = num1+num2;
		}else if(operator == '-') {
			result = num1-num2;
		}else if(operator == '*') {
			result = num1*num2;
		}else if(operator == '/') {
			result = num1/num2;
		}else {
			System.out.println("������ �����Դϴ�.");
			scn.close();
			return;
		}
		System.out.println("��� ���� : "+ result+" �Դϴ�.");
		scn.close();

		
	}

}
