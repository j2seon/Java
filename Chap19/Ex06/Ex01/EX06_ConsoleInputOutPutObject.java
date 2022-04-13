package Chap19.Ex06.Ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔에서 배열 100byte 이하 한글을 인풋 받은 값을 input.txt 에 저장 후 , Characterset : Default
// input.txt 파일에서 값을 읽어서 콘솔(System.out)을 사용해서 콘솔에 출력.
//힌트 : 
	//1. System.in   		: 콘솔에서 인풋 
	//2. FileOutputStream 	: 인풋 받은 값을 파일에 저장 
	//3. FileInputStream 	: 저장된 파일의 내용을 읽어온다. 
	//4. System.out  		: 콘솔에 출력 

//완료시간 : 6:20분까지 throws로 처리 . 


public class EX06_ConsoleInputOutPutObject {
	public static void main(String[] args) throws IOException  {
		
		//1. 콘솔에서 한글을 인풋 받는다. (System.in)  <== byte[] 배열을 생성해서 처리 : 한글을 처리 
		InputStream is = System.in;    //new로 생성하지 않고 연결만 설정, 콘솔에서 인풋 값을 받는다. 
		
		System.out.println("한글을 입력 하세요 >>>");
		
		byte[]	byteArray1 = new byte[100]; 
		int count1 = is.read(byteArray1);     // byteArray1 에 byte로 \r\n  , count1 배열에 값이 들어온 갯수, 
		// int data = is.read(); //한글을 처리하지 못한다. , data에는 1byte read한 값이 저장.  
			
		//2. 인풋 받은 한글을 파일에 저장한다. (FileOutputStream)
		File f1 = new File("src\\Chap19\\EX06\\input.txt"); 
		OutputStream fos = new FileOutputStream(f1);   // 덮어 쓰기. 
		
		fos.write(byteArray1);	//버퍼 (RAM)에만 쓰여짐. 
		fos.flush(); 			//버퍼의 쓰인 내용을 파일에 쓰기. 
		
				
		//3. 저장된 파일 에서 값을 읽어 온다. (FileInputStream)
		InputStream fis = new FileInputStream(f1); // read() : 한글을 처리 못한다. read(byte[]) : 한글 처리. 
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2); //read(byte[]) : 한글처리 
		//int data2 = fis.read();          //read() :  1byte 씩 읽어 온다. 
		
		
		System.out.println();
		System.out.println("파일에서 읽은 내용을 콘솔에 출력 합니다. >>>>" );
				System.out.println();
	
		//4. 읽어온 배열을 콘솔에 출력 한다. (System.out)
		OutputStream os = System.out;        // 콘솔에 출력 : byte[] 
		
		os.write(byteArray2);
		os.flush();
		
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
		
		
		
		
		
		
		
		
		

	}

}
