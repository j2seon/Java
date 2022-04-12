package Chap15.Ex10;

//동기화 : 여러 쓰레드가 공유된 필드에 접근할때 하나의 쓰레드 작업 시 다른스레드가 접근하지 못하도록 설정

//블락 동기화 : 메소드 내부의 일부부만 동기화 
//			- 구문형식 : synchronized(임의의 객체){ }
//								this : 자신의 객체 , new 임의의 객체 

class A{}
class B{}
class C{}


class MyData{ //쓰레드가 공유하는 객체 필드 생성
	int data = 3; //데이터 가져오기
	public void pulsData() {		
		synchronized (new A()){		//블락 동기화 : 메소드의 일부부만 동기화, this : 자신의 객체 /new MyData(),PlusThread()이런식으로 들어갈수도 있음,.
									// this : 자신의 객체를 뜻하고 , 동기화블록에 접근하는 키이다.
									// 모든쓰레드는 Key를 가져야 동기화 블록에 접근할 수 있다.
			int mydata = data; 
			try {Thread.sleep(2000);}catch(InterruptedException e) {}
			data= mydata+1;
		}
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
