package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//�ܼ� ��ǲ �� �ѱ� ó�� �迭�� �ؾ���
//InputStream system.in

public class ConsoleinputObject_3 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in; //�ѹ��� ������ �� �ִ�. close() ���� �������� ���.
		
		byte[] b1 =new byte[100];
		int count1=is.read(b1);
		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("�迭�� ���� �Ѱ��� r�� n�� ���� : "+ count1);
		
		// n- byte ���� �б� 
		byte[] b2 = new byte[9];
		int offset=3;
		int length=6;
		int count2 =is.read(b2, offset, length);
		String str2 = new String(b2, 0, offset+count2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}

}
