package Chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//������
		boolean aBcD;  //�������� ù�ڴ� �ҹ��ڷ� �����Ѵ�, �ܾ ������ ��� ù�ܾ�� �빮�ڷ�
		byte �����ٶ�;  //�������� �ѱ��� ���� �� �ִ�. (�������� ����)
		short _abcd; //_�� Ư�����ڷ� ����� �� �ִ�.
		char $ab_cd; //$�� ����� �� �ִ�. ������ ��� �Ұ���
		long abcd3; //������ ���ڸ� ���� �� �ִ�. ��, ù��° �ܾ ���ڰ� ���� �ȉ�.
		double main; 
		//double class; // JAVA���� ����ϴ� �������� ��������� ����� �� ����.
		int ABCD; //�������� �빮�ڸ� ���� �� �ִ�. (�������� ���� : ����,��� ������ ����.), ����� ������� ��ü �빮�ڷ� ���.
		
		//���: ���� ������ �� ����. finalŰ���带 ����Ѵ�, ����̸��� �빮�ڷ� ���
		final double PI;
		final int MY_DATA;
		final float my_Data; //�������� ����.
		
		PI= 3.141957;
		System.out.println(PI);
		
		//PI=123.4567; // ������� ���� ���Ҵ� �� �� ����.
		
		abcd3 = 1234L; //���� ������ Ÿ�� long������ ���� �Ҵ��� ��, �ҹ��� l �빮�� L�� ����ؾ���.
		System.out.println(abcd3);
		abcd3 = 56789l; //������ ���� ���Ҵ�.
		System.out.println(abcd3);
	
		aBcD= true; //true or false�� �����ϴ�.
		
		�����ٶ� = 127; //byte�� -128~127���� �����ϴ�.
		System.out.println(�����ٶ�);
		//�����ٶ� = 128; 127������ ������ 128�� �����߻���.
		
	
		
		
		
	}

}
