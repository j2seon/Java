package Chap14.Ex09;

import java.util.Scanner;

class Main{
	private String season; //봄,여름,가을,겨울(예외 발생 : 봄,여름 가을, 겨울만 입력하세요)
	private String week;//월,화,수,목,금,토,일만 입력하세요(예외발생)
	private int scoreKor; //0~100값만 입력(0~100까지 정수만 입력하세요)
	private int scoreEng; //0~100값만 입력(0~100까지 정수만 입력하세요)
	private  String userID; //12자 이상 20자 사이의 문자가 와야한다.(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)

//하나의 메소드로 처리
	void studentInfo(String season,String week,int scoreKor,int scoreEng,String userID ) throws Myexe {
		if(season != "봄"&&season != "여름"&&season != "가을"&&season != "겨울") {
			throw new Myexe("봄 여름 가을 겨울을 입력해주세요");
		}else if(week !="월"&&week !="화"&&week !="수"&&week !="목"&&week !="금"&&week !="토"&&week !="일") {
			throw new Myexe("월,화,수,목,금,토,일만 입력하세요(예외발생)");
		}else if(scoreKor<0||scoreKor>100) {
			throw new Myexe("0~100값만 입력(0~100까지 정수만 입력하세요");
		}else if(scoreEng<0||scoreEng>100) {
			throw new Myexe("0~100값만 입력(0~100까지 정수만 입력하세요");
		}else if(userID.length()<=12||userID.length()>20) {
			throw new Myexe("12자 이상 20자 사이의 문자가 와야한다");
		}else {
			System.out.println("정상적으로 값이 모두 잘 입력되었습니다.");
			this.season=season;
			this.week=week;
			this.scoreKor=scoreKor;
			this.scoreEng=scoreEng;
			this.userID=userID;
		}
		System.out.println(season+" , "+week+" ,"+scoreKor+" ,"+scoreEng+" ,"+userID);
	}
	
}
	
class Myexe extends Exception{
	public Myexe() {
		super();
	}
	public Myexe(String message) {
		super(message);
	}
}



public class EXer {

	public static void main(String[] args) {
		Main a= new Main();
		
		//모든필드의 값을 정상
		try {
			a.studentInfo("봄", "월", 80, 90, "1234567890123456");
		} catch (Myexe e) {
			System.out.println(e.getMessage()); //return값이 있음.
			//e.printStackTrace(); //void <
		}
		System.out.println("================ 예외발생하게 하기===============");
		try {
			a.studentInfo("봄", "가을", 80, 90, "1234567890123456");
		} catch (Myexe e) {
			System.out.println(e.getMessage()); //return값이 있음.
			//e.printStackTrace(); //void <
		}
		
		
	}

}
