package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//콘솔에서 한글을 인풋받은 값을 input.txt에 저장 후 ,
//input.txt파일에서 값을 읽어서 콘솔에 출력(System.out)을 이용해서 콘솔에 출력.
//객체를 4개를 만들어야한다.
 	//		1.System.in : 콘솔에서 인풋 
	// 		2.fileOutputStream : 인풋받은 값을 파일에 저장
	//		3. fileinputStream : 저장된 파일의 내용을 읽어온다.
	//		4. System.out : 콘솔에 출력


public class Ex06_ConsoleInputOutPutObject {

	public static void main(String[] args) throws IOException {
		//1.콘솔에서 한글을 인풋받는다. < byte[]배열을 생성해서 처리 : 한글을 처리
		InputStream is1 =System.in;   //new로 생성하지 않고 연결만 설정, 콘솔에서 인풋값을 받는다.
		System.out.println("한글을 입력하세요");
		byte[] b1 =new byte[100];
		int count1=is1.read(b1); //b1에 byte로 \r\n ,count1 배열에 값이 들어온 갯수!.
		//int data = re.read() 한글처리를 못한다. data에는 1bye
//		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		
		// 파일에 해당 값을 저장 
		File outFile = new File("src/Chap19/Ex06/input.txt");
		FileOutputStream os = new FileOutputStream(outFile); //덮어쓰기
		os.write(b1);		//버퍼(Ram)에만 쓰여짐.
		os.flush();//버퍼에 쓰인내용을 파일에 저장
		
		//저장된 파일 파일 내용 읽기
		InputStream fis =new FileInputStream(outFile);
		
		byte[] b2= new byte[100];
	
		int count2=fis.read(b2);
		
		
		//콘솔에 출력하기
		OutputStream os2 =System.out;
		os.write(b2);
		os.flush();
		
		is1.close();
		os.close();
		os2.close();
		fis.close();
		
		
		
		
		
		
		
		
		
		
	}

}
