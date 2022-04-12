package Chap10.Ex03;

//instanceof : 객체 내부의 캐스팅이 가능한지 여부를 알수 있도록하는 키워드
	//업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True,False로 리턴
	//다운 캐스팅 시 런타임오류가 발생 될 수 있다. 런타임 오류를 방지하기 위함
	//다운 캐스팅시 해당 타입이 객체에 존재할 때 다운캐스팅 하도록 설정.

class A{
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		// 1. intstanceof : 객체명 instanceof타입
		A aa= new A(); //aa는 A만 가지고 있다.
		A ab =new B(); //ab는 A,B를 포함하고 A만 사용(접근)

		System.out.println(aa instanceof A); //true aa객체에 A타입을 포함하니?
		System.out.println(ab instanceof A); //true
		System.out.println(aa instanceof B); //false
		System.out.println(ab instanceof B); //True
	
		if(aa instanceof B) { //aa객체에 B타입이 포함되어있을 경우에만 캐스팅한다. 
			B b=(B)aa; //instanceof의 조건을 주지않으면 문법은 오류나지 않지만 런타임 오류는 발생
			System.out.println("aa를 B로 캐스팅했습니다.");
		}else {
			System.out.println("aa는 B타입으로 캐스팅 불가");
		}
		
		if(ab instanceof B) { //ab에 B타입이 존재하는 경우 다운캐스팅
			B b= (B) ab;
			System.out.println("ab를 B타입으로 캐스팅 했습니다");
		}else {
			System.out.println("ab는 b타입으로 캐스팅 불가");
		}
		
		if("안녕" instanceof String) { //객체의 데이터타입을 확인
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
	}

}
