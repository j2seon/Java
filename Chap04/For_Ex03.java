package Chap04;
public class For_Ex03 {
	public static void main(String[] args) {

		int a; //��� �ۿ��� ����� ����, ���𸸵� ����(�ʱⰪ�Ҵ� x)
		
		for(a=0; a<5 ; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.println("��� �ۿ��� ��� : " + a); //������ �ۿ��� ����Ǿ��⶧���� ����/(����)
		
		
		System.out.println("============");
		
		for(int b=0; b<=10; b++) {
			System.out.println(b);
		}
		//System.out.println(b); for�� �������� ��ȿ��(����)
		
		System.out.println("=======================");
		int c;
		for( c=10; c>0; c-- ) {
			System.out.print(c+" ");
		}
		System.out.print("���ۿ��� c ��� : "+ c);
		System.out.println();
		
		//2�� ����� ���
		for (int i=0; i<100; i += 2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		
		/* for�� ������ �ʱⰪ�� �������� ���������� �Ҵ��� �� �ִ�.*/
		for(int i=0, j=0; i < 10 ; i++, j++) {
			System.out.println(i+" * "+ j+" : " + (i * j));
		}
		// for�� ����ؼ� 1~10���� *���� ����� �ּ���.
		
		int d=1;
		for(int e = 1; e <= 10; e++) {
			d*=e;       //d = d * e
			System.out.println(d); //1���� �����ߴ� ������ ���� �� ����
			 					  //������ d�� �ʿ��ϱ� ������ for�� �ۿ��� d���� ����� ��.
		}
		System.out.println("1���� 10���� ���� ��� : " + d);
		
		//for ���� ����ؼ� 1~100���� ���� ��
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;
			System.out.println(sum);
		}
		System.out.println("1���� 100���� ���� �����? "+sum);
	
		System.out.println("=========������ ���========");
	
		/*���� for�� : 1~9�ܱ��� ������ ���*/
		int o;
		int j;
		for(o=1; o<=9; o++) {  //o : ���� ���
			for(j=1; j<=9; j++) {
				System.out.println(o + " * " +j+" ="+(o*j));
			}
			System.out.println(o+" "+j);
			System.out.println("=====================");
		}
		/*
		* For ������ ���� ���� �߻�
		*/
//		for(int dd =0 ; ; dd++ ) {
//			System.out.println(dd + " "); //0,1,2,~ ���ѷ���
//		}
		//���ѷ���Ż��
		for(int dd=0; ; dd++) {
			if(dd>100)
				break;	//���ѷ����� ����
			
			System.out.println(dd);
		}
		//1.for���� ����ؼ� 1���� 100������ 4�� ����� ���� �� :
		//2.��� �� ���(double)
		int avg=0;
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%4==0) {
				sum+=num;
				avg++;
			}
		}System.out.println("4�� ����հ� : "+ sum);
		 System.out.println("4�� ��� ��� : "+ (sum/avg));
		
		
	}
}
		
	

	
	
	
	  
	
	



