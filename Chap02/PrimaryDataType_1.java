package Chap02;
public class PrimaryDataType_1 {
	public static void main(String[] args) {
		
		//boolean : true / false 값만 할당 가능
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("====정수 : 음의 값, 양수를 넣을 수 있다.=====");
		
		byte value1 = -128;   // byte : 1byte, (-128~127)
		//byte value11 = -129; 오류 발생
		System.out.println(value1);
		byte value111 = (byte) -129; //-129를 byte 타입으로 변환해서 저장
		System.out.println(value111); //-129 byte로 변환되면 127로 값이 나옴
		byte value1111 = (byte) 128; 
		System.out.println(value1111); //-128로 값이 나온다.
		//-128~127이 순환된다고 생각하기.
		
		short value2 = -10; // short : 2byte (-32768~ 32767)
		//value2 =-32769;오류발생
		value2 = (short) -32769;
		System.out.println(value2);
		
		int value3 = 100;
		long value4 = 200L;
		
		//실수: float, double
		float value5 = 1.2F;
		double value6 = -1.5;
		
	}

}
