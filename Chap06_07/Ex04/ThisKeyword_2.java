package Chap06_07.Ex04;

//명시적 this 키워드 추가 : 반드시 this key를 사용해야 되는 경우 : 
class Aa{		//this key를 사용하지 않는 경우 : 지역변수로 인식
	int m;
	int n;
	void init (int m, int n) {
		m = m; 		//this 키를 사용하지 않는 경우 m <== 지역변수 m
		n = n;		//this 키를 사용하지 않는 경우 m <== 지역변수 m
	}
}
class Bb{		//this 키를 사용하는 경우 
	int m;
	int n;
	void init ( int m, int n) {
		this.m=m;	//this키를 명시적으로 반드시 사용해서 m이 필드의 m이라고 알려줘야한다.
		this.n=n;
	}
}
public class ThisKeyword_2 {
	
	public static void main(String[] args) {
		
		// 1. 필드의 명과 지역변수의 명이 같은 경우(this 미사용한 경우 : 지역변수에 저장)
		Aa one = new Aa();
		one.init(3,6);
		System.out.println(one.m);  // 0
		System.out.println(one.n);  // 0
		// 2. 필드의 명과 지역변수의 명이 같은 경우(this 사용한 경우)
		Bb two = new Bb();
		two.init(2,4);
		System.out.println(two.m);  //2
		System.out.println(two.n);  //4
	}

}
