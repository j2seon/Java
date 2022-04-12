package Chap05;

import java.util.Arrays;
import java.util.Iterator;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		
		int[] array =new int[] {3,4,5,6,7};
		System.out.println("=====length======");

		//1. �迭�� ��(index)�� ���� ���ϱ�
		System.out.println(array.length); //���� ������ ��� : 5��
		
		System.out.println();
		System.out.println("=====���ȣ ���� �� ���======");

		//2. ����ϱ� 1 : ���ȣ�� ���� �� ��� : Ư�� ���ȣ�� ���� ���.
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		//System.out.println(array[5] + " "); //ArrayIndexOutOfBoundsException, ���ȣ�� �ʰ��� ��츦 ��½� ����
		
		System.out.println();
		System.out.println("=====for��======");

		//3. ����ϱ� 2 : for���� ����ؼ� Ư�������� �����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		System.out.println();
		System.out.println("=====for������ Ư��������======");

		//for���� ����ؼ� Ư�������� ����ϱ�
		for (int i = 0; i < 2; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println("=====for each(���� for��)======");

		
		//4. ����ϱ� 3 : ���� for, ó�� ����� ������ ����� ��ȯ�ϸ鼭 ���. ������ �����ؼ� ����� �� ����.
			//������ for���� ���ؼ� ª��.
		for(int k:array) { 		//for(����� �ڷ��� ���� : �迭����){���๮,k�� ��� 5}
			System.out.println(k+" ");
		}
		
		System.out.println();
		System.out.println("=====Arrays.toString======");
		
		//5. ����ϱ� 5 : Arrays.toString(�迭������)// �迭������ ��� ���� ���
		System.out.println(Arrays.toString(array));
		
		
	}

}
