package Chap04;

public class If_Ex_01 {

	public static void main(String[] args) {
		
		//1~100���� 5�� ����� ���ϰ� ����� ���ض� 
		
		int i;
		int sum=0;
		int a = 0;
		for(i=1; i<=100; i++) {
			if(i % 5 ==0) {
			sum+=i;
			a++;
			}
	}
		System.out.println("5�� ����� "+sum);
		System.out.println("5�� ������ "+sum / a);

		
		//1~10�� �������ϱ�
		int b;
		int c=1;
		for(b=1; b<=10; b++) {
			c*=b; //c=c*b 1/2/6
			System.out.println(c);
		}
		System.out.println("1~10 ���� "+c);
		
		
		
}
}
