package Jjs;

import java.util.Iterator;

public class Exercise05 {

	public static void main(String[] args) {
		//정방형 배열
		int[][] arr1 = new int[][] {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,29,20}};

		System.out.println("=========이중 for 문을 사용해서 출력==========");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}		
			System.out.println();
		}
		
		System.out.println("=======이중향상된 for 문을 사용해서 출력========");
		for(int[] array : arr1) {
			for(int a : array){
				System.out.print(a+" ");
			}System.out.println();
		}
		
		
		// 비정방형 배열
		int[][] arr2 = new int[][] {{1,2},{11,12,13},{21,22,23,24,25},{31,32}};
		
		System.out.println("=========이중 for 문을 사용해서 출력==========");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}System.out.println();
		}
		
		System.out.println("=======이중향상된 for 문을 사용해서 출력========");
		for (int[] array1:arr2) {
			for(int b : array1) {
				System.out.print(b+" ");
			}System.out.println();
		}
		
	}

}
