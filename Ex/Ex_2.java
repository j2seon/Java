package Ex;

public class Ex_2 {

	public static void main(String[] args) {
		//2. 1~100������ ��
		int sum =0;
		int i;
		for (i = 1;  i<=100 ; i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("1���� 100������ �� : "+sum);
		
		System.out.println("==========");
		
		sum=0;
		int j;
		for (j = 0; j < 100; j++) {
			sum+=j+1;
			
		}
		System.out.println("1���� "+j+"������ �� : "+sum);
		
		System.out.println("==============������ Ǯ��=============");
		sum=0;
		int num = 1;
		while (num<=100) {
			sum+=num;  // sum = sum + num
			num++;
		}
		System.out.println(sum);
		
	}

}
