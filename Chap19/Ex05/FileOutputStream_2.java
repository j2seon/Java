package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		//1. 저장할 파일 생성.
		File outdfile = new File("src/Chap19/Ex05/FileOutput2_1.txt"); //기본적으로 이클립스의 default charactorSet으로 저장된다
		
		//2. n- byte단위 쓰기 처리(byte[]의 처음부터 끝까지 쓰기)
		OutputStream os2 = new FileOutputStream(outdfile);
		byte[] bytearray1 ="안녕하세요".getBytes(Charset.forName("MS949")); //String ==> byte[]에 저장 : getBytes()
				//한자 2byte씩 처리됨. 총 10byte가 들어갔다.
		
		os2.write(bytearray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//3. n- byte단위 쓰기 처리(byte[]의 offset부터 length개의 바이트 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outdfile,true); //이어서 쓰기.
		byte[] bytearray2 = "반갑습니다.".getBytes(Charset.forName("MS949"));
		os3.write(bytearray2,6,5);
		
		//영어, 숫자, 특수문자 <==ASCII코드로 1byte
		
		os3.flush();
		os3.close();
	}

}
