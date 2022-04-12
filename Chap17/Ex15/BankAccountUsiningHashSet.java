package Chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



class Account{			//계좌정보를 저장하는 객체 , 중요한 필드 , private(캡슐화), 객체 필드 접근(x), 생성자,getter,setter로 
	private String ano; 	//계좌변호
	private String ownew; 	//계좌 주 , 이름
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

	private int balance; 	//통장 금액,
	
	public Account(String ano, String ownew, int balance) {
		this.ano=ano;
		this.ownew=ownew;
		this.balance=balance;
	}
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Account) {
				this.ano.equals(((Account)obj).ano);
				return true;
			}
			return false;
		}
	@Override
		public int hashCode() {
			return Objects.hash(ano);
		}
	
}

public class BankAccountUsiningHashSet {
	
	//컬랙션(ArrayList<E>)를 사용해서 Account 객체생성
	private static Set<Account> aSet = new HashSet<>(); 	//배열에 객체 저장. 배열은 방의 크기를 정해줘야한다.
		//배열은 방의 크기가 고정, 선언시 방의 크기를 지정, 방의 크기를 수정할 수 없다.
		//컬렉션은 방의 크기가 동적 무한정 저장
		//값을 추가할때 add(): 개수:size(); 값을 삭제시 remove()
	private static Scanner scanner =new Scanner(System.in);
	public static int index=0;
	
	private static void createAccount() {
		//코드작성 : 1.계좌 생성 스캐너로 계좌번호 이름, 초기통장금액 인풋
		//배열 객체에 저장
		System.out.println("-----------------------");
		System.out.println("1번 계좌 생성");
		System.out.println("-----------------------");
		System.out.println("계좌번호를 입력하세요");
		String ano = scanner.next(); 	//계좌번호를 인풋받아서 ano변수에 할당 지역변수이므로 메소드 내에서만 사용
		System.out.println("이름을 입력하세요");
		String owner = scanner.next(); 	
		System.out.println("계좌 개설 시 초기금액을 입력하세요");
		int balance = scanner.nextInt();		
		//배열선언은 메소드 외부에서 선언된 것. 전역변수이다. 모든 메소드에서 사용 가능
		//객체를 배열에 저장해야한다. (비어있는 방에 저장) for문을 사용해서 null인방을 찾아서 null일 경우 객체를 저장시킨다.
		Account a1= new Account(ano, owner, balance); 	//생성자를 통해서 객체에 필드값 적용 후 객체 생성.
		aSet.add(a1);
		System.out.println("계좌가 생성되었습니다.");
		}
		
	
	private static void  accountList() {
		//코드작성 : 계좌목록 출력 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		//배열의 각 방을 순회하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("-----------------------");
		System.out.println("2. 계좌 목록 출력");
		System.out.println("-----------------------");
		
		Iterator<Account> iterator1 = aSet.iterator();
		while(iterator1.hasNext()) {
			Account account=iterator1.next();
			if(account !=null) {
			System.out.println("계좌번호 : "+account.getAno());
			System.out.println("이름 : "+account.getOwnew());
			System.out.println("금액 : "+account.getBalance());
			System.out.println();

			}
		}	
	}
	private static void deposit() {
		//3.예금<== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액을 인풋받아서 해당 계좌에 저장.
		//1.사용자로부터 입금할 계좌를 받아야한다.
		//2.사용자로부터 받은 계좌번호를 배열에 저장된 객체내의 계좌번호를 확인 후 
		//3.해당계좌에 해당하는 금액에 입금금액을 더 해야한다.
		System.out.println("--------------");
		System.out.println("3. 예금하기");
		System.out.println("--------------");
		
		System.out.println("예금할 계좌번호를 입력해주세요.");
		String ano =scanner.next();
		System.out.println("예금금액을 입력하세요");
		int balance = scanner.nextInt();
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다.
		Account account = findAccount(ano);  //findAccount(계좌번호)
		if(account.getAno().equals(ano)) {
			account.setBalance(account.getBalance()+balance);
			System.out.println("예금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
		}
//		int result=findAccount(ano).getBalance()+balance;
//		findAccount(ano).setBalance(result);
//		System.out.println(findAccount(ano).getBalance());
		
		
	}
	private static void withdraw() {
		//4. 출금
		System.out.println("--------------");
		System.out.println("4. 출금하기");
		System.out.println("--------------");
		
		System.out.println("출금할 계좌번호를 입력해주세요.");
		String ano =scanner.next();
		System.out.println("출금금액을 입력하세요");
		int balance = scanner.nextInt();
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다.
		Account account = findAccount(ano);  //findAccount(계좌번호)
		if(account==null) {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
			return; //return을 만나면 메소드를 빠져나온다
		}else {
			account.setBalance(account.getBalance()-balance); //기존의 금액에 추가 입금한금액을 set로 넣어서 계좌에 저장.
			System.out.println("출금이 완료되었습니다.");
			System.out.println("현재금액은 : "+ account.getBalance()+"원 입니다.");
		}
	}
	//배열 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
	//예금할때와 출금할때 공통코드로 사용, 여러 매소드에서 중복사용될때 별도의 메소드를 생성해서 중복코드를 방지하기 위함.
	private static Account findAccount(String ano) {
		Account account=null;	
		Iterator<Account> iterator1 = aSet.iterator();
		while(iterator1.hasNext()) {
			Account ac =iterator1.next();
			if(ac.getAno().equals(ano)) {
				account=ac;
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
				createAccount(); //객체 생성 없이 메소드 명으로 호출(static), 
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
