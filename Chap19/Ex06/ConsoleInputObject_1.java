package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 * System.in : Consol에서 인풋을 받는 자바에서 제공해주는 객체 , InputStream 밑에 있음.
 * 		Windows : 콘솔에서 Enter : \r\n
 *  	MAC : 콘솔에서 Enter : \n
 * Sysout.out : Consol로 출력을 하는 객체 
 * 
 * 
 * */


public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		// 1.Consol에서 인풋 받기 위한 객체 생성.
		InputStream is1 = System.in;	//is1은 콘솔에서 인풋받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>>");
		
		int data;
		
		while((data=is1.read())!='\r' ) {  //1 byte 읽어서 int data 변수에 할당.
			System.out.println("읽은 데이터 : "+ (char)data + "남은바이트 수 : "+ is1.available());
		}
		System.out.println(data);			//13 <==\r
		System.out.println(is1.read());		//10 <==\n
		
		System.out.println("================================================");
		while((data=is1.read())!='\r' ) {  //1 byte 읽어서 int data 변수에 할당.
			System.out.println((char)data);
		}
	}

}
