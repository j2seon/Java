package Chap10.Ex04;

import Chap10.Ex01.Person;

class Human { 
	String name;	  	 
	int age;		// �ν��Ͻ� 
	void eat() {	//�ν��Ͻ� : ���� ��ġ���� �ְ� ���� �޸𸮴� �ν��Ͻ� ������ �ִ�.
		System.out.println("�ȳ�");
		
	}
	void sleep() {
		System.out.println("����");
	}
}
class Student extends Human{ //���л� Ŭ���� , Person : �θ�, Student �ڽ�
	//�ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ޴´�.
	//
	int studentID; //�й�
	void goToSchool() {
		System.out.println("�б����ϴ�.");
	}
	
}
class worker extends Human{  //������ Ŭ����
	int workerID; //���
	void goToWork() {
		System.out.println("���尩�ϴ�.");
	}
}

public class Test {
	public static void main(String[] args) {
		Human h = new Human();
		worker w= new worker();
		Student s = new Student();
		
		
	
	
	
	}
}

	


