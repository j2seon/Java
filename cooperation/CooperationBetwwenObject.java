package cooperation;
// ��ü���� ����

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  
 * �л�	: �뵷 100,000
 * 			     		������ Ż��(-1000��)			����ö�� Ż��(-1,500��) 
 * ����	:1,000��			�°� �� ���� ���� ����			
 * ����ö :1,500��										�°� �� ���� ���� ����
 * 
 */

class Student{
	String studentName;		//�л���
	int money;				//�л��� ������, �ʱ� �� : 100,000
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //�л��� ������ ���� �� ? ������ ���� �����ؾ��Ѵ�.
		bus.take(1000);
		
	}
	public void takeOutBus(Bus bus) {
		
	}
	
	public void takeSubway(Subway subway) { //����ö Ż��
		subway.take(1500);
	}
	public void takeOutSubway(Subway subway) { //����ö ������
		
	}


	@Override
	public String toString() {
		return getStudentName()+"\t"+getMoney();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if(this.studentName.equals(((Student)obj).studentName)){
				return true;
			}
		}
		return false;
	}
	
}

class Bus{
	int busName;	//100�� ����, 200�� ����  <==��ǲ���� �޾Ƽ�, �����ڷ�
	int passengerCount; //�°� �� 
	int money;
	
	public void take(int money) { //������ ������ ó��, �°����� ó�� 
		
	}
	
	public void takeOut() { //���� �°����� ����
		
	}
}

class Subway{
	String lineNumber;//1ȣ�� 2  3
	int passengerCount; //�°� �� 
	int money;
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ�޾Ƽ� Ȱ��ȭ,
	
	public void take(int money) { //����ö�� ������ ó��, �°����� ó�� 
			
	}
	public void takeOut() { //����ö �°����� ����
		
	}
}


public class CooperationBetwwenObject {

	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		boolean run=true;
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		 �� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 


		����>> 3
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 
		
		
		while(run) {
			System.out.println("===================================================================");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ���� ");
			System.out.println("3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����");
			System.out.println("===================================================================");
			System.out.println("���� >> ");
			int choice =scanner.nextInt();
			Student str=null;
			if(choice==1) {
				boolean a = true;
				while(a) {
					if(studentList.size()>4) {a=false; break;}else {
					System.out.println("�л� 5���� �Է����ּ���");
					System.out.print("�л��̸� : ");
					String name=scanner.next();
					int money=100000;
					System.out.print("�л��� : "+money);
					System.out.println();
					Student student = new Student(name,money);
					studentList.add(student);
					System.out.println();
					}
				}
			}else if(choice==2){
				System.out.println("=====�л� ���� ���======");
				System.out.println("�л��̸�\t ������");
				for(Student student:studentList) {
					System.out.println(student);
					System.out.println();
				}
				System.out.print("�л� ���� (�̸� �Է�) >>");
				String seletname= scanner.next();
				for(int i=0; i<studentList.size(); i++) {
					Student student = studentList.get(i);
					if(student.getStudentName().equals(seletname)){
						str=student;
					}
				}
			}else if(choice==3){
				System.out.println(str.getStudentName()+"��");
			}else if(choice==4){
				
			}else if(choice==5){
				
			}else if(choice==6){
				
			}else if(choice==7){
				break;
			}
			
		}
		
	}

}
