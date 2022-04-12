package Jjs;

import java.util.Scanner;

public class Exercise08 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ют╥б");
		String num = scanner.nextLine(); 
		String[] array1=num.split(" ");
		
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		result(array1);
	}	
	static void result(String...values) {
		int sum=0;
		double avg;
		
		for(int i=0; i<values.length;i++) {
			sum=sum+Integer.parseInt(values[i]);
		}
		avg=(double)sum/values.length;
		System.out.println(sum);
		System.out.println(avg);
	}
	

}