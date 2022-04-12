package Chap04;

public class IF_Ex01 {

	public static void main(String[] args) {
		/*if 문 :
		 * if (조건) {
		 * 	조건이 참일때 실행될 코드;
		 * }
		 */
		
		int value1 =5;
		if(value1 > 3) {
			System.out.println("실행 : 조건이 참일 때 실행");
		}
		
		/*
		 * if(조건) {
		 * 		조건이 참일 때 실행할 문장;
		 * } else{
		 * 		조건이 거짓일 때 실행할 문장;
		 * }
		 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("실행1"); //조건이 True일 때 
		}else {
			System.out.println("실행2"); //조건이 false일 때
		}
		
	
		if (bool2) {
			System.out.println("실행3"); //조건이 True일 때 
		}else {
			System.out.println("실행4"); //조건이 false일 때
		}
		System.out.println("=========");
		
		//if ~else는 삼항연산자로 변환이 가능
		
		System.out.println((bool1)? "실행5":"실행6"); //참이므로 실행 5 출력
		System.out.println((bool2)? "실행7":"실행8"); //거짓이므로 실행 8
		
		/*
		 * if의 조건이 여러개일때? 
		 * 
		 * if (조건1){
		 * 		조건1이 참일때 실행코드;
		 * }else if (조건2){
		 * 		조건2가 참일때 실행 실행코드;
		 * }else if(조건3){
		 * 		조건 3이 참일 때 실랭;
		 * }else {
		 * 		위의 조건이 모두 만족하지 않을 떄 실행할 코드;
		 * }	 
		 */
		
		int value3 = 64;
		if (value3>=90) {
			System.out.println("A 학점, 점수 : " + value3);
		}else if(value3>= 80) {
			System.out.println("B 학점, 점수 : " + value3); //실행 후에 if문을 빠져나온다.
		}else if(value3 >=70) {
			System.out.println("C 학점, 점수 : " + value3);
		}else {
			System.out.println("F 학점, 점수 : " + value3);
		}
		
		/*
		 * IF문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
		value3 = 85;
		if (value3>=90) {
			System.out.println("A 학점, 점수 : " + value3);
		}else if(value3>= 70) {
			System.out.println("C 학점, 점수 : " + value3); //실행 후에 if문을 빠져나온다.
		}else if(value3 >=80) {
			System.out.println("B 학점, 점수 : " + value3);
		}else {
			System.out.println("F 학점, 점수 : " + value3);
		}
		System.out.println("=============");
		// 조건을 부여할때 세밀하게 적용해야한다. 
		
		value3 = 85;
		if(value3<=100 && value3>=90){
			System.out.println("A학점입니다.");
		}else if (value3 < 80 && value3>= 70){
			System.out.println("C학점입니다.");
		}else if ( value3 <90 && value3 >=80) {
			System.out.println("B학점입니다");
		}
		
		System.out.println("======{}생략예시1=========");
		
		/*
		 * if문에서 실행문이 하나일 때 {}를 생략할 수 있다.
		 */
		
		if(3<5)
			System.out.println("안녕하세요");  // true이면서 실행문 1개 {}생략
		
		System.out.println("======={}생략 예시2========");
		

	if (3 > 5)  //가능하지만 권장사항이 아니다.
			System.out.println("안녕하세요2");
			System.out.println("반갑습니다.");
		
	}
	}

