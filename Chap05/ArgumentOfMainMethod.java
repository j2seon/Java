package Chap05;

public class ArgumentOfMainMethod {
	//파일이름과 class이름이 맞지 않으면 오류발생함!!!
	public static void main(String[] ar) { //메인 메소드[함수]
		//메소드 기본구조
		/*
		 * void main(String[] args) { // void: 리턴값이 없음을 뜻함.
		 * 	메소드를 호출시 실행할 코드;		  // main: 메소드명
		 * 							  //(인풋 매개변수)
		 * }
		 */
		
		String a = ar[0]; // 안녕하세요
		String b = ar[1]; // 3 : 정수 > 정수이지만 string으로 받아진것
		String c = ar[2]; // 3.8 : 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//main 메소드에 인자값으로 정수나 실수를 넘겨줄때 String으로 변환
		System.out.println();
		System.out.println(b+1); //31
		System.out.println(c+1); //3.81
		
		System.out.println();
		//String을 정수나 더블형으로 변환해서 연산
		int d = Integer.parseInt(b); //b(String ===> Integer 타입으로 변환
		double e = Double.parseDouble(c);//c(String) ===> Double 타입으로 변환
		
		System.out.println(d+1); //4
		System.out.println(e+1); //4.8
		
		
	}
}
