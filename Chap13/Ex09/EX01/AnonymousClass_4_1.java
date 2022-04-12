package Chap13.Ex09.EX01;

interface A{
	void cry();
	void fly();
}
class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {
	public static void main(String[] args) {
		// 1. 클래스는 존재(X) + 참조변수(O)
		C c= new C();
		A a = new A() {
			@Override
			public void cry() {
				System.out.println("꽉꽉");
			}
			@Override
			public void fly() {
				System.out.println("오리날다");
			}
		};
		c.abc(a);
		System.out.println("==============");
		// 2. 클래스는 존재(X) + 참조변수(X)
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("깩");
			}
			@Override
			public void fly() {
				System.out.println("skfdfkdf");
			}
		});
			
	}

}
