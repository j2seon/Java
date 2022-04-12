package Chap06_07.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Example_Q2 {

	public static void main(String[] args) {
		//[문제] : 스캐너로 임의의 정수값을 받아서 합계, 평균
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 값을 공백을 넣어서 입력하세요>> ");
		String num=scn.nextLine(); //공백이 들어가므로 전체 정수 값을 String으로!
		String[] array1= num.split(" "); //split는 구분자를 기준으로 글자를 잘라서 배열에 저장.

		System.out.println("당신이 입력한 정수는 : ");
		for(int i=0; i<array1.length; i++) { //입력값을 출력
			System.out.print(array1[i]+" ");
		}
		math(array1); //가변길이 메소드 ,math를 호풀하면서 매개변수로 array1을 넣어주면 된다.
	}
	static void math(String...values) {
		int sum=0;		//들어오는 정수를 합하는 변수
		double avg;		//평균을 저장하는 변수
		
		for(int i =0; i<values.length; i++) {
		//	sum+=values[i]; // values[i]번째 방의 값이 String 타입이므로 정수타입으로 변환
			sum +=Integer.parseInt(values[i]);
			//Intger.parseInt(String):숫자형 String타입을 정수로 변환
			
		}
		avg=(double) sum / values.length; //평균은 형변환이 반드시 필요(double)
		System.out.println();
		System.out.println("임의로 들어온 값의 합계는 : " + sum);
		System.out.println("임의로 들어온 값의 평균은 : "+ avg);
	}
}
	
