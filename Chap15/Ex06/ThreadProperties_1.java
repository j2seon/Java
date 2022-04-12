package Chap15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		//객체 정보 가져오기 (cuurentThread()) //쓰레드 수(activeCount())
			//static 
		//thread 의 이름이 같은 이유: 각 thread가 지역변수라아서 한 블락 내의 범위를 가지고있음
		Thread curThread = Thread.currentThread(); //main Thread
		//클래스(타입) 참조변수 = 클래스명.메소드<==static이라서 객체 만들지 않아도된다!
		System.out.println("현재 스레드의 이름 : "+ curThread.getName());
		System.out.println("동작하는 스레드 수 : "+ Thread.activeCount()); //스레드의 개수
		
		System.out.println("=======================================");
		//2. 스레드의 이름 출력 (자동출력) -JVM 스레드이름을 자동으로 할당 - Thread-0,,,,,,Thread-9
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		System.out.println("============================");
		//3. 쓰래드 이름 직접 지정 : 객체명.setName()
		for(int i=0; i<10; i++) {
			Thread thread =new Thread();
			thread.setName(i+" : 번째 스레드"); 
			System.out.println(thread.getName());
			thread.start();	
		}
		System.out.println("==========================");for(int i=0; i<10; i++) {
			//4. 스레드의 이름 출력 (자동출력) -JVM 스레드이름을 자동으로 할당 - Thread-0,,,,,,Thread-9
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			}
		}
		
		
		//5.쓰레드 수 출력하기
		System.out.println("동작하는 스레드 수 : "+ Thread.activeCount());
	}

}
