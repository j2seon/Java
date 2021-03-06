package Chap10.Ex06;

//this() 와 super() 의 혼용  <==생성자 호출, 생성자 내부에서만 사용, 첫라인에 위치
	//this() : 자신객체의 생성자 호출 
	//super() : 부모객체의 생성자 호출

class AAAA{
	AAAA(){
		this(3);
		System.out.println("AAAA생성자 1");
	}
	AAAA(int a){
		System.out.println("AAAA생성자 2");
	}
}

class BBBB extends AAAA{
	BBBB(){
		this(3);{
			System.out.println("BBBB 생성자 1");
		}
	}
	BBBB(int a){
		//super(); 생략되어있다.
		System.out.println("BBBB 생성자 2");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		AAAA aa = new AAAA();
		System.out.println("================");
		
		AAAA aaaa2 =new AAAA(3);
		
		System.out.println("================");
		//2. 자식의 객체 생성
		BBBB bbbb1= new BBBB();
		System.out.println("=====================");
		//3. 자식의 객체 생성(매개변수 1개인 생성자 호출) 
		BBBB bbbb2 =new BBBB(5);
	}

}
