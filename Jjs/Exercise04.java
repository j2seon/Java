package Jjs;

import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {
		
		//배열 변수 명 arr2[300]
		//0번째 방 : 3 1번째:6 - 3의 배수
		//for문 사용해서 3의 배수만 저장하기
		// for, 향상for, toString으로 출력하기
		
		int arr2[] = new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 3*(i+1);
			System.out.println(i+"번째 값 : "+arr2[i]);
		}
		System.out.println();
		System.out.println("=========향상된 for=======");
		for(int k:arr2) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("========toString=======");
		System.out.println(Arrays.toString(arr2));

		System.out.println();
		System.out.println("========범위100~300 이면서 홀수번호=======");
		
		//홀수번방의 값만 출력 (범위 100~300)
		for (int i = 100; i < arr2.length; i++) {
			arr2[i] = i; //if(arr2[i]%2 !=0)
			if (i%2 != 0) {
				System.out.println(i+"번째 값 : "+arr2[i]);				
			} 
		}
		System.out.println();
		System.out.println("========범위100~300 이면서 홀수번호=======");
		for (int i = 100; i < arr2.length; i++) {
			arr2[i]= (2*i)-1;
			System.out.println(i+"번째 값 : "+arr2[i]);				

		}
		
	}

}
