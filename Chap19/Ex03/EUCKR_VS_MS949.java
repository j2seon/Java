package Chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//EUCKR - �ѱ� ǥ��, �ѱ� ǥ�� ����  ��ü ǥ�� ������ �͸� �����Ǿ�����. �� 11,000 ---> 2200�� ǥ��, 8000�ڴ� ǥ��ȵ�.
	//������ 1byte�� ó���ȴ�
	//�ѱ��� 2byte�� ó���ȴ�.
//MS949 -Microsoft �翡�� ������ �ѱ� ǥ���� 11000��θ� ǥ���� �� �ִ�.

	//������ 1byte�� ó���ȴ�
	//�ѱ��� 2byte�� ó���ȴ�.
//UTF-8 : ��� ����(Web,FTP,Mail,.......) <��������>
	//������ 1byte�� ó���ȴ�	<==UTF8
	//�ѱ��� 3byte�� ó���ȴ�.
//UTF-16 : <��������>
	//����, �ѱ� ��� 2byte�� ó��
    //��糪���� �� ó��

//���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� ������ �ʴ´�.

//��Ŭ�������� ���ڵ� Ÿ�Լ��� 3����
	//1. ���� ����:
	//2. ������Ʈ���� ���� :
	//3. ���Ͽ��� ����

//�켱���� ���� > ������Ʈ > ����


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR VS MS949
		
		//1.�����ڸ� byte�� �������� String���� ��ȯ : 1byte
		byte[] b1 = "a".getBytes(Charset.forName("EUC-KR"));  //���ڸ� byte�� ��ȯ ===> ��Ʈ��ũ�� ���ڸ� �����Ҷ� byte�� ��ȯ�Ѵ�.
		//���ܰ� �߻��� (UnsupportedEncodingException) <== ��Ÿ�� �߻��� ��� ���ڵ� �� �� ���� ���ܰ� �߻��� ��.
		byte[] b2 = "a".getBytes("MS949");  //���ڸ� byte�� ��ȯ ===> ��Ʈ��ũ�� ���ڸ� �����Ҷ� byte�� ��ȯ�Ѵ�.
		
		System.out.println(b1.length);	//1
		System.out.println(b2.length);	//1
		
		System.out.println(new String(b1,Charset.forName("EUC-KR"))); 		//byte[]==>���ڿ��� �ٲ�
		System.out.println(new String(b2,"MS949")); 		//

		System.out.println();
		
		//2. �ѱ��� byte�� �������� String ���� ��������
		byte[] b3 ="��".getBytes("EUC-KR");
		byte[] b4 ="��".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(new String(b3,"EUC-KR"));  //byte[]==>���ڿ��� �ٲ�
		System.out.println(new String(b4,"MS949"));
		
		//3. EUC-KR�� ���� ��� ������ �͸� ǥ�� , �� 2000��
		//MS949sms 11,000�� ��� ǥ���.
		byte[] b5 ="��".getBytes("EUC-KR"); //11,000 �� �� 2000�� ǥ��, 8000(x)
		byte[] b6 ="��".getBytes("MS949");	//11,000�� ǥ��
		
		System.out.println(b5.length); 
		System.out.println(b6.length);
		System.out.println(new String(b5,"EUC-KR"));  //byte[]==>���ڿ��� �ٲ�
		System.out.println(new String(b6,"MS949"));
	}

}
