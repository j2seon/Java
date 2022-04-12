package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//콘솔 인풋 시 한글 처리 배열로 해야함
//InputStream system.in

public class ConsoleinputObject_3 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in; //한번만 선언할 수 있다. close() 제일 마지막에 사용.
		
		byte[] b1 =new byte[100];
		int count1=is.read(b1);
		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("배열의 방의 총갯수 r과 n을 포함 : "+ count1);
		
		// n- byte 단위 읽기 
		byte[] b2 = new byte[9];
		int offset=3;
		int length=6;
		int count2 =is.read(b2, offset, length);
		String str2 = new String(b2, 0, offset+count2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}

}
