package Empolyeeinfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empNo;
	private String empName;
	private String phone;
	private int age;
	private String department;
	private String compRank;
	
	public Employee(int empNo,String empName,String phone,int age,String department,String compRank) {
		this.empNo=empNo;
		this.empName=empName;
		this.phone=phone;
		this.age=age;
		this.department=department;
		this.compRank=compRank;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompRank() {
		return compRank;
	}
	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	
	@Override
	public int hashCode() {
		Objects.hashCode(empNo);
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			if(this.empNo == ((Employee)obj).empNo)
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empNo<o.empNo) {
			return -1;
		}else if(this.empNo==o.empNo) {
			return 0;
		}else { 
			return 1;
		}
	}
}

public class Employee_Info {	
	public static Scanner scanner = new Scanner(System.in);
	public static TreeSet<Employee> arr= new TreeSet<>();

	
	private static void resister() {
		System.out.print("- 사번 :");
		int empNo= scanner.nextInt();
		System.out.print("- 이름 :");
		String empName= scanner.next();
		System.out.print("- 연락처 :");
		String phone= scanner.next();
		System.out.print("- 나이 :");
		int age= scanner.nextInt();
		System.out.print("- 부서 :");
		String department= scanner.next();
		System.out.print("- 직급 :");
		String compRank= scanner.next();
		System.out.println("등록이 완료되었습니다.");
		
		Employee employee = new Employee(empNo, empName, phone, age, department, compRank);
		arr.add(employee);
		System.out.println();
	}
	
	private static void allprint() {
		Iterator<Employee> iterator1 = arr.iterator();
			System.out.println("사번\t이름\t연락처\t\t나이\t부서\t직급");
		while(iterator1.hasNext()) {
			Employee employee = iterator1.next();
			System.out.print(employee.getEmpNo()+"\t");
			System.out.print(employee.getEmpName()+"\t");
			System.out.print(employee.getPhone()+"\t\t");
			System.out.print(employee.getAge()+"\t");
			System.out.print(employee.getDepartment()+"\t");
			System.out.print(employee.getCompRank()+"\t");
			System.out.println();
		}
	}
	
	private static void reWrite() {
		//값을 가져와야한다.
		System.out.print("수정할 사번 : ");
		int renum=scanner.nextInt();
		System.out.println();
		Employee employee = findnumber(renum);
		boolean run=true;
		while(run) {
		System.out.print("수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급, 5. 수정 종료]  : ");
		int num2=scanner.nextInt();
			if(num2==1) {
				System.out.print("수정할 연락처 : ");
				String rephone=scanner.next();
				employee.setPhone(rephone);
				System.out.println(employee.getPhone()+"로 변경되었습니다.");
			}else if(num2==2) {
				System.out.print("수정할 나이 : ");
				int reage=scanner.nextInt();
				employee.setAge(reage);
				System.out.println(employee.getAge()+"로 변경되었습니다.");
			}else if(num2==3) {
				System.out.print("수정할 부서 : ");
				String reDepartment=scanner.next();
				employee.setPhone(reDepartment);
				System.out.println(employee.getDepartment()+"로 변경되었습니다.");
			}else if(num2==4) { 
				System.out.print("수정할 직급 : ");
				String reCompRank=scanner.next();
				employee.setCompRank(reCompRank);
				System.out.println(employee.getCompRank()+"로 변경되었습니다.");
			}else if(num2==5) {
				run=false;
				
			}
			
		}
	}
	
	private static void delet() {
		System.out.print("삭제할 사원의 사번 : ");
		int num = scanner.nextInt(); //사번 받은거
		Employee employee = findnumber(num); //사번이랑 같은 사원을 employee에 담고
		arr.add(employee); //삭제하기
	}
		
	
	//해당내용에 맞을때 대상자를 뽑는 메소드
	private static Employee findnumber(int EmpNo) {
		Iterator<Employee> iterator = arr.iterator();
		while(iterator.hasNext()) {
			//전체 출력되는 내용을 Employee타입에 넣어줘서 get set을 이용할 수 있게 만든다.
			//어파치 iterator로 출력되는 값도 Employee타입이니까!!!
			Employee employee=iterator.next();
			if(employee.getEmpNo()==EmpNo) {
				return employee;
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		boolean run=true;
		
		while (run) {
			System.out.println("=======사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
			System.out.println("===============================");
			System.out.print("메뉴입력 : ");
			int num1 = scanner.nextInt();
			
			
			if(num1==1) {
				resister();
			}else if(num1==2) {
				allprint();
			}else if(num1==3) {
				reWrite();
			}else if(num1==4) {
				delet();
			}else if(num1==5) {
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
		

	
	
	
	}
}

