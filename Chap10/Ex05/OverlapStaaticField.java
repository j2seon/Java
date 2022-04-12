package Chap10.Ex05;

class AAA{
	static int m=3;		//Static 필드는 오버라이딩 되지않는다.
}

class BBB extends AAA{
	static int m=4;
}

public class OverlapStaaticField {
	public static void main(String[] args) {
		//1.객체생성 없이 호출 가능 (클래스명으로 호출)		< === 권장사항
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		
		//2. 객체 생성후에도 호출이가능
		AAA aaa=new AAA();
		BBB bbb=new BBB();
		AAA abb=new BBB();
		System.out.println("-=================");
		System.out.println(aaa.m); //3
		System.out.println(bbb.m); //4
		System.out.println(abb.m); //3 static 필드 : 오버라이딩 안된다.
	}

}
