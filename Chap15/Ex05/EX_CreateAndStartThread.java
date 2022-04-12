package Chap15.Ex05;

/*스레드 4개 생성 : 1. Thread를 상속
 * 				2. runnable 구현
 * 				3,4. 익명내부 클래스를 생성해서 
 * 1.  2.
 * 이름  홍길동	이순신	신사임당
 * 나이  40		50		60
 * 국어	100		90		80
 * 영어	80		70		90
 * 수학	80		80		100
 * 
 * 
 * */

class NameThread extends Thread{
	@Override
	public void run() {
		String[] array1= {"이름 ","나이 ","국어 ","영어 ","수학 "};
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
		}
		for(int i=0; i<array1.length; i++) {
			System.out.print(array1[i]+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}


class Hong implements Runnable{
	@Override
	public void run() {
		String[] hongArray ={" 홍길동 "," 40 "," 100 "," 80 "," 90 "};
		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {
		}
		for(int i=0; i<hongArray.length; i++) {
			System.out.print(hongArray[i]+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
}
public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		Thread thread1 =new NameThread();
		Runnable hong =new Hong();
		Thread thread2 = new Thread(hong);

		
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] Lee= {"이순신 "," 50 "," 100 "," 80 "," 100 "};
				try {
					Thread.sleep(300);
				} catch (InterruptedException e1) {
				}
				for(int i=0; i<Lee.length; i++) {
					System.out.print(Lee[i]+"\t");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}		
		});
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] Sin= {" 신사임당 "," 50 "," 100 "," 80 "," 100 "};
				try {
					Thread.sleep(400);
				} catch (InterruptedException e1) {
				}
				for(int i=0; i<Sin.length; i++) {
					System.out.println(Sin[i]+"\t");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}		
		});
		
		thread4.start();
		thread3.start();
		thread1.start();
		thread2.start();
		
		
	}

}
