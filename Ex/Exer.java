package Ex;

import java.util.Scanner;

class Account{
	private String ano;
	private String name;
	private int balance;
	
	public Account(String ano, String name, int balance) { 
		this.ano=ano;
		this.name=name;
		this.balance=balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Exer {
	private static Account[] array = new Account [100];
	private static Scanner scanner = new Scanner(System.in);
	
	private static void creat() { //���»���
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String str=scanner.next();
		System.out.println("�̸��� �Է��ϼ���");
		String str1 = scanner.next();
		System.out.println("���� �ݾ��� �Է��ϼ���");
		int balance=scanner.nextInt();
		Account account = new Account(str, str1, balance);
		for(int i=0; i<array.length; i++) {
			if(array[i]==null) {
				array[i]=account;
				System.out.println("����ó���Ǿ����ϴ�.");
				break;
			}
		}
	}
	private static void print() { //��ü ���� ���
		for(int i=0; i<array.length; i++) {
			Account account = array[i];
			if(account!=null) {
				System.out.println("���¹�ȣ : "+ account.getAno());
				System.out.println("�̸� : "+ account.getName());
				System.out.println("�ݾ� : "+ account.getBalance());
			}else {
				break;
			}
		}
	}
	
	private static void addbalance() { //����
		System.out.println("�����ϰ����ϴ� ���¹�ȣ�� �Է��ϼ���");
		String ano=scanner.next();
		Account account= findAccount(ano);
		System.out.println("���ݱݾ��� ��������");
		int balance = scanner.nextInt();
		if(account==null) {
			System.out.println("���¹�ȣ�� �����ϴ�.");
		}else {
			account.setBalance(account.getBalance()+balance);
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	}
	
	private static void pushbalnce() { //���
		System.out.println("����ϰ����ϴ� ���¹�ȣ�� �Է��ϼ���");
		String ano=scanner.next();
		Account account= findAccount(ano);
		System.out.println("��ݱݾ��� ��������");
		int balance = scanner.nextInt();
		if(account==null) {
			System.out.println("���¹�ȣ�� �����ϴ�.");
		}else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	}
	
	private static Account findAccount(String ano) { //���¹�ȣ ���ؼ� ���� ����Ȯ��
		Account account = null;
		for(int i =0; i<array.length; i++) {
			if(array[i]!=null) {
				String str=array[i].getAno();
				if(str.equals(ano)) {
					account=array[i];
					break;
				}
			}
		}
		return account;
	}

	public static void main(String[] args) {
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("------------------------------------------------------------");
			System.out.println("����>>");
			int selectNo = scanner.nextInt();	
			if(selectNo==1) {
				creat();
			}else if(selectNo==2) {
				print();
			}else if(selectNo==3) {
				addbalance();
			}else if(selectNo==4) {
				pushbalnce();
			}else if(selectNo==5) {
				break;
			}
		
		
		}
		

	}	
}
