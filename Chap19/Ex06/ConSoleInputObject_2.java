package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConSoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		
		InputStream is =System.in; 		//�ܼ��� ���ؼ� ��ǲ�ްڴ�.
		//System.in�� �� ���������� �ѹ��� ���� �� �ִ�.
		
		System.out.println("������ �Է��ϼ���>>");
		
		//1. 1-byte ���� �б�
		int data;
		while((data=is.read())!='\r') {		//\r���� read�ϰڴ�.
			System.out.print((char)data);
		}
		is.read();			//10<==\n
		//n�� ������� �ڿ����� ��������.
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		
		//2. n-byte �б� ()
		byte [] bytearray1 = new byte[100];
		int count1 = is.read(bytearray1);		//count1�� 100byte�д´�. 100 100, 30 -1 �̷�������
			//count1 �迭���� ���� ���� ����
		
		
		for(int i=0; i< count1; i++) {
			System.out.print((char)bytearray1[i]);
			System.out.println(" : count1 = "+ count1);
		}
		
		//3.  n-byte ������ �а� (length ��ŭ �о�ͼ� byte[]offset ��ġ���� ����)
		int count2;
		count2 = is.read(bytearray1);		//�迭 ���ο� \r\n ����.
		System.out.print(new String(bytearray1, 0, count2));
		
//		while((count2=is.read(bytearray1))!='\r') { //�ֿܼ�����  -1����
//			System.out.println(new String(bytearray1));
//		}
//		is.read(); ���ۿ��� ���� �ʾƾ��Ѵ�. �迭 ���ο� \r\n
		
		System.out.println("============================");
		
		//4
		int offset =3;
		int length =5;
		byte[] bytearray2 = new byte[8];
		int count3=is.read(bytearray2, offset, length);
		for(int i=0; i<offset+count3; i++) {
			System.out.println((char)bytearray2[i]);
		}
		is.close(); //���� �������� ó��������Ѵ�. �߰��� close() �ϸ� �ٽ� ȣ���� �Ұ����ϴ�
		
		
		
	}

}
