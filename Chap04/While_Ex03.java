package Chap04;

public class While_Ex03 {

	public static void main(String[] args) {

		//1. while �� �⺻ ����
		int a = 0;   //�ʱⰪ
		while(a < 10) { //���ǽ�
			System.out.print(a + " ");
			a++; //������
		}
			//0~9���� ��µ� (10��)
		System.out.println();
		
		//For������ ��ȯ
		for(int i=0; i<10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		int b = 10;
		while(b > 0) {
			System.out.print(b+ " ");
			b--;
		}
		System.out.println();
		
		for(int i =10; i> 0 ; i--) {
			System.out.print(i + " ");
		}
		
		//while���� ���� ����

//		while(true) {
//			System.out.println("while�� ���ѷ��� �߻�");
//		}
		System.out.println();
		
		//while �� ���ѷ��� ����
		
		int c = 0;
		while(true) {
			if( c  > 100) {
				break;
			}
			System.out.print(c);
			c++;
		}
		
		
	}
}
