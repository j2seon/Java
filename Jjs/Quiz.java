package Jjs;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		String value;
		String[]array;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {
			System.out.println("운동 이름과 구성원 수를 공백을 넣어서 적어주세요.\n종료 시 '그만'이라고 입력하십시오.");
			value = scanner.nextLine();
			array = value.split(" ");
			if(value.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}System.out.println();
			for(int i=0; i<array.length; i++) {
				if(i==array.length-1) {
					System.out.println(array[i]);
				}else if(i%2==0) {
					System.out.print(array[i]+" : ");
				}else if(i%2!=0) {
					System.out.print(array[i]+",");
				}
			}
			result(array);
		}
	}
	static void result(String...values){
		int sum=0;
		int num=0;
		
		
		for(int i=0; i<values.length; i++) {
			if(i%2!=0) {
				sum=sum+Integer.parseInt(values[i]);
				num++;
			}
		}
		double avg=(sum/num);
		System.out.println();
		System.out.println("운동 종목의 구성원 총 합계 : "+sum);
		System.out.println("운동 종목의 평균 구성원 수 : "+avg);
		System.out.println();
	}
}
