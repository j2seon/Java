package Jjs;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,10,1};
		int money = scanner.nextInt();
		int won[]=new int[8];
		
		int i =0;
		while(i<unit.length) {
			won[i]= money /unit[i];
			money = money%unit[i];
			System.out.println(unit[i]+"¿ø ±Ç : "+ won[i]+" °³");
			i++;
		}scanner.close();
		
	}

}
