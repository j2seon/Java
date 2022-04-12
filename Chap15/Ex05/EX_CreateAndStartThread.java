package Chap15.Ex05;

/*������ 4�� ���� : 1. Thread�� ���
 * 				2. runnable ����
 * 				3,4. �͸��� Ŭ������ �����ؼ� 
 * 1.  2.
 * �̸�  ȫ�浿	�̼���	�Ż��Ӵ�
 * ����  40		50		60
 * ����	100		90		80
 * ����	80		70		90
 * ����	80		80		100
 * 
 * 
 * */

class NameThread extends Thread{
	@Override
	public void run() {
		String[] array1= {"�̸� ","���� ","���� ","���� ","���� "};
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
		String[] hongArray ={" ȫ�浿 "," 40 "," 100 "," 80 "," 90 "};
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
				String[] Lee= {"�̼��� "," 50 "," 100 "," 80 "," 100 "};
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
				String[] Sin= {" �Ż��Ӵ� "," 50 "," 100 "," 80 "," 100 "};
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
