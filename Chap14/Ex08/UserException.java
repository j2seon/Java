package Chap14.Ex08;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//1. Exception 을 상속받는 사용자 예외 -일반예외
	//1-1. 점수가 음수인 경우 예외
	//1-2. 점수에 100점을 초과하는 경우 에외

class MinusException extends Exception{  //음수가 들어올경우 강제 발생
	public MinusException() {
		super(); //부모의 생성자 호출 (Exception이 부모 <<<<애는 throwable 를 상속한다 ) e.getmessage의 경우 throwable에 위치해있다~
	}
	public MinusException(String message) {  //예외 메세지 출력, e.getMessage();
		super(message);
	}
}
class OverException extends Exception{  //100이상의 값이 들어오는 경우 호출
	public OverException() {
		super();
	}
	public OverException(String message) { //예외 메세지 출력, e.getMessage();
		super(message);
	}
}

class AAA{
	int socre;
	void checkScore(int socre) throws MinusException,OverException{
		if(socre<0) {
			throw new MinusException("예외 발생 : 음수는 넣을 수 없습니다.");
		}else if(socre>100) {
			throw new OverException("예외 발생 : 100점이 넘는 값은 입력할 수 없습니다");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.socre=socre;
			System.out.println("점수는 :" + this.socre);
		}
	}
}
public class UserException {

	public static void main(String[] args) {
		AAA aaa= new AAA();
		
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); //예외발생 : 음수는 넣을 수 없습니다.
		} 	//음수값입력
		
		System.out.println("==========================================");
		
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("==========================================");
		
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
