package Chap19.Ex08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		
		// 1. 콘솔 입력(MS949) : default charset, 콘솔에서 입력, 출력은 byte스트림!
		
		try {
			InputStreamReader isr =new InputStreamReader(System.in,"Ms949");
			//InputStreamReader : 바이트를 ===> char로 변환!!!!  바이트로 들어오는 ms949를 변환시키는 것
			//System.in : 콘솔 입력 , byte     
			//isr은 변환된 char를 가지고 있다.
			
			
			System.out.println("한글을 원하는 대로 입력하세요 >>> ");
			
			int data;
			while((data= isr.read())!='\r') { //콘솔입력을 대기함. //enter를 만날때까지 1바이트씩 읽음
				System.out.println((char)data);
			}
			System.out.println();
			System.out.print(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
		System.out.println();
		
		//2. 콘솔 입력 (UTF-8)
		try (InputStreamReader isr2 =new InputStreamReader(System.in,"UTF-8");){
			
			
			System.out.println("한글을 원하는 대로 입력하세요2 >>> ");
			
			int data;
			while((data= isr2.read())!='\r') { //콘솔입력을 대기함. //enter를 만날때까지 1바이트씩 읽음
				System.out.println((char)data);
			}
			System.out.println();
			System.out.print(isr2.getEncoding());
			
		} catch (Exception e) {}
		
		
		
		

	}

}
