package Chap05;

import java.util.Arrays;
import java.util.Iterator;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		
		int[] array =new int[] {3,4,5,6,7};
		System.out.println("=====length======");

		//1. 배열의 방(index)의 길이 구하기
		System.out.println(array.length); //방의 개수를 출력 : 5개
		
		System.out.println();
		System.out.println("=====방번호 직접 찍어서 출력======");

		//2. 출력하기 1 : 방번호를 직접 찍어서 출력 : 특정 방번호의 값을 출력.
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		//System.out.println(array[5] + " "); //ArrayIndexOutOfBoundsException, 방번호를 초과한 경우를 출력시 오류
		
		System.out.println();
		System.out.println("=====for문======");

		//3. 출력하기 2 : for문을 사용해서 특정범위를 지정해서 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		System.out.println();
		System.out.println("=====for문으로 특정범위만======");

		//for문을 사용해서 특정범위만 출력하기
		for (int i = 0; i < 2; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println("=====for each(향상된 for문)======");

		
		//4. 출력하기 3 : 향상된 for, 처음 방부터 마지막 방까지 순환하면서 출력. 범위를 지정해서 출력할 수 없다.
			//구문은 for문에 비해서 짧다.
		for(int k:array) { 		//for(출력할 자료형 변수 : 배열변수){실행문,k를 출력 5}
			System.out.println(k+" ");
		}
		
		System.out.println();
		System.out.println("=====Arrays.toString======");
		
		//5. 출력하기 5 : Arrays.toString(배열변수명)// 배열변수의 모든 값을 출력
		System.out.println(Arrays.toString(array));
		
		
	}

}
