package Chap05;

public class RectangleValueAssignment_Ex07 {

	public static void main(String[] args) {
		//1. 배열 객체의 생성 및 원소 값 대입 (방법 1), 배열의 초기값을 알 수 없는 경우
		//Rectagle (정방형 배열) : 직사각형으로 출력,
		
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
		
		//2. 배열 객체의 생성 및 원소값 대입(방법2) : 초기 값을 알때 사용
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
		
		//3. 배열 객체의 생성 및 원소값 대입(방법3) :
		int[][] array5 = {{1,2,3}, {4,5,6}};
		System.out.print(array5[0][0]+" "+array5[0][1]+" "+array5[0][2]);
		System.out.println();
		System.out.print(array5[1][0]+" "+array5[1][1]+" "+array5[1][2]);
		System.out.println();
		System.out.println("==============");
		
		int[][] array6;
//		array6 = new int[][]{{1,2,3}, {4,5,6}};  //사용 불가능
//		System.out.print(array6[0][0]+" "+array6[0][1]+" "+array6[0][2]);
//		System.out.println();
//		System.out.print(array6[1][0]+" "+array6[1][1]+" "+array6[1][2]);
//		System.out.println();
//		System.out.println("==============");
		
	}

}
