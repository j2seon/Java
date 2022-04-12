package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputStream1_1 {

	public static void main(String[] args) throws IOException {
		InputStream is1 = System.in;	//is1은 콘솔에서 인풋받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>>");
		
		int data;
		
		while((data=is1.read())!=-1 ) {  //1 byte 읽어서 int data 변수에 할당.
			System.out.print((char)data);
		}									//-1하면 값만 나옴! 
		System.out.println(data);			//13 <==\n
		System.out.println(is1.read());		//더이상 read가 없다.
		
	}

}
