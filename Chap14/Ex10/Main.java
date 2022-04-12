package Chap14.Ex10;


class Ex {

	private String season; //봄,여름,가을,겨울(예외 발생 : 봄,여름 가을, 겨울만 입력하세요)
	private String week;//월,화,수,목,금,토,일만 입력하세요(예외발생)
	private int scoreKor; //0~100값만 입력(0~100까지 정수만 입력하세요)
	private int scoreEng; //0~100값만 입력(0~100까지 정수만 입력하세요)
	private String userID; //12자 이상 20자 사이의 문자가 와야한다.(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)

	public void Info(String season,String week,int scoreKor,int scoreEng,String userID) throws MyException{
		if(season != "봄"&&season != "여름"&&season != "가을"&&season != "겨울") {
		throw new MyException("계절을 입력하세요");	
		}else if(week !="월"&&week !="화"&&week !="수"&&week !="목"&&week !="금"&&week !="토"&&week !="일") {
		throw new MyException("요일을 입력하세요");
		}else if(scoreKor>100 ||scoreKor<0) {
		throw new MyException("0~100사이의 값");	
		}else if(scoreEng>100 ||scoreEng<0) {
		throw new MyException("0~100사이의 값");	
		}else if(userID.length()<6||userID.length()>20) {
		throw new MyException("6자이상 20자이하 입력하세요");
		}else {
			this.season=season;
			this.week=week;
			this.scoreKor=scoreKor;
			this.scoreEng=scoreEng;
			this.userID=userID;
			System.out.println("입력하신 값 : "+season+" , "+week+" ,"+scoreKor+" ,"+scoreEng+" ,"+userID);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Ex ex= new Ex();
		try {
			ex.Info("겨울", "토", 33, 33, "1234567");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
