package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : 추상클래스  < == FileInputStream 을 구현한 클래스< == 읽기
//OutputStream : 추상클래스  < == FileOutputStream 을 구현한 클래스< == 쓰기
//FileInputStream : byte () 단위 데이터 읽기.
//FileOutputStream : byte() 단위 데이터 쓰기. 

//windows 콘솔, 메모장 Enter를 넣으면 : \r, \n(엔터를 의미하는것!)
//MAC 은 \n 만 처리!

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
	
		//1. 입력파일 생성 (존재하지 않음.)
	File outFile = new File("src/Chap19/Ex05/FileOutput1.txt");
	
	//2. 1- byte 쓰기
	OutputStream os1 = new FileOutputStream(outFile);
		//FileOutputStream에 존재하지 않는 파일을 넣으면 실행 시 생성됨.
		//FileInputStream 경로에 파일이 존재해야함.  예외 발생
	os1.write('J'); //write : IOException
	os1.write('A');
	os1.write('V');
	os1.write('A');
	os1.write('\r');	//13	 엔터 (생략가능)
	os1.write('\n');	//10	 엔턴 (생략가능)
	
		// 중요 : write()메서드는 버퍼(메모리)에 쓰는 것.
		//		 flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기 할때 사용 .
	os1.flush(); //버퍼가 꽉 차지 않더라도 강제로 파일에 쓰기를 한다.(생략가능) , write()를 사용하면 flush()를 사용할 것을 권장함.
	os1.close(); //close() 호출 시 flush가 작동된다.
	
	
	//3. n- byte 단위쓰기(byte[]의 offset부터 length 개의 byte 데이터 쓰기) 
	
	OutputStream os2 = new FileOutputStream(outFile); //덮어쓰기.
			//FileOutputStream(file o, Boolean append)    append = true : 이어쓰기, append = false :덮어쓰기(기본값)
	
		byte[] bytearray1 = "Hello!".getBytes();   				//Hello는 String ====> byte로 변환 ,getBytes()사용
		os2.write(bytearray1);
		os2.write('\n'); //\r은 생략가능 , \n만 넣어도 Windows 에서 Enter 처리가 됨.
		
		os2.flush();
		os2.close();
		
		
		OutputStream os3 = new FileOutputStream(outFile,true);	//이어쓰기. 
		
		byte[] bytearray2="Better the last smile than first laughter".getBytes();
		os3.write(bytearray2,7,8);
		os3.flush();
		os3.close();
		
		
	}

}
