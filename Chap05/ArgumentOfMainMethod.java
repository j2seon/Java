package Chap05;

public class ArgumentOfMainMethod {
	//�����̸��� class�̸��� ���� ������ �����߻���!!!
	public static void main(String[] ar) { //���� �޼ҵ�[�Լ�]
		//�޼ҵ� �⺻����
		/*
		 * void main(String[] args) { // void: ���ϰ��� ������ ����.
		 * 	�޼ҵ带 ȣ��� ������ �ڵ�;		  // main: �޼ҵ��
		 * 							  //(��ǲ �Ű�����)
		 * }
		 */
		
		String a = ar[0]; // �ȳ��ϼ���
		String b = ar[1]; // 3 : ���� > ���������� string���� �޾�����
		String c = ar[2]; // 3.8 : �Ǽ�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ��ٶ� String���� ��ȯ
		System.out.println();
		System.out.println(b+1); //31
		System.out.println(c+1); //3.81
		
		System.out.println();
		//String�� ������ ���������� ��ȯ�ؼ� ����
		int d = Integer.parseInt(b); //b(String ===> Integer Ÿ������ ��ȯ
		double e = Double.parseDouble(c);//c(String) ===> Double Ÿ������ ��ȯ
		
		System.out.println(d+1); //4
		System.out.println(e+1); //4.8
		
		
	}
}
