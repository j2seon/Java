package Chap12.Ex09;

public class SamSungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("따르릉 ~~~");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받으세요 ~~");
	}
	
	public void flash () {
		
	}

	
	
	//인터페이스에서 정의한 메소드를 구현했다.
	
}
