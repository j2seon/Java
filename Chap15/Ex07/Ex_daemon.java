package Chap15.Ex07;

class MM extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+"�� ������? "+(isDaemon()? "����":"�Ϲ�"));
	for(int i=0; i<6; i++) {
		System.out.println(getName()+"�� "+i+"��°");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
	
	}
}

public class Ex_daemon {
	public static void main(String[] args) {
		Thread thread1= new MM();
		thread1.setName("������");
		thread1.setDaemon(false);
		thread1.start();
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {}
		System.out.println("����");
		
	}

}
