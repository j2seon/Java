package Chap15.Ex06;

class MYthreads extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10000000; i++) {}
		System.out.println(getName()+" 우선순위 "+ getPriority());
	}
}
public class Ex_pro {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Thread thread1=new MYthreads();
			thread1.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		for(int i=0; i<100; i++) {
			Thread thread2= new MYthreads();
			thread2.setName(i+ "번째 스레드");
			if(i==9) thread2.setPriority(10);
			
				thread2.start();
			
		}
		
	}

}
