package Department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import Chap06_07.Ex05.C;

/*  ��ȭ���� �� ���� ���α׷�
 * 
 * (��Ӱ� ������) 
 * 
 * �� ��� :	1.	�Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����),������ ����
 * 			2.	Gold��() : ���ʽ�����Ʈ(2%����),������(5%)
 * 			3.	VIP �� : ���ʽ�����Ʈ(5%����),������(10%), ��� ������Ʈ�� �ִ�.  
 * 
 */

class Customer{ //�Ϲݰ�(silver)
	int customerID; 		// �����̵�
	String customerName; 	//�̸�
	String customerGrade; 	//��� = silver, Gold ,VIP
	double bonusPoint;		//���ʽ�����Ʈ ��:
	double bonusRatio;		//���ʽ�����Ʈ ������ 1% /2% /5%
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

	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade: silver / bonusRatio: 1%
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

	public double calcPrice (int price) { //�������̵� ����ϱ�
		//���� ��ǰ�� ������ �޾Ƽ� ���ʽ�����Ʈ�� �����ϴ� �ڵ��ۼ�
		price=0;
		setBonusPoint(getBonusPoint()+(price*bonusRatio));
		return price; //���ε� ������ ���� 
		
	}
}
class GoldCustomer extends Customer{
	double saleRatio;  //��ǰ������ : �����ڿ��� �⺻���� 5% ���� 
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade: silver / bonusRatio: 1% bonusRatio 5%

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
		return price; //���ε� ������ ���� 
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
		return price; //���ε� ������ ���� 
	}
	
	
}

public class Customer_Management {
//	private static Set<Customer> customerlist = new HashSet<Customer>();
//	private static Scanner scanner = new Scanner(System.in);
	
//	public static void resistersilver() {
//		Customer customer = new Customer(1212, "ȫ�浿", 12);
//		System.out.println("==�Ϲݰ�����Դϴ�==");
//		System.out.println("�� ���̵� : "+ customer.getCustomerID());
//		System.out.println("�� �̸� : "+customer.getCustomerName());
//		customerlist.add(customer);
//	}

	public static void main(String[] args) {
				/*
				
				======================================================================
				1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
				======================================================================
				���� >> 1
				==�Ϲݰ� ��� �Դϴ�. ==
				�� ���̵� : 
				���̸� : 

				���� >>2
				==VIP �� ��� �Դϴ�. ==
				�� ���̵� : 
				���̸� : 
				��翡����Ʈ(ID) ��� : 

				���� >>3
				==Gold �� ��� �Դϴ�. ==
				�� ���̵� : 
				���̸� : 

				���� >>4
				==�� ���� ���  �Դϴ�. ==
				��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>
				���� >>5
				==��ǰ������ ������ �ּ��� ==
				�� ���̵� : 
				���� ��ǰ ���� :  

				000 ���� 000 �� ���� �ϼ̽��ϴ�. 
				000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

				*/
		Set<Customer> customerlist = new HashSet<Customer>();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("==============================================================================================");
			System.out.println("1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����     6. ����");
			System.out.println("==============================================================================================");
			System.out.println("���� >> ");
			int choice= scanner.nextInt();
			
			if(choice==1) {
				System.out.println("==�Ϲݰ�����Դϴ�.==");
				System.out.print("�����̵� : ");
				int id = scanner.nextInt();
				System.out.print("���̸� : ");
				String name = scanner.next();
				Customer customer =new Customer(id, name, 0);
				customerlist.add(customer);
				System.out.println("silverȸ������ ��ϵǾ����ϴ�.");
			}else if(choice==2) {
				System.out.println("==vip������Դϴ�.==");
				System.out.print("�����̵� : ");
				int id = scanner.nextInt();
				System.out.print("���̸� : ");
				String name = scanner.next();
				System.out.print("��翡����Ʈ ID : ");
				int agent = scanner.nextInt();
				VIP customer =new VIP(id, name, 1000);
				customer.setAgentID(agent);
				customerlist.add(customer);
				System.out.println("vipȸ������ ��ϵǾ����ϴ�.");
			}else if(choice==3) {
				System.out.println("==gold������Դϴ�.==");
				System.out.print("�����̵� : ");
				int id = scanner.nextInt();
				System.out.print("���̸� : ");
				String name = scanner.next();
				Customer customer =new GoldCustomer(id, name, 200);
				customerlist.add(customer);
				System.out.println("goldȸ������ ��ϵǾ����ϴ�.");
			}else if(choice==4) {
				System.out.println("==�� ���� ���==");
				System.out.println("��ID	���̸�	 �����	 ���η�	���ʽ�����Ʈ����	 ������ƮID<VIP��>");
				Iterator<Customer> iterator = customerlist.iterator();
				while(iterator.hasNext()) {
				System.out.println(iterator.next()+"\n");
				}
			}else if(choice==5) {
				System.out.println("==��ǰ������ ������ �ּ��� ==");
				System.out.print("id�� �Է� : ");
				int id= scanner.nextInt();
				System.out.print("���Ź�ǰ ���� : ");
				int price = scanner.nextInt();
				Iterator<Customer> iterator = customerlist.iterator();
				while(iterator.hasNext()) {
					Customer customer =iterator.next();
					if(customer.getCustomerID()==id) {
						customer.setBonusPoint(customer.getBonusPoint()+price*customer.bonusRatio);
						System.out.println(customer.getCustomerName()+" ���� "+price+" �� �����ϼ̽��ϴ�.");
						System.out.println(customer.getCustomerName()+" ������ ����� "+customer.getCustomerGrade()+"�̰�, ���� ����Ʈ�� "
						+customer.getBonusPoint()+"�̰�, ������ "+ customer.calcPrice(price)+"�� �Ǿ����ϴ�.");
					}
				}
				
			}else if(choice==6) {
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
				

	}

}

