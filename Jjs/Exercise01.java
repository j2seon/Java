package Jjs;

public class Exercise01 {

	public static void main(String[] args) {
		
		//������ 
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+ (i*j));
			}
		}
		
		//1~10�߿� 6�̻��̸� pass ���ϴ� fail
		int num = 6;
		switch(num) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
		
		//1���� 1000������ 3����� ���ϰ� ��� ���غ���
		double i;
		int sum=0;
		int p=1;
		for(i=1; i<=1000; i++) {
			if(i % 3 == 0) {
			sum+=i; 	
			p++;	
			}
		}
		System.out.println(sum);
		System.out.println(sum/p); 
		
		//while ������ ���غ���
		i=1;
		sum = 0;
		while(i<=1000) {
			if(i%3==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("while 3��� " + sum);
			
		//5,6,7,8,9 ���� ����
		int c=5;
		do {
			System.out.print(c+ " ");
			++c;
		}while(c<10);
		System.out.println();
		
		c=5;
		while(c>4 && c<=9 ) {
			System.out.print(c);
			c++;
		}
		System.out.println();
		c=5;
		for(c=5; c>4&&c<=9; c++) {
			System.out.print(c);
		}
		
		
			
		
		
		
		
		
		
	}

}
