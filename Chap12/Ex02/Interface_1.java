package Chap12.Ex02;

//인터 페이스 (interface) : 외부와 내부를 연결 시켜주는 접점... 콘센트(외부전기장치>>콘센트(접점)<<전기)
						//리모컨 (사람, TV),API
	//타입으로 가능
	// 모든 필드는 반드시 public static final
	// 모든 메소드 : public abstract 생략 (1.8) , (default 매소드는 제와)

interface A{	//정식표현
	public static final int A =3;  	//Interface 필드의 정식 표현
	public abstract void abc();		//Interface 매소드의 정식 표현		
}
interface B {	//생략된 표현
	int A=3;
	void abc(); //추상메소드 : 
}

abstract class C { 		//추상클래스 일때는 abstract가 생략될 수 없다.
	abstract void abc();		//생략시 오류발생
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//인터페이스는 객체 생성 불가. 구현되지 않는 매소드가 포함.
		//A a =new A(); //A가 인터페이스 이므로 객체 생성 불가
		//1.Interface static 필두의 내용을 출력
		System.out.println(A.A); //인터페이스의 필드 출력, A <== static
		System.out.println(B.A);
		
		//2. final이 적용 되어 있기 때문에 값을 수정 불가
			//A.A=5; //final이 설정되어 값을 수정할 수 없다.
			
		
	}

}
