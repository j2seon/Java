package Chap01;
	import java.util.Scanner;
public class Scanner02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���� , ���̸� �Է����ּ���");
		
		String name = sc.next();
		System.out.println("�̸� : " + name + " , ");
		String gender = sc.next();
		System.out.println("���� : " + gender + " , ");
		int age = sc.nextInt();
		System.out.println("���� : " + age + " .");
		sc.close();

		
	}

}
