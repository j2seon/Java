package Chap10.Ex06;

//super 키워드 : 부모(super)클래스

class AA{
	int m;
	void abc () {
		System.out.println("AA클래스의 abc()");
		System.out.println(m);
	}
}
class BB extends AA{
	void abc(){
		System.out.println("BB클래스의 abc()"); 
	}
	void bcd() {
		super.m = 300;
		super.abc(); 
		
	}
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.bcd(); //부모의 abc호출
		
		
		
	}

}
