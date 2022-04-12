package Chap15.Ex06;

// 쓰레드 우선순위 
class MyThread extends Thread{
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {} //시간 지연용
		System.out.println(getName() + "우선순위"+ getPriority());
	}
}

public class ThreadProperties {

	public static void main(String[] args) {
		//1. 참고 : CPU core확인하기
		System.out.println("코어 수 : "+Runtime.getRuntime().availableProcessors() );
		//2. 기본(default : 5) 우선순위
			//(낮음)0 ~ 5(default) ~ 10(높음)
		for(int i=0; i<3; i++) {
			Thread thread= new Thread();
			System.out.print(thread.getName()+"\t"); //스레드 이름 출력 \t:탭키
			System.out.println(thread.getPriority()); // 기본값은 5 
			thread.start();
			
		}
		try { //위의 스레드가 만들면 없어지기 때문에 1초 지연
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		//2. 우선순위 직접지정 
		for (int i = 0; i<10; i++) {  //0 ~ 8 : 우선순의 5 / 9 : 우선순위 10
			Thread thread = new MyThread();
			thread.setName(i+ " 번째 쓰레드");
			
			if(i==9) {		//마지막 쓰레드의 우선순위를 10으로 할당
				thread.setPriority(10);
			}
			thread.start();
			//System.out.print(thread.getName()+"\t");
			//System.out.println(thread.getPriority());
		}
		
	}

}
