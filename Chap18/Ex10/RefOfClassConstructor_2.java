package Chap18.Ex10;


interface A{
	B abc(int k);		//리턴타입이 B객체를 리턴
}

class B{
	B(){
		System.out.println("첫번째 생성자");
	}
	B(int k){
		System.out.println("두번째 생성자");
	}
}
public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		
		
		//익명 이너클래스
		A a1 =new A() {
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		//람다식 표현
		A a2 =(int k) -> {return new B(3);}; //전체 구문
		A a3 =k -> new B(3); //약식표현 (하나일 때 앞의 k 타입 삭제가능)
		
		//클래스 생성자 참조
		
		A a4 = B::new;		//B의 두번째 생성자 호출 
		
		a1.abc(3);
		a2.abc(4);
		a3.abc(2);
		a4.abc(2);
		
		
		
		
		
	}

}
