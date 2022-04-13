package Chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//추가 기능을 제공하는 스트림 : 기반 스트림이 존재해야한다. 단독으로 사용할 수 없다.
//BufferdInputStream : InputStream 의 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림. ,단독으로 사용할 수 없다. 기반 스트림에 추가 기능
//BufferdOutputStream : InputStream 의 필터를 장착해서 쓰기 성능을 아주 빠르게 한 스트림 ,단독으로 사용할 수 없다. 기반 스트림에 추가 기능


public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {
		//두파일을 복사 , buffered를 사용하지 않고 처리하는 경우, Buffered를 사용하는 경우 속도차이
	
		File orgfile = new File("src\\Chap19\\Ex07\\mycat_origin.jpg"); //원본 파일.
		File copyfile1 = new File("src\\Chap19\\Ex07\\mycat_copy1.jpg"); //buffered를 사용하지 않고 처리하는 경우
		File copyfile2 = new File("src\\Chap19\\Ex07\\mycat_copy2.jpg"); //Buffered를 사용하는 경우  
		
		//성능 측정을 하기 위한 변수 선언
		long start, end, time1, time2; //time1 : Buffered를 사용 x , time2 : Buffered를 사용 o
		
		//1. Buffered를 사용하지 않고 처리하는 경우(BufferedInputStream, BufferedOutStream)
		start = System.nanoTime();	//시작시간
		
		try (InputStream is = new FileInputStream(orgfile); //auto close()
				OutputStream os = new FileOutputStream(copyfile1);) //auto close()
		{
			//데이터 복사 코드 생성
			int data;
			while((data=is.read())!=-1) {  //is 에서 1byte 읽어서 os읽은 걸 출력 , -1은 마지막까지,
				os.write(data);
			}
			
			
		} catch (IOException e) {
			}
		end =System.nanoTime();
		time1 = end -start;
		System.out.println("Without BufferedXXXStream : "+ time1); //버퍼를 사용하지 않고 복사 
		
		//2.
		
		//buffered를 사용하면서 처리하는 경우 ()
		start =System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile); //기반스트림
				BufferedInputStream bis =new BufferedInputStream(is); //추가 기능을 제공하는 스트림. 성능을 빠르게 처리(Buffer 사용함.)
				OutputStream os = new FileOutputStream(copyfile2); //기반스트림
				BufferedOutputStream bos = new BufferedOutputStream(os); //추가기능을 제공 (필터)
				){
				//복사할 코드 생성
			 int data ; 
			 while((data=bis.read())!=-1) { //버퍼를 사용해서 읽기 
				 bos.write(data);			//버퍼를 사용해서 쓰기
					 }
		} catch (IOException e) {
		}

		end =System.nanoTime();
		time2 = end -start;
		System.out.println("BufferedXXXStream : "+time2 );
		
		// 사용한 경우 (rime2), 사용하지 않은 경우 (time1)의 비율
		System.out.println("Buffered를 사용한 경우 속도 차이 몇 배 "+time1/time2);
	}

}
