package Chap06_07.Ex02;

public class EffectOfPrimaryDataArgument {
	int abc ; //�ʵ� : Heap������ ����, ��üȭ�� �ؾ� ����� �� �ִ�.
	
	
	static int twice(int a) { //������ �Ű������� �޾Ƽ� *2�� ���� ����
		a = a*2;
		return a;  //a : ������ �޼ҵ尡 ����ɶ� ����
	}
	
	
	public static void main(String[] args) {
		int a = 3; //�������� (Stack ������ ������� ���� ����)
		int result1 = twice(3);
			System.out.println(result1);//6
		
		int result2 = twice(a);
		System.out.println(result2);  //6
		System.out.println(a);  //3 
		
		
	}

}
