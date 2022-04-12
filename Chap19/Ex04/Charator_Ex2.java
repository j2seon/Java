package Chap19.Ex04;

/*A에서 Z까지의 아스키코드 값 출력
 * 
 * A,65
 * Z,90
 * 
 * 
 * 
 * 소문자 a에서 z까지 
 * 
 * a,97
 * z,122
 * */


public class Charator_Ex2 {
	public static void main(String[] args) {
		//배열에 넣고 만들기
	 char[] ch1= new char[26];
	for(int i=0; i<ch1.length; i++) {
		ch1[i]=(char) (i+65);
		System.out.println(ch1[i]+","+(int)ch1[i]);
	}	
	
	System.out.println();
	 char[] ch2= new char[26];
		for(int i=0; i<ch2.length; i++) {
			ch2[i]=(char) (i+97);
			System.out.println(ch2[i]+","+(int)ch2[i]);
		}	
		//i 자체를 변환해주는 방법 
	for(int i=65; i<=90; i++) {
//		System.out.println((char)i +" , "+ i );
		char a= (char)i;
		System.out.print(String.valueOf(a)+","+i);
		
	}
	
		
	}

}
