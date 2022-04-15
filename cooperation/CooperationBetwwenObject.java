package cooperation;
// 객체간의 협업

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  
 * 학생	: 용돈 100,000
 * 			     		버스를 탈때(-1000원)			지하철을 탈때(-1,500원) 
 * 버스	:1,000원			승객 수 증가 수입 증가			
 * 지하철 :1,500원										승객 수 증가 수입 증가
 * 
 */

class Student{
	String studentName;		//학생명
	int money;				//학생이 가진돈, 초기 값 : 100,000
	
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
	
	public void takeBus(Bus bus) { //학생이 버스를 탔을 때 ? 버스에 돈을 지불해야한다.
		bus.take(1000);
		
	}
	public void takeOutBus(Bus bus) {
		
	}
	
	public void takeSubway(Subway subway) { //지하철 탈때
		subway.take(1500);
	}
	public void takeOutSubway(Subway subway) { //지하철 내릴때
		
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
	int busName;	//100번 버스, 200번 버스  <==인풋값을 받아서, 생성자로
	int passengerCount; //승객 수 
	int money;
	
	public void take(int money) { //버스의 수입을 처리, 승객수를 처리 
		
	}
	
	public void takeOut() { //버스 승객수만 감소
		
	}
}

class Subway{
	String lineNumber;//1호선 2  3
	int passengerCount; //승객 수 
	int money;
	
	//생성자를 통해서 지하철 호선을 인풋받아서 활성화,
	
	public void take(int money) { //지하철의 수입을 처리, 승객수를 처리 
			
	}
	public void takeOut() { //지하철 승객수만 감소
		
	}
}


public class CooperationBetwwenObject {

	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		boolean run=true;
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 


		선택>> 3
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 
		
		
		while(run) {
			System.out.println("===================================================================");
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택 ");
			System.out.println("3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료");
			System.out.println("===================================================================");
			System.out.println("선택 >> ");
			int choice =scanner.nextInt();
			Student str=null;
			if(choice==1) {
				boolean a = true;
				while(a) {
					if(studentList.size()>4) {a=false; break;}else {
					System.out.println("학생 5명을 입력해주세요");
					System.out.print("학생이름 : ");
					String name=scanner.next();
					int money=100000;
					System.out.print("학생돈 : "+money);
					System.out.println();
					Student student = new Student(name,money);
					studentList.add(student);
					System.out.println();
					}
				}
			}else if(choice==2){
				System.out.println("=====학생 정보 출력======");
				System.out.println("학생이름\t 가진돈");
				for(Student student:studentList) {
					System.out.println(student);
					System.out.println();
				}
				System.out.print("학생 선택 (이름 입력) >>");
				String seletname= scanner.next();
				for(int i=0; i<studentList.size(); i++) {
					Student student = studentList.get(i);
					if(student.getStudentName().equals(seletname)){
						str=student;
					}
				}
			}else if(choice==3){
				System.out.println(str.getStudentName()+"님");
			}else if(choice==4){
				
			}else if(choice==5){
				
			}else if(choice==6){
				
			}else if(choice==7){
				break;
			}
			
		}
		
	}

}
