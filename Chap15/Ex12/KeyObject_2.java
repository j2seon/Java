package Chap15.Ex12;

class MyData{ 	//������ü : ���� �����尡 ����
	//���������尡 ���⿡ �����Ҷ� ���ü� ������ �����ϱ� ���� ����ȭó��   /
	//����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ���! ������ �Ұ�����.
	//����ȭ �޼ҵ�� Key���� ���� �� ����.
	//�ϳ��� �����尡 �����Ҷ� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�.
	//key�� ��ü�� Ű�� ����� �� �ִ�.
	//����ȭ ���� Key���� ���Ƿ� �Ҵ簡�� 
	 synchronized void abc(){
		 try {Thread.sleep(10);} catch (InterruptedException e1) {} //0.01�� ������
		for(int i=0; i<3; i++) {
			System.out.println(i+"sec"); 
			try {Thread.sleep(1000);} catch (InterruptedException e) {}//1�� ������
		}
	}
	 synchronized void bcd(){
		 try {Thread.sleep(20);} catch (InterruptedException e1) {} //0.01�� ������
		for(int i=0; i<3; i++) {
			System.out.println(i+"��"); 
			try {Thread.sleep(1000);} catch (InterruptedException e) {}//1�� ������
		}
	}
	void cde(){
		synchronized(new Object()) { //������ Ű�� ���� : ������ Ű, �����尡 �����ϴ� Ű,��ü ����
		try {Thread.sleep(30);} catch (InterruptedException e1) {} //0.01�� ������
			for(int i=0; i<3; i++) {
			System.out.println(i+"��°"); 
			try {Thread.sleep(1000);} catch (InterruptedException e) {}//1�� ������
			}
		}
	}
}

class A{}
class B{}
class C{}


public class KeyObject_2 {
	public static void main(String[] args) {
		//������ü
		MyData myData =new MyData();
		
		//������ �����尡 ������ �޼ҵ� ȣ��
		new Thread() { 				//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.abc();		//ù��° ������ abc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() { 				//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd();		//�ι�° ������ bcd() �޼ҵ� ȣ��
			};
		}.start();
		new Thread() { 				//�͸� Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde();		//����° ������ cde() �޼ҵ� ȣ��
			};
		}.start();

	}	
}

		
	
