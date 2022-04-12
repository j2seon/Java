package Chap15.Ex19;

//Waiting : 
	// a.join() : 자신의 쓰래드는 Waiting 상태이고 a 객체에게 CPU를 할당(Runnable) 
		//a객체가 실행이 완료되면 자신의 쓰레드가 (Runnable)로 이동 
		//자신 쓰레드의 처리할 내용이 다른스레드의 결과를 받아서 처리해야할 경우
	//wait(),notify(),notifyAll() <== 동기화 블락에서만 사용된다.
	// - wait() : 동기화 블럭 내에서 wait () 메소드를 만나면  Waiting 상태로 진입.
	// - notify(), notifyAll()이 wait() 메소드를 깨워줌. <==반드시 다른 쓰레드에서 깨워줄 수 있다. 


class DataBox{
	int Data; // 공유필드 
	synchronized void inputData(int Data) {		//동기화 메소드 //this사용
		this.Data=Data;
		System.out.println("입력 데이터 : "+Data);  //Data는 매개변수로 들어오는 데이터를 의미한다/
	}
	synchronized void output() {				// 동기화 메소드 this 사용
		System.out.println("출력 데이터 : " + Data);  //Data: 메모리의 Data, this가 생략되어있음.
	}
}

public class Waiting_WateNotify_1 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		//첫번째 쓰레드 : 공유 객체에 값을 넣는 쓰레드 
		Thread t1=new Thread() {	// t1은 익명내부 클래스 
			@Override
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//두번째 쓰레드 : 공유객체로부터 값을 읽어오는 메소드
		Thread t2=new Thread() {	// t1은 익명내부 클래스 
			@Override
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.output();   //inputData()메소드의 wait()된 쓰레드를 깨워준다.
				}
			}
		};
		t1.start();
		t2.start();
	}

}
