package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Exer {

	public static void main(String[] args) {

		File flie = new File("J:\\js\\JAVA\\src\\Chap19\\Ex04\\exception-ms949.txt");
		
		InputStream is1 =null;
		
		byte[] b1 = new byte[100];
		
		try {
			is1 = new FileInputStream(flie);
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}
		int data1=0;
		try {
			while((data1=is1.read(b1))!=-1) {
				String str = new String(b1, 0, data1, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("�Է� ����");
		}finally {
			if(is1!=null) {
				try {
					is1.close();
				} catch (IOException e) {
					System.out.println("�Է� ����");
				}
			}
		}
		
		InputStream is2 =null;
		
		byte[] b2 = new byte[100];
		
		int data2=0;
		try {
			is2 = new FileInputStream(flie);
			while((data2=is2.read(b2))!=-1) {
				String str1 = new String(b2, 0, data2, Charset.forName("MS949"));
				System.out.println(str1);
			}
		} catch (IOException e) {
			System.out.println("�Է� ����");
		}finally {
			if(is2!=null) {
				try {
					is2.close();
				} catch (IOException e) {
					System.out.println("�Է� ����");
				}
			}
		}
		
		
		File file2=new File("src\\Chap19\\Ex04\\exception-utf-8.txt");
		
		
		byte[] b3 = new byte[100];
		int data3=0;
		try (InputStream is3 = new FileInputStream(file2)){
			while((data3=is3.read(b3))!=-1) {
				String str1=new String(b3, 0, data3, Charset.forName("UTF-8"));
				System.out.println(str1);
			}
		} catch (IOException e) {
			System.out.println("����");
		}
		
		
	
	}
}