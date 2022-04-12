package Chap06_07.Ex04;


/*this가 키워드로 사용되는 경우 :this.m(필드의 m), this.init()(자신 객체의 메소드 init())
 * 
 * this가 메소드로 사용되는 경우: this();  <== 생성자 내에서 다른 생성자를 호출 시 사용
 * this();  <== 반드시 생성자 내부의 첫줄에 와야한다.
 * 			<== 메소드 내부에서는 사용할 수 없다.(생성자 내부에서만 사용가능)
 * */

class Abc{
	Abc(){		//생성자의 매개변수 값이 없는 생성자
		System.out.println("첫번째 생성자입니다.");
	}
	Abc(int a){
		this();		//this 매개변수가 없는 기본생성자 호출, 생성자의 첫라인에 와야한다.
		System.out.println("두번째 생성자입니다.");
	}
	
	
	Abc(int a, String b){
		this(30);	//this(30) : 매개변수가 정수 1개가 들어가는 생성자 호출
		System.out.println("세번째 생성자입니다.");
	}
	
/*	오류발생, (메소드 내부에서는 사용 불가능 !!  생성자 내부에서 사용가능!!!(첫라인에 위치)
 * 	void abc(){
		this(); //메소드 내에서는 this()를 사용할 수 없다.
				// this(); <==다른 생성자를 호출 할 때 사용. 
	}
	*/
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		//1. 객체 생성
		Abc abc= new Abc(); //매개변수가 없는 생성자 호출
		System.out.println("==============");
		Abc abc1= new Abc(1); //매개변수가 정수 1개를 가진 생성자를 호출
		System.out.println("==========s");
		Abc abc2= new Abc(30,"jjs");
		
	}
	

}
