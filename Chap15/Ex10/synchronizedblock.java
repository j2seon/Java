package Chap15.Ex10;

//����ȭ : ���� �����尡 ������ �ʵ忡 �����Ҷ� �ϳ��� ������ �۾� �� �ٸ������尡 �������� ���ϵ��� ����

//��� ����ȭ : �޼ҵ� ������ �Ϻκθ� ����ȭ 
//			- �������� : synchronized(������ ��ü){ }
//								this : �ڽ��� ��ü , new ������ ��ü 

class A{}
class B{}
class C{}


class MyData{ //�����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3; //������ ��������
	public void pulsData() {		
		synchronized (new A()){		//��� ����ȭ : �޼ҵ��� �Ϻκθ� ����ȭ, this : �ڽ��� ��ü /new MyData(),PlusThread()�̷������� ������ ����,.
									// this : �ڽ��� ��ü�� ���ϰ� , ����ȭ��Ͽ� �����ϴ� Ű�̴�.
									// ��羲����� Key�� ������ ����ȭ ��Ͽ� ������ �� �ִ�.
			int mydata = data; 
			try {Thread.sleep(2000);}catch(InterruptedException e) {}
			data= mydata+1;
		}
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

public class synchronizedblock {

	public static void main(String[] args) {
		MyData myData =new MyData();
		
		//1. PlusThread1
		Thread plusThread1 =new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		Thread plusThread2 =new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}

}
