package Chap16.Ex07;

//제너릭 메소드 내부에서 사용 가능한 메소드 : Object클래스의 메소드만 사용 가능하다.

class A{
	public <T> void method (T t) {
		//System.out.println(t.length());  		//t,length() :String 클래스에서 글자수를 리턴 해줌 //사용 불가
		System.out.println(t.equals("안녕"));  	//t.equals는 Object클래스의 메소드는 사용가능
	}
	public <T extends Object> void method2(T t){	//<T extends Object>가 생략되어있다
		System.out.println(t.equals("반갑습니다."));   //Object클래스의 메소드만 사용가능하다. 어떤 타입이 들어올지 모르기때문에 Object의 메소드를 써준것!!!!
	//	System.out.println(t.); 확인해보면 Object 값만 나옴!
	}
	public <T extends String> void method3(T t) {
		System.out.println(t.length()); 
		//System.out.println(t.); 이건 Strnig!!
	}
}


public class AvailableInGenericMethod {
	
	public static void main(String[] args) {
		A a =new A();
		a.<String>method("안녕"); 
		a.<String>method2("dndd");
		a.<String> method3("주진선");
	}

}
