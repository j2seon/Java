package Ex;

import java.util.Scanner;

public class Ex_teacher_08 {

	public static void main(String[] args) {

		/* �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������
		�� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500 ��¥�� ����, 100 ��
		¥�� ����, 50 ��¥�� ����, 10 ��¥�� ����, 1 ��¥�� ������ �� �� ���� ��ȯ��
		���� ���ÿ� ���� ����϶�. �̶� �ݵ�� ���� �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�.
		
		����)
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		�ݾ��� �Է��Ͻÿ� >> 65123
		50000 �� ¥�� : 1 ��
		10000 �� ¥�� : 1 ��
		1000 �� ¥�� : 5 ��
		500 �� ¥�� : 0 ��
		100 �� ¥�� : 1 ��
		50 �� ¥�� : 0 ��
		10 �� ¥�� : 2 ��
		1 �� ¥�� : 3 ��
				
		*/
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ����
		Scanner scanner = new Scanner(System.in);
		int money ;  //��ĳ�ʷ� ���� ������ ����
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money=scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d ��¥�� : %d��\n", unit[i], money/unit[i]);
			// printf : %d ���� �ڿ� ������ ������ ���Ե� \n(����)
			//System.out.println(unit[i]+"�� ¥�� : "+ money/unit[i]+" ��");
			money = money-(money/unit[i])*unit[i]; 
			//�Էµ� �� -( ȯ���� ���� ���� * unit [i]�ڸ��� �ִ� ��)= ���� �� ���� ���� ��
			//money=money%unit[i];
		}   
		
	}

}
