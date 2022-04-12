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
		System.out.println("계좌번호를 입력하세요");
		String str=scanner.next();
		System.out.println("이름을 입력하세요");
		String str1 = scanner.next();
		System.out.println("최초 금액을 입력하세요");
		int balance=scanner.nextInt();
		Account account= new Account(str, str1, balance);
		arr.add(account);
		System.out.println("완료되었습니다.");
 	} 
	
	private static void print() {
		for(int i=0; i<arr.size(); i++) {
			Account account = arr.get(i);
			System.out.println("계좌번호 : "+account.getAno());
			System.out.println("이름 : "+account.getName());
			System.out.println("금액 : "+account.getBalance());
			System.out.println();
		}
	} 
	private static void addbalance() {
		System.out.println("예금하고자하는 계좌번호를 입력하세요");
		String ano=scanner.next();
		System.out.println("예금금액을 입력하세요");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}else {
			account.setBalance(account.getBalance()+balance);
			System.out.println("예금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
		}
	} 
	private static void pushbalance() {
		System.out.println("예금하고자하는 계좌번호를 입력하세요");
		String ano=scanner.next();
		System.out.println("예금금액을 입력하세요");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("예금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
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
			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택>>");
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
		}System.out.println("프로그램을 종료합니다.");
	}

}
