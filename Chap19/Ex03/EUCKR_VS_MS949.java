package Chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//EUCKR - 한국 표준, 한국 표현 가능  전체 표기 가능한 것만 구성되어있음. 약 11,000 ---> 2200만 표기, 8000자는 표기안됨.
	//영문은 1byte로 처리된다
	//한글은 2byte로 처리된다.
//MS949 -Microsoft 사에서 개발한 한글 표기방식 11000모두를 표기할 수 있다.

	//영문은 1byte로 처리된다
	//한글은 2byte로 처리된다.
//UTF-8 : 모든 서버(Web,FTP,Mail,.......) <가변길이>
	//영문은 1byte로 처리된다	<==UTF8
	//한글은 3byte로 처리된다.
//UTF-16 : <고정길이>
	//영문, 한글 모두 2byte로 처리
    //모든나라의 언어를 처리

//문자를 해당 인코딩 타입으로 바이트 스트링으로 생성한 경우, 해당 인코딩 타입으로 조합을 해야 깨지지 않는다.

//이클립스에서 인코딩 타입설정 3가지
	//1. 전역 설정:
	//2. 프로젝트에서 설정 :
	//3. 파일에서 설정

//우선순위 파일 > 프로젝트 > 전역


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR VS MS949
		
		//1.영문자를 byte로 내보내고 String으로 변환 : 1byte
		byte[] b1 = "a".getBytes(Charset.forName("EUC-KR"));  //문자를 byte로 변환 ===> 네트워크로 문자를 전송할때 byte로 변환한다.
		//예외가 발생됨 (UnsupportedEncodingException) <== 오타가 발생할 경우 인코딩 할 수 없는 예외가 발생이 됨.
		byte[] b2 = "a".getBytes("MS949");  //문자를 byte로 변환 ===> 네트워크로 문자를 전송할때 byte로 변환한다.
		
		System.out.println(b1.length);	//1
		System.out.println(b2.length);	//1
		
		System.out.println(new String(b1,Charset.forName("EUC-KR"))); 		//byte[]==>문자열로 바꿈
		System.out.println(new String(b2,"MS949")); 		//

		System.out.println();
		
		//2. 한글을 byte로 내보내고 String 으로 가져오기
		byte[] b3 ="가".getBytes("EUC-KR");
		byte[] b4 ="가".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(new String(b3,"EUC-KR"));  //byte[]==>문자열로 바꿈
		System.out.println(new String(b4,"MS949"));
		
		//3. EUC-KR은 현재 사용 가능한 것만 표기 , 약 2000자
		//MS949sms 11,000자 모두 표기됨.
		byte[] b5 ="뷁".getBytes("EUC-KR"); //11,000 자 중 2000만 표기, 8000(x)
		byte[] b6 ="뷁".getBytes("MS949");	//11,000자 표기
		
		System.out.println(b5.length); 
		System.out.println(b6.length);
		System.out.println(new String(b5,"EUC-KR"));  //byte[]==>문자열로 바꿈
		System.out.println(new String(b6,"MS949"));
	}

}
