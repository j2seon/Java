package Ex;

public class Ex6 {

	public static void main(String[] args) {
		
		// 배열의 항목에서 최대값구하기 for문 이용
		int max=0; //최대값을 저장하는 변수
		int[] array = {4,5,1,2,3};
		for (int i:array) {  //향상된 for문 이용 i에 array의 값이 입력된다.
			if(i>max) {
				max=i;
			}
		}System.out.println(max);
		
		System.out.println("====== 다른 방법 생각해보기 =======");
		max = array[0];  
		for (int i = 0; i < array.length; i++) {//각방의 값을 순환하면서 가지고온다.
			if(array[i]>max) { //방의 값이 max변수의 값보다 클]
				max=array[i]; //max 변수에 큰값을 저장
			}
		}System.out.println(max);
		
		System.out.println("================");
		
		max=0;
		for (int i = 0; i < array.length; i++) {
			max=array[0];  //max를 이중으로 지정하니까 비효율적일듯
			if (max<array[i]) {
				max=array[i];
				System.out.println(max);
			} //출력을 밖에서 하게되면 for에 있는 max값으로 적용됨...
		}
	
		
	}

}
