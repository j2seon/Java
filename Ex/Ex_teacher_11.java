package Ex;

import java.util.Scanner;

public class Ex_teacher_11 {

	public static void main(String[] args) {
		/*
		 * String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
			int score[] = {95, 88, 76, 62, 55};
			�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. 
			"�׸�"�� �Է¹����� �����Ѵ�. (Java �� �ε��� 0 �� �����Ƿ� score[0]
			�� ���)
			���� �̸� >> Jaba
			���� �����Դϴ�.
			���� �̸� >> Java
			Java �� ������ 95
			���� �̸� >> �ȵ���̵�
			�ȵ���̵��� ������ 55
			���� �̸� >> �׸�
			[Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ�
			�Ѵ�.
			String name;
			if(course[i].equals(name)) {
			 	int n = score[i];
			 ...
			}
			*/
		Scanner sc =new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		String name = null; //��ĳ�ʷ� ������ ���ڿ��� �޴� ����
		int i=0;  //�ε�����ȣ ����ϴ� ����
		System.out.println("���α׷��� �����Ϸ��� \"�׸�\"�� �Է��ϼ���");
		// ""�� ����ϱ� ���ؼ� \�� �Է��Ѵ�.
		while(true) { // Ư�������� ������ ������ ��� ����
			System.out.print("���� �̸� >> ");
			name=sc.next(); //��ĳ�ʷ� �����̸��� �޾Ƽ� ������ name�� �Ҵ�.
			if(name.equals("�׸�")) { //���� : name�� �������� �̹Ƿ� ==�� ������� �ʰ� equals�� ���
				break;
			}
			//course�� ������ ���鼭 ��ĳ�ʷ� ���� name ������ ���� ������
			for (i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+" ������ : "+score[i]);
					break;
				}
				if (i == course.length-1) {  	//i ������ ������ ����� ���� �� �˻��� �ȵ� ���
				System.out.println("���� �����Դϴ�.");
				}
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
