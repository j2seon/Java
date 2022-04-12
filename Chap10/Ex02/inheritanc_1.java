package Chap10.Ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("부모 메소드");

	}
	
}
class Bb extends Aa{
	int n;
	void bcd() {
	System.out.println("자식 메소드");
	}
	
}


public class inheritanc_1 {

	public static void main(String[] args) {
		// 타입캐스팅을 하지 않는 경우
		Bb b = new Bb(); //b는 Aa,Bb 포함한다. Aa Bb의 필드와 메소드 모두 사용가능.
		b.m=10; //부모 필드
		b.n=20;
		b.abc(); //부모메소드
		b.bcd(); //자식메소드

		//업캐스팅 : 자식=>부모 : Aa 타입과, Bb의 타입 모두 포함하지만 Aa만 접근가능
		Aa a = new Bb();
		a.m=100;
		//a.n=200;
		
		Bb bb6 = (Bb) a ; //Aa--> Bb타입으로 다운캐스팅
		
	}

}
