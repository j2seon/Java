package Chap14.Ex09;

import java.util.Scanner;

class Main{
	private String season; //��,����,����,�ܿ�(���� �߻� : ��,���� ����, �ܿ︸ �Է��ϼ���)
	private String week;//��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���(���ܹ߻�)
	private int scoreKor; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	private int scoreEng; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	private  String userID; //12�� �̻� 20�� ������ ���ڰ� �;��Ѵ�.(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)

//�ϳ��� �޼ҵ�� ó��
	void studentInfo(String season,String week,int scoreKor,int scoreEng,String userID ) throws Myexe {
		if(season != "��"&&season != "����"&&season != "����"&&season != "�ܿ�") {
			throw new Myexe("�� ���� ���� �ܿ��� �Է����ּ���");
		}else if(week !="��"&&week !="ȭ"&&week !="��"&&week !="��"&&week !="��"&&week !="��"&&week !="��") {
			throw new Myexe("��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���(���ܹ߻�)");
		}else if(scoreKor<0||scoreKor>100) {
			throw new Myexe("0~100���� �Է�(0~100���� ������ �Է��ϼ���");
		}else if(scoreEng<0||scoreEng>100) {
			throw new Myexe("0~100���� �Է�(0~100���� ������ �Է��ϼ���");
		}else if(userID.length()<=12||userID.length()>20) {
			throw new Myexe("12�� �̻� 20�� ������ ���ڰ� �;��Ѵ�");
		}else {
			System.out.println("���������� ���� ��� �� �ԷµǾ����ϴ�.");
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
		
		//����ʵ��� ���� ����
		try {
			a.studentInfo("��", "��", 80, 90, "1234567890123456");
		} catch (Myexe e) {
			System.out.println(e.getMessage()); //return���� ����.
			//e.printStackTrace(); //void <
		}
		System.out.println("================ ���ܹ߻��ϰ� �ϱ�===============");
		try {
			a.studentInfo("��", "����", 80, 90, "1234567890123456");
		} catch (Myexe e) {
			System.out.println(e.getMessage()); //return���� ����.
			//e.printStackTrace(); //void <
		}
		
		
	}

}
