package Chap10.Ex06;


class KK{
	KK(){
		System.out.println("KKK");
	};
	KK(int a){
		System.out.println("AAAA");
	}
}
class JJ extends KK{
	JJ(){
		System.out.println("BBBB");
	}
}

public class Super_exer {

	public static void main(String[] args) {
		KK a = new JJ();
	}

}
