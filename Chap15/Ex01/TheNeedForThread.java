package Chap15.Ex01;

public class TheNeedForThread {
	public static void main(String[] args) { //현재는 Thread 를 만들지 않았음.
		// 1.비디오 프레임 : 1 ~ 5
			int [] intArray = {1,2,3,4,5};
		
		//2. 자막 프레임 : 하나 ~ 다섯 
			String[] strArray= {"하나","둘","셋","넷", "다섯"};
			
		//3. 비디오 프레임 출력
			for(int i=0; i<intArray.length; i++) {
				System.out.println("(비디오프레임)"+intArray[i]);	
				try {Thread.sleep(200);
				} catch (InterruptedException e) {} //0.2초 동안 일시 정지(잠시 딜레이 시킨다~)
			}
		//4. 자막프레임 출력
			for(int i=0; i<strArray.length; i++) {
				System.out.println("(자막번호)"+intArray[i]);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
				}
			}
	}	

}
