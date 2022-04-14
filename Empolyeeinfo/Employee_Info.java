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
		System.out.print("- ��� :");
		int empNo= scanner.nextInt();
		System.out.print("- �̸� :");
		String empName= scanner.next();
		System.out.print("- ����ó :");
		String phone= scanner.next();
		System.out.print("- ���� :");
		int age= scanner.nextInt();
		System.out.print("- �μ� :");
		String department= scanner.next();
		System.out.print("- ���� :");
		String compRank= scanner.next();
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		
		Employee employee = new Employee(empNo, empName, phone, age, department, compRank);
		arr.add(employee);
		System.out.println();
	}
	
	private static void allprint() {
		Iterator<Employee> iterator1 = arr.iterator();
			System.out.println("���\t�̸�\t����ó\t\t����\t�μ�\t����");
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
		//���� �����;��Ѵ�.
		System.out.print("������ ��� : ");
		int renum=scanner.nextInt();
		System.out.println();
		Employee employee = findnumber(renum);
		boolean run=true;
		while(run) {
		System.out.print("������ �ʵ� ���� [1. ����ó, 2.����, 3. �μ�, 4.����, 5. ���� ����]  : ");
		int num2=scanner.nextInt();
			if(num2==1) {
				System.out.print("������ ����ó : ");
				String rephone=scanner.next();
				employee.setPhone(rephone);
				System.out.println(employee.getPhone()+"�� ����Ǿ����ϴ�.");
			}else if(num2==2) {
				System.out.print("������ ���� : ");
				int reage=scanner.nextInt();
				employee.setAge(reage);
				System.out.println(employee.getAge()+"�� ����Ǿ����ϴ�.");
			}else if(num2==3) {
				System.out.print("������ �μ� : ");
				String reDepartment=scanner.next();
				employee.setPhone(reDepartment);
				System.out.println(employee.getDepartment()+"�� ����Ǿ����ϴ�.");
			}else if(num2==4) { 
				System.out.print("������ ���� : ");
				String reCompRank=scanner.next();
				employee.setCompRank(reCompRank);
				System.out.println(employee.getCompRank()+"�� ����Ǿ����ϴ�.");
			}else if(num2==5) {
				run=false;
				
			}
			
		}
	}
	
	private static void delet() {
		System.out.print("������ ����� ��� : ");
		int num = scanner.nextInt(); //��� ������
		Employee employee = findnumber(num); //����̶� ���� ����� employee�� ���
		arr.add(employee); //�����ϱ�
	}
		
	
	//�ش系�뿡 ������ ����ڸ� �̴� �޼ҵ�
	private static Employee findnumber(int EmpNo) {
		Iterator<Employee> iterator = arr.iterator();
		while(iterator.hasNext()) {
			//��ü ��µǴ� ������ EmployeeŸ�Կ� �־��༭ get set�� �̿��� �� �ְ� �����.
			//����ġ iterator�� ��µǴ� ���� EmployeeŸ���̴ϱ�!!!
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
			System.out.println("=======������� ���α׷�============");
			System.out.println("# 1. ������� �űԵ��");
			System.out.println("# 2. ������� �˻�");
			System.out.println("# 3. ������� ����");
			System.out.println("# 4. ������� ����");
			System.out.println("# 5. ���α׷� ����");
			System.out.println("===============================");
			System.out.print("�޴��Է� : ");
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
		System.out.println("���α׷� ����");
		

	
	
	
	}
}

