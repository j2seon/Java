package Chap04;

public class Break_Ex04 {

	public static void main(String[] args) {
		//1. ���� loop�� ����� ������ break Ż��
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; // break�� ������ �ش� ������ ���� ���´�. 
		}//0
		
		//2. for�� ������ if ������ ����ؼ� break�� �־ �ش籸���� ���� ���´�.
		for (int i =0; i < 10; i++){
			if ( i == 5) {   //i�� 5�϶� for���� �������´�.
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		//3. ���� loop ���϶� break Ż�� 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break; //�ϳ��� �ݺ����� �������´�.
				}
				System.out.println(i+" , "+j);
			}
		}
		System.out.println("============");
		//4. ���� loop(�ݺ���)���� �Ѳ����� Ż��
		
POS1:		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break POS1;
				}
				System.out.println(i+" , "+j);
			}
		}
		System.out.println("=======================");
		//4-1. ���� loop(�ݺ���)���� �Ѳ����� Ż�� <<2, ������ ������ false�� ���� ��������)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ( i == 2 ) {
					i=100;
					break;
				}
				System.out.println(i+" , "+j);
			}
		}
		
		
	}

}
