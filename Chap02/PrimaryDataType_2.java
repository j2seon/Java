package Chap02;
public class PrimaryDataType_2 {
	public static void main(String[] args) {
		//char 자료형에 값을 할당하는 방식
		//문자로 저장하는 방법
		char value1 = 'A';  //영문자
		char value2 = '가';  //한글
		char value3 = '3';  //숫자 3이 아니고 문자 3을 의미함.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//정수로 저장하는 방법
		
		char value4 =65; //정수 65는 아스키코드로 문자 A
		char value5 = 0xac00; //16진수로 값을 할당 0x : 16진수로 값을 넣겠다고 선언
		char value6 = 51; //51 : 숫자 3
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		//유니코드 타입으로 저장
		
		char value7 = '\u0041'; //유니코드로 문자 A
		char value8 = '\uac00';  
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("======문자 A를 저장하는 다양한 방법=======");
		char a = 'A'; // 문자로 할당
		char b = 65; //10진수로 저장 : 아스키 코드 값.
		char c = 0b1000001; //0b는 이진수를 선언
		char d = 00101; //00는 8진수
		char e = 0x0041;  //ox는 16진수
		char f ='\u0041'; //유니코드 값 할당.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		
		
		
		
	}

}
