package Chap10.Ex01;

class Student_sub extends Student{
	//Student_sub�� student�� ��ӹް� �ִ�. Student�� �ʵ�� �޼ҵ带 ��ӹ޴´�.
	//Student�� Person�� ��� �ް��ִ�, Student�� Person�� �ʵ�� �޼ҵ带 ��� �ް� �ִ�.
	//Student_sub�� Person�� �ʵ�� �޼ҵ�� Student�� �ʵ�� �޼ҵ带 ��� ��ӹ޴´�.

	String sub1;
	void sub() {
		System.out.println("Student_sub�� �޼ҵ��Դϴ�.");
	}
	
}

class Student extends Person{ //���л� Ŭ���� , Person : �θ�, Student �ڽ�
	//�ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ޴´�.
	//
	int studentID; //�й�
	void goToSchool() {
		System.out.println("�ڽ�Ŭ������ Student �޼ҵ� goToSchool ȣ��");
	}
	
}
class worker extends Person{  //������ Ŭ����
	int workerID; //���
	void goToWork() {
		System.out.println("������ Ŭ������ �޼ҵ� ȣ��");
	}
}
public class Person { //��� : �θ�Ŭ������(�ʵ�,�޼ҵ�,����Ŭ����)�� �ڽ�Ŭ�������� ���
	String name;	  //����� ����: 1. ������ �ڵ��� ����(�ڵ��� ����)
					  // 		 2. �ڵ尡 ��������! 3. ������(�޼ҵ� �������̵�)
	int age;
	void eat() {
		System.out.println("�θ�Ŭ������ eat()�޼ҵ�");
		
	}
	void sleep() {
		System.out.println("�θ�Ŭ������ sleep() �޼ҵ�");
	}

	
	public static void main(String[] args) {
		
		//1.person��ü ����.
		Person p=new Person();
		p.name="ȫ�浿";
		p.age=11;
		p.eat();
		p.sleep();
				
		System.out.println("===========");
				
		//2. Student ��ü ����.
		Student s =new Student(); //Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ���
		//PersonŬ������ �ʵ�
		s.name="�̼���";
		s.age = 50;
		//PersonŬ������ �޼ҵ�
		s.eat();
		s.sleep();
		//Student Ŭ������ �ʵ�
		s.studentID=20190632;
		//Student Ŭ������ �޼ҵ�
		s.goToSchool();
		
		System.out.println("====workerŬ����=======");
		
		//3. work ��ü ����
		worker w= new worker();
		//�θ�Ŭ������ �ʵ�
		w.name="�������";
		w.age = 60;
		//�ڽ� Ŭ������ �ʵ�
		w.workerID=20220310;
		
		//�θ�Ŭ������ �޼ҵ� : Person
		w.eat();
		w.sleep();
		//�ڽ�Ŭ������ �޼ҵ� 
		s.goToSchool();
		
		
		System.out.println("====��ü���� �� Ÿ�� ��ȯ====");
		
		Person p1 =new Person(); //Person()�� Person�̴�(�ڽ��� �θ��)
		Person ps = new Student(); //��ĳ����, student�� Person�̴�
		//Student sp=new person(); //person�� Student�̴�(x)
		Person pw =new worker(); //��ĳ����
		//Worker wp =new Person)// ����
		
		System.out.println("===person<==Student<==Student_sub===");
		//Ŭ����Ÿ��(Type)    ��ü��    <�ڽ�Ŭ����>
			Student_sub sub1=new Student_sub(); //����
			//person Ŭ������ �ʵ�� �޼ҵ� ��� ����
			sub1.name="�Ż��Ӵ�";
			sub1.age=50;
			sub1.eat();
			sub1.sleep();
			//Student Ŭ������ �ʵ�� �޼ҵ�
			sub1.studentID=20220313;
			sub1.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			sub1.sub1="�ڽ��� �ڽ�Ŭ����";
			sub1.sub();
			
		Person ps1= new Student_sub();//��ĳ���� :Student_sub ��ü�� ���� �� �θ� ������ Ÿ������ ����ȯ
		// Student_sub�� person�̴�! > person Ÿ������ ��ĳ����, Person Ŭ������ �ɹ��� ��밡��
			ps1.name ="BTS"; // Person Ŭ������ �ʵ�� �޼ҵ常 ����
			ps1.age=30;
			ps1.eat();
			ps1.sleep();
		Student ss1 =new Student_sub(); //��ĳ����:Student_sub�� StudentŸ������ ��ĳ����
				//person�� student�� �ʵ�� �޼ҵ带 ��밡��
			//person�� �ʵ�� �޼ҵ�
			ss1.name="SES";
			ss1.age=30;
			ss1.eat();
			ss1.sleep();
			//Student �� �ʵ�� �޼ҵ�
			ss1.studentID=20211031;
			ss1.goToSchool();
			
		Student_sub ss2= new Student_sub();	//Person, Student,Student_sub�� �ʵ�� �޼ҵ� ��λ��.
			//personŬ������ �ʵ�� �޼ҵ�
			ss2.name="�����������ܿ�";
			ss2.age=40;
			ss2.eat();
			ss2.sleep();
			//Student Ŭ������ �ʵ�� �޼ҵ�
			ss2.studentID=20220312;
			ss2.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			ss2.sub1="�ڽ��� �ڽ�Ŭ����";

		//��Ӱ��迡�� ��ü ���� �� �θ� ������ Ÿ������ ��ĳ���� ����.
			//�θ����� Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ� �޼ҵ常 ��밡��
			//Person<==Student <==Student_sub
			Person ps4 = new Student_sub();
				//Student_sub ��ü ������ PersonŸ������ ��ĳ����
				//Student_sub�� Person Student, Student_sub�� ��� �ʵ�� �޼ҵ带 ����
			 	//���߿��� PersonŬ������ �ʵ�� �޼ҵ常 ���ٰ���
			Student ss4 = new Student_sub();
				//Student_sub ��ü ������ StudentŸ������ ��ĳ����
				//Student_sub�� Person Student, Student_sub�� ��� �ʵ�� �޼ҵ带 ����
			 	//���߿��� PersonŬ���� �� Student �ʵ�� �޼ҵ� ���ٰ���
			Student_sub ss5 = new Student_sub();
				//Student_sub ��ü ������ Student_subŸ������ 
				//Student_sub�� Person Student, Student_sub�� ��� �ʵ�� �޼ҵ带 ����
			 	//���߿��� PersonŬ���� �� Student �ʵ�� �޼ҵ� ���ٰ���
			
			//�ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �� ���� �ڽĵ����� Ÿ������ ��ȯ(�������� ��ȯ)
			
			Student ps5=(Student) ps4; 	//ps4(person,Student,Student_sub)�� ������ Ÿ���� person
				//ps5�� person,student�� �ʵ�� �޼ҵ� ���� ����
			ps5.name="�ٿ�ĳ����";
			ps5.age=30;
			ps5.studentID=20220310; //student �ʵ�� �޼ҵ��� ����
			ps5.goToSchool(); 	//Student�� �޼ҵ� ���
			
			Student_sub ps6=(Student_sub)ps4;//ps4�� person������ Ÿ�Կ��� student_sub�� �ٿ�ĳ����
				//Student_sub�� �ٿ�ĳ���õ�(Person, Student,Student_sub�� �ʵ�� �޼ҵ� ��밡��)
			ps6.name="�̿��"; //person
			ps6.studentID =20220301; //Student
			ps6.sub1="�ڽ��� �ڽ�";//student_sub
	
	
	}	

}
