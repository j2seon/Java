package Jjs;

import java.text.ParseException;
import java.util.Scanner;

public class Method_Ex5 {

	public static void main(String[] args) {
		//임의의 운동의 이름을 넣고 해당운동의 구성원(명수)를 넣어서 출력하시오
		//예시 입력 탁구 2 야구 9 축구 11 농구 6 씨름 2
		//출력 탁구 : 2, 야구 : 9, 축구 : 11, 농구 : 6,씨름 :2
		//운동종목의 구성원 총 합계 :
		//운동 종목의 평균 구성원 수 :
		//"그만"이라고 입력하면 프로그램 종료
		System.out.println("운동이름 구성원수를 공백을 넣어서 적어주세요");
		Scanner sc = new Scanner(System.in); //스캐너로 
		String push = sc.nextLine(); 	// 공백이 포함된 채로 입력되는 값들이 push에 넣어진다.
		String[] name = push.split(" ");
		
		for(int i=0; i<name.length; i+=2) {
			for(int j=1; j<name.length; j+=1) {
				System.out.print(name[i]+" : "+name[j]+" ,");
				break;
			}
		}
		result(name);
//		sports(name);
	}
	static void result(String...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			if(i%2==0) {
				sum=sum+Integer.parseInt(values[i]);
			}
		}
		System.out.println("합계"+sum);
	}
			
}