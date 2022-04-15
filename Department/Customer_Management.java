package Department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import Chap06_07.Ex05.C;

/*  백화점의 고객 관리 프로그램
 * 
 * (상속과 다형성) 
 * 
 * 고객 등급 :	1.	일반고객(silver) : 보너스포인트(1%적립),할인율 없음
 * 			2.	Gold고객() : 보너스포인트(2%적립),할인율(5%)
 * 			3.	VIP 고객 : 보너스포인트(5%적립),할인율(10%), 담당 에이젼트가 있다.  
 * 
 */

class Customer{ //일반고객(silver)
	int customerID; 		// 고객아이디
	String customerName; 	//이름
	String customerGrade; 	//등급 = silver, Gold ,VIP
	double bonusPoint;		//보너스포인트 값:
	double bonusRatio;		//보너스포인트 적립률 1% /2% /5%
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}


	
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}


	public double getBonusPoint() {
		return bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}

	//생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade: silver / bonusRatio: 1%
	public Customer(int customerID,String customerName,double bonusPoint) {
		this();
		this.customerID=customerID;
		this.customerName=customerName;
		this.bonusPoint=bonusPoint;
	}
	public Customer() {
		customerGrade="Silver";
		bonusRatio =0.01;
	}
	
	@Override
	public String toString() {
		return getCustomerID()+"\t"+getCustomerName()+"\t"+getCustomerGrade()+"\t\t"+getBonusRatio();
	}
	

	@Override
	public int hashCode() {
		return Objects.hashCode(customerID);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			if(this.customerID==((Customer)obj).customerID) {
				return true;
			}
		}
		return false;
	}

	public double calcPrice (int price) { //오버라이드 사용하기
		//기존 물품의 가격을 받아서 보너스포인트를 적립하는 코드작성
		price=0;
		setBonusPoint(getBonusPoint()+(price*bonusRatio));
		return price; //할인된 가격을 리턴 
		
	}
}
class GoldCustomer extends Customer{
	double saleRatio;  //물품할인율 : 생성자에서 기본으로 5% 할인 
	//생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade: silver / bonusRatio: 1% bonusRatio 5%

	public GoldCustomer(int customerID,String customerName,double bonusPoint ) {
		super(customerID,customerName,bonusPoint);
		customerGrade="Gold";
		bonusRatio =0.02;
		saleRatio=0.05;
	}
	@Override
	public String toString() {
		return getCustomerID()+"\t"+getCustomerName()+"\t "+getCustomerGrade()+"\t"+this.saleRatio+"\t  "+getBonusRatio();
	}
	@Override
	public double calcPrice(int price) {
		Customer customer;
		this.setBonusPoint(getBonusPoint()+price*bonusRatio);
		price=(int) (price*saleRatio);
		return price; //할인된 가격을 리턴 
	}
	
}

class VIP extends Customer{
	private int agentID;
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	double saleRatio;
	
	
	public VIP(int customerID,String customerName,double bonusPoint) {
		super(customerID,customerName,bonusPoint);
		customerGrade="VIP";
		bonusRatio =0.05; 
		saleRatio =0.1;
	}
	@Override
	public String toString() {
		return getCustomerID()+"  \t"+getCustomerName()+" \t  "+getCustomerGrade()+"\t  "+this.saleRatio+"\t  "+getBonusRatio()+"\t\t\t"+agentID;
	}
	@Override
	public double calcPrice(int price) {
		this.setBonusPoint(getBonusPoint()+price*bonusRatio);
		price=(int) (price*saleRatio);
		return price; //할인된 가격을 리턴 
	}
	
	
}

public class Customer_Management {
//	private static Set<Customer> customerlist = new HashSet<Customer>();
//	private static Scanner scanner = new Scanner(System.in);
	
//	public static void resistersilver() {
//		Customer customer = new Customer(1212, "홍길동", 12);
//		System.out.println("==일반고객등록입니다==");
//		System.out.println("고객 아이디 : "+ customer.getCustomerID());
//		System.out.println("고객 이름 : "+customer.getCustomerName());
//		customerlist.add(customer);
//	}

	public static void main(String[] args) {
				/*
				
				======================================================================
				1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  5. 종료 
				======================================================================
				선택 >> 1
				==일반고객 등록 입니다. ==
				고객 아이디 : 
				고객이름 : 

				선택 >>2
				==VIP 고객 등록 입니다. ==
				고객 아이디 : 
				고객이름 : 
				담당에이젼트(ID) 등록 : 

				선택 >>3
				==Gold 고객 등록 입니다. ==
				고객 아이디 : 
				고객이름 : 

				선택 >>4
				==고객 정보 출력  입니다. ==
				고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>
				선택 >>5
				==물품가격을 지불해 주세요 ==
				고객 아이디 : 
				구매 물품 가격 :  

				000 고객님 000 원 지불 하셨습니다. 
				000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

				*/
		Set<Customer> customerlist = new HashSet<Customer>();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("==============================================================================================");
			System.out.println("1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매     6. 종료");
			System.out.println("==============================================================================================");
			System.out.println("선택 >> ");
			int choice= scanner.nextInt();
			
			if(choice==1) {
				System.out.println("==일반고객등록입니다.==");
				System.out.print("고객아이디 : ");
				int id = scanner.nextInt();
				System.out.print("고객이름 : ");
				String name = scanner.next();
				Customer customer =new Customer(id, name, 0);
				customerlist.add(customer);
				System.out.println("silver회원으로 등록되었습니다.");
			}else if(choice==2) {
				System.out.println("==vip고객등록입니다.==");
				System.out.print("고객아이디 : ");
				int id = scanner.nextInt();
				System.out.print("고객이름 : ");
				String name = scanner.next();
				System.out.print("담당에이전트 ID : ");
				int agent = scanner.nextInt();
				VIP customer =new VIP(id, name, 1000);
				customer.setAgentID(agent);
				customerlist.add(customer);
				System.out.println("vip회원으로 등록되었습니다.");
			}else if(choice==3) {
				System.out.println("==gold고객등록입니다.==");
				System.out.print("고객아이디 : ");
				int id = scanner.nextInt();
				System.out.print("고객이름 : ");
				String name = scanner.next();
				Customer customer =new GoldCustomer(id, name, 200);
				customerlist.add(customer);
				System.out.println("gold회원으로 등록되었습니다.");
			}else if(choice==4) {
				System.out.println("==고객 정보 출력==");
				System.out.println("고객ID	고객이름	 고객등급	 할인률	보너스포인트비율	 에이젼트ID<VIP고객>");
				Iterator<Customer> iterator = customerlist.iterator();
				while(iterator.hasNext()) {
				System.out.println(iterator.next()+"\n");
				}
			}else if(choice==5) {
				System.out.println("==물품가격을 지불해 주세요 ==");
				System.out.print("id를 입력 : ");
				int id= scanner.nextInt();
				System.out.print("구매물품 가격 : ");
				int price = scanner.nextInt();
				Iterator<Customer> iterator = customerlist.iterator();
				while(iterator.hasNext()) {
					Customer customer =iterator.next();
					if(customer.getCustomerID()==id) {
						customer.setBonusPoint(customer.getBonusPoint()+price*customer.bonusRatio);
						System.out.println(customer.getCustomerName()+" 고객님 "+price+" 원 지불하셨습니다.");
						System.out.println(customer.getCustomerName()+" 고객님의 등급은 "+customer.getCustomerGrade()+"이고, 현재 포인트는 "
						+customer.getBonusPoint()+"이고, 할인은 "+ customer.calcPrice(price)+"원 되었습니다.");
					}
				}
				
			}else if(choice==6) {
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램이 종료되었습니다.");
				

	}

}

