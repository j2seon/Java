package Ex.Arr;

import java.util.ArrayList;
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

public class Excer1 {
	private static ArrayList<Account> arr = new ArrayList<Account>();
	private static Scanner scanner = new Scanner(System.in);
	
	private static void creat() { 
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String str=scanner.next();
		System.out.println("�̸��� �Է��ϼ���");
		String str1 = scanner.next();
		System.out.println("���� �ݾ��� �Է��ϼ���");
		int balance=scanner.nextInt();
		Account account= new Account(str, str1, balance);
		arr.add(account);
		System.out.println("�Ϸ�Ǿ����ϴ�.");
 	} 
	
	private static void print() {
		for(int i=0; i<arr.size(); i++) {
			Account account = arr.get(i);
			System.out.println("���¹�ȣ : "+account.getAno());
			System.out.println("�̸� : "+account.getName());
			System.out.println("�ݾ� : "+account.getBalance());
			System.out.println();
		}
	} 
	private static void addbalance() {
		System.out.println("�����ϰ����ϴ� ���¹�ȣ�� �Է��ϼ���");
		String ano=scanner.next();
		System.out.println("���ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}else {
			account.setBalance(account.getBalance()+balance);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	} 
	private static void pushbalance() {
		System.out.println("�����ϰ����ϴ� ���¹�ȣ�� �Է��ϼ���");
		String ano=scanner.next();
		System.out.println("���ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	} 
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getAno().equals(ano)) {
				account=arr.get(i);
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
				pushbalance();
			}else if(selectNo==5) {
				break;
			}
			scanner.close();
		}System.out.println("���α׷��� �����մϴ�.");
	}

}
