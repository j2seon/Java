package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Ex {

	public static void main(String[] args) throws IOException {

		//한글을 콘솔 창에서 인풋받는다. 
		System.out.println("한글을 입력해주세요!");
		InputStream is1 = System.in;
		//한글은 배열로 받아야한다. 따라서 배열 선언
		byte b1[] = new byte[100]; 
		int count1=is1.read(b1);
		String str1 = new String(b1, 0, count1, Charset.defaultCharset());
		
		//콘솔로 인풋받은 걸 파일로 저장해야한다.
		// 새로운 택스트 파일을 만들어주고
		File files = new File("src/Chap19/Ex06/input1.txt");
		
		OutputStream os1 = new FileOutputStream(files);
		byte[] b2 = str1.getBytes(Charset.defaultCharset());
		os1.write(b2);
		os1.flush();
		
		// 저장된 파일을 가져오자!
		//가져올 파일을 선언해주기!
		File infile = new File("src/Chap19/Ex06/input1.txt");
		InputStream is2 = new FileInputStream(infile);
		
		byte b3[] = new byte[100];
		int count2 = is2.read(b3);
		String str2 = new String(b3, 0, count2, Charset.defaultCharset());
		
		//콘솔에 가져온 파일을 출력해보자
		
		OutputStream os2 = System.out;
		System.out.println("출력이 되었습니다.");
		byte[] b4 = str2.getBytes(Charset.defaultCharset());
		os2.write(b4);
		os2.flush();
		os2.close();
		os1.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
	}

}
