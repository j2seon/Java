package Chap06_07.Ex04;

/*묵시적 this 키워드 자동 추가 */
//1. 클래스 내부에서 자동으로 필드, 메소드 앞에 자동으로 this키워드가 붇는다.
	//this 키는 자기 자신의 객체의 필드와 객체의 메소드를 지칭,

class A{  //객체만들기 전 클래스 객체는 A a=new A(); 로 선언해야 만들어진다~
	int m;
	int n;
	
	//A(){}인 기본생성자가 생략
	
	 void init(int a, int b) {
		int c;			//a,b,c는 지역변수 (stack영역에 변수명과 값을 가짐)
		c=3;			//init()메소드 생성시 stack에 생성되고 메소드가 끝나면 소멸. 
		this.m=a*c;		//this키를 생략시, 컴파일러가 자동으로 추가하게 됌.
		this.n=b;
	}
	void work() {
		this.init(2,3);
		System.out.println(this.m+" , " +n); //this는 생략가능, 생략시 컴파일러가 자동으로 실행
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		//2. 객체 생성
		A a = new A();
		//3. 매서드 호출
		a.work();
	}

}
