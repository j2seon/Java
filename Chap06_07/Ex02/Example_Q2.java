package Chap06_07.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Example_Q2 {

	public static void main(String[] args) {
		//[����] : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ���� ������ �־ �Է��ϼ���>> ");
		String num=scn.nextLine(); //������ ���Ƿ� ��ü ���� ���� String����!
		String[] array1= num.split(" "); //split�� �����ڸ� �������� ���ڸ� �߶� �迭�� ����.

		System.out.println("����� �Է��� ������ : ");
		for(int i=0; i<array1.length; i++) { //�Է°��� ���
			System.out.print(array1[i]+" ");
		}
		math(array1); //�������� �޼ҵ� ,math�� ȣǮ�ϸ鼭 �Ű������� array1�� �־��ָ� �ȴ�.
	}
	static void math(String...values) {
		int sum=0;		//������ ������ ���ϴ� ����
		double avg;		//����� �����ϴ� ����
		
		for(int i =0; i<values.length; i++) {
		//	sum+=values[i]; // values[i]��° ���� ���� String Ÿ���̹Ƿ� ����Ÿ������ ��ȯ
			sum +=Integer.parseInt(values[i]);
			//Intger.parseInt(String):������ StringŸ���� ������ ��ȯ
			
		}
		avg=(double) sum / values.length; //����� ����ȯ�� �ݵ�� �ʿ�(double)
		System.out.println();
		System.out.println("���Ƿ� ���� ���� �հ�� : " + sum);
		System.out.println("���Ƿ� ���� ���� ����� : "+ avg);
	}
}
	
