package Chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//하나의 기반 스트림에 Filter 스트림을 여러개 혼합해서 사용이 가능하다.
	//제일 마지막에 처리하는 스트림의 메소드 사용 여부에 따라 순서를 정할 수 있다.

//기반스트림 1 : FileOutputStream		   : 기반 스트림. 파일에 쓰기
//FiltertStream : BufferedOutputStream : 버퍼를 사용해서 빠르게 처리
//FiltertStream : DataOutputStream 	   : 다양한 포멧 방식으로 처리


public class CombineFilterStream {

	public static void main(String[] args) {
		//1. 파일생성
		File datafile = new File ("src\\Chap19\\Ex07\\file2.data");
		
		//2.데이터 쓰기
		try (OutputStream os =new FileOutputStream(datafile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
				){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
		} catch (Exception e) {}
		
		
		//3. 데이터 읽기
		try (InputStream is = new FileInputStream(datafile);
				BufferedInputStream bis = new BufferedInputStream(is);
				DataInputStream dis = new DataInputStream(bis);
				){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
		
		
		
		
	}

}
