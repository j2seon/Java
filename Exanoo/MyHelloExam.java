package Exanoo;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		//�޼ҵ� ������ �˾Ƴ�������. 
		//getClass�� Obeject Ŭ�����޼ҵ�� ��밡���ϰ� hello ��ü�� ���鶧 ����� Ŭ������ ����?��� �ǹ�
		//getDeclaredMethod("hello") hello��� �޼ҵ��� ������ �����Ͷ�
		try {
			Method method =hello.getClass().getDeclaredMethod("hello");
			
			//�޼ҵ忡�� Count100�̶�� Ư�� ������̼��� ������ �ǰ� �ֳ���?
			if(method.isAnnotationPresent(Count100.class)) {
				//�ش� ������̼��� ������ �ִٸ� ~
				for(int i=0; i<100; i++ ) {
					hello.hello(); //hello��ü�� hello�޼ҵ带 100�������ϰ���
				}
			}else {//�ƴ϶�� �ѹ�!
				hello.hello(); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
