package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		//1. 1-byte 출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\n');   //버퍼에서만 저장되어있다.
		os.write('\r');
		
		os.flush(); //버퍼의 내용을 콘솔에 출력
		
		//os.close();
		
		//2. n-byte 출력
		
		byte[] b1= "Hello".getBytes(); //String ==>byte로 변환
		os.write(b1);
		os.write('\n');
		os.flush();
		
		//3. n-byte 출력
		
		byte[] b2= "Better the last smile than the first laughter".getBytes();
		os.write(b2,7,8);
		os.flush();
		os.close();
		
	}

}
