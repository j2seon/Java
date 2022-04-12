package Chap04;

public class If_Ex_01 {

	public static void main(String[] args) {
		
		//1~100까지 5의 배수를 더하고 평균을 구해라 
		
		int i;
		int sum=0;
		int a = 0;
		for(i=1; i<=100; i++) {
			if(i % 5 ==0) {
			sum+=i;
			a++;
			}
	}
		System.out.println("5의 배수합 "+sum);
		System.out.println("5의 배수평균 "+sum / a);

		
		//1~10의 곱셈구하기
		int b;
		int c=1;
		for(b=1; b<=10; b++) {
			c*=b; //c=c*b 1/2/6
			System.out.println(c);
		}
		System.out.println("1~10 곱은 "+c);
		
		
		
}
}
