package Chap04;

public class For_ex_03_01 {

	public static void main(String[] args) {
	//���� �Ѱ�
	//	int s=0;
	//	for(int i=0; i<=1000; i++) {
	//		if(i%4==0) {
//			s+=i;
//			}
//		}
//			System.out.println("4�� ��� ������� : "+ s);
//		
		double sum = 0;  //���� ���� �����ϴ� ����
		int j = 0;  //4�� ����� ī��Ʈ�ϴ� ����
		for(int i = 1; i<=1000; i++) {
			if(i%4==0) { //
				sum += i ; //sum = sum + i(4�� ����� ���´�)
				j++;
			}
		}
		System.out.println("���� : "+ sum);
		System.out.println("����� : " + (sum/j));
		System.out.println(j);
		
		
	}

}
