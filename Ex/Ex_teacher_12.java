package Ex;

import java.util.Scanner;

public class Ex_teacher_12 {

	public static void main(String[] args) {
		
		/*[문항 12] 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음
			그림과 같다. 독자부터 먼저 시작한다. 독자가 가위 바위 보 중 하나를 입력하고
			<Enter>키를 치면, 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고
			컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여
			누가 이겼는지 판단한다. 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝난다.
			컴퓨터와 가위 바위 보 게임을 합니다.
			가위 바위 보! >> 바위
			사용자 = 바위 , 컴퓨터 = 가위 사용자가 이겼습니다.
			가위 바위 보! >> 가위
			사용자 = 가위 , 컴퓨터 = 가위 비겼습니다.
			가위 바위 보! >> 그만
			게임을 종료합니다...
			[Hint] 
			다음과 같은 문자열 배열을 만든다.
			String str[] = {"가위", "바위", "보"};
			컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 다음 코드를 이용한다.
			int n = (int)(Math.random()*3); // n 은 0, 1, 2 중에서 랜덤하게 결정
			컴퓨터가 낸 것이 "바위" 인지 비교하는 코드는 다음과 같이 한다.
			if(str[n].equals("바위")) //컴퓨터가 낸 것이 "바위"인지 비교하는 
		 */
		
		String str[] = {"가위","바위","보"};
		String com = null; // 컴퓨터가 낼 값을 저장할 변수
		String user = null; // 사용자가 낼 값을 저장할 변수
		int n;  //랜덤으로 낼 값을 저장하는 변수
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다!!!");
		do {
			System.out.print("가위 바위 보! >> ");
			user=sc.next(); //사용자가 내는 값
			if (user.equals("그만")) {
				break;
			}
			n=(int)(Math.random()*3);//컴퓨터가 낼 값 랜덤지정
			com = str[n]; //컴퓨터가 내는 값 : 0-가위, 1- 바위, 2- 보
			//사용자가 가위 일 때
			if(user.equals(str[0])) {
				if (com.equals(str[0])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 비겼습니다.");
				}else if(com.equals(str[1])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 컴퓨터가 이겼습니다.");
				}else if(com.equals(str[2])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 사용자가 이겼습니다.");
				}
				//사용자가 바위 일 때
			}else if (user.equals(str[1])) {
				if (com.equals(str[0])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 사용자가 이겼습니다.");
				}else if(com.equals(str[1])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 비겼습니다..");
				}else if(com.equals(str[2])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 컴퓨터가 이겼습니다.");
				//사용자가 보 일 때 
				}
			}else if (user.equals(str[2])) {
				if (com.equals(str[0])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 컴퓨터가 이겼습니다.");
				}else if(com.equals(str[1])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 사용자가 이겼습니다.");
				}else if(com.equals(str[2])) {
					System.out.print("사용자 = "+user+", 컴퓨터 = "+ com);
					System.out.println(" 비겼습니다");
				}
			}	
			
		} while (true);
		
			
		sc.close();
	 System.out.println("게임을 종료합니다...");
	}
		
}
