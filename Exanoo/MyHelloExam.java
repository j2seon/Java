package Exanoo;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		//메소드 정보를 알아내기위함. 
		//getClass는 Obeject 클래스메소드라서 사용가능하고 hello 객체를 만들때 사용한 클래스는 뭐니?라는 의미
		//getDeclaredMethod("hello") hello라는 메소드의 정보를 가져와라
		try {
			Method method =hello.getClass().getDeclaredMethod("hello");
			
			//메소드에서 Count100이라는 특정 어노테이션이 적용이 되고 있나요?
			if(method.isAnnotationPresent(Count100.class)) {
				//해당 어노테이션을 가지고 있다면 ~
				for(int i=0; i<100; i++ ) {
					hello.hello(); //hello객체의 hello메소드를 100번실행하게함
				}
			}else {//아니라면 한번!
				hello.hello(); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
