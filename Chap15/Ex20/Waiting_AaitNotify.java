package Chap15.Ex20;


class DataBox{
	boolean isEmpty = true;  //기본값 세팅
	int Data; // 공유필드 
	synchronized void inputData(int Data) {		//동기화 메소드 //this사용
		if(!isEmpty) { //false 일떄 wait(); 동기화 블럭이나 동기화 메소드에서 WAITING 상태로 전환
						//data 필드의 값이 비어있지 않을 때 잠시 대기 t2쓰레드가 처리하도록  
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty =false; //Data필드의 값을 넣고 t2가 값을 읽을 수 있도록 false로 기본 세팅
		this.Data=Data;
		System.out.println("입력 데이터 : "+Data);  //Data는 매개변수로 들어오는 데이터를 의미한다/
		notify();
	}
	synchronized void output() {// 동기화 메소드 this 사용
		if(isEmpty){
			try {wait();} catch (InterruptedException e) {}  //Waiting상태로 진입 
			}
		isEmpty=true;
		System.out.println("출력 데이터 : " + Data);  //Data: 메모리의 Data, this가 생략되어있음.
		notify();
	}
}


public class Waiting_AaitNotify {

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
					dataBox.output();
				}
			}
		};
		t1.start();
		t2.start();
	


	}

}
