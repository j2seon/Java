package Ex;

public class Ex5 {

	public static void main(String[] args) {
		//�迭 1~10���� �հ�
		
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum= 0;
		for(int i=0; i<10; i++) {
			sum+=scores[i];
		}
		System.out.println("scores �迭 �հ� : "+sum);
	}

}
