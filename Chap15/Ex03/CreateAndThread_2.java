package Chap15.Ex03;

import java.util.Iterator;

//2. 두번째 Thread 
class SMIFileThread extends Thread{ //자막파일 처리하는 쓰레드 
	@Override
	public void run() {
		//1. 자막번호출력
		String[] strArray= {"하나","둘","셋","넷","다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {} //0.01초 딜레이
		for(int i=0; i<strArray.length; i++) {
			System.out.println("- 자막번호 "+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}	//0.2초 딜레이
		}
	}
}

//3. 세번쨰 Thread
class VideoFilthread extends Thread{ //비디오 프레임을 처리하는 쓰레드
	@Override
	public void run() {
		//2.비디오 프레임 출룍
		int[] intArray= {1,2,3,4,5};
		for(int i =0; i<intArray.length; i++) {
			System.out.print("(비디오 프레임) "+intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}	//0.2초 딜레이
		}
	}
}
public class CreateAndThread_2 { 
	
//1. main Thread 	
	public static void main(String[] args) {
		//SMIFilThread 객체 시작
		
		Thread smi =new SMIFileThread();
		smi.start();
		
		//VideoFileThread 객체 시작
		Thread video=new VideoFilthread();
		video.start();
		
		
		
	}

}
