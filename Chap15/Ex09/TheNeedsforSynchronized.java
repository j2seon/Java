package Chap15.Ex09;


//메소드 동기화 : 메소드 전체를 동기화 하는 것 
	// key값이 this 할당됨 


class MyData{ //쓰레드가 공유하는 객체 필드 생성
	int data = 3; //데이터 가져오기
	public synchronized void pulsData() {		//메소드 동기화 : 
		//동기화처리 메소드 : 하나의 쓰레드가 작업이 완료되면 다음 쓰레드가 작업 할 수 있다.
		int mydata = data; 
		try {
		Thread.sleep(1000);
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
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	
		Thread plusThread2 =new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
			
	
	}

}
