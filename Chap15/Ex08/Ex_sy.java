package Chap15.Ex08;

class MMydata{
	int data=10;
	public synchronized void minus() {
		int minusdata=data;
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		data=minusdata-1;
	}
}

class Minus extends Thread{
	MMydata mmdata;
	public Minus(MMydata mmdata){
		this.mmdata=mmdata;
	}
	@Override
	public void run() {
		mmdata.minus();
		System.out.println(getName() +" : "+mmdata.data);
	}
}


public class Ex_sy {
	public static void main(String[] args) {
		
		MMydata mm= new MMydata();
		
		Thread thread1 = new Minus(mm);
		thread1.setName("thread1");
		thread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		Thread thread2 = new Minus(mm);
		thread2.setName("thread2");
		thread2.start();
		
		
	}

}
