package Chap02;
public class TypeCasting_1 {
	public static void main(String[] args) {
		
		//캐스팅 방법 1 : 자료형을 선언 
		
		//int value1 = 5.3; //오류
		int value1 = (int) 5.3; //캐스팅 : 자료 형식을 변환해서 변수값을 할당.
		long value2 = (long)10.333; 
		float value3 = (float) 5.8;
		double value4 = (double) 5; //정수5를 double(실수) 형식으로 변환
		double value5 = 10;
		
		System.out.println(value1); // 5만 나옴
		System.out.println(value2); 
		System.out.println(value3); 
		System.out.println(value4); 
		System.out.println("=========");
		
		
		//캐스팅 방법 2 : L, F라고 선언해서 캐스팅, iong : l,L, float : f, F
		long value6 = 10L;
		long value7 = 10l;
		float value8 = 5.8F;
		float value9 = 5.8f;

		System.out.println(value6); 
		System.out.println(value7); 
		System.out.println(value8);
		System.out.println(value9);
		
	}

}
