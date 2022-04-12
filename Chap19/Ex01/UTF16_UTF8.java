package Chap19.Ex01;

import java.io.UnsupportedEncodingException;

//UTF16�� �������� : �ѱ�,���� ��� 2byte�� ����Ѵ�.
//UTF8�� : ���� 1byte �ѱ� 2byte�� ����Ѵ�.

public class UTF16_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 ="abc".getBytes("UTF-16"); //���ڿ��� -->byte[]
				//BOM �ĺ��ڵ� 2byte
				//abc : 6byte
		
		byte[] b2 ="abc".getBytes("UTF-8");
		
		System.out.println(b1.length); //8 : BOM(2) + 6(abc)
		System.out.println(b2.length); //3
		
		for(byte b : b1) {
			System.out.printf("%02X",b); //16������ ���
			System.out.println();
		}
		System.out.println("============================");
		for(byte b : b2) {
			System.out.printf("%02X",b);
			System.out.println();
		}
		System.out.println();
		System.out.println("==============================");
		byte[] b3 ="������".getBytes("UTF-16"); //8 BOM(2) + (6byte)
		byte[] b4 ="������".getBytes("UTF-8"); // 9 // �ѱ�(3byte)
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		
		for(byte b : b3) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		for(byte b : b4) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
	}

}