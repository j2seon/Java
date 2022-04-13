package Chap19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


//InputStream : 기반스트림.
	//int ==>5555(문자) ===> 555(문자) ==> int
//DataInputStream : 추가기능을 제공하는 스트리므 기반 스트림이 반드시 존재 단독으로 사용할 수 없다.
	//다양한 포멧의 데이터를 빠르게 전송할 때 사용한다.
	//int ==> int, double ==>double 라서 빠르다!

public class DataInputStream_1 {

	public static void main(String[] args) {
		//파일 생성
		File datafile = new File("src\\Chap19\\Ex07\\file1.data"); //확장자 주의: 
		
		//데이터 쓰기 (DataOutPutSteam) 
		try (OutputStream os = new FileOutputStream(datafile); 
			 DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
			
		} catch (Exception e) {  //가장 최상위의 exception 모든 예외의 최상위 클래스! 
			//데이터 읽기(DataInputStream)
		}
			
			try (InputStream is1 = new FileInputStream(datafile);
				DataInputStream dis = new DataInputStream(is1);
					){
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
			} catch (Exception e1) {
			}
			
			
			
			

	}

}
