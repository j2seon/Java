package Jjs;

import java.util.Arrays;

public class Method_Ex4 {
//�����ڷ����� ȣ����
	
	static void print1(int[] a) {
		a[0] = 3;
		a[1] = 3;
		a[2] = 3;
		a[3] = 3;
		}// ���� ���������!!!
	static void print2(int[] a) {
		System.out.println(Arrays.toString(a));
	}//���� ����ϴ� �޼ҵ带 �������!!!
	
	
	
	public static void main(String[] args) {

		// �迭 ����
		int[] array=new int[] {2,3,4,4};
		System.out.println(Arrays.toString(array));
		//�޼ҵ�� ���� �����ؼ� ȣ���� �غ���
		print1(array);
		print2(array);
		
	}

}
