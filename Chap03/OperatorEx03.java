package Chap03;
public class OperatorEx03 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자(&&,||, ^, !) : 쇼트 서킷이 발생됨 ( 앞의 연산 결과를 인지할 수 있을 때 뒷부분은 연산 생략) 
		 * 비트 연산자 (&,|,^) : 쇼트서킷이 발생되지 않는다.
		 * 
		 */
		
		//1. 논리 연산자 AND (&&) : 두 항이 모두 True 일때 True
		
		System.out.println(true && true);  // true, 쇼트 서킷이 발생되지 않음.
		System.out.println(true && false); //쇼트서킷이 발생되지 않음.
		System.out.println(false && true); // false, 쇼트서킷이 발생됨.
		System.out.println(true && 5<3); //false,
		System.out.println((5 <= 5) && (7>2)); //true
		System.out.println((3 < 2) && (8 < 10)); //false, 쇼트서킷이 발생됨.
		
		//OR (||) : 두 항중 하나만 True 이면 결과가 True 
		System.out.println(true || true); //true 쇼트서킷이 발생됨.
		System.out.println(false || (5<3)); //false 쇼트서킷이 발생되지 않음.
		System.out.println();
		
		//XOR (^) :두 값이 같을 때 false, 두값이 다를 때 True 쇼트서킷이 발생되지 않음.
		System.out.println(true ^ true);  //false
		System.out.println(false ^ false);  //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println((5<=5) ^ (7>2)); //false
		System.out.println();
		
		//Not (!) : True 이면 false, false이면 true
		System.out.println(!true); // false
		System.out.println(!false);  //true
		System.out.println(false || !(5<3)); // true
		System.out.println();
		
		//쇼트서킷의 사용 여부 (논리 연산자일때 발생, 비트연산자일때는 발생되지 않음.)
		int value2 = 3;
		System.out.println(false && ++value2 > 6);// false, 쇼트서킷이 발생함.
		System.out.println(value2); 
		//3 원래는 4가 나와야하지만 논리연산자 쇼트서킷으로 뒤를 계산하지 않았기 때문에 3이나옴
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); //false, 쇼트서킷이 발생이 안됨.
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4>6); //true 쇼트서킷발생
		System.out.println(value4);
		
		int value5 =3; 
		System.out.println(true | ++value5>6); //true 쇼트서킷 발생 안됨.
		System.out.println(value5);
		
		
	}

}
