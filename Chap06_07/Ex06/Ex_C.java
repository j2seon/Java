package Chap06_07.Ex06;

import Chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		//다른클래스에 존재함. /public만 접근 / model,color 메모리로 접근 불가
		// model과 color는 setter를 통해서 
		C c = new C(); //다른 패키지이므로 import

		//company, model,color는 다른 패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성
		c.maxSpeed = 300;
		
		//setter를 통해서 메모리의 값을 부여.
		c.setModel("에쿠스");
		c.setColor("검은색");
		c.setCompany("현대");
		
		c.print();
	}

}
