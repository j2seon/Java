package Jjs;

import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {
		
		//�迭 ���� �� arr2[300]
		//0��° �� : 3 1��°:6 - 3�� ���
		//for�� ����ؼ� 3�� ����� �����ϱ�
		// for, ���for, toString���� ����ϱ�
		
		int arr2[] = new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 3*(i+1);
			System.out.println(i+"��° �� : "+arr2[i]);
		}
		System.out.println();
		System.out.println("=========���� for=======");
		for(int k:arr2) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("========toString=======");
		System.out.println(Arrays.toString(arr2));

		System.out.println();
		System.out.println("========����100~300 �̸鼭 Ȧ����ȣ=======");
		
		//Ȧ�������� ���� ��� (���� 100~300)
		for (int i = 100; i < arr2.length; i++) {
			arr2[i] = i; //if(arr2[i]%2 !=0)
			if (i%2 != 0) {
				System.out.println(i+"��° �� : "+arr2[i]);				
			} 
		}
		System.out.println();
		System.out.println("========����100~300 �̸鼭 Ȧ����ȣ=======");
		for (int i = 100; i < arr2.length; i++) {
			arr2[i]= (2*i)-1;
			System.out.println(i+"��° �� : "+arr2[i]);				

		}
		
	}

}
