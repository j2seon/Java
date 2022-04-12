package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConcileOutputObject_2 {

	public static void main(String[] args) throws IOException {
		OutputStream os =System.out;  //콘솔에 출력  byte로 콘솔에 값을 던져야한다.
		
		//2. n- byte 출력 (byte[] 배열에 처음부터 끝가지 데이터 쓰기)
		byte[] b1 = "안녕하세요".getBytes();
		
		os.write(b1);
		os.write('\n');		//버퍼에 쓰기
		
		os.flush();		//버퍼의 내용 출력
		
		//3. 
		byte[] b2 = "반갑습니다".getBytes(Charset.defaultCharset());
		
		os.write(b2, 6, 4); //6btye 제거 후 4byte만 처리

		os.flush();
		
	}

}
