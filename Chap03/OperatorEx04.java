package Chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * 대입 연산자 (=, +=,-=,*=,/=,>>=,<<=,>>>=)
		 * a = b; <=== b변수의 값을 a에 할당해라라는 의미, ==(같다)
		 * a += b <=== a = a+b
		 * a -= b <=== a = a-b
		 * a *= b <=== a = a * b 
		 * a /= b <=== a = a / b
		 * a &= b <=== a = a & b 
		 * a |= b <=== a = a | b
		 * a <<= b <=== a = a << b 
		 */
		int value1 = 3; 
		value1 = value1 +3;
		System.out.println(value1);
		System.out.println();
		
		int value2; //기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당.
		value2 = 5;		//참조 자료형일 경우 변수의 값을 할당하지 않을 경우 기본값으로 NULL
		//축약표현
		
		System.out.println(value2 += 2); //value2 = value2 + 2
		System.out.println(value2 -= 2); // value3 = value2 -2 
		System.out.println(value2 /= 2); //value3 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2); //이진법으로 value2 = value2 | 2
		//0101(5) 0010(2) |연산시 0111나옴. 따라서 7
		value2 = 5; System.out.println(value2 &= 2); //이진법으로 value2 = value2 & 2
		// 0101 0010 &연산시 0000 따라서 0
		
		value2 = 5; System.out.println(value2 <<= 2); //value2 = value << 2 
		//결과 값 20 2진수로 변경해서 계산 0101
		value2 = 5; System.out.println(value2 >>= 2); //value2 = value >> 2
		
		value2 = 5; System.out.println(value2 >>>= 2); // value2 = value2 >>> 2
		byte value3; 
		value3 = -128; System.out.println(value3 >>>= 2); 
	}

}
