package Jjs;

import java.util.Arrays;

public class Method_Ex3 {
	//배열을 지정하면 그 배열이 출력되었으면 좋겠다~
	
	public static void main(String[] args) {
		//2. 배열을 선언하고 배열의 값을 적으면 그 배열을 출력해준다.
	int[] a = new int[] {3,4,5,6}; //a라는 배열을 선언! 그리고 a는 {}에 있는 값을 가지고 있다.
	printArray(a);
	printArray(new int[] {1,2,3});
	printArray(a); //a를 한번더 찍으면 앞의 값이 나온다.
				//이유 : printarray에 선언
		
	}
	static void printArray(int[] a){ //1. 배열을 출력하는 메소드를 만들자 
		System.out.println(Arrays.toString(a)); //그냥 a를 할 경우 위치값이 나옴.
		
	}

}
