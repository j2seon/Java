package Chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.sql.rowset.BaseRowSet;

/*Reader Writer 를 사용
 * 1. 콘솔에서 한글을 읽어서 
 * C:\temp\a\aaa.txt(MS949)
 * C:\temp\b\bbb.txt(UTF-8)
 * 
 * a,b는 없으면 생성
 * 
 * 파일에서 읽어와서 콘솔에 출력
 */


public class Ex_Reader_Writer {
	public static void main(String[] args) {
		
		//1. 폴더 만들기
		File file1 = new File("C:\\temp1\\a");
			if(!file1.exists()) {file1.mkdirs();}
		File file2 = new File("C:\\temp1\\b");
			if(!file2.exists()) {file2.mkdirs();}
		
		//2. 폴더 안에 파일 만들기
		File file3 = new File("C:\\temp1\\a\\aaa.txt");
		File file4 = new File("C:\\temp1\\b\\bbb.txt");

		//3. 콘솔에서 입력한 값을 읽어서 파일로 보내기(ms)
		 InputStreamReader isr=null;
		 OutputStream os=null;
		 OutputStream os2=null;
		 OutputStreamWriter osw1=null;
		 OutputStreamWriter osw2 =null;
			try {
				//읽기
				isr = new InputStreamReader(System.in,"MS949");
				
				os = new FileOutputStream(file3);
				os2 = new FileOutputStream(file4);
				osw1= new OutputStreamWriter(os,"MS949");
				
				osw2= new OutputStreamWriter(os2,"UTF-8");
				
				System.out.println("내용을 입력하세요");
				int data; 
				while((data=isr.read())!='\r') {
					System.out.print((char)data);
					
					osw1.write((char)data);
					osw2.write((char)data);
					osw1.flush();
					osw2.flush();

				}
			} catch (Exception e) {}
			
			
		//4. 파일을 읽어서 콘솔에 넣기
			InputStreamReader osr1=null;
			InputStreamReader osr2=null;
			try {
				 osr1= new InputStreamReader(new FileInputStream(file3),"MS949");
				int data1;
				System.out.println();
				System.out.println("입력된 내용입니다 - ms949로");
				while((data1=osr1.read())!=-1) {
					System.out.print((char)data1);
				}
			} catch (Exception e) {
			} 

			try {
				osr2= new InputStreamReader(new FileInputStream(file4),"UTF-8");
				int data2;
				System.out.println();
				System.out.println("입력된 내용입니다 -utf8로 ");
				while((data2=osr2.read())!=-1) {
					System.out.print((char)data2);
				}
				osr1.close();
				
				
			} catch (Exception e) {
			} 
			
			
			
			
		

		
		
		
		
		
		
		
	}

}
