package Chap05;

public class RectangleValueAssignment_Ex07 {

	public static void main(String[] args) {
		//1. �迭 ��ü�� ���� �� ���� �� ���� (��� 1), �迭�� �ʱⰪ�� �� �� ���� ���
		//Rectagle (������ �迭) : ���簢������ ���,
		
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;		
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.print(array1[0][0]+" "+array1[0][1]+" "+array1[0][2]);
		System.out.println();
		System.out.print(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		System.out.println();
		System.out.println("==============");
		
		//2. �迭 ��ü�� ���� �� ���Ұ� ����(���2) : �ʱ� ���� �˶� ���
		int[][] array3=new int[][] {{1,2,3},{4,5,6}};
		System.out.print(array3[0][0]+" "+array3[0][1]+" "+array3[0][2]);
		System.out.println();
		System.out.print(array3[1][0]+" "+array3[1][1]+" "+array3[1][2]);
		System.out.println();
		System.out.println("==============");
		
		int[][] array4;
		array4 = new int[][]{{1,2,3}, {4,5,6}};
		System.out.print(array1[0][0]+" "+array1[0][1]+" "+array1[0][2]);
		System.out.println();
		System.out.print(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		System.out.println();
		System.out.println("==============");
		
		//3. �迭 ��ü�� ���� �� ���Ұ� ����(���3) :
		int[][] array5 = {{1,2,3}, {4,5,6}};
		System.out.print(array5[0][0]+" "+array5[0][1]+" "+array5[0][2]);
		System.out.println();
		System.out.print(array5[1][0]+" "+array5[1][1]+" "+array5[1][2]);
		System.out.println();
		System.out.println("==============");
		
		int[][] array6;
//		array6 = new int[][]{{1,2,3}, {4,5,6}};  //��� �Ұ���
//		System.out.print(array6[0][0]+" "+array6[0][1]+" "+array6[0][2]);
//		System.out.println();
//		System.out.print(array6[1][0]+" "+array6[1][1]+" "+array6[1][2]);
//		System.out.println();
//		System.out.println("==============");
		
	}

}
