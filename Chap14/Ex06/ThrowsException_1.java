package Chap14.Ex06;

/*예외처리  2가지 방법
 * 
 *		 1. 직접 처리하는 방법 : try catch
 * 
 *		 2. 예외 전가(미룬다) : throws, 메소드를 호출하는 쪽에서 예외를 처리하도록 전가(미룬다)
 *				throws : 강제로 예외를 발생시킨다.		
 * */

class A { 	//메소드 내부에서 예외처리를 직접구현
	void abc() {
		bcd();
	}
	void bcd() { //일반 예외 : interruptedException
		try {	
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("예외 발생 1 ");
		}  
	}
}
class B{
	void abc() {		//bcd()메소드의 예외를 처리할 의무를 가진다.
		try {		//예외처리
			bcd();
		} catch (InterruptedException e) {
			System.out.println("예외 발생 2");
			//e.printStackTrace();
		}			
	}
	void bcd() throws InterruptedException  { //bcd 메소드를 호출하는 곳에서 예외를 처리하도록 미루는 것
		Thread.sleep(1000); //일반예외 : InterruptedException
	}
}


public class ThrowsException_1 {

	public static void main(String[] args) {
		A a1 =new A();
		a1.abc();

	}

}
