package Chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader : byte 데이터를 char 포멧으로 변환하는 객체. <==	인코딩을 지정할 수 있다.  
	//byte 포맷은 인코딩을 잘 지정해야한다.  <=encoding : ms949, utf
	//char 포맷으로 바꾸면 인코딩 타입을 신경 쓸 필요가 없다. 
	//사용 목적 filReader : default charset만 사용 가능해서 InputStreamReader를 이용하면 charset을 바꿀수 있다. 현재 default charset이지만 외부파일이 UTF-8인경우 
	// 네트워크에 전송되는 스트림이 utf8,ms949 ==>char로 변환처리


public class InputStreamReader_1 {
	public static void main(String[] args) {
		
		//1. 파일 객체 생성
		File isr =new File("src\\Chap19\\Ex08\\isr.txt"); //현재isr.txt UTF-8로 저장되어있다.
		
		try(Reader reader  = new FileReader(isr);) {  //FileReader는 인코딩 설정이 안됨. default Encoding 만 사용.
			int data;  
			while((data=reader.read())!=-1) {	//MS949
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("================================================");
		
		//2. fileInputStrea + inpuStreamReader를 이용한 파일 읽기
		//InputStreamReader(is,"UTF-8") : byte ==>Char로 변환
		
		try (InputStream is = new FileInputStream(isr);
			InputStreamReader isr1 = new InputStreamReader(is,"UTF-8");){ //isr1 : char 변환된 
			
			int data; 
			while((data=isr1.read())!=1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		} catch (IOException e) {
		}
		
		
		
		
	}

}
