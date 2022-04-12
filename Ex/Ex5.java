package Ex;

public class Ex5 {

	public static void main(String[] args) {
		//배열 1~10까지 합계
		
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum= 0;
		for(int i=0; i<10; i++) {
			sum+=scores[i];
		}
		System.out.println("scores 배열 합계 : "+sum);
	}

}
