package Jjs;

import java.util.Arrays;

public class Exercise03 {

	public static void main(String[] args) {
		//�迭������ arr1 : arr1[100] 0��° �� 1���� 99��° 100����
		//for���� ����ؼ� ���� 
		//��� : for, ���� for, Arrays.toString()
		
		int arr1[]= new int[100];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i+1;		//arr1[0~99]=i+1;
			System.out.println(i+"��° ���� �� : "+ arr1[i]);
		}
		System.out.println();
		System.out.println("==========���� for=========");
		
		for(int j:arr1) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("========toString==========");
		
		System.out.print(Arrays.toString(arr1));

		
		
		
	}

}
