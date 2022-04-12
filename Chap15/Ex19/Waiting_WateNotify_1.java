package Chap15.Ex19;

//Waiting : 
	// a.join() : �ڽ��� ������� Waiting �����̰� a ��ü���� CPU�� �Ҵ�(Runnable) 
		//a��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 (Runnable)�� �̵� 
		//�ڽ� �������� ó���� ������ �ٸ��������� ����� �޾Ƽ� ó���ؾ��� ���
	//wait(),notify(),notifyAll() <== ����ȭ ��������� ���ȴ�.
	// - wait() : ����ȭ �� ������ wait () �޼ҵ带 ������  Waiting ���·� ����.
	// - notify(), notifyAll()�� wait() �޼ҵ带 ������. <==�ݵ�� �ٸ� �����忡�� ������ �� �ִ�. 


class DataBox{
	int Data; // �����ʵ� 
	synchronized void inputData(int Data) {		//����ȭ �޼ҵ� //this���
		this.Data=Data;
		System.out.println("�Է� ������ : "+Data);  //Data�� �Ű������� ������ �����͸� �ǹ��Ѵ�/
	}
	synchronized void output() {				// ����ȭ �޼ҵ� this ���
		System.out.println("��� ������ : " + Data);  //Data: �޸��� Data, this�� �����Ǿ�����.
	}
}

public class Waiting_WateNotify_1 {

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
					dataBox.output();   //inputData()�޼ҵ��� wait()�� �����带 �����ش�.
				}
			}
		};
		t1.start();
		t2.start();
	}

}
