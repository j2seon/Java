package Chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * ���� ������ (=, +=,-=,*=,/=,>>=,<<=,>>>=)
		 * a = b; <=== b������ ���� a�� �Ҵ��ض��� �ǹ�, ==(����)
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
		
		int value2; //�⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
		value2 = 5;		//���� �ڷ����� ��� ������ ���� �Ҵ����� ���� ��� �⺻������ NULL
		//���ǥ��
		
		System.out.println(value2 += 2); //value2 = value2 + 2
		System.out.println(value2 -= 2); // value3 = value2 -2 
		System.out.println(value2 /= 2); //value3 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2); //���������� value2 = value2 | 2
		//0101(5) 0010(2) |����� 0111����. ���� 7
		value2 = 5; System.out.println(value2 &= 2); //���������� value2 = value2 & 2
		// 0101 0010 &����� 0000 ���� 0
		
		value2 = 5; System.out.println(value2 <<= 2); //value2 = value << 2 
		//��� �� 20 2������ �����ؼ� ��� 0101
		value2 = 5; System.out.println(value2 >>= 2); //value2 = value >> 2
		
		value2 = 5; System.out.println(value2 >>>= 2); // value2 = value2 >>> 2
		byte value3; 
		value3 = -128; System.out.println(value3 >>>= 2); 
	}

}
