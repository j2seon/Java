package Chap15.Ex15;


//Thread.yield() : 쓰레드의 실행상태(RUNNABLE)에 있는 특정 쓰레드에게 자신의 쓰레드는 일시 양보
	// 실행상태 내부에서 다른 쓰레드를 먼저 실행하도록 양보.
	//동기화에서 key를 서로 점유하는 현상이 발생되는데.. 키를 양보해서 균등하게 처리하도록 할 때 사용.
	
class Mythread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) { 	// yieldFlag True일때 쓰레드를 양보해줌
				Thread.yield();
			}else {   //yieldFlag false 일때 쓰레드 정보를  출력 해줌
				System.out.println(getName()+"실행");
				for(long i =0; i<1000000000L; i++) {} //0.5초 시간제한 
			}
		}
	}
}

public class YieldRunnableState {
	public static void main(String[] args) {
		Mythread thread1= new Mythread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;		//false일때 쓰레드 정보 출력
		thread1.setDaemon(true); 		//마지막 쓰레드가 종료하면 같이 종료한다.  //while 문의 무한루프로 인해 빠져나오기 위해서
		thread1.start();
				
		Mythread thread2= new Mythread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;		//false일때 쓰레드 정보 출력
		thread2.setDaemon(true); 		//마지막 쓰레드가 종료하면 같이 종료한다.
		thread2.start();
				
		//쓰레드 6초 지연(1초마다 한번씩 양보한다.)
		for(int i =0; i<6; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		// 참일땐 거짓 거짓일땐 참
			thread2.yieldFlag =! thread2.yieldFlag;
		}
	}

}
