package Chap04;

public class Continue_Ex05 {

	public static void main(String[] args) {
		
		//1. ���� loop���� continue
		for (int i = 0; i < 10; i++) {
			continue;
			//System.out.println("��� ���� ����"); 
			//continue�� ���������� �������� �ʰ� ������������ �̵���.==> "���Ǿ��� ��� �� ����"
		}
		System.out.println();
		System.out.println("=========continue============");
		//2. ������ ����ؼ� continue ó��
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				continue; //���� ������ �������� �ʰ� ������������ �̵�.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=========break===========");
		//3.������ ����ؼ� break�� ó��
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break; //������ ���������� ��.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======���߷��� ���� continue=======");
		//4. ���� loop������ continue ���.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();
		System.out.println("=======���߷��� ���� break=======");
		//5. ���� loop������ break ���.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break; //j�� 3,4�� ���� ������ ����.
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();
		System.out.println("=======continue���� �󺧻��=======");
		//6. continue���� �� ���
		POS2:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				if (j==3) {
					continue POS2; //���� ���� ������ ���� �ٽ� ����Ѵ�.
				}
				System.out.println(i +" , "+j);
			}
			
		}
		System.out.println();
		System.out.println("=======break���� �󺧻��=======");
		//7. break���� �� ���
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
