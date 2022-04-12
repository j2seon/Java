package Chap06_07.Ex03;

//생성자 오버로딩 : 하나의 생성자 명에 데이터타입, 갯수에 따라 다른 생성자가 호출
	//주의) 데이터타입도 같고, 갯수도 같은 경우 두개이상 있으면 오류.

class Abc{
	int a, b, c;
	String d;
	
	Abc(){System.out.println(a+ " , "+b+" , "+c);}//기본생성자
	Abc(int a){	//매개변수 1개인 생성자
		this.a=a;
		System.out.println(a);
	}
	Abc(String d){
		this.d=d;
		System.out.println(d);
	}
	Abc(int a, int b){ //매개변수 2개인 생성자
		this.a=a;
		this.b=b;
		System.out.println(a+ " , "+b);
		System.out.println();
	}
	Abc(int a, int b, int c){ //매개변수가 3개인 생성자
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+ " , "+b+" , "+c);
	}
		Abc(int a, int b, int c, String d){ //매개변수가 3개인 생성자
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
			System.out.println(a+ " , "+b+" , "+c+" "+d);
		
	}
}


public class ConstructorOverLoading {	

	public static void main(String[] args) {
		Abc empty=new Abc();
		Abc one=new Abc(1);
		Abc st = new Abc("레이");
		Abc two=new Abc(1,4);
		Abc three=new Abc(96,04,01);
		Abc threest=new Abc(90,4,1,"생년월일");
		
		
	}

}
