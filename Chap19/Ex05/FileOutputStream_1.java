package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : �߻�Ŭ����  < == FileInputStream �� ������ Ŭ����< == �б�
//OutputStream : �߻�Ŭ����  < == FileOutputStream �� ������ Ŭ����< == ����
//FileInputStream : byte () ���� ������ �б�.
//FileOutputStream : byte() ���� ������ ����. 

//windows �ܼ�, �޸��� Enter�� ������ : \r, \n(���͸� �ǹ��ϴ°�!)
//MAC �� \n �� ó��!

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
	
		//1. �Է����� ���� (�������� ����.)
	File outFile = new File("src/Chap19/Ex05/FileOutput1.txt");
	
	//2. 1- byte ����
	OutputStream os1 = new FileOutputStream(outFile);
		//FileOutputStream�� �������� �ʴ� ������ ������ ���� �� ������.
		//FileInputStream ��ο� ������ �����ؾ���.  ���� �߻�
	os1.write('J'); //write : IOException
	os1.write('A');
	os1.write('V');
	os1.write('A');
	os1.write('\r');	//13	 ���� (��������)
	os1.write('\n');	//10	 ���� (��������)
	
		// �߿� : write()�޼���� ����(�޸�)�� ���� ��.
		//		 flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �Ҷ� ��� .
	os1.flush(); //���۰� �� ���� �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ�.(��������) , write()�� ����ϸ� flush()�� ����� ���� ������.
	os1.close(); //close() ȣ�� �� flush�� �۵��ȴ�.
	
	
	//3. n- byte ��������(byte[]�� offset���� length ���� byte ������ ����) 
	
	OutputStream os2 = new FileOutputStream(outFile); //�����.
			//FileOutputStream(file o, Boolean append)    append = true : �̾��, append = false :�����(�⺻��)
	
		byte[] bytearray1 = "Hello!".getBytes();   				//Hello�� String ====> byte�� ��ȯ ,getBytes()���
		os2.write(bytearray1);
		os2.write('\n'); //\r�� �������� , \n�� �־ Windows ���� Enter ó���� ��.
		
		os2.flush();
		os2.close();
		
		
		OutputStream os3 = new FileOutputStream(outFile,true);	//�̾��. 
		
		byte[] bytearray2="Better the last smile than first laughter".getBytes();
		os3.write(bytearray2,7,8);
		os3.flush();
		os3.close();
		
		
	}

}
