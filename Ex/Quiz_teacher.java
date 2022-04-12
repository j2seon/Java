package Ex;

import java.util.Scanner;

public class Quiz_teacher {

	public static void main(String[] args) {
 /*출력 >>
  * 출력 : 탁구 2 야구 9 축구 11 농구 6 씨름 2
  * 운동 종목의 구성원 총 합계: //sum
  * 운동 종목의 평균 구성원 수 : //avg
  * "그만"이라고 입력하면 프로그램 종료 //전체 반복문
  * next()는 공백없이 String으로 하나만 받음. 
  * nestLine()은 공백을 포함해서 String으로 받음. //스캐너
  */
		Scanner sc =new Scanner(System.in); //스캐너 장착!
		String str; // 전체 String 값을 인풋 (내가 넣는 것)
		String[] array; //인풋받은 문자를 배열로 만드는 변수 
		int sum =0; //구성원의 합계를 저장하는 변수
		int num =0; // 
		double avg; //구성원의 평균을 저장하는 변수 //(double) 구성원 합/종목 수
		int b=0; //각종목의 구성원을 담는 변수
		do {
			System.out.println("운동이름과 구성원 수를 공백을 이용해서 입력하세요.");
			System.out.println("입력 : 탁구 2 야구 9 축구 11 농구 6 씨름 2 ");
			str=sc.nextLine(); // sc.next():공백까지만 String
								// cs.nextLine():엔터까지 전체를 String으로 저장
			if(str.equals("그만")) {  // str이 참조자료형이므로 ==이 아닌 equals()를 사용한다. 
				System.out.println("시스템을 종료합니다.");
				break;
			}
			array=str.split(" "); //array배열에 내가 적은 str을 공백을 기준으로 잘라서 저장해라~
			System.out.println();
			System.out.print("입력 내용 >> ");
			for(int j=0; j<array.length; j++) {
				if(j==array.length-1) {
					System.out.print(array[j]);
				}else if(j%2==0) {
					System.out.print(array[j]+" : ");
				}else if(j%2==1) {
					System.out.print(array[j]+" , ");
				}
			}System.out.println();
			
			for(int i=0; i<array.length; i++) { //array.length 배열의 index0~마지막 방까지
				if(i%2!=0) {
					b=Integer.parseInt(array[i]);  //각방의 String타입을 정수로 변환 
							sum+=b; //sum=sum+b 전체구성원의 합.
							num++;
				}
			}
			avg=(double)(sum/num); //int를 double로 바꿔야함.
			System.out.println("운동 종목의 구성원 총 합계 : "+sum);
			System.out.println("운동 종목의 평균 구성원 수 : "+ avg);
			System.out.println();
		}while(true);
		
	}
}
