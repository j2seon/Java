package Chap04;
public class IF_Ex02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator ='-';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1+num2;
		}else if(operator == '-') {
			result = num1-num2;
		}else if(operator == '*') {
			result = num1*num2;
		}else if(operator =='/') {
			result = num1/num2;
		}else {
			System.out.println("연산자 오류입니다.");
			return; // 오류나면 밑의 sysout을 실행하지 않는다. 프로그램 자체가 끝난다.
		}
		System.out.println("결과 값은 : "+ result+" 입니다.");
		
		
	}

}
