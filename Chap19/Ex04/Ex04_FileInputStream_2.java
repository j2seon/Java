package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//is1 : Ms949 한글로 읽기처리, try with resource로 예외처리
//si2 : UTF-8 한글로 읽기 처리 , try로 
public class Ex04_FileInputStream_2 {

	public static void main(String[] args) {

		File file1 = new File("src\\Chap19\\Ex04\\flies\\file-ms949.txt");
		
		byte b1[] = new byte[100];
		try (InputStream is1 = new FileInputStream(file1);) {
			int data1 ;
			while((data1=is1.read(b1))!=-1) {
				String str1 = new String(b1,0,data1, Charset.forName("MS949"));
				System.out.println(str1);
			}
		} catch (IOException e) {
			System.out.println("오류입니다.");
		}
		
		System.out.println("=====================================");
		
		File file2 = new File("src\\Chap19\\Ex04\\flies\\file-utf8.txt");
		
		InputStream is2 = null;
		byte b2[] = new byte[512];
		try {
			is2= new FileInputStream(file2);
		int data2;
		while((data2=is2.read(b2))!=-1) {
			String str2 = new String(b2, 0, data2, "UTF-8");
			System.out.println(str2);
			}
		} catch (IOException e) {
			System.out.println("오류입니다.");
		}try {
			is2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
