package Jjs;


public class Method_Ex2 {
	
	 static void print() {
		System.out.println("진선");
	}
	static int twice(int a) {
		return(a*3);
	}
	static double avg(int a, double b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
		
		print(); // 같은 클래스에 있기 때문에 따로 객체생성 필요가 없다.
		// 메소드에 따로 출력 구문을 적었기 때문에 메소드만 적어도 출력
		int a=twice(4); // return 값으로만 지정했기 때문에 변수를 지정해야함.
		System.out.println(a);//변수 지정하고 출력구문으로 불러야한다.
		double b = avg(5,10);
		System.out.println(b);
		
	}

}
