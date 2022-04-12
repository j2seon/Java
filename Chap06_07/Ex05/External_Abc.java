package Chap06_07.Ex05;


import Chap06_07.Ex06.Bcd;
//import Chap06_07.Ex06.Abc; //Abc class에 접근제한자가 default여서 외부패키지에서 접근할 수 없다.

public class External_Abc extends Bcd {  //External_Abc 클래스가 Bcd 클래스를 상속하겠다. 
			//부모 클래스 : Bcd, 자식클래스 : External_Abc
	public static void main(String[] args) {

		//Abc abc2=new Abc(); class 접근 제어자가 default여서 접근 불가.
		Bcd bcd1=new Bcd();
		External_Abc ext=new External_Abc();// 부모클래스 객체
		ext.b= 2000; //External_Abc라는 '자식'클래스에서 Bcd'부모'클래스에 protrcted를 접근!!(상속관계)

		//다른패키지에서 필드호출 1.import(public:클래스 접근지정자일때 가능)
						// 2. 객체 생성, 3. 접근지정자 확인 후 접근(필드, 메소드)
		bcd1.a=1000; //public : 다른 패키지에서 접근 가능
		//bcd1.b=2000; //protected
		
	}

}
