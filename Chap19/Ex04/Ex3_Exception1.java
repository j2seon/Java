package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 
  1. is1 < == inputStream ��ü(������ ���� - ms949.txt),����ó��
  2. is2 < == inputStream ��ü(����� ���� - utf-8.txt),����ó��(try with resource�� ����ó��)
  				close() �ڵ�����ó��
  
 */


public class Ex3_Exception1 {

	public static void main(String[] args)  {
		
		File file1=new File("J:\\js\\JAVA\\src\\Chap19\\Ex04\\exception-ms949.txt");
		
		InputStream is1 =null;  		//���������� ����.  finally������� is1.close()�ϱ�����
		
		byte[] b1 = new byte[100];
		try {
			is1 = new FileInputStream(file1) ;		//��ü ����. FileInputStream�� FileNotFoundException�� �߻��Ѵ�.
		}catch(FileNotFoundException e){
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		int data=0;
		try {
			while((data=is1. read(b1))!=-1){
				String s = new String(b1, 0, data, Charset.forName("MS949"));
				System.out.println(s);
			}
		} catch (IOException e1) {
			System.out.println("�������");
		}finally {
			if(is1 !=null) {
				try {
					is1.close();
				} catch (IOException e) {
					System.out.println("�������");
				}
			}
		}
		System.out.println("==========================");
		//1-1 ���� Exception�� ���ؼ� ���� try ~ catch�� ó��
		
		
		InputStream is1_1 =null;  		//���������� ����.  finally������� is1.close()�ϱ�����
		
		byte[] b11 = new byte[100];
				//�ѱ�ó�� #1 : byte[]�迭 ����.
		
		int data11=0;
		try {
			is1_1 = new FileInputStream(file1) ;		//��ü ����. FileInputStream�� FileNotFoundException�� �߻��Ѵ�.
			while((data11=is1_1.read(b11))!=-1){			//IOException
				//�ѱ�ó�� #2 : read(byte�迭)
				
				String is2 = new String(b11, 0, data11, Charset.forName("MS949"));
							//�ѱ� ó�� #3 : String(byte�迭, offset, length, "encoding" ) 
				System.out.println(is2);
			}
		} catch (IOException e1) {
			System.out.println("�������");
		}finally {
			if(is1_1!=null) {
				try {
					is1_1.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("==========================");
		
		File file2=new File("src\\Chap19\\Ex04\\exception-utf-8.txt");
		byte[] b2 = new byte[100];
			//�ѱ�ó�� #1;
		int data2=0;
		try (InputStream is2 = new FileInputStream(file2))    {
			//try(with resource : ��ü ����, Ram�� ���) <== close() �ڵ����� ó���ȴ� AutoCloseable�� close() ������ Ŭ�����̾�� �Ѵ�.
		
			while((data2=is2.read(b2))!=-1) {
				//�ѱ�ó�� #2: is.read(byte�迭);
				String str2 = new String(b2, 0, data2, Charset.forName("UTF-8"));
				System.out.println(str2);
			}
		}catch (IOException e) {
			System.out.println("���ܹ߻�");
		}
		
		
		
		
	}

}
