package Chap04;

import java.util.Scanner; 
public class IF_Ex06 {
	
	public static void main(String[] args) {
		System.out.println("계산하고자 하는 값을 입력해주세요.");
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
			System.out.println("연산자 오류입니다.");
			scn.close();
			return;
		}
		System.out.println("결과 값은 : "+ result+" 입니다.");
		scn.close();

		
	}

}
