package Chap14.Ex08;

//메소드의 throws 를 전가 , 전가, 전가 ~ ~ main 까지 전가
	// main 까지 예외가 전가된 경우 예외의 결과창을 띄우고 프로그램이 중지된다.
	//main 메소드는 예외 처리하지 않는다.

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");// Exception 발생, NumberFormatException 발생
	}
}
public class ExceptionMethod {

	public static void main(String[] args) {
		
		//1. 객체 생성
		AA aa =new AA();
		
		//2. 메소드 호출
		try {
		aa.abc();	//실행 예외 (컴파일 단계에서는 오류가 없다.)
		}catch (NumberFormatException e) {
			//e.printStackTrace();	//예외의 자세한 정보를 출력
		}
		System.out.println("프로그램 종료 ");
		
	}

}
