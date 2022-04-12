package Chap06_07.Ex01;

class K{
	String j;
	double j1;
	int j2;
	
	void print() {
		System.out.println(j);
		System.out.println(j1);
		System.out.println(j2);
	}
	void print1() {
		int i;
		//System.out.println(i); 초기값을 설정하지 않은 지역변수는 출력되지 않는다.
	}
}


public class Fidvaule {

	public static void main(String[] args) {
		K a = new K();
		a.print();
	}

}
