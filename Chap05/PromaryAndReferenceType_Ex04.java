package Chap05;

public class PromaryAndReferenceType_Ex04 {

	public static void main(String[] args) {
		// 1.�⺻ ������ Ÿ���� ���� ����(stack ���� ����)
		int value1 = 3 ;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);	//3
		System.out.println(value2); //7
		System.out.println();
		System.out.println("==========");
		
		//2. ���� �ڷ����� ���Կ���(Stack�� �������� �ּҸ� ����)
		
		int[] array1= new int[] {3,4,5,7};
		int[] array2 =array1 ;		//array2�� ���ÿ������� array1�� �������� �ּҸ� ����
		array2[0] = 7;
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		
		
		
		

	}

}
