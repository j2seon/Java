package Ex;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int money = scn.nextInt();
		int a[] = new int[8];
		int[] unit = {50000,10000,1000,500,100,50,10,1}; //환산할 돈
		for (int i = 0; i < unit.length; i++) {
			a[i]= money/unit[i];
			money = money % unit[i];
			System.out.println(unit[i]+"원 짜리 : " +a[i]+" 개");
		}
		 scn.close();
		
		
		
		
		
	}

}
