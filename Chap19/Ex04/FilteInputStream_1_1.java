package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FilteInputStream_1_1 {

	public static void main(String[] args) {
		
		//����ó�� 1. �� ���ܿ� ���ؼ� ���� ó��
		
		
		File inFile = new File("src\\Chap19\\files\\FileInputStream_1.txt");
		InputStream is = null ;
		try {
			is = new FileInputStream(inFile) ;			// FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		int data=0; 
		try {
			while((data =is.read())!=-1) {		//IOException  �� ���� ���� ����.
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		}
		try {
			if(is!=null){
				is.close();
			}			
		}catch (IOException e) {
		}
		
		System.out.println();
		System.out.println("======================================");
		
		//����ó�� 2. 2���� ���ܿ� ���ؼ� �Ѳ�����ó�� 

		
		InputStream is2 =null;
		int data2=0;
		try {
			is2 = new FileInputStream(inFile) ;			// FileNotFoundException
			while((data2 =is.read())!=-1) {		//IOException  �� ���� ���� ����.
				System.out.print((char)data2);
			}
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�..");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��߽��ϴ�..");
			}
		}
		
	}
}
