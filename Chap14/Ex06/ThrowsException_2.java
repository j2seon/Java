package Chap14.Ex06;

//일반 예외(checked Exception) : 컴파일 단계에서 예외, 
	//1. 직접처리하는 경우 
	//2. throws로 전가 (미룬다.)

	//main 메소드에 throw를 전가 시키는 경우 , 정보를 출력해주고 중지
public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException{

		//정상적으로 파일이 존재합니다. ClassNotFoundException이 발생되지 않음.
		Class cls = Class.forName("java.lang.Object");
		
		//정상적으로 파일이 존재하지 않는다. ClassNotFoundException이 발생.   
		//Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
