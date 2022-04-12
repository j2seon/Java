package Chap16.Ex09;


class AA{
	public <T extends Number> void m1(T t) {
		System.out.println(t.intValue());
	}
}

interface MM{
	public abstract void print1();
}

class BB {
	public <T extends MM> void m2(T t) {
		t.print1();
	}
}


class K implements MM{

	@Override
	public void print1() {
		System.out.println("ddddddddd");
	}
}

public class Exer {
	public static void main(String[] args) {
		AA a =new AA();
		a.<Double>m1(3.33);
		
		BB b =new BB();
		b.<MM>m2(new MM() {

			@Override
			public void print1() {
				System.out.println("안녕하십니까!!!!");
			}
		});
		b.<MM>m2(new K());
		
	}

}
