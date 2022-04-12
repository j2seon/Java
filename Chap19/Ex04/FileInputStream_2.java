package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {
	
	
	public static void main(String[] args) throws IOException  {
		
		//1. 입력파일 생성
		File inFile = new File("src\\Chap19\\Ex04\\FileInputSteam1.txt");
		
		//2. byte 단위로 읽기 (한바이트씩 읽어서 처리 ): 처리속도가 느리다. 
		
		InputStream is1=null; //객체 선언
	
		try {
			is1 = new FileInputStream(inFile); //객체 생성
			int data;
			while((data=is1.read())!=-1) {
				System.out.print((char)data);
			} 
		}catch (IOException e) {
			System.out.println("오류");
		}finally {
			if(is1!=null) {
				is1.close();
			}
		}
		
		System.out.println();
		System.out.println("===================================");
			
			try(InputStream is2 = new FileInputStream(inFile)){
				//try (with resource : 객체 생성)
				int data1;
				while((data1=is2.read())!=-1) {
					System.out.print((char)data1);
				}
			}catch (IOException e) {
				System.out.println("파일을 못찾았습니다.");
			}
			
		
		System.out.println();
		System.out.println("===================================");
		
		
		//3. n-byte 단위 로 읽기 ( byte[]의 처음위치에서 부터 읽은 데이터 저장) : 여러 바이트를 동시에 읽어서 처리속도가 빠름.
			//배열의 방의 크기만큼 읽어 들여서 byte 배열에 저장
			//한글 처리가능 
		
		InputStream is3 = new FileInputStream(inFile);
		
		byte[] b1 = new byte[9];
		int count=0;
		while((count=is3.read(b1))!=-1) {
			//is2.read() : 1byte 씩 읽는다.      //한글을 처리 못한다. 
			//is2.read(b1) : 9byte 씩 읽는다. b1에 저장
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
		// b3의 배열을 offset 위치에 6개를 읽어라
		for(int i=0; i<offset+count; i++) {
			System.out.print(new String(b3,Charset.forName("MS949")));
		}
		}
		
	
}
