package Ex;

public class Ex_teacher_09_Random {

	public static void main(String[] args) {
		
		
		/*
		 * ������ 10 �� �����ϴ� �迭�� ����� 1 ���� 10 ���� ������ ������ ��
		���ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		������ ������ : 3 6 3 6 1 3 8 9 6 9 
		����� 5.4
		[Hint] 1 ���� 10 ���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
		int i = (int)(Math.random()*10+1)
		 */
		double c=(double) Math.random();  //���� �߻��� (������ ���� �ڵ��� �߻���Ŵ)
			// 0.0000xxxxxxx <== ������ ������ ���� �߻���Ų��.
		System.out.println(c);
		
		int d =(int)(Math.random() * 10);  //0~9������ ������ ���� �����Ѵ�.
		int e =(int)(Math.random() * 10+1); //1~10������ ���� �����Ѵ�.
		int f =(int)(Math.random() * 100+1);
		System.out.println("0���� 9������ ������ �� : "+d);
		System.out.println("1���� 10������ ������ �� : "+e);
		System.out.println("1���� 100���� ������ �� : "+f);
		
	}

}
