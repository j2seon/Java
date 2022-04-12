package Chap06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	//static 있으면서 같은 클래스에 존재하는 메소드 :메소드 이름으로 호출
	//다른 패키지에서 접근 가능하도록 설정 : 접근 제어자(public, protected, default,private)
	//접근 제어자가 생략되어 있으면 : default (같은 패키지에서 접근 가능)
	
	public static void printArray(int[]a) { 
		//static이 있기 때문에 같은 클래스에서 이름으로 바로 호출 가능
		System.out.println();
		System.out.println("====Arrays.toString(a)로 출력======");
		System.out.println(Arrays.toString(a));
		System.out.println("====for문으로 출력========");
		//for문을 사용해서 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("====향상된 for 문으로 출력====");
		//향상된 for문으로 출력
		for (int j : a) {
			System.out.print(j+ " ");
		}
		System.out.println();
		System.out.println("배열 길이 : "+a.length);
	}
	
	public static void main(String[] args) {
		//배열을 배개 변수로 가지는 메소드 호출
		int[] a = new int[] {1,2,3};  //방법 1 : 배열 변수를 선언하고 값을 넣은 후 
		
		printArray(a);  //배열변수를 메소드 호출 시 배열 변수 입력 
		printArray(new int[] {4,5,6,7,8}); //방법 2
		printArray(new int[] {1,4,6,7,0,9} );
		printArray(a);
		
		
	}

}
