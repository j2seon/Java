package Chap10.Ex07.Ex04;

class A {
	String name;
	A(String name){
		this.name=name;
	}
} 

public class StringEx {

	public static void main(String[] args) {

		String s0 = new String("안녕");
				
		
		String s1="안녕"; 	//String은 참조변수
		System.out.println(s0);		//String은 객체를 출력할때 toString()재정의 되어있다.
		System.out.println(s1);
		
		A a=new A("안녕");
		System.out.println(a);
	}

}
