package Chap04;

public class Continue_Break_EX01 {

	public static void main(String[] args) {
		//1. continue ����ؼ� 1~19�� �� Ȧ���ܸ� ���
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
		System.out.println("=======����2==========");
		//2. continue�� ����ؼ� 1~19�� �� 3�� ����ܸ� ���
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
