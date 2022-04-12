package Chap14.Ex09;

import java.util.Scanner;

class A{
	String season; //봄,여름,가을,겨울(예외 발생 : 봄,여름 가을, 겨울만 입력하세요)
	String week;//월,화,수,목,금,토,일만 입력하세요(예외발생)
	int ScoreKor; //0~100값만 입력(0~100까지 정수만 입력하세요)
	int ScoreEng; //0~100값만 입력(0~100까지 정수만 입력하세요)
	String UserID; //12자 이상 20자 사이의 문자가 와야한다.(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)
	
	void Sseason(String season) throws seaonException {
		if(season.equals("봄")) {
			this.season=season;
			System.out.println("계절은 : "+season);
		}else if(season.equals("여름")) {
			this.season=season;
			System.out.println("계절은 : "+season);
		}else if(season.equals("가을")) {
			this.season=season;
			System.out.println("계절은 : "+season);
		}else if(season.equals("겨울")) {
			this.season=season;
			System.out.println("계절은 : "+season);
		}else {
		throw new seaonException("봄,여름,가을,겨울만 가능");
		}
	}
	void Wweek(String week) throws weekException{
		if(week.equals("월")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("화")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("수")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("목")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("금")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("토")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else if(week.equals("일")) {
			this.week=week;
			System.out.println("요일은 : "+week);
		}else {
		throw new weekException("월,화,수,목,금,토,일만 입력하세요");
		}
	}
	void KOr(int ScoreKor) throws Score1Excetion {
		if(ScoreKor<0 && ScoreKor<100) {
			throw new Score1Excetion("0~100까지 정수만 입력하세요");
		}else {
			this.ScoreKor=ScoreKor;
			System.out.println("국어 점수는 : "+ ScoreKor);
		}
	}
	void Eng(int ScoreEng) throws Score1Excetion {
		if(ScoreEng<0 && ScoreEng<100) {
			throw new Score1Excetion("0~100까지 정수만 입력하세요");
		}else {
			this.ScoreEng=ScoreEng;
			System.out.println("영어 점수는 : "+ this.ScoreEng);
		}
	}
	void Id(String UserID) throws IDExcetion{
		if (UserID.length()<12||UserID.length()>20) {
			throw new IDExcetion("12자 이상 20자 사이의 문자를 입력하세요");
		}else {
			this.UserID=UserID;
			System.out.println("아이디 : "+ UserID);
		}
	}
	
}


class seaonException extends Exception{
	public seaonException() {
		super();
	}
	public seaonException(String message) {
		super(message);
	}
}
class weekException extends Exception{
	public weekException() {
		super();
	}
	public weekException(String message) {
		super(message);
	}
}

class Score1Excetion extends Exception{
	public Score1Excetion() {
		super();
	}
	public Score1Excetion(String message) {
		super(message);
	}
}
class Score2Excetion extends Exception{
	public Score2Excetion() {
		super();
	}
	public Score2Excetion(String message) {
		super(message);
	}
}
class IDExcetion extends Exception{
	public IDExcetion() {
		super();
	}
	public IDExcetion(String message) {
		super(message);
	}
}

public class UserException_EX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A a =new A();		
		System.out.println("계절, 요일 , 국어점수, 영어점수, ID를 공백을 넣어 적어주세요");
		String str1=sc.nextLine();
		String array[]=str1.split(" ");
		try {
			a.Sseason(array[0]);
		} catch (seaonException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			a.Wweek(array[1]);
		} catch (weekException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.KOr(Integer.parseInt(array[2]));
		} catch (Score1Excetion e) {
			System.out.println(e.getMessage());
		}
		try {
			a.Eng(Integer.parseInt(array[3]));
		} catch (Score1Excetion e) {
			System.out.println(e.getMessage());
		}
		try {
			a.Id(array[4]);
		} catch (IDExcetion e) {
			System.out.println(e.getMessage());
		}
	}

}
