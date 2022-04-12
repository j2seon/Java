package Ex;

import java.util.Iterator;

public class Ex_teacher_04 {

	public static void main(String[] args) {
		int lineCount; //다음라인으로 개행변수
		int starcount; //별을 출력하는 변수
		
		for (lineCount = 0; lineCount < 4; lineCount++) {
			for ( starcount= 0; starcount <= lineCount; starcount++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
