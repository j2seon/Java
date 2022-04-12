package Chap06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	//static �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ� :�޼ҵ� �̸����� ȣ��
	//�ٸ� ��Ű������ ���� �����ϵ��� ���� : ���� ������(public, protected, default,private)
	//���� �����ڰ� �����Ǿ� ������ : default (���� ��Ű������ ���� ����)
	
	public static void printArray(int[]a) { 
		//static�� �ֱ� ������ ���� Ŭ�������� �̸����� �ٷ� ȣ�� ����
		System.out.println();
		System.out.println("====Arrays.toString(a)�� ���======");
		System.out.println(Arrays.toString(a));
		System.out.println("====for������ ���========");
		//for���� ����ؼ� ���
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("====���� for ������ ���====");
		//���� for������ ���
		for (int j : a) {
			System.out.print(j+ " ");
		}
		System.out.println();
		System.out.println("�迭 ���� : "+a.length);
	}
	
	public static void main(String[] args) {
		//�迭�� �谳 ������ ������ �޼ҵ� ȣ��
		int[] a = new int[] {1,2,3};  //��� 1 : �迭 ������ �����ϰ� ���� ���� �� 
		
		printArray(a);  //�迭������ �޼ҵ� ȣ�� �� �迭 ���� �Է� 
		printArray(new int[] {4,5,6,7,8}); //��� 2
		printArray(new int[] {1,4,6,7,0,9} );
		printArray(a);
		
		
	}

}
