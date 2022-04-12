package Chap01;

import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요.");
		Scanner scn =new Scanner(System.in);
				
		int value = scn.nextInt();
		if (value % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		int value1 = scn.nextInt();
		System.out.println((value1 %5 == 0 )? "5의 배수입니다": "아닙니다.");
		scn.close();


	}
}
