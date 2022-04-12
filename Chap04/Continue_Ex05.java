package Chap04;

public class Continue_Ex05 {

	public static void main(String[] args) {
		
		//1. 단일 loop에서 continue
		for (int i = 0; i < 10; i++) {
			continue;
			//System.out.println("출력 구문 오류"); 
			//continue는 하위구문을 실행하지 않고 증가구문으로 이동함.==> "조건없이 사용 시 오류"
		}
		System.out.println();
		System.out.println("=========continue============");
		//2. 조건을 사용해서 continue 처리
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				continue; //밑의 구문을 실행하지 않고 증가조건으로 이동.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=========break===========");
		//3.조건을 사용해서 break로 처리
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break; //구문을 빠져나가는 것.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======다중루프 문의 continue=======");
		//4. 다중 loop문에서 continue 사용.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();
		System.out.println("=======다중루프 문의 break=======");
		//5. 다중 loop문에서 break 사용.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break; //j의 3,4는 값이 나오지 않음.
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();
		System.out.println("=======continue에서 라벨사용=======");
		//6. continue에서 라벨 사용
		POS2:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				if (j==3) {
					continue POS2; //라벨이 붙은 곳으로 가서 다시 출력한다.
				}
				System.out.println(i +" , "+j);
			}
			
		}
		System.out.println();
		System.out.println("=======break에서 라벨사용=======");
		//7. break에서 라벨 사용
		POS3:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				if (j==3) {
					break POS3;
				}
				System.out.println(i +" , "+j);
			}
		}
		
	}
}
