package Chap02;

public class OperationBetweenDataType {
	
	public static void main(String[] args) {
		//���� �ڷ��� ���� ����
		int value1 = 3 + 5; //int + int===>int
		int value2 = 8 / 5; //
		float value3 = 3.0f + 5.0f; // float+float
		double value4 = 8.0 / 5.0; //double
		
		byte data1 = 3;
		byte data2 = 5;
		
		int value5 = data1 + data2; // int���� ���� �ڷ����� ���� ����� int Ÿ������ ��ȯ
		//byte value55 = data1 + data2; ������. 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//�ٸ� �ڷ��� ���� ����
		//int value6666= 5+3.5; // ����
		int value66 = (int)(5+3.5);  // ()�� ��� �������� �����ϸ� ����
		double value6 = 5+3.5; //int + double �� double ������
		
		double value8 = 5/2.0; //double 
		byte data3 = 3; 
		short data4 = 5;
		
		//short value99 = data3 + data4; // �����ϸ� int�� �Ǿ���.
		int value9 = data3 + data4; //int���� ���� ������ Ÿ���� ������ ��� int
		double value10 = data3 + data4; //double
		System.out.println(value66);
		System.out.println(value6);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);

	}

}
