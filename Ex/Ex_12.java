package Ex;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			int n = (int)(Math.random()*3); 
			String com= str[n]; //컴퓨터가 낼 값
			System.out.print("가위 바위 보! >> ");
			String name = scanner.next(); //내가 적는 것
			if (name.equals("그만")) {
				System.out.println(" 게임을 종료합니다...");
				break;
			}
			System.out.print("사용자 = "+name+","+"컴퓨터 = "+com);
			if (name.equals("가위")) {
				if (com.equals("가위")) {
					System.out.println(" 비겼습니다.");
				}else if (com.equals("바위")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}else if (com.equals("보")) {
					System.out.println(" 사용자가 이겼습니다.");
				}
			}
			else if(name.equals("바위")) {
				if (com.equals("가위")) {
					System.out.println(" 사용자가 이겼습니다.");
				}else if (com.equals("바위")) {
					System.out.println(" 비겼습니다.");
				}else if (com.equals("보")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}
			}
			else if(name.equals("보")) {
				if (com.equals("가위")) {
					System.out.println(" 컴퓨터가 이겼습니다.");
				}else if (com.equals("바위")) {
					System.out.println(" 사용자가 이겼습니다.");
				}else if (com.equals("보")) {
					System.out.println(" 비겼습니다.");
				}
			}
		}
			scanner.close();	
	}

}
