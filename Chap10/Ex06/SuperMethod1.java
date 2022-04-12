package Chap10.Ex06;

//super 키워드 : 부모클래스를 지칭 , 메소드 내부에서 사용 , 생성자 내부에서도 사용
//super (): 생성자 내부에서만 사용. 부모 생성자()를 호출할때 사용
			//반드시 첫라인에 위치 
//this 키워드 : 자신의 객체를 지칭 , 메소드 내부에서 사용, 생성자 내부에서도 사용. 필드이름 앞, 메소드 이름 앞
//this () : 생성자 내부에서만 사요으 자신의 클래스의 다른 생성자를 호출
			//반드시 첫라인에 위치 
 
class AAA{
	AAA(){
		System.out.println("AAA생성자");
	}
}
class BBB extends AAA {
	BBB(){
//		super();
		System.out.println("BBB 생성자");
	}
}
class CCC {
	CCC(){}
    CCC(int a){
    	System.out.println("CCC 생성자" +a);
    }	
}

class DDD extends CCC{
	DDD(){
		super();
	}
	DDD(int a){
		super(3);
		System.out.println("ddd 생성자 정수 1 : " + a);
	}
}

public class SuperMethod1 {

	public static void main(String[] args) {
		//1. 객체 생성
		AAA aaa= new AAA(); 	//기본생성자 호출
		System.out.println("=============");
	
		BBB bbb=new BBB();		//기본생성자 호출 
		System.out.println("================");
				

		DDD ddd= new DDD();		//기본생성자 호출
		System.out.println("==================");
		
		CCC eee= new DDD(5);
		
		
		
		
	}

}
