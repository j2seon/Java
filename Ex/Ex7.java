package Ex;

import java.util.Scanner;

import javax.management.loading.MLet;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int arr1 []=new int[10]; //���� ������ ����
		int i;
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		for (i = 0; i < arr1.length; i++) {
			arr1[i]=scanner.nextInt(); // for���� ����ؼ� �� �濡 ��ĳ�ʿ� ���� ���� ����.
		}
		System.out.print("3�� ����� ");
		for (i = 0; i < arr1.length; i++) {  
			if (arr1[i]%3==0) {  //�� �濡 �ִ� ���� 3���� �������� �������� 0�� ���鸸!
			System.out.print(arr1[i]+" ");
		}
			
		}
	}

}
