package Chap15.Ex09;


//�޼ҵ� ����ȭ : �޼ҵ� ��ü�� ����ȭ �ϴ� �� 
	// key���� this �Ҵ�� 


class MyData{ //�����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3; //������ ��������
	public synchronized void pulsData() {		//�޼ҵ� ����ȭ : 
		//����ȭó�� �޼ҵ� : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� ���� �����尡 �۾� �� �� �ִ�.
		int mydata = data; 
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {}
		data= mydata+1;
	}
}

class PlusThread extends Thread{
	MyData mydata; //1�� �����ϸ鼭 �ΰ��� ���������
	public PlusThread(MyData mydata) {
		this.mydata=mydata;
	}
	@Override
	public void run() {
		mydata.pulsData();
		System.out.println(getName()+"������ : "+ mydata.data);
	}
}

public class TheNeedsforSynchronized {

	public static void main(String[] args) {
		MyData myData =new MyData();
		
		//1. PlusThread1
		Thread plusThread1 =new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	
		Thread plusThread2 =new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
			
	
	}

}
