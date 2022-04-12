package Chap15.Ex02;


class pushThread extends Thread{
	@Override
	public void run() {
		String[] array1={"하나","둘","셋","넷","다섯"};
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
		}
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}


public class creat {

	public static void main(String[] args) {
		
		Thread thread1= new pushThread();
		thread1.start();
		
		
		int [] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print("비디오프레임 "+ arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		
	}

}
