package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConcileOutputObject_2 {

	public static void main(String[] args) throws IOException {
		OutputStream os =System.out;  //�ֿܼ� ���  byte�� �ֿܼ� ���� �������Ѵ�.
		
		//2. n- byte ��� (byte[] �迭�� ó������ ������ ������ ����)
		byte[] b1 = "�ȳ��ϼ���".getBytes();
		
		os.write(b1);
		os.write('\n');		//���ۿ� ����
		
		os.flush();		//������ ���� ���
		
		//3. 
		byte[] b2 = "�ݰ����ϴ�".getBytes(Charset.defaultCharset());
		
		os.write(b2, 6, 4); //6btye ���� �� 4byte�� ó��

		os.flush();
		
	}

}
