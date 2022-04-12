package Chap17.Ex13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Account{			
	private String ano; 	//���º�ȣ
	private String ownew; 	//���� �� , �̸�
	public String getAno() {
		return ano;
	}
	public Account() {}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwnew() {
		return ownew;
	}

	public void setOwnew(String ownew) {
		this.ownew = ownew;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private int balance; 	//���� �ݾ�,
	
	public Account(String ano, String ownew, int balance) {
		this.ano=ano;
		this.ownew=ownew;
		this.balance=balance;
	}
	
}

public class BankAccountUsingArray {
	
	//�Ϲ� �迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100]; 	//�迭�� ��ü ����.
	private static Scanner scanner =new Scanner(System.in);
	public static int index=0;
	
	private static void createAccount() {
		//�ڵ��ۼ� : 1.���� ���� ��ĳ�ʷ� ���¹�ȣ �̸�, �ʱ�����ݾ� ��ǲ
		//�迭 ��ü�� ����
		System.out.println("���¹�ȣ�� �Է��Ͻÿ�");
		String str = scanner.next();
		System.out.println("�̸��� �Է��Ͻÿ�");
		String str1 =scanner.next();
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		int num=scanner.nextInt();
		accountArray[index]= new Account(str,str1,num);
		index++;
//		Account a1= new Account(str, str1, num);
//		for(int i=0; i<str.length(); i++) {
//			if(accountArray[i]==null) {
//				accountArray[i]=a1;
//				
//				break;
//			}
//		}
		System.out.println("�Է¿Ϸ�");
	}
	private static void  accountList() {
		//�ڵ��ۼ� : ���¸�� ��� �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		for(int i=0; i<index; i++) {
			if(accountArray[i]!=null) {
				System.out.println("���¹�ȣ : "+accountArray[i].getAno()+", �̸� : "+accountArray[i].getOwnew()+", �ݾ� : "+accountArray[i].getBalance());
			}
		}
 	}
	private static void deposit() {
		//3.����<== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ��� ��ǲ�޾Ƽ� �ش� ���¿� ����.
		System.out.println("ã���ô� ���¹�ȣ�� �Է��ϼ���");
		String str1=scanner.next();
		System.out.println("�Ա� �ݾ��� �Է��ϼ���");
		for(int i=0; i<index; i++) {
			int num=scanner.nextInt();
			if(accountArray[i].getAno().equals(str1)) {
				int result=accountArray[i].getBalance()+num;
				accountArray[i].setBalance(result);
				System.out.println("���� �ݾ��� "+accountArray[i].getBalance()+"�� �Դϴ�.");
				break;
			}
		}
	}
	private static void withdraw() {
		//4. ���
		System.out.println("ã���ô� ���¹�ȣ�� �Է��ϼ���");
		String str1=scanner.next();
		System.out.println("��� �ݾ��� �Է��ϼ���");
		int num = scanner.nextInt();
		for(int i=0; i<index; i++) {
			if(accountArray[i].getAno().equals(str1)) {
				int a=accountArray[i].getBalance() - num;
				accountArray[i].setBalance(a);
				System.out.println("���� �ݾ��� "+accountArray[i].getBalance()+"�� �Դϴ�.");
				break;
			}
		}

	}
	//�迭 Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	private static Account findAccount(String ano) {
		Account account=null;	
		for(int i =0; i<index; i++) {
			if(account.getAno().equals(ano)); {
				account=accountArray[i];				
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
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				findAccount("11");
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
		
		
		
		
	}

}
