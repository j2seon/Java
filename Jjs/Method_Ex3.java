package Jjs;

import java.util.Arrays;

public class Method_Ex3 {
	//�迭�� �����ϸ� �� �迭�� ��µǾ����� ���ڴ�~
	
	public static void main(String[] args) {
		//2. �迭�� �����ϰ� �迭�� ���� ������ �� �迭�� ������ش�.
	int[] a = new int[] {3,4,5,6}; //a��� �迭�� ����! �׸��� a�� {}�� �ִ� ���� ������ �ִ�.
	printArray(a);
	printArray(new int[] {1,2,3});
	printArray(a); //a�� �ѹ��� ������ ���� ���� ���´�.
				//���� : printarray�� ����
		
	}
	static void printArray(int[] a){ //1. �迭�� ����ϴ� �޼ҵ带 ������ 
		System.out.println(Arrays.toString(a)); //�׳� a�� �� ��� ��ġ���� ����.
		
	}

}
