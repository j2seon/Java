package Chap01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		// Scanner scanner(�̸��ٲܼ� ����)
		
		String name = scanner.next(); //���ڿ��� ��ǲ�޵��� ��.
		System.out.println("�̸��� " + name + ", ");
		
		String city = scanner.next();
		System.out.println("���ô� " + city +", ");
		
		int age = scanner.nextInt(); //�������� ��ǲ�޾Ƽ� �о� ����.
		System.out.println("���̴�" + age + ", ");
		
		double weight = scanner.nextDouble();  //�Ǽ� ���� ��ǲ �޾Ƽ� �о� �帲 
		System.out.println("ü����" + weight + ", ");
		
		boolean single = scanner.nextBoolean(); //true or false(������ �о� ����)
		System.out.println("���ſ��δ� " + single + "�Դϴ�. ");
		scanner.close(); //�������� �ݵ�� close�� �ؾ��Ѵ�.
	}
}
