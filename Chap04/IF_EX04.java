package Chap04;

public class IF_EX04 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator ='+';
		int result = num1+num2;
		
		switch(operator) {
		case '+':
			System.out.println(result);
			break;
		case '-':
			System.out.println(result);
			break;
		case '*':
			System.out.println(result);
			break;
		case '/':
			System.out.println(result);
			break;
		
		default:
			System.out.println("연산자 오류입니다");
		}
		System.out.println("결과 값은 : "+ result+" 입니다.");
	}

}
