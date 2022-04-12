package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		//1. ������ ���� ����.
		File outdfile = new File("src/Chap19/Ex05/FileOutput2_1.txt"); //�⺻������ ��Ŭ������ default charactorSet���� ����ȴ�
		
		//2. n- byte���� ���� ó��(byte[]�� ó������ ������ ����)
		OutputStream os2 = new FileOutputStream(outdfile);
		byte[] bytearray1 ="�ȳ��ϼ���".getBytes(Charset.forName("MS949")); //String ==> byte[]�� ���� : getBytes()
				//���� 2byte�� ó����. �� 10byte�� ����.
		
		os2.write(bytearray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//3. n- byte���� ���� ó��(byte[]�� offset���� length���� ����Ʈ ������ ����)
		OutputStream os3 = new FileOutputStream(outdfile,true); //�̾ ����.
		byte[] bytearray2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949"));
		os3.write(bytearray2,6,5);
		
		//����, ����, Ư������ <==ASCII�ڵ�� 1byte
		
		os3.flush();
		os3.close();
	}

}
