package Chap06_07.Ex05;

class B { //외부 클래스 , public이 올 수 없다. default가 생략되어있다.
		  //다른 패키지의 클래스에서는 접근이 불가, 같은 패키지 내에서만 접근 가능
	
	private int a=1;	//private : 같은 클래스에서만 사용가능
	int b=2;			//default : 같은 패키지내의 다른 클래스에서 접근가능
	protected int c=3;	//protected : default 포함 + 다른 패키지에 접근 가능(상속된 경우만 가능)
	public int d=4;		//public : 다른 패키지에서 접근이 가능
	
	//private<default<protected<public
	
	private void print1() { //같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() { //같은 클래스에 존재하는 메소드
		a = 30;
		b = 40;
		c = 50;
		d = 60;
	}
	protected void print3() { //같은 클래스에 존재하는 메소드
		a = 20;
		b = 30;
		c = 90;
		d = 70;
	}
	public void print4() { //같은 클래스에 존재하는 메소드
		a = 60;
		b = 60;
		c = 60;
		d = 60;
	}
}


public class ExternalClass_1 {

	public static void main(String[] args) {
		B b = new B();		//default 접근제어자가 class 이름에 할당/같은 클래스에 존재하므로 B class를 생성할 수 있다.
							//다른패키지이면 접근이 안된다.
		
		//필드접근
		BB bb=new BB(); 	//public 접근 제한자, 같은
		//bb.a=10; 	//private : a는 bb 클래스 내부에서만 사용.  <오류발생 : 접근이 불가>
		bb.b=20;	//default : 같은 패키지의 클래스에서 접근을 허용.
		bb.c=30;	//protected : default를 포함 + <<다른 패키지에서 접근이 가능하지만 상속관계일때만>>
		bb.d=40;	//public : protected를 포함 + 다른 패키지에서 접근 가능
	
		//메소드 접근
		//bb.print1(); 	//private : 오류발생, 클래스 내부에서만 호출
		bb.print2();	//default 
		bb.print3();	//protected
		bb.print4();	//public
	}

}
