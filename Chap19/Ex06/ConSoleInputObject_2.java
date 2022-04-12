package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConSoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		
		InputStream is =System.in; 		//콘솔을 통해서 인풋받겠다.
		//System.in은 한 페이지에서 한번만 만들 수 있다.
		
		System.out.println("영문만 입력하세요>>");
		
		//1. 1-byte 단위 읽기
		int data;
		while((data=is.read())!='\r') {		//\r까지 read하겠다.
			System.out.print((char)data);
		}
		is.read();			//10<==\n
		//n을 꺼내줘야 뒤에꺼도 쓸수있음.
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		
		//2. n-byte 읽기 ()
		byte [] bytearray1 = new byte[100];
		int count1 = is.read(bytearray1);		//count1은 100byte읽는다. 100 100, 30 -1 이런식으로
			//count1 배열에서 읽은 값의 개수
		
		
		for(int i=0; i< count1; i++) {
			System.out.print((char)bytearray1[i]);
			System.out.println(" : count1 = "+ count1);
		}
		
		//3.  n-byte 단위로 읽고 (length 만큼 읽어와서 byte[]offset 위치에서 저장)
		int count2;
		count2 = is.read(bytearray1);		//배열 내부에 \r\n 들어간다.
		System.out.print(new String(bytearray1, 0, count2));
		
//		while((count2=is.read(bytearray1))!='\r') { //콘솔에서는  -1말고
//			System.out.println(new String(bytearray1));
//		}
//		is.read(); 버퍼에서 빼지 않아야한다. 배열 내부에 \r\n
		
		System.out.println("============================");
		
		//4
		int offset =3;
		int length =5;
		byte[] bytearray2 = new byte[8];
		int count3=is.read(bytearray2, offset, length);
		for(int i=0; i<offset+count3; i++) {
			System.out.println((char)bytearray2[i]);
		}
		is.close(); //제일 마지막에 처리해줘야한다. 중간에 close() 하면 다시 호출이 불가능하다
		
		
		
	}

}
