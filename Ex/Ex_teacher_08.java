package Ex;

import java.util.Scanner;

public class Ex_teacher_08 {

	public static void main(String[] args) {

		/* 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로
		된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500 원짜리 동전, 100 원
		짜리 동전, 50 원짜리 동전, 10 원짜리 동전, 1 원짜리 동전이 각 몇 개로 변환되
		는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
		
		예시)
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		금액을 입력하시오 >> 65123
		50000 원 짜리 : 1 개
		10000 원 짜리 : 1 개
		1000 원 짜리 : 5 개
		500 원 짜리 : 0 개
		100 원 짜리 : 1 개
		50 원 짜리 : 0 개
		10 원 짜리 : 2 개
		1 원 짜리 : 3 개
				
		*/
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
		Scanner scanner = new Scanner(System.in);
		int money ;  //스캐너로 돈을 저장할 변수
		
		System.out.print("금액을 입력하시오 >> ");
		money=scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d 원짜리 : %d개\n", unit[i], money/unit[i]);
			// printf : %d 값이 뒤에 적히는 값들이 대입됨 \n(엔터)
			//System.out.println(unit[i]+"원 짜리 : "+ money/unit[i]+" 개");
			money = money-(money/unit[i])*unit[i]; 
			//입력된 돈 -( 환산한 돈의 개수 * unit [i]자리에 있는 값)= 계산된 값 빼고 남은 돈
			//money=money%unit[i];
		}   
		
	}

}
