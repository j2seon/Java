package Ex;

import java.util.Scanner;

public class Quiz_teacher {

	public static void main(String[] args) {
 /*��� >>
  * ��� : Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
  * � ������ ������ �� �հ�: //sum
  * � ������ ��� ������ �� : //avg
  * "�׸�"�̶�� �Է��ϸ� ���α׷� ���� //��ü �ݺ���
  * next()�� ������� String���� �ϳ��� ����. 
  * nestLine()�� ������ �����ؼ� String���� ����. //��ĳ��
  */
		Scanner sc =new Scanner(System.in); //��ĳ�� ����!
		String str; // ��ü String ���� ��ǲ (���� �ִ� ��)
		String[] array; //��ǲ���� ���ڸ� �迭�� ����� ���� 
		int sum =0; //�������� �հ踦 �����ϴ� ����
		int num =0; // 
		double avg; //�������� ����� �����ϴ� ���� //(double) ������ ��/���� ��
		int b=0; //�������� �������� ��� ����
		do {
			System.out.println("��̸��� ������ ���� ������ �̿��ؼ� �Է��ϼ���.");
			System.out.println("�Է� : Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2 ");
			str=sc.nextLine(); // sc.next():��������� String
								// cs.nextLine():���ͱ��� ��ü�� String���� ����
			if(str.equals("�׸�")) {  // str�� �����ڷ����̹Ƿ� ==�� �ƴ� equals()�� ����Ѵ�. 
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			array=str.split(" "); //array�迭�� ���� ���� str�� ������ �������� �߶� �����ض�~
			System.out.println();
			System.out.print("�Է� ���� >> ");
			for(int j=0; j<array.length; j++) {
				if(j==array.length-1) {
					System.out.print(array[j]);
				}else if(j%2==0) {
					System.out.print(array[j]+" : ");
				}else if(j%2==1) {
					System.out.print(array[j]+" , ");
				}
			}System.out.println();
			
			for(int i=0; i<array.length; i++) { //array.length �迭�� index0~������ �����
				if(i%2!=0) {
					b=Integer.parseInt(array[i]);  //������ StringŸ���� ������ ��ȯ 
							sum+=b; //sum=sum+b ��ü�������� ��.
							num++;
				}
			}
			avg=(double)(sum/num); //int�� double�� �ٲ����.
			System.out.println("� ������ ������ �� �հ� : "+sum);
			System.out.println("� ������ ��� ������ �� : "+ avg);
			System.out.println();
		}while(true);
		
	}
}
