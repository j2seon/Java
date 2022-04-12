package Chap17.Ex13.Ex01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Account{			//���������� �����ϴ� ��ü , �߿��� �ʵ� , private(ĸ��ȭ), ��ü �ʵ� ����(x), ������,getter,setter�� 
	private String ano; 	//���º�ȣ
	private String ownew; 	//���� �� , �̸�
	public String getAno() {
		return ano;
	}

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
	private static Account[] accountArray = new Account[100]; 	//�迭�� ��ü ����. �迭�� ���� ũ�⸦ ��������Ѵ�.
		//Account[] : �迭 Ÿ��(����Ÿ��, �迭�� ���濡 ���� �������� ���� ��� �⺻������ null�� ����.)
		//�迭 ������ ��(Index)�� ũ�⸦ ����, index =0, length()<== �迭���� ����
	private static Scanner scanner =new Scanner(System.in);
	public static int index=0;
	
	private static void createAccount() {
		//�ڵ��ۼ� : 1.���� ���� ��ĳ�ʷ� ���¹�ȣ �̸�, �ʱ�����ݾ� ��ǲ
		//�迭 ��ü�� ����
		System.out.println("-----------------------");
		System.out.println("1�� ���� ����");
		System.out.println("-----------------------");
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano = scanner.next(); 	//���¹�ȣ�� ��ǲ�޾Ƽ� ano������ �Ҵ� ���������̹Ƿ� �޼ҵ� �������� ���
		System.out.println("�̸��� �Է��ϼ���");
		String owner = scanner.next(); 	
		System.out.println("���� ���� �� �ʱ�ݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ�޾Ƽ� ��ü�� ������ �ʵ忡 �� ����.
		Account account =new Account(ano, owner, balance); 	//�����ڸ� ���ؼ� ��ü�� �ʵ尪 ���� �� ��ü ����.
		
		//�迭������ �޼ҵ� �ܺο��� ����� ��. ���������̴�. ��� �޼ҵ忡�� ��� ����
		//��ü�� �迭�� �����ؾ��Ѵ�. (����ִ� �濡 ����) for���� ����ؼ� null�ι��� ã�Ƽ� null�� ��� ��ü�� �����Ų��.
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {		//0������� null�� ���� ã�Ƽ� null�� ��� ��ü�� �迭�� �����Ѵ�/
				accountArray[i]=account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;		//���� ���� �� for���� �������´�. 
			}
		}
		
	}
	private static void  accountList() {
		//�ڵ��ۼ� : ���¸�� ��� �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("-----------------------");
		System.out.println("2. ���� ��� ���");
		System.out.println("-----------------------");
		
		//�迭�� �� ���� null�� �ƴ� ���, ��ü�� �ʵ��� ���� ���.
		for(int i=0; i<accountArray.length; i++) {
			//�� ���� ��ü�� ��� ������ ���� 
			Account account=accountArray[i]; 		//0~99���� ��ü�� account ���������� ��´�.
			if(account!=null) {		//null�� �ƴ� ��쿡�� ��� null�̸� ������������
				System.out.println((index+1)+"��° ���� ����");
				System.out.println("���¹�ȣ : "+accountArray[i].getAno());
				System.out.println("������ : "+accountArray[i].getOwnew());
				System.out.println("�ݾ� : "+ accountArray[i].getBalance());
				System.out.println();
				index++;
			}else {
				break;
			}
		}
		
 	}
	private static void deposit() {
		//3.����<== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ��� ��ǲ�޾Ƽ� �ش� ���¿� ����.
		//1.����ڷκ��� �Ա��� ���¸� �޾ƾ��Ѵ�.
		//2.����ڷκ��� ���� ���¹�ȣ�� �迭�� ����� ��ü���� ���¹�ȣ�� Ȯ�� �� 
		//3.�ش���¿� �ش��ϴ� �ݾ׿� �Աݱݾ��� �� �ؾ��Ѵ�.
		System.out.println("--------------");
		System.out.println("3. �����ϱ�");
		System.out.println("--------------");
		
		System.out.println("������ ���¹�ȣ�� �Է����ּ���.");
		String ano =scanner.next();
		System.out.println("���ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);  //findAccount(���¹�ȣ)
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
			return; //return�� ������ �޼ҵ带 �������´�
		}else {
			account.setBalance(account.getBalance()+balance); //������ �ݾ׿� �߰� �Ա��ѱݾ��� set�� �־ ���¿� ����.
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
//		int result=findAccount(ano).getBalance()+balance;
//		findAccount(ano).setBalance(result);
//		System.out.println(findAccount(ano).getBalance());
		
		
	}
	private static void withdraw() {
		//4. ���
		System.out.println("--------------");
		System.out.println("4. ����ϱ�");
		System.out.println("--------------");
		
		System.out.println("����� ���¹�ȣ�� �Է����ּ���.");
		String ano =scanner.next();
		System.out.println("��ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);  //findAccount(���¹�ȣ)
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
			return; //return�� ������ �޼ҵ带 �������´�
		}else {
			account.setBalance(account.getBalance()-balance); //������ �ݾ׿� �߰� �Ա��ѱݾ��� set�� �־ ���¿� ����.
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	}
	//�迭 Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	//�����Ҷ��� ����Ҷ� �����ڵ�� ���, ���� �żҵ忡�� �ߺ����ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϱ� ����.
	private static Account findAccount(String ano) {
		Account account=null;	
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) { //�迭���� ���� null�� �ƴҰ�� ��ü�� ano
				//�� ��ü�� �濡 ano�� ��� ���� ����
				String str=accountArray[i].getAno(); //�迭�� �� �濡 ����� ��ü�� ano�� str ������ �Ҵ���.
				if(str.equals(ano)) {
					account=accountArray[i];
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
				createAccount(); //��ü ���� ���� �޼ҵ� ������ ȣ��(static), 
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
