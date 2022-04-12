package Chap15.Ex15;


//Thread.yield() : �������� �������(RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	// ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸.
	//����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�.. Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �� �� ���.
	
class Mythread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) { 	// yieldFlag True�϶� �����带 �纸����
				Thread.yield();
			}else {   //yieldFlag false �϶� ������ ������  ��� ����
				System.out.println(getName()+"����");
				for(long i =0; i<1000000000L; i++) {} //0.5�� �ð����� 
			}
		}
	}
}

public class YieldRunnableState {
	public static void main(String[] args) {
		Mythread thread1= new Mythread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;		//false�϶� ������ ���� ���
		thread1.setDaemon(true); 		//������ �����尡 �����ϸ� ���� �����Ѵ�.  //while ���� ���ѷ����� ���� ���������� ���ؼ�
		thread1.start();
				
		Mythread thread2= new Mythread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;		//false�϶� ������ ���� ���
		thread2.setDaemon(true); 		//������ �����尡 �����ϸ� ���� �����Ѵ�.
		thread2.start();
				
		//������ 6�� ����(1�ʸ��� �ѹ��� �纸�Ѵ�.)
		for(int i =0; i<6; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		// ���϶� ���� �����϶� ��
			thread2.yieldFlag =! thread2.yieldFlag;
		}
	}

}
