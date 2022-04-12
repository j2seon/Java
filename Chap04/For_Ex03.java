package Chap04;
public class For_Ex03 {
	public static void main(String[] args) {

		int a; //블락 밖에서 선언된 변수, 선언만된 상태(초기값할당 x)
		
		for(a=0; a<5 ; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.println("블락 밖에서 출력 : " + a); //변수가 밖에서 선언되었기때문에 가능/(전역)
		
		
		System.out.println("============");
		
		for(int b=0; b<=10; b++) {
			System.out.println(b);
		}
		//System.out.println(b); for문 내에서만 유효함(지역)
		
		System.out.println("=======================");
		int c;
		for( c=10; c>0; c-- ) {
			System.out.print(c+" ");
		}
		System.out.print("블럭밖에서 c 출력 : "+ c);
		System.out.println();
		
		//2의 배수를 출력
		for (int i=0; i<100; i += 2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		
		/* for문 내에서 초기값과 증가값은 여러변수를 할당할 수 있다.*/
		for(int i=0, j=0; i < 10 ; i++, j++) {
			System.out.println(i+" * "+ j+" : " + (i * j));
		}
		// for문 사용해서 1~10까지 *값을 출력해 주세요.
		
		int d=1;
		for(int e = 1; e <= 10; e++) {
			d*=e;       //d = d * e
			System.out.println(d); //1부터 시작했던 값들이 전부 다 나옴
			 					  //마지막 d만 필요하기 때문에 for문 밖에서 d값을 출력할 것.
		}
		System.out.println("1에서 10까지 곱한 결과 : " + d);
		
		//for 문을 사용해서 1~100까지 더한 값
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;
			System.out.println(sum);
		}
		System.out.println("1에서 100까지 더한 결과는? "+sum);
	
		System.out.println("=========구구단 출력========");
	
		/*이중 for문 : 1~9단까지 구구단 출력*/
		int o;
		int j;
		for(o=1; o<=9; o++) {  //o : 단을 출력
			for(j=1; j<=9; j++) {
				System.out.println(o + " * " +j+" ="+(o*j));
			}
			System.out.println(o+" "+j);
			System.out.println("=====================");
		}
		/*
		* For 문에서 무한 루프 발생
		*/
//		for(int dd =0 ; ; dd++ ) {
//			System.out.println(dd + " "); //0,1,2,~ 무한루프
//		}
		//무한루프탈출
		for(int dd=0; ; dd++) {
			if(dd>100)
				break;	//무한루프는 종료
			
			System.out.println(dd);
		}
		//1.for문을 사용해서 1부터 100까지의 4의 배수만 더한 값 :
		//2.평균 값 출력(double)
		int avg=0;
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%4==0) {
				sum+=num;
				avg++;
			}
		}System.out.println("4의 배수합계 : "+ sum);
		 System.out.println("4의 배수 평균 : "+ (sum/avg));
		
		
	}
}
		
	

	
	
	
	  
	
	



