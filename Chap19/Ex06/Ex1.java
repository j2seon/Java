package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Ex1 {
 
	public static void main(String[] args) throws IOException {
		
		System.out.println("������ �Է����ּ���!");
		InputStream is1 = System.in;
		//�ѱ��� �迭�� �޾ƾ��Ѵ�. ���� �迭 ����
		byte b1[] = new byte[100]; 
		int count1=is1.read(b1);
		String str1 = new String(b1, 0, count1, Charset.defaultCharset());
		
		
	}
	
}
