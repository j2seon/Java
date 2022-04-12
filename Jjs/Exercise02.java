package Jjs;

import java.io.PipedOutputStream;

import javax.sql.rowset.JoinRowSet;

public class Exercise02 {

	public static void main(String[] args) {
		
		int score=72;
		if(score >= 90) {
			System.out.println("a학점");
		}else if (score >= 80 && score < 90) {
			System.out.println("b학점");
		}else if (score >= 70 && score < 80) {
			System.out.println("c학점");
		}else if (score < 70) {
			System.out.println("f학점");
		}
		int a=score;
		switch (a/10) {
		case 10 , 9:
			System.out.println("a학점");
			break;
		case 8:
			System.out.println("b학점");
			break;
		case 7:
			System.out.println("c학점");
			break;
		default:
			System.out.println("f학점");
			break;
		}
		System.out.println("=====");
		
		for (int i = 0; ; i++) {
			if (i % 2 == 1) {
				continue;
			}
			if (i>10) {
				break;
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("=======");
		
		for(int i=0; i<5; i++) {
			for (int j = 0; j < 3; j++) {
				if (i ==2) {
					continue;
				}
				if (j==1) {
					break;
				}
				System.out.print("a");
			}
		}
		System.out.println();
		System.out.println("================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==3 && j==2) {
					i=111;
					break;
				}
				System.out.println(i+","+j);
			}
		}
		System.out.println();
		System.out.println("================");
POS1:		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==3 && j==2) {
					break POS1;
				}
				System.out.println(i+","+j);
			}
		}
		
		
		
		
		
	}
	
}
