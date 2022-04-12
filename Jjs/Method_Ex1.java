package Jjs;


class A {
	void print() {
		System.out.println("안녕");
	}
	int data() {
		return 3;
	}
	double sum(int a,double b) {
		return a+b;
	}
	void printMonth(int a) {
		if(a<0||a>12) {
			System.out.println("잘못입력했습니다.");
			return;
		} 
			System.out.println(a+"월");
	}
}

public class Method_Ex1 {
	public static void main(String[] args) {
		
		A a = new A(); //객체생성
		a.print();
		a.data(); //값이 안나온다~ 왜냐? A클래스에 sysout 이 없음!! 따라서 변수를지정해야함
		int i=a.data();//변수를 지정해서
		System.out.println(i); //출력한다!
		double k=a.sum(3,5.5);
		System.out.println(k);
		a.printMonth(12);
		
		
		
	}

}
