package Jjs;

import java.util.Arrays;

public class Method_Ex4 {
//참조자료형의 호출방법
	
	static void print1(int[] a) {
		a[0] = 3;
		a[1] = 3;
		a[2] = 3;
		a[3] = 3;
		}// 값을 변경해줬다!!!
	static void print2(int[] a) {
		System.out.println(Arrays.toString(a));
	}//값을 출력하는 메소드를 만들었다!!!
	
	
	
	public static void main(String[] args) {

		// 배열 생성
		int[] array=new int[] {2,3,4,4};
		System.out.println(Arrays.toString(array));
		//메소드로 값을 지정해서 호출을 해보자
		print1(array);
		print2(array);
		
	}

}
