package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FilteInputStream_1_1 {

	public static void main(String[] args) {
		
		//예외처리 1. 각 예외에 대해서 각각 처리
		
		
		File inFile = new File("src\\Chap19\\files\\FileInputStream_1.txt");
		InputStream is = null ;
		try {
			is = new FileInputStream(inFile) ;			// FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		int data=0; 
		try {
			while((data =is.read())!=-1) {		//IOException  못 읽을 수도 있음.
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		}
		try {
			if(is!=null){
				is.close();
			}			
		}catch (IOException e) {
		}
		
		System.out.println();
		System.out.println("======================================");
		
		//예외처리 2. 2개의 예외에 대해서 한꺼번에처리 

		
		InputStream is2 =null;
		int data2=0;
		try {
			is2 = new FileInputStream(inFile) ;			// FileNotFoundException
			while((data2 =is.read())!=-1) {		//IOException  못 읽을 수도 있음.
				System.out.print((char)data2);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다..");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("예외가 발생했습니다..");
			}
		}
		
	}
}
