package Chap04;
public class Switch_Ex02 {
	public static void main(String[] args) {
		
		//1. Break를 처리하지 않았을 때 : 해당 case로 이동한 후 하위의 case를 모두 실행 
		int value1 =2;  
		
		switch(value1) { //정수, 문자 ,문자열만 가능
		case 1: //case1,2,3,4 값이 같을때 해당방법으로 처리할 수 있다.
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3: 
			System.out.println("C 학점");
		default :
			System.out.println("F 학점");
		}
		System.out.println("==============");
		
		//2. break가 포함된 경우
		
		int value2 = 3;
		
		switch(value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3: 
			System.out.println("C 학점");
			break;
		default :
			System.out.println("F 학점"); //switch의 default는 break를 생략해도 된다.
		}
		
		System.out.println("===============");
		
		value2 = 1;
		if(value2 == 1) {
			System.out.println("A 학점(if문)");
		}else if(value2 ==2){
			System.out.println("B 학점(if문)");
		}else if(value2 ==3) {
			System.out.println("C 학점(if문)");
		}else { 
			System.out.println("F 학점(if문)");
		}
		/*
		 * switch문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력(점수 1~10)
		 */
		
		int a = 6;
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass"); //매번 println을 안해도 값이 나오도록 지정가능.
			break;
		default :
			System.out.println("Fail");
		}
		
		
		
	}

}
