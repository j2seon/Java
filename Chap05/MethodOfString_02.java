package Chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		// 5 문자열 수정
		//toLowerCase() : 소문자로 변환, toUpperCase() : 대문자로 변화
		String str1 ="Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println();
		String aaa=new String("happy");
		System.out.println(aaa.toUpperCase());
		
		
		
		//replace(old,new) : old를 new로 바꿈.
		System.out.println(str1.replace("Study", "공부"));
		
		//substring(시작 index. 자를 마지막 index 앞까지) : 문자열을 잘라서 출력.
		System.out.println(str1.substring(0,5)); //Java
		System.out.println(str1.substring(6,8)); //tu
		
		//split() : 특정문자를 기준으로 잘라서 String[] 배열에 저장
		String str11 = "abc/def-ghi jkl";
		String[] strArray = str11.split("/|-| "); // 자를 인자 : '/' 또는 '-'또는 공백
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "오늘의 날씨는 흐립니다. ";
		String[] strArray2 = str111.split(" ");  // 공백을 기준으로 잘라서 strArray2에 저장 
		System.out.println(Arrays.toString(strArray2));
		
		String str1111 ="이름, 나이, 성별, 전화번호, 메일주소";
		String[] strArray3= str1111.split(",");
		System.out.println(Arrays.toString(strArray3));
		for (int i = 0; i < strArray3.length; i++) {
			System.out.print(strArray3[i]+" ");
		}
		System.out.println();
		//trim() 앞뒤의 공백을 제거함.
		System.out.println("       abc   ");
		System.out.println("            abc      dfg".trim());
		
		//6.문자열의 내용비교.(equals():대소문자 구분하면서 값을 비교.
				// , equalsIgnoreCase() : 대소문자 구별없이 값을 비교.
		String str2 =new String("Java");
		String str3 =new String("Java");
		String str4 =new String("java");
		
		//메모리의 주소 값 비교 (==)
		System.out.println(str2==str3); //false 
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		System.out.println();
		
		//값을 비교 (equals(), equalsIgnoreCase())
		System.out.println(str2.equals(str3));//true , 대소문자 구별
		System.out.println(str3.equals(str4));//false 대소문자 구별
		System.out.println(str3.equalsIgnoreCase(str4)); //true, 대소문자 구별하지 않는다.
		

		
	}

}
