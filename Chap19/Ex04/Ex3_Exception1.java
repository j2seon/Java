package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 
  1. is1 < == inputStream 객체(절대경로 접근 - ms949.txt),에외처리
  2. is2 < == inputStream 객체(상대경로 접근 - utf-8.txt),에외처리(try with resource로 예외처리)
  				close() 자동으로처리
  
 */


public class Ex3_Exception1 {

	public static void main(String[] args)  {
		
		File file1=new File("J:\\js\\JAVA\\src\\Chap19\\Ex04\\exception-ms949.txt");
		
		InputStream is1 =null;  		//전역변수로 선언.  finally블락에서 is1.close()하기위함
		
		byte[] b1 = new byte[100];
		try {
			is1 = new FileInputStream(file1) ;		//객체 생성. FileInputStream은 FileNotFoundException이 발생한다.
		}catch(FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.");
		}
		int data=0;
		try {
			while((data=is1. read(b1))!=-1){
				String s = new String(b1, 0, data, Charset.forName("MS949"));
				System.out.println(s);
			}
		} catch (IOException e1) {
			System.out.println("실행오류");
		}finally {
			if(is1 !=null) {
				try {
					is1.close();
				} catch (IOException e) {
					System.out.println("실행오류");
				}
			}
		}
		System.out.println("==========================");
		//1-1 여러 Exception에 대해서 단일 try ~ catch로 처리
		
		
		InputStream is1_1 =null;  		//전역변수로 선언.  finally블락에서 is1.close()하기위함
		
		byte[] b11 = new byte[100];
				//한글처리 #1 : byte[]배열 선언.
		
		int data11=0;
		try {
			is1_1 = new FileInputStream(file1) ;		//객체 생성. FileInputStream은 FileNotFoundException이 발생한다.
			while((data11=is1_1.read(b11))!=-1){			//IOException
				//한글처리 #2 : read(byte배열)
				
				String is2 = new String(b11, 0, data11, Charset.forName("MS949"));
							//한글 처리 #3 : String(byte배열, offset, length, "encoding" ) 
				System.out.println(is2);
			}
		} catch (IOException e1) {
			System.out.println("실행오류");
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
			//한글처리 #1;
		int data2=0;
		try (InputStream is2 = new FileInputStream(file2))    {
			//try(with resource : 객체 생성, Ram을 사용) <== close() 자동으로 처리된다 AutoCloseable의 close() 구현한 클래스이어야 한다.
		
			while((data2=is2.read(b2))!=-1) {
				//한글처라 #2: is.read(byte배열);
				String str2 = new String(b2, 0, data2, Charset.forName("UTF-8"));
				System.out.println(str2);
			}
		}catch (IOException e) {
			System.out.println("예외발생");
		}
		
		
		
		
	}

}
