package Jjs;

import java.util.Arrays;

public class Exercise03 {

	public static void main(String[] args) {
		//배열변수명 arr1 : arr1[100] 0번째 방 1부터 99번째 100까지
		//for문을 사용해서 저장 
		//출력 : for, 향상된 for, Arrays.toString()
		
		int arr1[]= new int[100];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i+1;		//arr1[0~99]=i+1;
			System.out.println(i+"번째 방의 값 : "+ arr1[i]);
		}
		System.out.println();
		System.out.println("==========향상된 for=========");
		
		for(int j:arr1) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("========toString==========");
		
		System.out.print(Arrays.toString(arr1));

		
		
		
	}

}
