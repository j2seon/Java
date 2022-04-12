   package Ex;

import java.util.Iterator;

public class Ex4 {

	public static void main(String[] args) {
		//4. for 문을 이용하여 삼각형을 출력
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j <i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		
		for(int i=1; i<4; i+=1) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println();
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		
		
//		System.out.println("=======");
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i+1 ; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
		

	}
}
