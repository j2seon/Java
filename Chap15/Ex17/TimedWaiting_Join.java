package Chap15.Ex17;

//a.join(1000) : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimedWaiting���·� ���

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(long i =0; i<100000000000L; i++) { //�ð����� 0.5��
			
		}
	};
}

class MyThread2 extends Thread{
	MyThread1 myThread1; //Ŭ����Ÿ�� ��������
	public MyThread2(MyThread1 myThread1) {  // �����ڸ� ���ؼ� ���� ������ �� �Ҵ�.
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000); //MyThread2�� 3�ʴ���ϰ� myThread1���� CPU�Ҵ�. 
		} catch (InterruptedException e) {
			System.out.println("---join(...)������ Interrupt�߻�");
			for(long i =0; i<100000000L; i++) {} //�ð����� 0.5��
			for(long i =0; i<100000000L; i++) {} //�ð����� 0.5��
			for(long i =0; i<100000000L; i++) {} //�ð����� 0.5��
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		//1. ��ü ����
		MyThread1 mythread1 =new MyThread1();
		MyThread2 mythread2 = new MyThread2(mythread1);
		mythread1.start();
		mythread2.start();
		try {Thread.sleep(2);} catch (InterruptedException e) {}  //������ ���� �غ�ð� 0.01�� 
		System.out.println("MyThread1 State : "+ mythread1.getState());  //RUNNABLE
		System.out.println("MyThread2 State : "+ mythread2.getState());	//TIMED_WAITING
		
		mythread2.interrupt(); //3�� ��� �� ���� ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable�� �̵���.
		try {Thread.sleep(1);} catch (InterruptedException e) {}  //������ ���� �غ�ð� 0.01�� 
		System.out.println("MyThread1 State : "+ mythread1.getState());  //RUNNABLE
		System.out.println("MyThread2 State : "+ mythread2.getState());	//RUNNABLE
		
	}

}
