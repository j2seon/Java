package Chap17.Ex13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Account{			
	private String ano; 	//계좌변호
	private String ownew; 	//계좌 주 , 이름
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

	private int balance; 	//통장 금액,
	
	public Account(String ano, String ownew, int balance) {
		this.ano=ano;
		this.ownew=ownew;
		this.balance=balance;
	}
	
}

public class BankAccountUsingArray {
	
	//일반 배열을 사용해서 Account 객체 등록
	private static Account[] accountArray = new Account[100]; 	//배열에 객체 저장.
	private static Scanner scanner =new Scanner(System.in);
	public static int index=0;
	
	private static void createAccount() {
		//코드작성 : 1.계좌 생성 스캐너로 계좌번호 이름, 초기통장금액 인풋
		//배열 객체에 저장
		System.out.println("계좌번호을 입력하시오");
		String str = scanner.next();
		System.out.println("이름을 입력하시오");
		String str1 =scanner.next();
		System.out.println("금액을 입력하시오");
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
		System.out.println("입력완료");
	}
	private static void  accountList() {
		//코드작성 : 계좌목록 출력 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		for(int i=0; i<index; i++) {
			if(accountArray[i]!=null) {
				System.out.println("계좌번호 : "+accountArray[i].getAno()+", 이름 : "+accountArray[i].getOwnew()+", 금액 : "+accountArray[i].getBalance());
			}
		}
 	}
	private static void deposit() {
		//3.예금<== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액을 인풋받아서 해당 계좌에 저장.
		System.out.println("찾으시는 계좌번호를 입력하세요");
		String str1=scanner.next();
		System.out.println("입금 금액을 입력하세요");
		for(int i=0; i<index; i++) {
			int num=scanner.nextInt();
			if(accountArray[i].getAno().equals(str1)) {
				int result=accountArray[i].getBalance()+num;
				accountArray[i].setBalance(result);
				System.out.println("현재 금액은 "+accountArray[i].getBalance()+"원 입니다.");
				break;
			}
		}
	}
	private static void withdraw() {
		//4. 출금
		System.out.println("찾으시는 계좌번호를 입력하세요");
		String str1=scanner.next();
		System.out.println("출금 금액을 입력하세요");
		int num = scanner.nextInt();
		for(int i=0; i<index; i++) {
			if(accountArray[i].getAno().equals(str1)) {
				int a=accountArray[i].getBalance() - num;
				accountArray[i].setBalance(a);
				System.out.println("현재 금액은 "+accountArray[i].getBalance()+"원 입니다.");
				break;
			}
		}

	}
	//배열 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
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
			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택>>");
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
		System.out.println("프로그램 종료");
		
		
		
		
	}

}
