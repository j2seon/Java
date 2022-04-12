package Ex;

import java.util.Scanner;

import javax.management.loading.MLet;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int arr1 []=new int[10]; //방의 갯수만 선언
		int i;
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for (i = 0; i < arr1.length; i++) {
			arr1[i]=scanner.nextInt(); // for문을 사용해서 각 방에 스캐너에 넣은 값을 저장.
		}
		System.out.print("3의 배수는 ");
		for (i = 0; i < arr1.length; i++) {  
			if (arr1[i]%3==0) {  //각 방에 있는 값을 3으로 남았을때 나머지가 0인 값들만!
			System.out.print(arr1[i]+" ");
		}
			
		}
	}

}
