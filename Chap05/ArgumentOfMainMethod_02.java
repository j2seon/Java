package Chap05;

public class ArgumentOfMainMethod_02 {

	public static void main(String[] args) {
		
		//main 메소드에 인풋 매개 변수로 들어오는 배열의 길이를 구하시오.
		System.out.println(args.length);
		System.out.println();
		
		// 입력 매개변수를 for문 으로 출력
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		} //
		System.out.println("======================");
		
		// 입력된 매개변수를 향상된(enhanced) for 문으로 출력
		for(String k : args) { //String 타입의 변수에 args가 대입된다.
			System.out.println(k);
		}
	}
	
}
