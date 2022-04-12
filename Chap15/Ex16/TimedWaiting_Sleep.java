package Chap15.Ex16;

//Thread.sleep(1000) ===> TimedWaiting 상태로 이동 ===> 특정시간(1초) Runnable 상태로 이동
								//				===> 인터럽트가 발생되면 예외를 발생시키고 Runnable 
//인스턴스먕(객체명)[a].join(1000) ===> TimedWaiting 상태로 이동 ==> 
	//a.join(1000) : 자신의 쓰레드는 1초를 기다리고 a 객체에게 cpu할당 (Runnable),
						//1초 귀에는 자신의 쓰레드도 Runnable
//참고) 인스턴스 명(객체명)[a].join() ===> Waiting 상태로 이동 ==>
			//자신의 쓰레드는 잠시 Waiting 상태로 가고 a 객체에게 CPU(Runnable) 사용하도록 할당.
			// a 객체가 모두 완료된 경우 자신의 쓰레드도 Runnable

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000); //3초동안 TimedWaiting 상태로 진입, 3초후에는 Runnable 상태로 이동
								//interrupt가 발생되면 예외를 발생시키고 Runnable 상태로 이동
		} catch (InterruptedException e) {
			System.out.println("----sleep()진행중 Interrupt 발생");
			for(long i =0; i<10000000000L; i++) {} //시간지연 0.5초
		}
	}
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();		//RUNNABLE 
		
			try {Thread.sleep(100);} catch (InterruptedException e) {}  //쓰레드 시작 준비 시간
			System.out.println("MyThread State : "+ myThread.getState()); //TimedWaiting

			//3ch 이전에 인터럽트 강제발생
			myThread.interrupt(); //TimmeWaiting 상태
			try {Thread.sleep(1);} catch (InterruptedException e) {}
			System.out.println("MyThread State:" + myThread.getState());  //Runnable 상태
		
	}

}
