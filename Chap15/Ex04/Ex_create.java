package Chap15.Ex04;


class SM implements Runnable{
	@Override
	public void run() {
		String[] array1= {"�ϳ�","��","��","��","�ټ�"};
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {}
		for(int i=0; i<array1.length; i++) {
			System.out.println("- �ڸ���ȣ "+array1[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}	
}

class AA implements Runnable{
	@Override
	public void run() {
		int[] array2= {1,2,3,4,5};
		for(int i=0; i<array2.length; i++) {
			System.out.print("(���� ������) "+array2[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}	
}

public class Ex_create {
	public static void main(String[] args) {
		Runnable sm= new SM();
		Thread thread1=new Thread(sm);
		thread1.start();
		Runnable aa= new AA();
		Thread thread2=new Thread(aa);
		thread2.start();
		
		
		
		
	}

}
