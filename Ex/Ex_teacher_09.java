package Ex;

public class Ex_teacher_09 {

	public static void main(String[] args) {
		/*
		 * 정수를 10 개 저장하는 배열을 만들고 1 에서 10 까지 범위의 정수를 랜
		덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
		평균은 5.4
		[Hint] 1 에서 10 까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
		int i = (int)(Math.random()*10+1)
		 */
		
		int[] num =new int[10];
		int sum =0;
		double avg = 0; //평균 = 전체방을 합해서 (sum)/방의 개수
						//평균은 소수점이 나오니까 double형으로 지정!!!
		
		//배열의 각 방에 임의의 수를 발생시켜서 입력 : 1~10
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*10+1); //num[0]~num[9]각 방에 난수 :1~10의 값을
			System.out.print(num[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			sum+=num[i]; //sum=sum+num[i]
		}
		avg =(double) sum / num.length; //평균 = 합/방의 개수
		System.out.println("평균은 : "+avg);
		System.out.println("합은 : "+sum);
		System.out.println("방의 개수 : "+ num.length);
	}

}
