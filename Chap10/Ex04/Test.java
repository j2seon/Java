package Chap10.Ex04;

import Chap10.Ex01.Person;

class Human { 
	String name;	  	 
	int age;		// 인스턴스 
	void eat() {	//인스턴스 : 힙에 위치값이 있고 실제 메모리는 인스턴스 영역에 있다.
		System.out.println("냠냠");
		
	}
	void sleep() {
		System.out.println("쿨쿨");
	}
}
class Student extends Human{ //대학생 클래스 , Person : 부모, Student 자식
	//자식클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받는다.
	//
	int studentID; //학번
	void goToSchool() {
		System.out.println("학교갑니다.");
	}
	
}
class worker extends Human{  //직장인 클래스
	int workerID; //사번
	void goToWork() {
		System.out.println("직장갑니다.");
	}
}

public class Test {
	public static void main(String[] args) {
		Human h = new Human();
		worker w= new worker();
		Student s = new Student();
		
		
	
	
	
	}
}

	


