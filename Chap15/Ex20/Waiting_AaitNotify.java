package Chap15.Ex20;


class DataBox{
	boolean isEmpty = true;  //�⺻�� ����
	int Data; // �����ʵ� 
	synchronized void inputData(int Data) {		//����ȭ �޼ҵ� //this���
		if(!isEmpty) { //false �ϋ� wait(); ����ȭ ���̳� ����ȭ �޼ҵ忡�� WAITING ���·� ��ȯ
						//data �ʵ��� ���� ������� ���� �� ��� ��� t2�����尡 ó���ϵ���  
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty =false; //Data�ʵ��� ���� �ְ� t2�� ���� ���� �� �ֵ��� false�� �⺻ ����
		this.Data=Data;
		System.out.println("�Է� ������ : "+Data);  //Data�� �Ű������� ������ �����͸� �ǹ��Ѵ�/
		notify();
	}
	synchronized void output() {// ����ȭ �޼ҵ� this ���
		if(isEmpty){
			try {wait();} catch (InterruptedException e) {}  //Waiting���·� ���� 
			}
		isEmpty=true;
		System.out.println("��� ������ : " + Data);  //Data: �޸��� Data, this�� �����Ǿ�����.
		notify();
	}
}


public class Waiting_AaitNotify {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		//ù��° ������ : ���� ��ü�� ���� �ִ� ������ 
		Thread t1=new Thread() {	// t1�� �͸��� Ŭ���� 
			@Override
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//�ι�° ������ : ������ü�κ��� ���� �о���� �޼ҵ�
		Thread t2=new Thread() {	// t1�� �͸��� Ŭ���� 
			@Override
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.output();
				}
			}
		};
		t1.start();
		t2.start();
	


	}

}
