package Chap12.Ex09;

public class EX {
 public static void main(String[] args) {
	//1. SamSungPhone타입으로 지정
	 SamSungPhone s1 = new SamSungPhone();
	 s1.printLogo(); 	//interface에서 default 메소드가 상속되어 내려온 기능
	 s1.sendCall();		//
	 s1.receiveCall();
	 s1.flash();
	 
	 System.out.println("=================================");
	 
	 //2. phoneInterface로 업캐스팅
	 PhoneInterface s2 = new SamSungPhone();
	 s2.printLogo();
	 s2.sendCall();
	 s2.receiveCall();
	 SamSungPhone ss = (SamSungPhone)s2; //s2 : phone Interface ===> Samsungphone로 타입변환
	 
	 ss.flash(); //flash 다운 캐스팅 후 출력
	 
 }
}
