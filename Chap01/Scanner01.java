package Chap01;

import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���.");
		Scanner scn =new Scanner(System.in);
				
		int value = scn.nextInt();
		if (value % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		int value1 = scn.nextInt();
		System.out.println((value1 %5 == 0 )? "5�� ����Դϴ�": "�ƴմϴ�.");
		scn.close();


	}
}
