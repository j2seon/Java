package Chap10.Ex04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//
		boolean run=true;
		int nu=0;
	
		
		do {
			Scanner sc =new Scanner(System.in);
			System.out.println();
			System.out.println("1. 19�� ��� | 2.Ȧ���ܸ� ��� | 3�� ����ܸ� ���| 4.����");
			System.out.println("==================");
			System.out.print("��ȣ�� �Է����ּ��� >>>>");
			nu=sc.nextInt();
			if(nu==1) {//19�� ��� ���� for�� ��� 
				for(int i=1; i<20; i++) {
					for(int j=1; j<20; j++) {
						System.out.println(i+"*"+j+" : "+(i*j));
					}
				}
			}else if(nu==2) {
				for(int i=1; i<20; i+=2) {
					for(int j=1; j<20; j++) {
						System.out.println(i+"*"+j+" : "+(i*j));
					}
				}
			}else if(nu==3) {
				for(int i=1; i<20; i++) {
					for(int j=1; j<20; j++) {
						if(i%3==0) {
							System.out.println(i+"*"+j+" : "+(i*j));
						}
					}
				}
			}else if(nu==4) {
				break;
			}
		}while(run);
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		
	}

}
