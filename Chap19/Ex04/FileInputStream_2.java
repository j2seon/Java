package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {
	
	
	public static void main(String[] args) throws IOException  {
		
		//1. �Է����� ����
		File inFile = new File("src\\Chap19\\Ex04\\FileInputSteam1.txt");
		
		//2. byte ������ �б� (�ѹ���Ʈ�� �о ó�� ): ó���ӵ��� ������. 
		
		InputStream is1=null; //��ü ����
	
		try {
			is1 = new FileInputStream(inFile); //��ü ����
			int data;
			while((data=is1.read())!=-1) {
				System.out.print((char)data);
			} 
		}catch (IOException e) {
			System.out.println("����");
		}finally {
			if(is1!=null) {
				is1.close();
			}
		}
		
		System.out.println();
		System.out.println("===================================");
			
			try(InputStream is2 = new FileInputStream(inFile)){
				//try (with resource : ��ü ����)
				int data1;
				while((data1=is2.read())!=-1) {
					System.out.print((char)data1);
				}
			}catch (IOException e) {
				System.out.println("������ ��ã�ҽ��ϴ�.");
			}
			
		
		System.out.println();
		System.out.println("===================================");
		
		
		//3. n-byte ���� �� �б� ( byte[]�� ó����ġ���� ���� ���� ������ ����) : ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����.
			//�迭�� ���� ũ�⸸ŭ �о� �鿩�� byte �迭�� ����
			//�ѱ� ó������ 
		
		InputStream is3 = new FileInputStream(inFile);
		
		byte[] b1 = new byte[9];
		int count=0;
		while((count=is3.read(b1))!=-1) {
			//is2.read() : 1byte �� �д´�.      //�ѱ��� ó�� ���Ѵ�. 
			//is2.read(b1) : 9byte �� �д´�. b1�� ����
			//count1  :  9  ,  9,  2 , -1
			for(int i=0; i<count; i++) {
				System.out.print((char)b1[i]);
			}
			System.out.println(" : count = " + count);
		}
		is3.close();
		
		System.out.println();
		System.out.println("===========================");
		InputStream is4 = new FileInputStream(inFile);
		byte[] b2 = new byte[30];
		int count1=0;
		while((count1=is4.read(b2))!=-1) {
			System.out.println(new String(b2, Charset.forName("MS949")));
		}is4.close();
		
		System.out.println();
		System.out.println("===========================");
		
		InputStream is5 = new FileInputStream(inFile);
		byte[] b3 = new byte[9];
		
		int offset = 3; 
		int length = 6;
		int count2 = is5.read(b3, offset, length);
		// b3�� �迭�� offset ��ġ�� 6���� �о��
		for(int i=0; i<offset+count; i++) {
			System.out.print(new String(b3,Charset.forName("MS949")));
		}
		}
		
	
}
