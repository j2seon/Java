package Jjs;

import java.text.ParseException;
import java.util.Scanner;

public class Method_Ex5 {

	public static void main(String[] args) {
		//������ ��� �̸��� �ְ� �ش��� ������(���)�� �־ ����Ͻÿ�
		//���� �Է� Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		//��� Ź�� : 2, �߱� : 9, �౸ : 11, �� : 6,���� :2
		//������� ������ �� �հ� :
		//� ������ ��� ������ �� :
		//"�׸�"�̶�� �Է��ϸ� ���α׷� ����
		System.out.println("��̸� ���������� ������ �־ �����ּ���");
		Scanner sc = new Scanner(System.in); //��ĳ�ʷ� 
		String push = sc.nextLine(); 	// ������ ���Ե� ä�� �ԷµǴ� ������ push�� �־�����.
		String[] name = push.split(" ");
		
		for(int i=0; i<name.length; i+=2) {
			for(int j=1; j<name.length; j+=1) {
				System.out.print(name[i]+" : "+name[j]+" ,");
				break;
			}
		}
		result(name);
//		sports(name);
	}
	static void result(String...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			if(i%2==0) {
				sum=sum+Integer.parseInt(values[i]);
			}
		}
		System.out.println("�հ�"+sum);
	}
			
}