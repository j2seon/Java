package Chap14.Ex10;


class Ex {

	private String season; //��,����,����,�ܿ�(���� �߻� : ��,���� ����, �ܿ︸ �Է��ϼ���)
	private String week;//��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���(���ܹ߻�)
	private int scoreKor; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	private int scoreEng; //0~100���� �Է�(0~100���� ������ �Է��ϼ���)
	private String userID; //12�� �̻� 20�� ������ ���ڰ� �;��Ѵ�.(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)

	public void Info(String season,String week,int scoreKor,int scoreEng,String userID) throws MyException{
		if(season != "��"&&season != "����"&&season != "����"&&season != "�ܿ�") {
		throw new MyException("������ �Է��ϼ���");	
		}else if(week !="��"&&week !="ȭ"&&week !="��"&&week !="��"&&week !="��"&&week !="��"&&week !="��") {
		throw new MyException("������ �Է��ϼ���");
		}else if(scoreKor>100 ||scoreKor<0) {
		throw new MyException("0~100������ ��");	
		}else if(scoreEng>100 ||scoreEng<0) {
		throw new MyException("0~100������ ��");	
		}else if(userID.length()<6||userID.length()>20) {
		throw new MyException("6���̻� 20������ �Է��ϼ���");
		}else {
			this.season=season;
			this.week=week;
			this.scoreKor=scoreKor;
			this.scoreEng=scoreEng;
			this.userID=userID;
			System.out.println("�Է��Ͻ� �� : "+season+" , "+week+" ,"+scoreKor+" ,"+scoreEng+" ,"+userID);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Ex ex= new Ex();
		try {
			ex.Info("�ܿ�", "��", 33, 33, "1234567");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
