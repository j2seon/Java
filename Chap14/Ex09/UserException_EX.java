package Chap14.Ex09;

import java.util.Scanner;

class A{
	String season; //��,����,����,�ܿ�(���� �߻� : ��,���� ����, �ܿ︸ �Է��ϼ���)
	String week;//��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���(���ܹ߻�)
	int ScoreKor; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	int ScoreEng; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	String UserID; //12�� �̻� 20�� ������ ���ڰ� �;��Ѵ�.(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)
	
	void Sseason(String season) throws seaonException {
		if(season.equals("��")) {
			this.season=season;
			System.out.println("������ : "+season);
		}else if(season.equals("����")) {
			this.season=season;
			System.out.println("������ : "+season);
		}else if(season.equals("����")) {
			this.season=season;
			System.out.println("������ : "+season);
		}else if(season.equals("�ܿ�")) {
			this.season=season;
			System.out.println("������ : "+season);
		}else {
		throw new seaonException("��,����,����,�ܿ︸ ����");
		}
	}
	void Wweek(String week) throws weekException{
		if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("ȭ")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else if(week.equals("��")) {
			this.week=week;
			System.out.println("������ : "+week);
		}else {
		throw new weekException("��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���");
		}
	}
	void KOr(int ScoreKor) throws Score1Excetion {
		if(ScoreKor<0 && ScoreKor<100) {
			throw new Score1Excetion("0~100���� ������ �Է��ϼ���");
		}else {
			this.ScoreKor=ScoreKor;
			System.out.println("���� ������ : "+ ScoreKor);
		}
	}
	void Eng(int ScoreEng) throws Score1Excetion {
		if(ScoreEng<0 && ScoreEng<100) {
			throw new Score1Excetion("0~100���� ������ �Է��ϼ���");
		}else {
			this.ScoreEng=ScoreEng;
			System.out.println("���� ������ : "+ this.ScoreEng);
		}
	}
	void Id(String UserID) throws IDExcetion{
		if (UserID.length()<12||UserID.length()>20) {
			throw new IDExcetion("12�� �̻� 20�� ������ ���ڸ� �Է��ϼ���");
		}else {
			this.UserID=UserID;
			System.out.println("���̵� : "+ UserID);
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
		System.out.println("����, ���� , ��������, ��������, ID�� ������ �־� �����ּ���");
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
