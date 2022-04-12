package Chap14.Ex01;

public class ArrayException_1 {

	public static void main(String[] args) {

		int[] arr= new int[5];	//arr배열에 배열방 5개 생성. index :0,1,2,3,4
	
	
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){  //하위의 모든 예외를  처리할 수있다.
			System.out.println("배열의 인덱스 방번호를 넘긴다");
		}finally {
			System.out.println("출력");
		}
		System.out.println("종료");
	
		
	}
}

