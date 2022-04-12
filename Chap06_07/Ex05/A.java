package Chap06_07.Ex05;

	//접근제어자(캡슐화:데이터를 외부로부터 보호) : 
		//public, protected, default(생략해서 사용), private
		//클래스 이름, 필드명 , 메소드명, 생성자명  <<== 접근제어자가 반드시 할당이 되어 있습니다.
		//클래스 이름 : public, default

public class A {

	int m=3; 	//필드의 기본 접근 제어자는 default : 생략됨
						//default : 같은 패키지 내에서 다른 클래스 접근 가능
						//다른 패키지의 클래스에서는 접근 불가.
	int n=4;
						// private: 외부 클래스에서 접근 불가능
	
	public int k = 10;	//public : 다른 패키지에서 접근 가능
	
	public void print2() {
		System.out.println("외부패키지의 다른 클래스에서 접근 가능" +" "+k);
	}
	
	void print() {		//default : 같은 패키지 내의 클래스에서만 사용 가능 
		System.out.println("임포트 성공"+m+" "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
