package Chap10.Ex01;

class Student_sub extends Student{
	//Student_sub는 student를 상속받고 있다. Student의 필드와 메소드를 상속받는다.
	//Student는 Person을 상속 받고있다, Student는 Person의 필드와 메소드를 상속 받고 있다.
	//Student_sub는 Person의 필드와 메소드와 Student의 필드와 메소드를 모두 상속받는다.

	String sub1;
	void sub() {
		System.out.println("Student_sub의 메소드입니다.");
	}
	
}

class Student extends Person{ //대학생 클래스 , Person : 부모, Student 자식
	//자식클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받는다.
	//
	int studentID; //학번
	void goToSchool() {
		System.out.println("자식클래스의 Student 메소드 goToSchool 호출");
	}
	
}
class worker extends Person{  //직장인 클래스
	int workerID; //사번
	void goToWork() {
		System.out.println("직장인 클래스의 메소드 호출");
	}
}
public class Person { //상속 : 부모클래스의(필드,메소드,내부클래스)를 자식클래스에게 상속
	String name;	  //상속의 이점: 1. 종복된 코드의 제거(코드의 재사용)
					  // 		 2. 코드가 간결해짐! 3. 다형성(메소드 오버라이딩)
	int age;
	void eat() {
		System.out.println("부모클래스의 eat()메소드");
		
	}
	void sleep() {
		System.out.println("부모클래스의 sleep() 메소드");
	}

	
	public static void main(String[] args) {
		
		//1.person객체 생성.
		Person p=new Person();
		p.name="홍길동";
		p.age=11;
		p.eat();
		p.sleep();
				
		System.out.println("===========");
				
		//2. Student 객체 생성.
		Student s =new Student(); //Person 클래스를 상속, Person 클래스의 필드와 메소드를 사용
		//Person클래스의 필드
		s.name="이순신";
		s.age = 50;
		//Person클래스의 메소드
		s.eat();
		s.sleep();
		//Student 클래스의 필드
		s.studentID=20190632;
		//Student 클래스의 메소드
		s.goToSchool();
		
		System.out.println("====worker클래스=======");
		
		//3. work 객체 생성
		worker w= new worker();
		//부모클래스의 필드
		w.name="세종대왕";
		w.age = 60;
		//자식 클래스의 필드
		w.workerID=20220310;
		
		//부모클래스의 메소드 : Person
		w.eat();
		w.sleep();
		//자식클래스의 메소드 
		s.goToSchool();
		
		
		System.out.println("====객체생성 시 타입 변환====");
		
		Person p1 =new Person(); //Person()은 Person이다(자식은 부모다)
		Person ps = new Student(); //업캐스팅, student응 Person이다
		//Student sp=new person(); //person은 Student이다(x)
		Person pw =new worker(); //업캐스팅
		//Worker wp =new Person)// 오류
		
		System.out.println("===person<==Student<==Student_sub===");
		//클래스타입(Type)    객체명    <자식클래스>
			Student_sub sub1=new Student_sub(); //가능
			//person 클래스의 필드와 메소드 사용 가능
			sub1.name="신사임당";
			sub1.age=50;
			sub1.eat();
			sub1.sleep();
			//Student 클래스의 필드와 메소드
			sub1.studentID=20220313;
			sub1.goToSchool();
			//Student_sub의 필드와 메소드
			sub1.sub1="자식의 자식클래스";
			sub1.sub();
			
		Person ps1= new Student_sub();//업캐스팅 :Student_sub 객체를 생성 시 부모 데이터 타입으로 형변환
		// Student_sub는 person이다! > person 타입으로 업캐스팅, Person 클래스의 맴버만 사용가능
			ps1.name ="BTS"; // Person 클래스의 필드와 메소드만 접근
			ps1.age=30;
			ps1.eat();
			ps1.sleep();
		Student ss1 =new Student_sub(); //업캐스팅:Student_sub를 Student타입으로 업캐스팅
				//person과 student의 필드와 메소드를 사용가능
			//person의 필드와 메소드
			ss1.name="SES";
			ss1.age=30;
			ss1.eat();
			ss1.sleep();
			//Student 의 필드와 메소드
			ss1.studentID=20211031;
			ss1.goToSchool();
			
		Student_sub ss2= new Student_sub();	//Person, Student,Student_sub의 필드와 메소드 모두사용.
			//person클래스의 필드와 메소드
			ss2.name="봄여름가을겨울";
			ss2.age=40;
			ss2.eat();
			ss2.sleep();
			//Student 클래스의 필드와 메소드
			ss2.studentID=20220312;
			ss2.goToSchool();
			//Student_sub의 필드와 메소드
			ss2.sub1="자식의 자식클래스";

		//상속관계에서 객체 생성 시 부모 데이터 타입으로 업캐스팅 가능.
			//부모데이터 타입으로 업캐스팅 된 경우 부모의 필드 메소드만 사용가능
			//Person<==Student <==Student_sub
			Person ps4 = new Student_sub();
				//Student_sub 객체 생성시 Person타입으로 업캐스팅
				//Student_sub는 Person Student, Student_sub의 모든 필드와 메소드를 포함
			 	//그중에서 Person클래스의 필드와 메소드만 접근가능
			Student ss4 = new Student_sub();
				//Student_sub 객체 생성시 Student타입으로 업캐스팅
				//Student_sub는 Person Student, Student_sub의 모든 필드와 메소드를 포함
			 	//그중에서 Person클래스 과 Student 필드와 메소드 접근가능
			Student_sub ss5 = new Student_sub();
				//Student_sub 객체 생성시 Student_sub타입으로 
				//Student_sub는 Person Student, Student_sub의 모든 필드와 메소드를 포함
			 	//그중에서 Person클래스 과 Student 필드와 메소드 접근가능
			
			//다운 캐스팅 : 부모 데이터 타입으로 업캐스팅 된 것을 자식데이터 타입으로 변환(수동으로 변환)
			
			Student ps5=(Student) ps4; 	//ps4(person,Student,Student_sub)의 데이터 타입은 person
				//ps5는 person,student의 필드와 메소드 접근 가능
			ps5.name="다운캐스팅";
			ps5.age=30;
			ps5.studentID=20220310; //student 필드와 메소드사용 가능
			ps5.goToSchool(); 	//Student의 메소드 사용
			
			Student_sub ps6=(Student_sub)ps4;//ps4는 person데이터 타입에서 student_sub로 다운캐스팅
				//Student_sub로 다운캐스팅됨(Person, Student,Student_sub의 필드와 메소드 사용가능)
			ps6.name="이용식"; //person
			ps6.studentID =20220301; //Student
			ps6.sub1="자식의 자식";//student_sub
	
	
	}	

}
