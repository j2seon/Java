package Chap06_07.Ex02;


//다양한 타입의 메소드 형식(리턴타입이 있는 경우 (int,double, String...)
//리턴타입이 없는 경우는 void키를 사용
public class ExternalCallMethods {

	public static void main(String[] args) {
		//객체생성
		A a = new A(); //같은 패키지 내의 클래스는 import 없이 호출해서 사용가능
					
		//메소드 호출
		a.print();
		int k= a.data();
		System.out.println(k); //3
		double result =a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethod(5);
		a.printMethod(15);
	
		//주의 :
		
		System.out.println(a.data()); //출력 구문에 호출가능한 메소드(리턴이 있는 메소드)
		//System.out.println(a.print()); //오류발생 : 리턴 값이 없음.
		a.print();
		System.out.println(a.sum(4, 10.5));
		//System.out.println(a.printMethod(3)); //오류발생 
		a.printMethod(4); //return이 없는 메소드는 출력구문에 적지 않아도 됌.
		
		
	}

}
