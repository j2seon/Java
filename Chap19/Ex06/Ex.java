package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Ex {

	public static void main(String[] args) throws IOException {

		//�ѱ��� �ܼ� â���� ��ǲ�޴´�. 
		System.out.println("�ѱ��� �Է����ּ���!");
		InputStream is1 = System.in;
		//�ѱ��� �迭�� �޾ƾ��Ѵ�. ���� �迭 ����
		byte b1[] = new byte[100]; 
		int count1=is1.read(b1);
		String str1 = new String(b1, 0, count1, Charset.defaultCharset());
		
		//�ַܼ� ��ǲ���� �� ���Ϸ� �����ؾ��Ѵ�.
		// ���ο� �ý�Ʈ ������ ������ְ�
		File files = new File("src/Chap19/Ex06/input1.txt");
		
		OutputStream os1 = new FileOutputStream(files);
		byte[] b2 = str1.getBytes(Charset.defaultCharset());
		os1.write(b2);
		os1.flush();
		
		// ����� ������ ��������!
		//������ ������ �������ֱ�!
		File infile = new File("src/Chap19/Ex06/input1.txt");
		InputStream is2 = new FileInputStream(infile);
		
		byte b3[] = new byte[100];
		int count2 = is2.read(b3);
		String str2 = new String(b3, 0, count2, Charset.defaultCharset());
		
		//�ֿܼ� ������ ������ ����غ���
		
		OutputStream os2 = System.out;
		System.out.println("����� �Ǿ����ϴ�.");
		byte[] b4 = str2.getBytes(Charset.defaultCharset());
		os2.write(b4);
		os2.flush();
		os2.close();
		os1.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
	}

}
