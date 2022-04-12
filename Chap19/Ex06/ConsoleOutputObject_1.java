package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		//1. 1-byte ���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\n');   //���ۿ����� ����Ǿ��ִ�.
		os.write('\r');
		
		os.flush(); //������ ������ �ֿܼ� ���
		
		//os.close();
		
		//2. n-byte ���
		
		byte[] b1= "Hello".getBytes(); //String ==>byte�� ��ȯ
		os.write(b1);
		os.write('\n');
		os.flush();
		
		//3. n-byte ���
		
		byte[] b2= "Better the last smile than the first laughter".getBytes();
		os.write(b2,7,8);
		os.flush();
		os.close();
		
	}

}
