package Chap04;

public class While_Ex03 {

	public static void main(String[] args) {

		//1. while 의 기본 문법
		int a = 0;   //초기값
		while(a < 10) { //조건식
			System.out.print(a + " ");
			a++; //증감식
		}
			//0~9까지 출력됨 (10번)
		System.out.println();
		
		//For문으로 변환
		for(int i=0; i<10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		int b = 10;
		while(b > 0) {
			System.out.print(b+ " ");
			b--;
		}
		System.out.println();
		
		for(int i =10; i> 0 ; i--) {
			System.out.print(i + " ");
		}
		
		//while문의 무한 루프

//		while(true) {
//			System.out.println("while의 무한루프 발생");
//		}
		System.out.println();
		
		//while 의 무한루프 중지
		
		int c = 0;
		while(true) {
			if( c  > 100) {
				break;
			}
			System.out.print(c);
			c++;
		}
		
		
	}
}
