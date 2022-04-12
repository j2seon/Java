package Chap10.Ex04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//
		boolean run=true;
		int nu=0;
	
		
		do {
			Scanner sc =new Scanner(System.in);
			System.out.println();
			System.out.println("1. 19단 출력 | 2.홀수단만 출력 | 3의 배수단만 출력| 4.종료");
			System.out.println("==================");
			System.out.print("번호를 입력해주세요 >>>>");
			nu=sc.nextInt();
			if(nu==1) {//19단 출력 이중 for문 사용 
				for(int i=1; i<20; i++) {
					for(int j=1; j<20; j++) {
						System.out.println(i+"*"+j+" : "+(i*j));
					}
				}
			}else if(nu==2) {
				for(int i=1; i<20; i+=2) {
					for(int j=1; j<20; j++) {
						System.out.println(i+"*"+j+" : "+(i*j));
					}
				}
			}else if(nu==3) {
				for(int i=1; i<20; i++) {
					for(int j=1; j<20; j++) {
						if(i%3==0) {
							System.out.println(i+"*"+j+" : "+(i*j));
						}
					}
				}
			}else if(nu==4) {
				break;
			}
		}while(run);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
	}

}
