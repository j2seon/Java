package Chap19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * Reader / Writer : 추상클래스 , char 를 처리 , 문자(o) 이미지(x) mp3(x) >문자에 특화
 * FileReader / FileWriter : 완성된 클래스 Default charset
 *  
 * InputStreamReader/OutputStreamWriter : 읽을 때 인코딩 지정해서 읽기,쓰기 가능 (ms949,utf-8)
 * 
 * 주의 : System.in : 콘솔에서 입력 ,System.out : 콘솔에 출력 <==Application에서 한번 close()되면 재사용 불가.
 * 		System.in/System.out <=====byte 읽기,쓰기
 * 
 * */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {
	
	//콘솔출력 (default ms 949)	
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			
			osw.write("OuputStreamWriter1 예제 파일입니댜ㅏ \n".toCharArray());  //String을 char 배열에 저장.
			osw.write("한글과 영문이 모두 포함되어있습니다"); //String
			osw.write('\n'); //char 저장
			osw.write("Good Bye!!!!\n\n");
			osw.flush(); //버퍼에 저장된 값을 콘솔에 출력
			
		} catch (Exception e) {}
		
		
		
	//콘솔출력 (default utf-8)	
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			
			osw.write("OuputStreamWriter1 예제 파일입니댜ㅏ \n".toCharArray());  //String을 char 배열에 저장.
			osw.write("한글과 영문이 모두 포함되어있습니다"); //String
			osw.write('\n'); //char 저장
			osw.write("Good Bye!!!!\n\n");
			osw.flush(); //버퍼에 저장된 값을 콘솔에 출력
			
		} catch (Exception e) {}
		
	}

}
