package Chap04;

public class Continue_Break_EX01 {

	public static void main(String[] args) {
		//1. continue 사용해서 1~19단 중 홀수단만 출력
POS1:	for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i%2 == 0) {
					continue POS1;
				}
				System.out.println(i+ "*" +j+" = "+ (i*j));
			}
			System.out.println("==========");
		}
		System.out.println();
		System.out.println("=======문제2==========");
		//2. continue를 사용해서 1~19단 중 3의 배수단만 출력
POS2:	for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i%3 == 0) {
					System.out.println(i+ "*" +j+" = "+ (i*j));
				}else {
					continue POS2;
				}
			}
			System.out.println("========");
		}
	}
}
