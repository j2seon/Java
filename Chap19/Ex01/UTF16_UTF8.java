package Chap19.Ex01;

import java.io.UnsupportedEncodingException;

//UTF16은 고정길이 : 한글,영문 모두 2byte를 사용한다.
//UTF8은 : 영문 1byte 한글 2byte를 사용한다.

public class UTF16_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 ="abc".getBytes("UTF-16"); //문자열을 -->byte[]
				//BOM 식별코드 2byte
				//abc : 6byte
		
		byte[] b2 ="abc".getBytes("UTF-8");
		
		System.out.println(b1.length); //8 : BOM(2) + 6(abc)
		System.out.println(b2.length); //3
		
		for(byte b : b1) {
			System.out.printf("%02X",b); //16진수로 출력
			System.out.println();
		}
		System.out.println("============================");
		for(byte b : b2) {
			System.out.printf("%02X",b);
			System.out.println();
		}
		System.out.println();
		System.out.println("==============================");
		byte[] b3 ="가나다".getBytes("UTF-16"); //8 BOM(2) + (6byte)
		byte[] b4 ="가나다".getBytes("UTF-8"); // 9 // 한글(3byte)
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		
		for(byte b : b3) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		for(byte b : b4) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
	}

}
