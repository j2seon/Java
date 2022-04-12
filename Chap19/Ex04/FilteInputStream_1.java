package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilteInputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		//1. 입력파일 생성
			//절대 경로로 설정
		File inFile1 = new File("J:\\js\\JAVA\\src\\Chap19\\files\\FileInputStream_1.txt");
			//상대경로로 설정 : 현재 작업디렉토라에서 설정
		File inFile = new File("src\\Chap19\\files\\FileInputStream_1.txt");
		
			//InputStream이 객체를 생성해야 파일의 내용을 읽을 수 았다.
		InputStream is = new FileInputStream(inFile) ;
			//InputStream은 추상클래스, 직접 객체 생성을 할 수 없다, 타입지정은 가능
		//파일의 내용을 출력.
		
//		int data;
		//UTf-8 : 영어(1byte), 한글(3byte)
		//UTF- 16 : 영어, 한글: 2byte, 첫번째 BOM 2byte<= 식별자
		//MS949 : 영어(1byte), 한글(2byte)
		//EUC-KR : 영어(1byte), 한글(2byte)
		
		//JAVA에서 줄바꿈처리 
		// - UNIX : \n
		// - Windows : \r\n    <==\r은 생략해도됨.  <=콘솔이나 메모장에서 enter : \r\n
		// - MAC : \r
		
		//한바이트 데이터를 읽어서 char로 변환 후 출력
//		System.out.print(is.read());  //read() 한 바이트를 읽어들인다.
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//	
		System.out.println();
		System.out.println();
		System.out.println("=======================================");

		//스트림은 값을 읽으면 메모리에서 삭제된다. 새로이 읽기 위해서는 새로운 스트림을 생성해야한다!!
		
		//int read() : 한 바이트를 읽어서 값이 존재할 경우 양수를 리턴, 읽은 데이터가 존재하지 않을 경우 음수를 리턴
		//while 문을 사용해서 한번에 출력
		
		
	
		int data;
		while((data=is.read())!=-1) { // -1이 아닐때까지만 루프를 돈다, 마지막값까지 계속 순환 (-1은 값이 없을때 나온다)
			System.out.print((char)data);
		} 
			//중요 : is.read() : 1byte를 읽어 들임. 반환타입은 int 이다.
			// 
		    //FileInputStram은 반드시 index 0번 부터 읽어 들임. 중간 임의의 값부터 읽을 수 가 없다.
			//FileRandomAccess를 사용해서 임의의 index에서 읽어 들임.
			
		System.out.println();
		System.out.println();
		
		System.out.println("======================================");
		
		//available() : 스트림의 남은 바이트수를 출력.
		
		InputStream is2 = new FileInputStream(inFile) ;
		
		while((data=is2.read())!=-1) { // -1이 아닐때까지만 루프를 돈다, 마지막값까지 계속 순환 (-1은 값이 없을때 나온다)
			System.out.println("읽은 데이터 : "+(char)data+ "  남은 바이트 수 : "+ is2.available());
		} 
		is.close();
		is2.close();
		
		
	}

}
