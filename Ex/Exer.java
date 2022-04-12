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
	
	private static void creat() { //계좌생성
		System.out.println("계좌번호를 입력하세요");
		String str=scanner.next();
		System.out.println("이름을 입력하세요");
		String str1 = scanner.next();
		System.out.println("최초 금액을 입력하세요");
		int balance=scanner.nextInt();
		Account account = new Account(str, str1, balance);
		for(int i=0; i<array.length; i++) {
			if(array[i]==null) {
				array[i]=account;
				System.out.println("정상처리되었습니다.");
				break;
			}
		}
	}
	private static void print() { //전체 계좌 출력
		for(int i=0; i<array.length; i++) {
			Account account = array[i];
			if(account!=null) {
				System.out.println("계좌번호 : "+ account.getAno());
				System.out.println("이름 : "+ account.getName());
				System.out.println("금액 : "+ account.getBalance());
			}else {
				break;
			}
		}
	}
	
	private static void addbalance() { //예금
		System.out.println("예금하고자하는 계좌번호를 입력하세요");
		String ano=scanner.next();
		Account account= findAccount(ano);
		System.out.println("예금금액을 적으세요");
		int balance = scanner.nextInt();
		if(account==null) {
			System.out.println("계좌번호가 없습니다.");
		}else {
			account.setBalance(account.getBalance()+balance);
			System.out.println("입금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
		}
	}
	
	private static void pushbalnce() { //출금
		System.out.println("출금하고자하는 계좌번호를 입력하세요");
		String ano=scanner.next();
		Account account= findAccount(ano);
		System.out.println("출금금액을 적으세요");
		int balance = scanner.nextInt();
		if(account==null) {
			System.out.println("계좌번호가 없습니다.");
		}else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("출금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
		}
	}
	
	private static Account findAccount(String ano) { //계좌번호 비교해서 같은 계좌확인
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
				pushbalnce();
			}else if(selectNo==5) {
				break;
			}
		
		
		}
		

	}	
}
