package Chap14.Ex08;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//1. Exception �� ��ӹ޴� ����� ���� -�Ϲݿ���
	//1-1. ������ ������ ��� ����
	//1-2. ������ 100���� �ʰ��ϴ� ��� ����

class MinusException extends Exception{  //������ ���ð�� ���� �߻�
	public MinusException() {
		super(); //�θ��� ������ ȣ�� (Exception�� �θ� <<<<�ִ� throwable �� ����Ѵ� ) e.getmessage�� ��� throwable�� ��ġ���ִ�~
	}
	public MinusException(String message) {  //���� �޼��� ���, e.getMessage();
		super(message);
	}
}
class OverException extends Exception{  //100�̻��� ���� ������ ��� ȣ��
	public OverException() {
		super();
	}
	public OverException(String message) { //���� �޼��� ���, e.getMessage();
		super(message);
	}
}

class AAA{
	int socre;
	void checkScore(int socre) throws MinusException,OverException{
		if(socre<0) {
			throw new MinusException("���� �߻� : ������ ���� �� �����ϴ�.");
		}else if(socre>100) {
			throw new OverException("���� �߻� : 100���� �Ѵ� ���� �Է��� �� �����ϴ�");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.socre=socre;
			System.out.println("������ :" + this.socre);
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
			System.out.println(e.getMessage()); //���ܹ߻� : ������ ���� �� �����ϴ�.
		} 	//�������Է�
		
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
