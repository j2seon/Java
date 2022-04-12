package Chap15.Ex08;


//동기화(Synchronized) : 여러 스레드가 하나의 공유된 필드를 접근할 경우
					//한 작업을 완전히 완료 후 다음 작업을 처리하도록 설정.
	//내가 작업할때 lock을 걸고 작업을 마치면 lock을 해제

//1. 동기화를 처리하지 않았을 때 예문

class MyData{ //쓰레드가 공유하는 객체 필드 생성
	int data = 3; //데이터 가져오기
	void pulsData() {
		int mydata = data; 
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {}
		data= mydata+1;
	}
}

class PlusThread extends Thread{
	MyData mydata; //1씩 증가하면서 두개의 쓰레드생성
	public PlusThread(MyData mydata) {
		this.mydata=mydata;
	}
	@Override
	public void run() {
		mydata.pulsData();
		System.out.println(getName()+"실행결과 : "+ mydata.data);
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		Thread plusThread2 =new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
			
	
	}

}
