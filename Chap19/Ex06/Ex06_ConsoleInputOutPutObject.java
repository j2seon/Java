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
		//1.인풋
		System.out.println("한글을 입력하세요");
		InputStream is1 =System.in;   
		byte[] b1 =new byte[100];
		int count1=is1.read(b1);
		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		
		
		
		// 파일에 해당 값을 저장 
		File outFile = new File("src/Chap19/Ex06/input.txt");
		FileOutputStream os = new FileOutputStream(outFile,false);
		os.write(b1);
		os.flush();
		
		//저장된 파일 파일 내용 읽기
		byte b2[]=new byte[100];
		int count2;
		String str2=null;
		try (InputStream is2= new FileInputStream(outFile)){
			while((count2=is2.read(b2))!=-1) {
				str2= new String(b2, 0, count2, Charset.defaultCharset());
			}
		}catch (IOException e) {
			System.out.println("오류입니다.");
		}
		
		//콘솔에 출력하기
		System.out.println(str2);
		System.out.println("출력결과 >> ");
		OutputStream out = System.out;
		byte[] b3 = str2.getBytes(Charset.defaultCharset());
//		out.write(b3);
		out.flush();
		is1.close();
		out.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
