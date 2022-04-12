package Chap04;

public class For_ex_03_01 {

	public static void main(String[] args) {
	//내가 한거
	//	int s=0;
	//	for(int i=0; i<=1000; i++) {
	//		if(i%4==0) {
//			s+=i;
//			}
//		}
//			System.out.println("4의 배수 덧셈결과 : "+ s);
//		
		double sum = 0;  //더한 값을 저장하는 변수
		int j = 0;  //4의 배수를 카운트하는 변수
		for(int i = 1; i<=1000; i++) {
			if(i%4==0) { //
				sum += i ; //sum = sum + i(4의 배수만 들어온다)
				j++;
			}
		}
		System.out.println("합은 : "+ sum);
		System.out.println("평균은 : " + (sum/j));
		System.out.println(j);
		
		
	}

}
