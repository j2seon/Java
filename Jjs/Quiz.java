package Jjs;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		String value;
		String[]array;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {
			System.out.println("� �̸��� ������ ���� ������ �־ �����ּ���.\n���� �� '�׸�'�̶�� �Է��Ͻʽÿ�.");
			value = scanner.nextLine();
			array = value.split(" ");
			if(value.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}System.out.println();
			for(int i=0; i<array.length; i++) {
				if(i==array.length-1) {
					System.out.println(array[i]);
				}else if(i%2==0) {
					System.out.print(array[i]+" : ");
				}else if(i%2!=0) {
					System.out.print(array[i]+",");
				}
			}
			result(array);
		}
	}
	static void result(String...values){
		int sum=0;
		int num=0;
		
		
		for(int i=0; i<values.length; i++) {
			if(i%2!=0) {
				sum=sum+Integer.parseInt(values[i]);
				num++;
			}
		}
		double avg=(sum/num);
		System.out.println();
		System.out.println("� ������ ������ �� �հ� : "+sum);
		System.out.println("� ������ ��� ������ �� : "+avg);
		System.out.println();
	}
}
